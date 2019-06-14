package edu.neu.hoso.model;

import edu.neu.hoso.example.MedicalRecordHomePageExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface MedicalRecordHomePageMapper {
    int countByExample(MedicalRecordHomePageExample example);

    int deleteByExample(MedicalRecordHomePageExample example);

    @Delete({
        "delete from medical_record_home_page",
        "where Medical_Record_Home_Page_ID = #{medicalRecordHomePageId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer medicalRecordHomePageId);

    @Insert({
        "insert into medical_record_home_page (Medical_Record_ID, Doctor_ID, ",
        "Chief_Complaint, Present_History, ",
        "Present_Treatment, Past_History, ",
        "Allergic_History, Physical_Examination, ",
        "Assistant_Examination)",
        "values (#{medicalRecordId,jdbcType=INTEGER}, #{doctorId,jdbcType=INTEGER}, ",
        "#{chiefComplaint,jdbcType=VARCHAR}, #{presentHistory,jdbcType=VARCHAR}, ",
        "#{presentTreatment,jdbcType=VARCHAR}, #{pastHistory,jdbcType=VARCHAR}, ",
        "#{allergicHistory,jdbcType=VARCHAR}, #{physicalExamination,jdbcType=VARCHAR}, ",
        "#{assistantExamination,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="medicalRecordHomePageId", before=false, resultType=Integer.class)
    int insert(MedicalRecordHomePage record);

    int insertSelective(MedicalRecordHomePage record);

    List<MedicalRecordHomePage> selectByExample(MedicalRecordHomePageExample example);

    @Select({
        "select",
        "Medical_Record_Home_Page_ID, Medical_Record_ID, Doctor_ID, Chief_Complaint, ",
        "Present_History, Present_Treatment, Past_History, Allergic_History, Physical_Examination, ",
        "Assistant_Examination",
        "from medical_record_home_page",
        "where Medical_Record_Home_Page_ID = #{medicalRecordHomePageId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    MedicalRecordHomePage selectByPrimaryKey(Integer medicalRecordHomePageId);

    int updateByExampleSelective(@Param("record") MedicalRecordHomePage record, @Param("example") MedicalRecordHomePageExample example);

    int updateByExample(@Param("record") MedicalRecordHomePage record, @Param("example") MedicalRecordHomePageExample example);

    int updateByPrimaryKeySelective(MedicalRecordHomePage record);

    @Update({
        "update medical_record_home_page",
        "set Medical_Record_ID = #{medicalRecordId,jdbcType=INTEGER},",
          "Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Chief_Complaint = #{chiefComplaint,jdbcType=VARCHAR},",
          "Present_History = #{presentHistory,jdbcType=VARCHAR},",
          "Present_Treatment = #{presentTreatment,jdbcType=VARCHAR},",
          "Past_History = #{pastHistory,jdbcType=VARCHAR},",
          "Allergic_History = #{allergicHistory,jdbcType=VARCHAR},",
          "Physical_Examination = #{physicalExamination,jdbcType=VARCHAR},",
          "Assistant_Examination = #{assistantExamination,jdbcType=VARCHAR}",
        "where Medical_Record_Home_Page_ID = #{medicalRecordHomePageId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MedicalRecordHomePage record);
}