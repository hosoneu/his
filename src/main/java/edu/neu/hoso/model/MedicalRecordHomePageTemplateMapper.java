package edu.neu.hoso.model;

import edu.neu.hoso.example.MedicalRecordHomePageTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface MedicalRecordHomePageTemplateMapper {
    int countByExample(MedicalRecordHomePageTemplateExample example);

    int deleteByExample(MedicalRecordHomePageTemplateExample example);

    @Delete({
        "delete from medical_record_home_page_template",
        "where Medical_Record_Home_Page_Template_ID = #{medicalRecordHomePageTemplateId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer medicalRecordHomePageTemplateId);

    @Insert({
        "insert into medical_record_home_page_template (Doctor_ID, Name, ",
        "Scope, Chief_Complaint, ",
        "Present_History, Physical_Examination)",
        "values (#{doctorId,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{scope,jdbcType=CHAR}, #{chiefComplaint,jdbcType=VARCHAR}, ",
        "#{presentHistory,jdbcType=VARCHAR}, #{physicalExamination,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="medicalRecordHomePageTemplateId", before=false, resultType=Integer.class)
    int insert(MedicalRecordHomePageTemplate record);

    int insertSelective(MedicalRecordHomePageTemplate record);

    List<MedicalRecordHomePageTemplate> selectByExample(MedicalRecordHomePageTemplateExample example);

    @Select({
        "select",
        "Medical_Record_Home_Page_Template_ID, Doctor_ID, Name, Scope, Chief_Complaint, ",
        "Present_History, Physical_Examination",
        "from medical_record_home_page_template",
        "where Medical_Record_Home_Page_Template_ID = #{medicalRecordHomePageTemplateId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    MedicalRecordHomePageTemplate selectByPrimaryKey(Integer medicalRecordHomePageTemplateId);

    int updateByExampleSelective(@Param("record") MedicalRecordHomePageTemplate record, @Param("example") MedicalRecordHomePageTemplateExample example);

    int updateByExample(@Param("record") MedicalRecordHomePageTemplate record, @Param("example") MedicalRecordHomePageTemplateExample example);

    int updateByPrimaryKeySelective(MedicalRecordHomePageTemplate record);

    @Update({
        "update medical_record_home_page_template",
        "set Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Name = #{name,jdbcType=VARCHAR},",
          "Scope = #{scope,jdbcType=CHAR},",
          "Chief_Complaint = #{chiefComplaint,jdbcType=VARCHAR},",
          "Present_History = #{presentHistory,jdbcType=VARCHAR},",
          "Physical_Examination = #{physicalExamination,jdbcType=VARCHAR}",
        "where Medical_Record_Home_Page_Template_ID = #{medicalRecordHomePageTemplateId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MedicalRecordHomePageTemplate record);

    @Select({
            "select m.*,d.*,disease.* " ,
            "from medical_record_home_page_template m join diagnosis_template d on m.Medical_Record_Home_Page_Template_ID = d.Medical_Record_Home_Page_Template_ID join disease on disease.Disease_ID = d.Disease_ID " ,
            "where m.Scope=\"1\" and m.Doctor_ID = #{userId,jdbcType=INTEGER} "
    })
    @ResultMap("SecondResultMap")
    List<MedicalRecordHomePageTemplate> listMedicalRecordHomePageTemplateFromUser(Integer userId);

    @Select({
            "select m.*,d.*,disease.* " ,
            "from medical_record_home_page_template m join diagnosis_template d on m.Medical_Record_Home_Page_Template_ID = d.Medical_Record_Home_Page_Template_ID join `user` create_doctor on create_doctor.User_ID = m.Doctor_ID join disease on disease.Disease_ID = d.Disease_ID " ,
            "where m.Scope=\"2\" and EXISTS ( " ,
            "select * " ,
            "from `user` doctor " ,
            "where doctor.Department_ID = create_doctor.Department_ID and doctor.User_ID= #{userId,jdbcType=INTEGER} " ,
            ")"
    })
    @ResultMap("SecondResultMap")
    List<MedicalRecordHomePageTemplate> listMedicalRecordHomePageTemplateFromDepartment(Integer userId);

    @Select({
            "select m.*,d.*,disease.* " ,
            "from medical_record_home_page_template m join diagnosis_template d on m.Medical_Record_Home_Page_Template_ID = d.Medical_Record_Home_Page_Template_ID join disease on disease.Disease_ID = d.Disease_ID " ,
            "where m.Scope=\"3\" "
    })
    @ResultMap("SecondResultMap")
    List<MedicalRecordHomePageTemplate> listMedicalRecordHomePageTemplateFromHospital();

    @Select({
            "select m.*,d.*,disease.* " ,
            "from medical_record_home_page_template m join diagnosis_template d on m.Medical_Record_Home_Page_Template_ID = d.Medical_Record_Home_Page_Template_ID join disease on disease.Disease_ID = d.Disease_ID " ,
            "where m.Medical_Record_Home_Page_Template_ID = #{userId,jdbcType=INTEGER} "
    })
    @ResultMap("SecondResultMap")
    MedicalRecordHomePageTemplate selectMedicalRecordHomePageTemplateById(Integer medicalRecordHomePageTemplateId);
}