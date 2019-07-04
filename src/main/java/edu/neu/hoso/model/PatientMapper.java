package edu.neu.hoso.model;

import edu.neu.hoso.example.PatientExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface PatientMapper {
    int countByExample(PatientExample example);

    int deleteByExample(PatientExample example);

    @Delete({
        "delete from patient",
        "where Patient_ID = #{patientId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer patientId);

    @Insert({
        "insert into patient (Patient_Name, Patient_Gender, ",
        "Patient_Birth, Patient_Age, ",
        "Patient_IDentity, Patient_Address)",
        "values (#{patientName,jdbcType=VARCHAR}, #{patientGender,jdbcType=CHAR}, ",
        "#{patientBirth,jdbcType=DATE}, #{patientAge,jdbcType=INTEGER}, ",
        "#{patientIdentity,jdbcType=VARCHAR}, #{patientAddress,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="patientId", before=false, resultType=Integer.class)
    int insert(Patient record);

    int insertSelective(Patient record);

    List<Patient> selectByExample(PatientExample example);

    @Select({
        "select",
        "Patient_ID, Patient_Name, Patient_Gender, Patient_Birth, Patient_Age, Patient_IDentity, ",
        "Patient_Address",
        "from patient",
        "where Patient_ID = #{patientId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Patient selectByPrimaryKey(Integer patientId);

    int updateByExampleSelective(@Param("record") Patient record, @Param("example") PatientExample example);

    int updateByExample(@Param("record") Patient record, @Param("example") PatientExample example);

    int updateByPrimaryKeySelective(Patient record);

    @Update({
        "update patient",
        "set Patient_Name = #{patientName,jdbcType=VARCHAR},",
          "Patient_Gender = #{patientGender,jdbcType=CHAR},",
          "Patient_Birth = #{patientBirth,jdbcType=DATE},",
          "Patient_Age = #{patientAge,jdbcType=INTEGER},",
          "Patient_IDentity = #{patientIdentity,jdbcType=VARCHAR},",
          "Patient_Address = #{patientAddress,jdbcType=VARCHAR}",
        "where Patient_ID = #{patientId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Patient record);

    //根据病历号获得Patient
    Patient getPatientById(@Param("medicalRecordId")int medicalRecordId);
}