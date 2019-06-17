package edu.neu.hoso.service;

import edu.neu.hoso.model.ExpenseType;

import java.util.List;

/**
 * @title: ExpenseTypeService
 * @package edu.neu.hoso.service
 * @description: 费用科目类业务接口
 * @author: Mike
 * @date: 2019-06-17 11:14
 * @version: V1.0
*/
public interface ExpenseTypeService {
    Integer insertSelective(ExpenseType expenseType);
    void deleteById(Integer id);
    void deleteByCode(String code);
    void deleteByName(String name);
    void update(ExpenseType expenseType);
    ExpenseType getExpenseTypeById(Integer id);
    List<ExpenseType> getExpenseTypeByCode(String code);
    List<ExpenseType> getExpenseTypeByName(String name);
    List<ExpenseType> getAllExpenseType();
}
