package edu.neu.hoso.model;

import edu.neu.hoso.example.MedicalRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface MedicalRecordMapper {
    int countByExample(MedicalRecordExample example);

    int deleteByExample(MedicalRecordExample example);

    @Delete({
        "delete from medical_record",
        "where Medical_Record_ID = #{medicalRecordId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer medicalRecordId);

    @Insert({
        "insert into medical_record (Doctor_ID, Is_Treament_Over, ",
        "First_Diagnosis_Doctor_ID, Final_Diagnosis_Doctor_ID, ",
        "First_Diagnosis_Time, Final_Diagnosis_Time)",
        "values (#{doctorId,jdbcType=INTEGER}, #{isTreamentOver,jdbcType=CHAR}, ",
        "#{firstDiagnosisDoctorId,jdbcType=INTEGER}, #{finalDiagnosisDoctorId,jdbcType=INTEGER}, ",
        "#{firstDiagnosisTime,jdbcType=TIMESTAMP}, #{finalDiagnosisTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="medicalRecordId", before=false, resultType=Integer.class)
    int insert(MedicalRecord record);

    int insertSelective(MedicalRecord record);

    List<MedicalRecord> selectByExample(MedicalRecordExample example);

    @Select({
        "select",
        "Medical_Record_ID, Doctor_ID, Is_Treament_Over, First_Diagnosis_Doctor_ID, Final_Diagnosis_Doctor_ID, ",
        "First_Diagnosis_Time, Final_Diagnosis_Time",
        "from medical_record",
        "where Medical_Record_ID = #{medicalRecordId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    MedicalRecord selectByPrimaryKey(Integer medicalRecordId);

    int updateByExampleSelective(@Param("record") MedicalRecord record, @Param("example") MedicalRecordExample example);

    int updateByExample(@Param("record") MedicalRecord record, @Param("example") MedicalRecordExample example);

    int updateByPrimaryKeySelective(MedicalRecord record);

    @Update({
        "update medical_record",
        "set Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Is_Treament_Over = #{isTreamentOver,jdbcType=CHAR},",
          "First_Diagnosis_Doctor_ID = #{firstDiagnosisDoctorId,jdbcType=INTEGER},",
          "Final_Diagnosis_Doctor_ID = #{finalDiagnosisDoctorId,jdbcType=INTEGER},",
          "First_Diagnosis_Time = #{firstDiagnosisTime,jdbcType=TIMESTAMP},",
          "Final_Diagnosis_Time = #{finalDiagnosisTime,jdbcType=TIMESTAMP}",
        "where Medical_Record_ID = #{medicalRecordId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MedicalRecord record);

    /**
     * @title: listMedicalRecordHistoryByPatientId
     * @description: 展示历史病历
     * @author: 29-y
     * @date: 2019-06-16 21:35
     * @param: [patientId]
     * @return: java.util.List<edu.neu.hoso.model.MedicalRecord>
     * @throws:
     */
    @Select({
            "select m.*,p.*,dia.*,dis.* " ,
            "from registration r join medical_record m on r.Medical_Record_ID = m.Medical_Record_ID join medical_record_home_page p on p.Medical_Record_ID = m.Medical_Record_ID join diagnosis dia on dia.Medical_Record_ID = m.Medical_Record_ID join disease " ,
            "dis on dia.Disease_ID = dis.Disease_ID " ,
            "where r.Registration_Status=\"1\" and m.Is_Treament_Over = \"2\" and r.Patient_ID = #{patientId,jdbcType=INTEGER}"
    })
    @ResultMap("SecondResultMap")
    List<MedicalRecord> listMedicalRecordHistoryByPatientId(Integer patientId);
}