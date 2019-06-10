package edu.neu.hoso.model;

import edu.neu.hoso.example.ExpenseItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ExpenseItemsMapper {
    int countByExample(ExpenseItemsExample example);

    int deleteByExample(ExpenseItemsExample example);

    @Delete({
        "delete from expense_items",
        "where Expense_Items_ID = #{expenseItemsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer expenseItemsId);

    @Insert({
        "insert into expense_items (Expense_Items_ID, Medical_Record_ID, ",
        "Total_Cost, Pay_Status, ",
        "Is_Day_Cal, Pay_Time, ",
        "Invoice_NO, Pay_Mode_ID, ",
        "User_ID)",
        "values (#{expenseItemsId,jdbcType=INTEGER}, #{medicalRecordId,jdbcType=INTEGER}, ",
        "#{totalCost,jdbcType=DECIMAL}, #{payStatus,jdbcType=CHAR}, ",
        "#{isDayCal,jdbcType=CHAR}, #{payTime,jdbcType=TIMESTAMP}, ",
        "#{invoiceNo,jdbcType=INTEGER}, #{payModeId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="expenseItemsId", before=true, resultType=Integer.class)
    int insert(ExpenseItems record);

    int insertSelective(ExpenseItems record);

    List<ExpenseItems> selectByExample(ExpenseItemsExample example);

    @Select({
        "select",
        "Expense_Items_ID, Medical_Record_ID, Total_Cost, Pay_Status, Is_Day_Cal, Pay_Time, ",
        "Invoice_NO, Pay_Mode_ID, User_ID",
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
          "Total_Cost = #{totalCost,jdbcType=DECIMAL},",
          "Pay_Status = #{payStatus,jdbcType=CHAR},",
          "Is_Day_Cal = #{isDayCal,jdbcType=CHAR},",
          "Pay_Time = #{payTime,jdbcType=TIMESTAMP},",
          "Invoice_NO = #{invoiceNo,jdbcType=INTEGER},",
          "Pay_Mode_ID = #{payModeId,jdbcType=INTEGER},",
          "User_ID = #{userId,jdbcType=INTEGER}",
        "where Expense_Items_ID = #{expenseItemsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ExpenseItems record);
}