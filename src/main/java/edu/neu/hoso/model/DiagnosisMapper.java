package edu.neu.hoso.model;

import edu.neu.hoso.example.DiagnosisExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface DiagnosisMapper {
    int countByExample(DiagnosisExample example);

    int deleteByExample(DiagnosisExample example);

    @Delete({
        "delete from diagnosis",
        "where Diagnosis_ID = #{diagnosisId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer diagnosisId);

    @Insert({
        "insert into diagnosis (Diagnosis_ID, Disease_ID, ",
        "Medical_Record_ID, Main_Diagnosis_Mark, ",
        "Suspect_Mark, Onset_Date, ",
        "Diagnosis_Mark)",
        "values (#{diagnosisId,jdbcType=INTEGER}, #{diseaseId,jdbcType=INTEGER}, ",
        "#{medicalRecordId,jdbcType=INTEGER}, #{mainDiagnosisMark,jdbcType=CHAR}, ",
        "#{suspectMark,jdbcType=CHAR}, #{onsetDate,jdbcType=DATE}, ",
        "#{diagnosisMark,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="diagnosisId", before=true, resultType=Integer.class)
    int insert(Diagnosis record);

    int insertSelective(Diagnosis record);

    List<Diagnosis> selectByExample(DiagnosisExample example);

    @Select({
        "select",
        "Diagnosis_ID, Disease_ID, Medical_Record_ID, Main_Diagnosis_Mark, Suspect_Mark, ",
        "Onset_Date, Diagnosis_Mark",
        "from diagnosis",
        "where Diagnosis_ID = #{diagnosisId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Diagnosis selectByPrimaryKey(Integer diagnosisId);

    int updateByExampleSelective(@Param("record") Diagnosis record, @Param("example") DiagnosisExample example);

    int updateByExample(@Param("record") Diagnosis record, @Param("example") DiagnosisExample example);

    int updateByPrimaryKeySelective(Diagnosis record);

    @Update({
        "update diagnosis",
        "set Disease_ID = #{diseaseId,jdbcType=INTEGER},",
          "Medical_Record_ID = #{medicalRecordId,jdbcType=INTEGER},",
          "Main_Diagnosis_Mark = #{mainDiagnosisMark,jdbcType=CHAR},",
          "Suspect_Mark = #{suspectMark,jdbcType=CHAR},",
          "Onset_Date = #{onsetDate,jdbcType=DATE},",
          "Diagnosis_Mark = #{diagnosisMark,jdbcType=CHAR}",
        "where Diagnosis_ID = #{diagnosisId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Diagnosis record);
}