package edu.neu.hoso.service.impl;

import edu.neu.hoso.converter.DateConverter;
import edu.neu.hoso.example.PatientExample;
import edu.neu.hoso.example.RegistrationExample;
import edu.neu.hoso.example.SchedulingInfoExample;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.RegistrationService;
import edu.neu.hoso.service.SerialNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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
    RegistrationLevelMapper registrationLevelMapper;

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

    @Resource
    SchedulingInfoMapper schedulingInfoMapper;

    @Resource
    DateConverter dateConverter;

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
    public List<Registration> getRegistration() {
        /**
         *@title: getRegistration
         *@description: 展示挂号列表
         *@author: Mike
         *@date: 2019-06-18 10:32
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.Registration>
         *@throws:
         */
        return registrationMapper.getRegistration();
    }

    @Override
    public Registration register(Registration registration, Patient patient, MedicalRecord medicalRecord, ExpenseItems expenseItems, Integer userId, Integer payModeId) {
        /**
         *@title: register
         *@description: 挂号操作
         *@author: Mike
         *@date: 2019-06-13 18:14
         *@param: [registration, patient, medicalRecord, expenseItems]
         *@return: edu.neu.hoso.model.Registration
         *@throws:
         */
        //计算挂号费 根据挂号级别以及是否购买病历本（状态中不买为1 减1后为0 买为2 减1后为1元）
        double totalCost = registrationLevelMapper.selectByPrimaryKey(registration.getRegistrationLevelId()).getRegistrationCost() + Double.parseDouble(registration.getBuyMedicalRecord()) - 1;
        Date date = new Date();
        medicalRecord.setDoctorId(registration.getDoctorId());
        medicalRecordMapper.insertSelective(medicalRecord);
        if(getPatientByIdentity(patient.getPatientIdentity()).size() == 0){
            patientMapper.insertSelective(patient);
        }
        Invoice invoice = new Invoice();
        try {
            invoice.setInvoiceNo(serialNumberService.generateSerialNumber(2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        invoice.setIsDayCal("1");
        invoice.setPayTime(date);
        invoice.setPayModeId(payModeId);
        invoice.setUserId(userId);
        invoice.setTotalCost(totalCost);
        invoiceMapper.insertSelective(invoice);
        expenseItems.setMedicalRecordId(medicalRecord.getMedicalRecordId());
        expenseItems.setTotalCost(totalCost);
        expenseItems.setInvoiceId(invoice.getInvoiceId());
        //挂号费类型为1
        expenseItems.setExpenseTypeId(1);
        expenseItemsMapper.insertSelective(expenseItems);
        registration.setMedicalRecordId(medicalRecord.getMedicalRecordId());
        registration.setExpenseItemsId(expenseItems.getExpenseItemsId());
        registration.setPatientId(patient.getPatientId());
        registration.setExpenseTypeId(1);
        registration.setRegistrationTotalCost(totalCost);
        registration.setRegistrationDate(date);
        registrationMapper.insertSelective(registration);
//        if (registration.getDoctorId() != null){
//            //更新被挂号医生的排班剩额
//            updateSchedulingRestcount(registration);
//        }
        return registration;
    }

    @Override
    public List<Patient> getPatientByIdentity(String patientIdentity) {
        PatientExample patientExample = new PatientExample();
        PatientExample.Criteria criteria = patientExample.createCriteria();
        criteria.andPatientIdentityEqualTo(patientIdentity);
        return patientMapper.selectByExample(patientExample);
    }

    @Override
    public void updateSchedulingRestcount(Registration registration) {
        //排班表 限额-1
        //按时间上来说一定得是在班医生 不然找不到医生，报错
        SchedulingInfoExample schedulingInfoExample = new SchedulingInfoExample();
        SchedulingInfoExample.Criteria criteria = schedulingInfoExample.createCriteria();
        criteria.andDoctorIdEqualTo(registration.getDoctorId());
        Date date = registration.getRegistrationDate();
        //匹配星期
        // Mon Tue Wed Thu Fri Sat Sun
        SimpleDateFormat wf = new SimpleDateFormat("EEE", Locale.ENGLISH);
        criteria.andSchedulingWeekdayEqualTo(wf.format(date));
        //匹配午别
        SimpleDateFormat nf = new SimpleDateFormat("HH");
        String noonbreak = nf.format(date);
        int a = Integer.parseInt(noonbreak);
        if (a >= 0 && a <= 6) {
            //Daybreak
            criteria.andSchedulingNoonbreakEqualTo("Daybreak");
        }else if (a > 6 && a <= 12) {
            //Morning
            criteria.andSchedulingNoonbreakEqualTo("Morning");
        }else if (a > 12 && a <= 13) {
            //Noon
            criteria.andSchedulingNoonbreakEqualTo("Noon");
        }else if (a > 13 && a <= 18) {
            //Afternoon
            criteria.andSchedulingNoonbreakEqualTo("Afternoon");
        } else if (a > 18 && a <= 24) {
            //Night
            criteria.andSchedulingNoonbreakEqualTo("Night");
        }
        List<SchedulingInfo> schedulingInfos= schedulingInfoMapper.selectByExample(schedulingInfoExample);
        SchedulingInfo schedulingInfo = schedulingInfos.get(0);
        if (schedulingInfo != null&& schedulingInfo.getSchedulingRestcount() > 0){
            schedulingInfo.setSchedulingRestcount(schedulingInfo.getSchedulingRestcount() - 1);
        }
        schedulingInfoMapper.updateByPrimaryKeySelective(schedulingInfo);
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
            //为收费明细装填发票id属性
            expenseItems.setInvoiceId(invoice.getInvoiceId());
            expenseItemsMapper.updateByPrimaryKeySelective(expenseItems);
            //计算总费用
            totalCost += expenseItems.getTotalCost();
        }
        //装入总费用属性后 再次进行更新
        invoice.setTotalCost(totalCost);
        invoiceMapper.updateByPrimaryKeySelective(invoice);
    }

    @Override
    public void refund(List<ExpenseItems> expenseItemsList, Integer userId) {
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
        //需要保留的部分药品费用项目
        List<ExpenseItems> expenseItemsListForSave = new ArrayList();
        //遍历前端传来的收费明细id数组
        for (ExpenseItems expenseItems : expenseItemsList) {
            //判断是否存在部分退费的费用项目
            //lombok没有插件便无法执行get方法
            if (expenseItems.getDrugs() != null){
                if (expenseItems.getPrescriptionItems().getActualQuantity() != 0){
                    //存在部分退药情况
                    //正常退药应将实际数量改为0
                    //部分退药 找到发票 生成新发票附带部分药品
                    //更新费用项目总费用 为退药后实际数量对应费用
                    //退药处只能退药一次 相应的 退费也只有一次
                    expenseItems.setTotalCost(expenseItems.getPrescriptionItems().getActualQuantity() * expenseItems.getDrugs().getDrugsPrice());
                    expenseItemsListForSave.add(expenseItems);
                }
            }
            else if(expenseItems.getExDrugs() != null){
                if (expenseItems.getExaminationDrugsItems().getActualQuantity() != 0){
                    //存在部分退药情况
                    expenseItems.setTotalCost(expenseItems.getExaminationDrugsItems().getActualQuantity() * expenseItems.getExDrugs().getDrugsPrice());
                    expenseItemsListForSave.add(expenseItems);
                }

            }
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
            //旧发票号对应未退费项目
            List<ExpenseItems> expenseItems = expenseItemsMapper.getUnWithdrawExpenseItems(oldInvoice.getInvoiceNo());
            //取到退部分的项目
            for (ExpenseItems partExpenseItems : expenseItemsListForSave) {
                if (oldInvoice.getInvoiceId() == partExpenseItems.getInvoiceId()){
                    //将已部分退费药品状态置为5——部分退费 不可再次退费
                    partExpenseItems.setPayStatus("5");
                    //将部分退药项目 加入到新发票中 （按更新后的totalCost算钱）
                    expenseItems.add(partExpenseItems);
                }
            }
            if (!expenseItems.isEmpty()){
                double totalCost = 0;
                //插入新发票
                Invoice newInvoice = new Invoice();
                //发票号生成
                try {
                    newInvoice.setInvoiceNo(serialNumberService.generateSerialNumber(2));
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
                    expenseItemsMapper.updateByPrimaryKeySelective(expenseItem);
                }
                newInvoice.setTotalCost(totalCost);
                invoiceMapper.updateByPrimaryKeySelective(newInvoice);
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

    @Override
    public List<Patient> getAllPatient() {
        /**
         *@title: getAllPatient
         *@description: 查询所有患者
         *@author: Mike
         *@date: 2019-06-28 16:26
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.Patient>
         *@throws:
         */
        PatientExample patientExample = new PatientExample();
        return patientMapper.selectByExample(patientExample);
    }

    @Override
    public List<ExpenseItems> getAllExpenseItems() {
        /**
         *@title: getAllExpenseItems
         *@description: 查询所有费用项目 包含全部信息
         *@author: Mike
         *@date: 2019-06-30 2:43
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.ExpenseItems>
         *@throws:
         */
        return expenseItemsMapper.getAllExpenseItems();
    }

}
