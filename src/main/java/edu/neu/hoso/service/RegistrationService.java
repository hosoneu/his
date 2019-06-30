package edu.neu.hoso.service;

import edu.neu.hoso.model.*;

import java.util.Date;
import java.util.List;

/**
 * @title: RegistrationService
 * @package edu.neu.hoso.service
 * @description: 挂号类业务接口
 * @author: Mike
 * @date: 2019-06-13 14:07
 * @version: V1.0
*/
public interface RegistrationService {
    Integer insert(Registration registration);
    Integer insertSelective(Registration registration);
    void deleteById(Integer id);
    void update(Registration registration);
    Registration getRegistrationById(Integer id);
    List<Registration> getAllRegistration();
    List<Registration> getRegistrationByMedicalRecordId(Integer medicalRecordId);
    List<Registration> getRegistration();
    Registration register(Registration registration, Patient patient, MedicalRecord medicalRecord, ExpenseItems expenseItems, Integer userId, Integer payModeId);
    List<Patient> getPatientByIdentity(String patientIdentity);
    void updateSchedulingRestcount(Registration registration);
    void withdraw(Integer expenseItemsId, Integer userId);
    void charge(List<Integer> expenseItemsIds, Integer userId, Integer payModeId);
    void refund(List<ExpenseItems> expenseItemsIds, Integer userId);
    Invoice offsetInvoice(Invoice oldInvoice, Integer userId);
    List<ExpenseItems> getPatientPayExpenseItems(Integer medicalRecordId, Date startDate, Date endDate);
    List<ExpenseItems> getPatientUnPayExpenseItems(Integer medicalRecordId);
    List<Patient> getAllPatient();
    List<ExpenseItems> getAllExpenseItems();
}
