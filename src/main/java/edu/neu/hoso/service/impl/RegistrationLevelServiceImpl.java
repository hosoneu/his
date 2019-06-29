package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.RegistrationLevelExample;
import edu.neu.hoso.model.RegistrationLevel;
import edu.neu.hoso.model.RegistrationLevelMapper;
import edu.neu.hoso.service.RegistrationLevelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: RegistrationLevelServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 挂号级别类业务接口实现类
 * @author: Mike
 * @date: 2019-06-11 14:39
 * @version: V1.0
*/
@Service
public class RegistrationLevelServiceImpl implements RegistrationLevelService {
    @Resource
    RegistrationLevelMapper registrationLevelMapper;

    @Override
    public Integer insert(RegistrationLevel registrationLevel) {
        /**
         *@title: insert
         *@description: 插入挂号级别
         *@author: Mike
         *@date: 2019-06-11 14:40
         *@param: [registrationLevel]
         *@return: java.lang.Integer
         *@throws:
         */
        registrationLevelMapper.insert(registrationLevel);
        return registrationLevel.getRegistrationLevelId();
    }

    @Override
    public void deleteById(Integer id) {
        /**
         *@title: deleteById
         *@description: 删除挂号级别 经id
         *@author: Mike
         *@date: 2019-06-11 15:00
         *@param: [id]
         *@return: void
         *@throws:
         */
        registrationLevelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByName(String name) {
        /**
         *@title: deleteByName
         *@description: 删除挂号级别 经name
         *@author: Mike
         *@date: 2019-06-11 15:01
         *@param: [name]
         *@return: void
         *@throws:
         */
        RegistrationLevelExample registrationLevelExample = new RegistrationLevelExample();
        RegistrationLevelExample.Criteria criteria = registrationLevelExample.createCriteria();
        criteria.andRegistrationLevelNameEqualTo(name);
        registrationLevelMapper.deleteByExample(registrationLevelExample);
    }

    @Override
    public void update(RegistrationLevel registrationLevel) {
        /**
         *@title: update
         *@description: 更新挂号级别
         *@author: Mike
         *@date: 2019-06-11 15:03
         *@param: [registrationLevel]
         *@return: void
         *@throws:
         */
        registrationLevelMapper.updateByPrimaryKeySelective(registrationLevel);
    }

    @Override
    public RegistrationLevel getRegistrationLevelById(Integer id) {
        /**
         *@title: getRegistrationLevelById
         *@description: 查询挂号级别 经id
         *@author: Mike
         *@date: 2019-06-11 15:04
         *@param: [id]
         *@return: edu.neu.hoso.model.RegistrationLevel
         *@throws:
         */
        return registrationLevelMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<RegistrationLevel> getRegistrationLevelByName(String name) {
        /**
         *@title: getRegistrationLevelByName
         *@description: 查询挂号级别 经name
         *@author: Mike
         *@date: 2019-06-11 15:06
         *@param: [name]
         *@return: java.util.List<edu.neu.hoso.model.RegistrationLevel>
         *@throws:
         */
        RegistrationLevelExample registrationLevelExample = new RegistrationLevelExample();
        RegistrationLevelExample.Criteria criteria = registrationLevelExample.createCriteria();
        criteria.andRegistrationLevelNameEqualTo(name);
        return registrationLevelMapper.selectByExample(registrationLevelExample);
    }

    @Override
    public List<RegistrationLevel> getRegistrationLevelByIsDefault(String isDefault) {
        /**
         *@title: getRegistrationLevelByIsDefault
         *@description: 查询挂号级别 经isDefault
         *@author: Mike
         *@date: 2019-06-11 15:06
         *@param: [isDefault]
         *@return: java.util.List<edu.neu.hoso.model.RegistrationLevel>
         *@throws:
         */
        RegistrationLevelExample registrationLevelExample = new RegistrationLevelExample();
        RegistrationLevelExample.Criteria criteria = registrationLevelExample.createCriteria();
        criteria.andIsDefaultEqualTo(isDefault);
        return registrationLevelMapper.selectByExample(registrationLevelExample);
    }

    @Override
    public List<RegistrationLevel> getAllRegistrationLevel() {
        /**
         *@title: getAllRegistrationLevel
         *@description: 查询所有挂号级别
         *@author: Mike
         *@date: 2019-06-11 15:07
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.RegistrationLevel>
         *@throws:
         */
        RegistrationLevelExample registrationLevelExample = new RegistrationLevelExample();
        return registrationLevelMapper.selectByExample(registrationLevelExample);
    }
}
