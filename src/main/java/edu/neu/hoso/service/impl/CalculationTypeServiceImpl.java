package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.CalculationTypeExample;
import edu.neu.hoso.model.CalculationType;
import edu.neu.hoso.model.CalculationTypeMapper;
import edu.neu.hoso.service.CalculationTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: CalculationTypeServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 结算类别类接口实现类
 * @author: Mike
 * @date: 2019-06-11 15:09
 * @version: V1.0
*/
@Service
public class CalculationTypeServiceImpl implements CalculationTypeService {
    @Resource
    CalculationTypeMapper calculationTypeMapper;

    @Override
    public Integer insert(CalculationType calculationType) {
        /**
         *@title: insert
         *@description: 插入结算类别
         *@author: Mike
         *@date: 2019-06-11 15:10
         *@param: [calculationType]
         *@return: java.lang.Integer
         *@throws:
         */
        calculationTypeMapper.insert(calculationType);
        return calculationType.getCalculationTypeId();
    }

    @Override
    public void deleteById(Integer id) {
        /**
         *@title: deleteById
         *@description: 删除结算类别 经id
         *@author: Mike
         *@date: 2019-06-11 15:11
         *@param: [id]
         *@return: void
         *@throws:
         */
        calculationTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByName(String name) {
        /**
         *@title: deleteByName
         *@description: 删除结算类别 经name
         *@author: Mike
         *@date: 2019-06-11 15:12
         *@param: [name]
         *@return: void
         *@throws:
         */
        CalculationTypeExample calculationTypeExample = new CalculationTypeExample();
        CalculationTypeExample.Criteria criteria = calculationTypeExample.createCriteria();
        criteria.andCalculationTypeNameEqualTo(name);
        calculationTypeMapper.deleteByExample(calculationTypeExample);
    }

    @Override
    public void update(CalculationType calculationType) {
        /**
         *@title: update
         *@description: 更新结算类别
         *@author: Mike
         *@date: 2019-06-11 15:12
         *@param: [calculationType]
         *@return: void
         *@throws:
         */
        calculationTypeMapper.updateByPrimaryKeySelective(calculationType);
    }

    @Override
    public CalculationType getCalculationTypeById(Integer id) {
        /**
         *@title: getCalculationTypeById
         *@description: 查询结算类别 经id
         *@author: Mike
         *@date: 2019-06-11 15:12
         *@param: [id]
         *@return: edu.neu.hoso.model.CalculationType
         *@throws:
         */
        return calculationTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CalculationType> getCalculationTypeByName(String name) {
        /**
         *@title: getCalculationTypeByName
         *@description: 查询结算类别 经name
         *@author: Mike
         *@date: 2019-06-11 15:12
         *@param: [name]
         *@return: java.util.List<edu.neu.hoso.model.CalculationType>
         *@throws:
         */
        CalculationTypeExample calculationTypeExample = new CalculationTypeExample();
        CalculationTypeExample.Criteria criteria = calculationTypeExample.createCriteria();
        criteria.andCalculationTypeNameEqualTo(name);
        return calculationTypeMapper.selectByExample(calculationTypeExample);
    }

    @Override
    public List<CalculationType> getAllCalculationType() {
        /**
         *@title: getAllCalculationType
         *@description: 查询所有结算类别
         *@author: Mike
         *@date: 2019-06-11 15:13
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.CalculationType>
         *@throws:
         */
        CalculationTypeExample calculationTypeExample = new CalculationTypeExample();
        return calculationTypeMapper.selectByExample(calculationTypeExample);
    }
}
