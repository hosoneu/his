package edu.neu.hoso.service;

import edu.neu.hoso.model.ExpenseItems;
import edu.neu.hoso.model.MedicalRecord;
import edu.neu.hoso.model.Patient;
import edu.neu.hoso.model.Registration;

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
    Registration register(Registration registration, Patient patient, MedicalRecord medicalRecord, ExpenseItems expenseItems);
    void withdraw(Integer expenseItemsId, Integer userId);
}
