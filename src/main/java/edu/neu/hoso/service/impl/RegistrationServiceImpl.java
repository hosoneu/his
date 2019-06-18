package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.RegistrationExample;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.RegistrationService;
import edu.neu.hoso.service.SerialNumberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @title: RegistrationServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 挂号类业务接口实现类
 * @author: Mike
 * @date: 2019-06-13 14:15
 * @version: V1.0
*/
@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Resource
    RegistrationMapper registrationMapper;

    @Resource
    MedicalRecordMapper medicalRecordMapper;

    @Resource
    PatientMapper patientMapper;

    @Resource
    ExpenseItemsMapper expenseItemsMapper;

    @Resource
    InvoiceMapper invoiceMapper;

    @Resource
    SerialNumberService serialNumberService;

    @Override
    public Integer insert(Registration registration) {
        /**
         *@title: insert
         *@description: 插入挂号
         *@author: Mike
         *@date: 2019-06-13 14:17
         *@param: [registration]
         *@return: java.lang.Integer
         *@throws:
         */
        registrationMapper.insert(registration);
        return registration.getRegistrationId();
    }

    @Override
    public Integer insertSelective(Registration registration) {
        /**
         *@title: insertSelective
         *@description: 选择性插入挂号
         *@author: Mike
         *@date: 2019-06-13 14:17
         *@param: [registration]
         *@return: java.lang.Integer
         *@throws:
         */
        registrationMapper.insertSelective(registration);
        return registration.getRegistrationId();
    }

    @Override
    public void deleteById(Integer id) {
        /**
         *@title: deleteById
         *@description: 删除挂号
         *@author: Mike
         *@date: 2019-06-13 14:17
         *@param: [id]
         *@return: void
         *@throws:
         */
        registrationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Registration registration) {
        /**
         *@title: update
         *@description: 更新挂号
         *@author: Mike
         *@date: 2019-06-13 14:18
         *@param: [registration]
         *@return: void
         *@throws:
         */
        registrationMapper.updateByPrimaryKeySelective(registration);
    }

    @Override
    public Registration getRegistrationById(Integer id) {
        /**
         *@title: getRegistrationById
         *@description: 查询挂号 经id
         *@author: Mike
         *@date: 2019-06-13 14:18
         *@param: [id]
         *@return: edu.neu.hoso.model.Registration
         *@throws:
         */
        return registrationMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Registration> getAllRegistration() {
        /**
         *@title: getAllRegistration
         *@description: 查询所有挂号
         *@author: Mike
         *@date: 2019-06-13 14:19
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.Registration>
         *@throws:
         */
        RegistrationExample registrationExample = new RegistrationExample();
        return registrationMapper.selectByExample(registrationExample);
    }

    @Override
    public List<Registration> getRegistrationByMedicalRecordId(Integer medicalRecordId) {
        /**
         *@title: getRegistrationByMedicalRecordId
         *@description: 查询挂号信息 经medicalRecordId
         *@author: Mike
         *@date: 2019-06-16 15:11
         *@param: [medicalRecordId]
         *@return: java.util.List<edu.neu.hoso.model.Registration>
         *@throws:
         */
        return registrationMapper.getRegistrationByMedicalRecordId(medicalRecordId);
    }

    @Override
    public Registration register(Registration registration, Patient patient, MedicalRecord medicalRecord, ExpenseItems expenseItems) {
        /**
         *@title: register
         *@description: 挂号操作
         *@author: Mike
         *@date: 2019-06-13 18:14
         *@param: [registration, patient, medicalRecord, expenseItems]
         *@return: edu.neu.hoso.model.Registration
         *@throws:
         */
        medicalRecordMapper.insertSelective(medicalRecord);
        patientMapper.insertSelective(patient);
        expenseItems.setMedicalRecordId(medicalRecord.getMedicalRecordId());
        expenseItemsMapper.insertSelective(expenseItems);
        registration.setMedicalRecordId(medicalRecord.getMedicalRecordId());
        registration.setExpenseItemsId(expenseItems.getExpenseItemsId());
        registrationMapper.insertSelective(registration);
        //排班表 限额-1
        return registration;
    }

    @Override
    public void withdraw(Integer expenseItemsId, Integer userId) {
        /**
         *@title: withdraw
         *@description: 退号操作
         *@author: Mike
         *@date: 2019-06-14 15:11
         *@param: [expenseItemsId, userId]
         *@return: void
         *@throws:
         */
        //得到所退挂号信息
        RegistrationExample registrationExample = new RegistrationExample();
        RegistrationExample.Criteria criteria = registrationExample.createCriteria();
        criteria.andExpenseItemsIdEqualTo(expenseItemsId);
        List<Registration> registrations = registrationMapper.selectByExample(registrationExample);
        Registration registration = registrations.get(0);
        //将挂号状态置为退号
        registration.setRegistrationStatus("2");
        registrationMapper.updateByPrimaryKeySelective(registration);

        //得到所退号对应收费明细并更新收费状态为退费
        ExpenseItems expenseItems = expenseItemsMapper.selectByPrimaryKey(expenseItemsId);
        expenseItems.setPayStatus("3");
        expenseItemsMapper.updateByPrimaryKeySelective(expenseItems);

        Invoice oldInvoice = invoiceMapper.selectByPrimaryKey(expenseItems.getInvoiceId());

        //生成发票号相同的发票 冲正
        offsetInvoice(oldInvoice, userId);
    }

    @Override
    public void charge(List<Integer> expenseItemsIds, Integer userId, Integer payModeId) {
        /**
         *@title: charge
         *@description: 收费操作
         *@author: Mike
         *@date: 2019-06-14 15:32
         *@param: [expenseItemsIds, userId, payModeId]
         *@return: void
         *@throws:
         */
        double totalCost = 0;
        Invoice invoice = new Invoice();
        try {
            invoice.setInvoiceNo(serialNumberService.generateSerialNumber(2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        invoice.setIsDayCal("1");
        invoice.setPayTime(new Date());
        invoice.setPayModeId(payModeId);
        invoice.setUserId(userId);
        invoiceMapper.insertSelective(invoice);
        //对每个收费明细进行更新
        for (Integer expenseItemsId : expenseItemsIds) {
            ExpenseItems expenseItems = expenseItemsMapper.selectByPrimaryKey(expenseItemsId);
            //将执行收费操作的收费明细的收费状态置为已收费
            expenseItems.setPayStatus("2");
            expenseItemsMapper.updateByPrimaryKeySelective(expenseItems);
            //为收费明细装填发票id属性
            expenseItems.setInvoiceId(invoice.getInvoiceId());
            //计算总费用
            totalCost += expenseItems.getTotalCost();
        }
        //装入总费用属性后 再次进行更新
        invoice.setTotalCost(totalCost);
        invoiceMapper.updateByPrimaryKeySelective(invoice);
    }

    @Override
    public void refund(List<Integer> expenseItemsIds, Integer userId) {
        /**
         *@title: refund
         *@description: 退费操作
         *@author: Mike
         *@date: 2019-06-14 14:14
         *@param: [expenseItemsIds, userId]
         *@return: void
         *@throws:
         */

        //声明发票id数组
        List<Integer> invoiceIdList = new ArrayList<>();
        //遍历前端传来的收费明细id数组
        for (Integer expenseItemsId : expenseItemsIds) {
            ExpenseItems expenseItems = expenseItemsMapper.selectByPrimaryKey(expenseItemsId);
            //将执行退费操作的收费明细的收费状态置为退费
            expenseItems.setPayStatus("3");
            expenseItemsMapper.updateByPrimaryKeySelective(expenseItems);
            //应对情况：所选退费项目并不属于同一发票
            if (!invoiceIdList.contains(expenseItems.getInvoiceId())){
                invoiceIdList.add(expenseItems.getInvoiceId());
            }
        }
        //声明发票数组
        List<Invoice> invoices = new ArrayList<>();
        //遍历发票id数组，将其对应发票存入发票数组
        for (Integer invoiceId : invoiceIdList) {
            invoices.add(invoiceMapper.selectByPrimaryKey(invoiceId));
        }
        //生成与发票数组中发票号相同的发票 冲正
        for (Invoice oldInvoice : invoices) {
            offsetInvoice(oldInvoice, userId);
            List<ExpenseItems> expenseItems = expenseItemsMapper.getUnWithdrawExpenseItems(oldInvoice.getInvoiceNo());
            if (!expenseItems.isEmpty()){
                double totalCost = 0;
                //插入新发票
                Invoice newInvoice = new Invoice();
                //发票号生成
                try {
                    serialNumberService.generateSerialNumber(2);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                newInvoice.setIsDayCal("1");
                newInvoice.setPayTime(new Date());
                newInvoice.setUserId(userId);
                invoiceMapper.insertSelective(newInvoice);
                for (ExpenseItems expenseItem:expenseItems) {
                    totalCost += expenseItem.getTotalCost();
                    //为收费项目设置新发票号
                    expenseItem.setInvoiceId(newInvoice.getInvoiceId());
                }
                newInvoice.setTotalCost(totalCost);
            }
        }
    }

    @Override
    public Invoice offsetInvoice(Invoice oldInvoice, Integer userId) {
        /**
         *@title: offsetInvoice
         *@description: 生成抵销发票
         *@author: Mike
         *@date: 2019-06-14 15:08
         *@param: [oldInvoice, userId]
         *@return: edu.neu.hoso.model.Invoice
         *@throws:
         */
        Invoice offsetInvoice = new Invoice();
        offsetInvoice.setInvoiceNo(oldInvoice.getInvoiceNo());
        offsetInvoice.setIsDayCal("1");
        offsetInvoice.setPayTime(new Date());
        offsetInvoice.setTotalCost(0 - oldInvoice.getTotalCost());
        offsetInvoice.setUserId(userId);
        invoiceMapper.insertSelective(offsetInvoice);
        return offsetInvoice;
    }

    @Override
    public List<ExpenseItems> getPatientPayExpenseItems(Integer medicalRecordId, Date startDate, Date endDate) {
        /**
         *@title: getPatientPayExpenseItems
         *@description: 查询患者历史收费信息 经medicalRecordId, startDate, endDate
         *@author: Mike
         *@date: 2019-06-16 16:03
         *@param: [medicalRecordId, startDate, endDate]
         *@return: java.util.List<edu.neu.hoso.model.ExpenseItems>
         *@throws:
         */
        return expenseItemsMapper.getPatientPayExpenseItems(medicalRecordId, startDate, endDate);
    }

    @Override
    public List<ExpenseItems> getPatientUnPayExpenseItems(Integer medicalRecordId) {
        /**
         *@title: getPatientUnPayExpenseItems
         *@description: 查询患者未收费项目 经medicalRecordId
         *@author: Mike
         *@date: 2019-06-16 16:04
         *@param: [medicalRecordId]
         *@return: java.util.List<edu.neu.hoso.model.ExpenseItems>
         *@throws:
         */
        return expenseItemsMapper.getPatientUnPayExpenseItems(medicalRecordId);
    }

}
