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
        "insert into diagnosis (Disease_ID, Medical_Record_ID, ",
        "Main_Diagnosis_Mark, Suspect_Mark, ",
        "Onset_Date, Diagnosis_Mark)",
        "values (#{diseaseId,jdbcType=INTEGER}, #{medicalRecordId,jdbcType=INTEGER}, ",
        "#{mainDiagnosisMark,jdbcType=CHAR}, #{suspectMark,jdbcType=CHAR}, ",
        "#{onsetDate,jdbcType=DATE}, #{diagnosisMark,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="diagnosisId", before=false, resultType=Integer.class)
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

    /**
     * @title: listFirstDiagnosisByMedicalRecordId
     * @description: 列出病历ID对应的初诊信息
     * @author: 29-y
     * @date: 2019-06-26 1:11
     * @param: [medicalRecordId]
     * @return: java.util.List<edu.neu.hoso.model.Diagnosis>
     * @throws:
     */
    @Select({
            "select dia.*,dis.* " ,
            "from diagnosis dia join disease dis on dia.Disease_ID = dis.Disease_ID " ,
            "where dia.Medical_Record_ID=#{medicalRecordId,jdbcType=INTEGER} and dia.Diagnosis_Mark=#{type,jdbcType=CHAR} "
    })
    @ResultMap("SecondResultMap")
    List<Diagnosis> listDiagnosisByMedicalRecordId(Integer medicalRecordId,String type);
}