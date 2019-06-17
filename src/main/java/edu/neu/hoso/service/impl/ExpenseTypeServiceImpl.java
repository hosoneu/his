package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.ExpenseTypeExample;
import edu.neu.hoso.model.ExpenseType;
import edu.neu.hoso.model.ExpenseTypeMapper;
import edu.neu.hoso.service.ExpenseTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: ExpenseTypeServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 费用科目类接口实现类
 * @author: Mike
 * @date: 2019-06-17 11:16
 * @version: V1.0
*/
@Service
public class ExpenseTypeServiceImpl implements ExpenseTypeService {
    @Resource
    ExpenseTypeMapper expenseTypeMapper;

    @Override
    public Integer insertSelective(ExpenseType expenseType) {
        /**
         *@title: insertSelective
         *@description: 选择性插入费用科目
         *@author: Mike
         *@date: 2019-06-17 11:17
         *@param: [expenseType]
         *@return: java.lang.Integer
         *@throws:
         */
        expenseTypeMapper.insertSelective(expenseType);
        return expenseType.getExpenseTypeId();
    }

    @Override
    public void deleteById(Integer id) {
        /**
         *@title: deleteById
         *@description: 删除费用科目 经id
         *@author: Mike
         *@date: 2019-06-17 11:17
         *@param: [id]
         *@return: void
         *@throws:
         */
        expenseTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByCode(String code) {
        /**
         *@title: deleteByCode
         *@description: 删除费用科目 经code
         *@author: Mike
         *@date: 2019-06-17 11:18
         *@param: [code]
         *@return: void
         *@throws:
         */
        ExpenseTypeExample expenseTypeExample = new ExpenseTypeExample();
        ExpenseTypeExample.Criteria criteria = expenseTypeExample.createCriteria();
        criteria.andExpenseTypeCodeEqualTo(code);
        expenseTypeMapper.deleteByExample(expenseTypeExample);
    }

    @Override
    public void deleteByName(String name) {
        /**
         *@title: deleteByName
         *@description: 删除费用科目 经name
         *@author: Mike
         *@date: 2019-06-17 11:18
         *@param: [name]
         *@return: void
         *@throws:
         */
        ExpenseTypeExample expenseTypeExample = new ExpenseTypeExample();
        ExpenseTypeExample.Criteria criteria = expenseTypeExample.createCriteria();
        criteria.andExpenseTypeNameEqualTo(name);
        expenseTypeMapper.deleteByExample(expenseTypeExample);
    }

    @Override
    public void update(ExpenseType expenseType) {
        /**
         *@title: update
         *@description: 更新费用科目
         *@author: Mike
         *@date: 2019-06-17 11:19
         *@param: [expenseType]
         *@return: void
         *@throws:
         */
        expenseTypeMapper.updateByPrimaryKeySelective(expenseType);
    }

    @Override
    public ExpenseType getExpenseTypeById(Integer id) {
        /**
         *@title: getExpenseTypeById
         *@description: 查询费用科目 经id
         *@author: Mike
         *@date: 2019-06-17 11:19
         *@param: [id]
         *@return: edu.neu.hoso.model.ExpenseType
         *@throws:
         */
        return expenseTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ExpenseType> getExpenseTypeByCode(String code) {
        /**
         *@title: getExpenseTypeByCode
         *@description: 查询费用科目 经code
         *@author: Mike
         *@date: 2019-06-17 11:20
         *@param: [code]
         *@return: java.util.List<edu.neu.hoso.model.ExpenseType>
         *@throws:
         */
        ExpenseTypeExample expenseTypeExample = new ExpenseTypeExample();
        ExpenseTypeExample.Criteria criteria = expenseTypeExample.createCriteria();
        criteria.andExpenseTypeCodeEqualTo(code);
        return expenseTypeMapper.selectByExample(expenseTypeExample);
    }

    @Override
    public List<ExpenseType> getExpenseTypeByName(String name) {
        /**
         *@title: getExpenseTypeByName
         *@description: 查询费用科目 经name
         *@author: Mike
         *@date: 2019-06-17 11:20
         *@param: [name]
         *@return: java.util.List<edu.neu.hoso.model.ExpenseType>
         *@throws:
         */
        ExpenseTypeExample expenseTypeExample = new ExpenseTypeExample();
        ExpenseTypeExample.Criteria criteria = expenseTypeExample.createCriteria();
        criteria.andExpenseTypeNameEqualTo(name);
        return expenseTypeMapper.selectByExample(expenseTypeExample);
    }

    @Override
    public List<ExpenseType> getAllExpenseType() {
        /**
         *@title: getAllExpenseType
         *@description: 查询所有费用科目
         *@author: Mike
         *@date: 2019-06-17 11:21
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.ExpenseType>
         *@throws:
         */
        ExpenseTypeExample expenseTypeExample = new ExpenseTypeExample();
        return expenseTypeMapper.selectByExample(expenseTypeExample);
    }
}
