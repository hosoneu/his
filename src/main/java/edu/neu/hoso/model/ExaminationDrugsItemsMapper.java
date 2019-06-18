package edu.neu.hoso.model;

import edu.neu.hoso.example.ExaminationDrugsItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ExaminationDrugsItemsMapper {
    int countByExample(ExaminationDrugsItemsExample example);

    int deleteByExample(ExaminationDrugsItemsExample example);

    @Delete({
        "delete from examination_drugs_items",
        "where Examination_Drugs_Items_ID = #{examinationDrugsItemsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer examinationDrugsItemsId);

    @Insert({
        "insert into examination_drugs_items (Examination_Fmedical_Items_ID, ",
        "Drugs_ID, Doctor_ID, ",
        "Drugs_Usage, Quantity, ",
        "Actual_Quantity, Drugs_Dispensing_Status, ",
        "Expense_Items_ID, Times, ",
        "Days, Dosage)",
        "values (#{examinationFmedicalItemsId,jdbcType=INTEGER}, ",
        "#{drugsId,jdbcType=INTEGER}, #{doctorId,jdbcType=INTEGER}, ",
        "#{drugsUsage,jdbcType=CHAR}, #{quantity,jdbcType=INTEGER}, ",
        "#{actualQuantity,jdbcType=INTEGER}, #{drugsDispensingStatus,jdbcType=CHAR}, ",
        "#{expenseItemsId,jdbcType=INTEGER}, #{times,jdbcType=INTEGER}, ",
        "#{days,jdbcType=INTEGER}, #{dosage,jdbcType=DOUBLE})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="examinationDrugsItemsId", before=false, resultType=Integer.class)
    int insert(ExaminationDrugsItems record);

    int insertSelective(ExaminationDrugsItems record);

    List<ExaminationDrugsItems> selectByExample(ExaminationDrugsItemsExample example);

    @Select({
        "select",
        "Examination_Drugs_Items_ID, Examination_Fmedical_Items_ID, Drugs_ID, Doctor_ID, ",
        "Drugs_Usage, Quantity, Actual_Quantity, Drugs_Dispensing_Status, Expense_Items_ID, ",
        "Times, Days, Dosage",
        "from examination_drugs_items",
        "where Examination_Drugs_Items_ID = #{examinationDrugsItemsId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    ExaminationDrugsItems selectByPrimaryKey(Integer examinationDrugsItemsId);

    int updateByExampleSelective(@Param("record") ExaminationDrugsItems record, @Param("example") ExaminationDrugsItemsExample example);

    int updateByExample(@Param("record") ExaminationDrugsItems record, @Param("example") ExaminationDrugsItemsExample example);

    int updateByPrimaryKeySelective(ExaminationDrugsItems record);

    @Update({
        "update examination_drugs_items",
        "set Examination_Fmedical_Items_ID = #{examinationFmedicalItemsId,jdbcType=INTEGER},",
          "Drugs_ID = #{drugsId,jdbcType=INTEGER},",
          "Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Drugs_Usage = #{drugsUsage,jdbcType=CHAR},",
          "Quantity = #{quantity,jdbcType=INTEGER},",
          "Actual_Quantity = #{actualQuantity,jdbcType=INTEGER},",
          "Drugs_Dispensing_Status = #{drugsDispensingStatus,jdbcType=CHAR},",
          "Expense_Items_ID = #{expenseItemsId,jdbcType=INTEGER},",
          "Times = #{times,jdbcType=INTEGER},",
          "Days = #{days,jdbcType=INTEGER},",
          "Dosage = #{dosage,jdbcType=DOUBLE}",
        "where Examination_Drugs_Items_ID = #{examinationDrugsItemsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ExaminationDrugsItems record);

    //在检查检验药品中更改发药状态中更改发药状态
    List<ExaminationDrugsItems> selectDispensingInExamination(@Param("Medical_record_ID")int Medical_record_ID, @Param("DrugsId")int DrugsId);
}