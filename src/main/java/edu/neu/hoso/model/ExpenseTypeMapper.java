package edu.neu.hoso.model;

import edu.neu.hoso.example.ExpenseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ExpenseTypeMapper {
    int countByExample(ExpenseTypeExample example);

    int deleteByExample(ExpenseTypeExample example);

    @Delete({
        "delete from expense_type",
        "where Expense_Type_ID = #{expenseTypeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer expenseTypeId);

    @Insert({
        "insert into expense_type (Expense_Type_Code, Expense_Type_Name)",
        "values (#{expenseTypeCode,jdbcType=VARCHAR}, #{expenseTypeName,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="expenseTypeId", before=false, resultType=Integer.class)
    int insert(ExpenseType record);

    int insertSelective(ExpenseType record);

    List<ExpenseType> selectByExample(ExpenseTypeExample example);

    @Select({
        "select",
        "Expense_Type_ID, Expense_Type_Code, Expense_Type_Name",
        "from expense_type",
        "where Expense_Type_ID = #{expenseTypeId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    ExpenseType selectByPrimaryKey(Integer expenseTypeId);

    int updateByExampleSelective(@Param("record") ExpenseType record, @Param("example") ExpenseTypeExample example);

    int updateByExample(@Param("record") ExpenseType record, @Param("example") ExpenseTypeExample example);

    int updateByPrimaryKeySelective(ExpenseType record);

    @Update({
        "update expense_type",
        "set Expense_Type_Code = #{expenseTypeCode,jdbcType=VARCHAR},",
          "Expense_Type_Name = #{expenseTypeName,jdbcType=VARCHAR}",
        "where Expense_Type_ID = #{expenseTypeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ExpenseType record);
}