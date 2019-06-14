package edu.neu.hoso.model;

import edu.neu.hoso.example.TreatmentItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface TreatmentItemsMapper {
    int countByExample(TreatmentItemsExample example);

    int deleteByExample(TreatmentItemsExample example);

    @Delete({
        "delete from treatment_items",
        "where Treatment_Items_ID = #{treatmentItemsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer treatmentItemsId);

    @Insert({
        "insert into treatment_items (Treatment_ID, Fmedical_Items_ID, ",
        "Quantity, Actual_Quantity, ",
        "Expense_Items_ID, Valid_Status)",
        "values (#{treatmentId,jdbcType=INTEGER}, #{fmedicalItemsId,jdbcType=INTEGER}, ",
        "#{quantity,jdbcType=INTEGER}, #{actualQuantity,jdbcType=INTEGER}, ",
        "#{expenseItemsId,jdbcType=INTEGER}, #{validStatus,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="treatmentItemsId", before=false, resultType=Integer.class)
    int insert(TreatmentItems record);

    int insertSelective(TreatmentItems record);

    List<TreatmentItems> selectByExample(TreatmentItemsExample example);

    @Select({
        "select",
        "Treatment_Items_ID, Treatment_ID, Fmedical_Items_ID, Quantity, Actual_Quantity, ",
        "Expense_Items_ID, Valid_Status",
        "from treatment_items",
        "where Treatment_Items_ID = #{treatmentItemsId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    TreatmentItems selectByPrimaryKey(Integer treatmentItemsId);

    int updateByExampleSelective(@Param("record") TreatmentItems record, @Param("example") TreatmentItemsExample example);

    int updateByExample(@Param("record") TreatmentItems record, @Param("example") TreatmentItemsExample example);

    int updateByPrimaryKeySelective(TreatmentItems record);

    @Update({
        "update treatment_items",
        "set Treatment_ID = #{treatmentId,jdbcType=INTEGER},",
          "Fmedical_Items_ID = #{fmedicalItemsId,jdbcType=INTEGER},",
          "Quantity = #{quantity,jdbcType=INTEGER},",
          "Actual_Quantity = #{actualQuantity,jdbcType=INTEGER},",
          "Expense_Items_ID = #{expenseItemsId,jdbcType=INTEGER},",
          "Valid_Status = #{validStatus,jdbcType=VARCHAR}",
        "where Treatment_Items_ID = #{treatmentItemsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TreatmentItems record);
}