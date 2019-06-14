package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.RegistrationExample;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.RegistrationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
        return registration;
    }

    @Override
    public void withdraw(Integer expenseItemsId, Integer userId) {
        /**
         *@title: withdraw
         *@description: 退号操作
         *@author: Mike
         *@date: 2019-06-13 18:25
         *@param: [expenseItemsId]
         *@return: void
         *@throws:
         */
        ExpenseItems oldExpenseItems = expenseItemsMapper.selectByPrimaryKey(expenseItemsId);
        Invoice oldInvoice = invoiceMapper.selectByPrimaryKey(oldExpenseItems.getInvoiceId());
        //生成发票号相同发票
        Invoice newInvoice = new Invoice();
        newInvoice.setInvoiceNo(oldInvoice.getInvoiceNo());
        newInvoice.setIsDayCal("1");
        newInvoice.setPayTime(new Date());
        newInvoice.setTotalCost(0 - oldInvoice.getTotalCost());
        newInvoice.setUserId(userId);
        invoiceMapper.insertSelective(newInvoice);
        ExpenseItems expenseItems = new ExpenseItems();
        
    }
}
