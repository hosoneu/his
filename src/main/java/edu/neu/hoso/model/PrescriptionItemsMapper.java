package edu.neu.hoso.model;

import edu.neu.hoso.example.PrescriptionItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface PrescriptionItemsMapper {
    int countByExample(PrescriptionItemsExample example);

    int deleteByExample(PrescriptionItemsExample example);

    @Delete({
        "delete from prescription_items",
        "where Prescription_Items_ID = #{prescriptionItemsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer prescriptionItemsId);

    @Insert({
        "insert into prescription_items (Prescription_ID, Drags_ID, ",
        "Expense_Items_ID, Drugs_Usage, ",
        "Dosage, Times, Days, ",
        "Quantity, Drugs_Advice, ",
        "Drugs_Dispensing_Status, Actual_Quantity)",
        "values (#{prescriptionId,jdbcType=INTEGER}, #{dragsId,jdbcType=INTEGER}, ",
        "#{expenseItemsId,jdbcType=INTEGER}, #{drugsUsage,jdbcType=CHAR}, ",
        "#{dosage,jdbcType=DOUBLE}, #{times,jdbcType=INTEGER}, #{days,jdbcType=INTEGER}, ",
        "#{quantity,jdbcType=INTEGER}, #{drugsAdvice,jdbcType=VARCHAR}, ",
        "#{drugsDispensingStatus,jdbcType=CHAR}, #{actualQuantity,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="prescriptionItemsId", before=false, resultType=Integer.class)
    int insert(PrescriptionItems record);

    int insertSelective(PrescriptionItems record);

    List<PrescriptionItems> selectByExample(PrescriptionItemsExample example);

    @Select({
        "select",
        "Prescription_Items_ID, Prescription_ID, Drags_ID, Expense_Items_ID, Drugs_Usage, ",
        "Dosage, Times, Days, Quantity, Drugs_Advice, Drugs_Dispensing_Status, Actual_Quantity",
        "from prescription_items",
        "where Prescription_Items_ID = #{prescriptionItemsId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    PrescriptionItems selectByPrimaryKey(Integer prescriptionItemsId);

    int updateByExampleSelective(@Param("record") PrescriptionItems record, @Param("example") PrescriptionItemsExample example);

    int updateByExample(@Param("record") PrescriptionItems record, @Param("example") PrescriptionItemsExample example);

    int updateByPrimaryKeySelective(PrescriptionItems record);

    @Update({
        "update prescription_items",
        "set Prescription_ID = #{prescriptionId,jdbcType=INTEGER},",
          "Drags_ID = #{dragsId,jdbcType=INTEGER},",
          "Expense_Items_ID = #{expenseItemsId,jdbcType=INTEGER},",
          "Drugs_Usage = #{drugsUsage,jdbcType=CHAR},",
          "Dosage = #{dosage,jdbcType=DOUBLE},",
          "Times = #{times,jdbcType=INTEGER},",
          "Days = #{days,jdbcType=INTEGER},",
          "Quantity = #{quantity,jdbcType=INTEGER},",
          "Drugs_Advice = #{drugsAdvice,jdbcType=VARCHAR},",
          "Drugs_Dispensing_Status = #{drugsDispensingStatus,jdbcType=CHAR},",
          "Actual_Quantity = #{actualQuantity,jdbcType=INTEGER}",
        "where Prescription_Items_ID = #{prescriptionItemsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PrescriptionItems record);

    //在处方中更改发药状态
    List<PrescriptionItems> selectDispensingInPrescription(@Param("Medical_record_ID")int Medical_record_ID, @Param("DrugsId")int DrugsId);

}