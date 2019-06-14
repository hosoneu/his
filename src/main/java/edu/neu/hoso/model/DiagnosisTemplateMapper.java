package edu.neu.hoso.model;

import edu.neu.hoso.example.DiagnosisTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface DiagnosisTemplateMapper {
    int countByExample(DiagnosisTemplateExample example);

    int deleteByExample(DiagnosisTemplateExample example);

    @Delete({
        "delete from diagnosis_template",
        "where Diagnosis_Template_ID = #{diagnosisTemplateId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer diagnosisTemplateId);

    @Insert({
        "insert into diagnosis_template (Medical_Record_Home_Page_Template_ID, ",
        "Disease_ID, Main_Diagnosis_Mark, ",
        "Suspect_Mark)",
        "values (#{medicalRecordHomePageTemplateId,jdbcType=INTEGER}, ",
        "#{diseaseId,jdbcType=INTEGER}, #{mainDiagnosisMark,jdbcType=CHAR}, ",
        "#{suspectMark,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="diagnosisTemplateId", before=false, resultType=Integer.class)
    int insert(DiagnosisTemplate record);

    int insertSelective(DiagnosisTemplate record);

    List<DiagnosisTemplate> selectByExample(DiagnosisTemplateExample example);

    @Select({
        "select",
        "Diagnosis_Template_ID, Medical_Record_Home_Page_Template_ID, Disease_ID, Main_Diagnosis_Mark, ",
        "Suspect_Mark",
        "from diagnosis_template",
        "where Diagnosis_Template_ID = #{diagnosisTemplateId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    DiagnosisTemplate selectByPrimaryKey(Integer diagnosisTemplateId);

    int updateByExampleSelective(@Param("record") DiagnosisTemplate record, @Param("example") DiagnosisTemplateExample example);

    int updateByExample(@Param("record") DiagnosisTemplate record, @Param("example") DiagnosisTemplateExample example);

    int updateByPrimaryKeySelective(DiagnosisTemplate record);

    @Update({
        "update diagnosis_template",
        "set Medical_Record_Home_Page_Template_ID = #{medicalRecordHomePageTemplateId,jdbcType=INTEGER},",
          "Disease_ID = #{diseaseId,jdbcType=INTEGER},",
          "Main_Diagnosis_Mark = #{mainDiagnosisMark,jdbcType=CHAR},",
          "Suspect_Mark = #{suspectMark,jdbcType=CHAR}",
        "where Diagnosis_Template_ID = #{diagnosisTemplateId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DiagnosisTemplate record);
}