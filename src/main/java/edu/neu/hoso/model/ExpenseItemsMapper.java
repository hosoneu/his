package edu.neu.hoso.model;

import edu.neu.hoso.example.ExpenseItemsExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ExpenseItemsMapper {

    int countByExample(ExpenseItemsExample example);

    int deleteByExample(ExpenseItemsExample example);

    @Delete({
        "delete from expense_items",
        "where Expense_Items_ID = #{expenseItemsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer expenseItemsId);

    @Insert({
        "insert into expense_items (Medical_Record_ID, Total_Cost, ",
        "Pay_Status, Invoice_ID, ",
        "Expense_Type_ID)",
        "values (#{medicalRecordId,jdbcType=INTEGER}, #{totalCost,jdbcType=DOUBLE}, ",
        "#{payStatus,jdbcType=CHAR}, #{invoiceId,jdbcType=INTEGER}, ",
        "#{expenseTypeId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="expenseItemsId", before=false, resultType=Integer.class)
    int insert(ExpenseItems record);

    int insertSelective(ExpenseItems record);

    List<ExpenseItems> selectByExample(ExpenseItemsExample example);

    @Select({
        "select",
        "Expense_Items_ID, Medical_Record_ID, Total_Cost, Pay_Status, Invoice_ID, Expense_Type_ID",
        "from expense_items",
        "where Expense_Items_ID = #{expenseItemsId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    ExpenseItems selectByPrimaryKey(Integer expenseItemsId);

    int updateByExampleSelective(@Param("record") ExpenseItems record, @Param("example") ExpenseItemsExample example);

    int updateByExample(@Param("record") ExpenseItems record, @Param("example") ExpenseItemsExample example);

    int updateByPrimaryKeySelective(ExpenseItems record);

    @Update({
        "update expense_items",
        "set Medical_Record_ID = #{medicalRecordId,jdbcType=INTEGER},",
          "Total_Cost = #{totalCost,jdbcType=DOUBLE},",
          "Pay_Status = #{payStatus,jdbcType=CHAR},",
          "Invoice_ID = #{invoiceId,jdbcType=INTEGER},",
          "Expense_Type_ID = #{expenseTypeId,jdbcType=INTEGER}",
        "where Expense_Items_ID = #{expenseItemsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ExpenseItems record);
}