package edu.neu.hoso.service;

import edu.neu.hoso.model.RegistrationLevel;

import java.util.List;

/**
 * @title: RegistrationLevelService
 * @package edu.neu.hoso.service
 * @description: 挂号级别类业务接口
 * @author: Mike
 * @date: 2019-06-11 14:28
 * @version: V1.0
*/
public interface RegistrationLevelService {
    Integer insert(RegistrationLevel registrationLevel);
    void deleteById(Integer id);
    void deleteByName(String name);
    void update(RegistrationLevel registrationLevel);
    RegistrationLevel getRegistrationLevelById(Integer id);
    List<RegistrationLevel> getRegistrationLevelByName(String name);
    List<RegistrationLevel> getRegistrationLevelByIsDefault(String isDefault);
    List<RegistrationLevel> getAllRegistrationLevel();
}
