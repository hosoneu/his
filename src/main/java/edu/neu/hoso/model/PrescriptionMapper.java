package edu.neu.hoso.model;

import edu.neu.hoso.example.PrescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface PrescriptionMapper {
    int countByExample(PrescriptionExample example);

    int deleteByExample(PrescriptionExample example);

    @Delete({
        "delete from prescription",
        "where Prescription_ID = #{prescriptionId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer prescriptionId);

    @Insert({
        "insert into prescription (Medical_Record_ID, Doctor_ID, ",
        "Submit_Time, Prescription_Type, ",
        "Valid_Status)",
        "values (#{medicalRecordId,jdbcType=INTEGER}, #{doctorId,jdbcType=INTEGER}, ",
        "#{submitTime,jdbcType=TIMESTAMP}, #{prescriptionType,jdbcType=CHAR}, ",
        "#{validStatus,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="prescriptionId", before=false, resultType=Integer.class)
    int insert(Prescription record);

    int insertSelective(Prescription record);

    List<Prescription> selectByExample(PrescriptionExample example);

    @Select({
        "select",
        "Prescription_ID, Medical_Record_ID, Doctor_ID, Submit_Time, Prescription_Type, ",
        "Valid_Status",
        "from prescription",
        "where Prescription_ID = #{prescriptionId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Prescription selectByPrimaryKey(Integer prescriptionId);

    int updateByExampleSelective(@Param("record") Prescription record, @Param("example") PrescriptionExample example);

    int updateByExample(@Param("record") Prescription record, @Param("example") PrescriptionExample example);

    int updateByPrimaryKeySelective(Prescription record);

    @Update({
        "update prescription",
        "set Medical_Record_ID = #{medicalRecordId,jdbcType=INTEGER},",
          "Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Submit_Time = #{submitTime,jdbcType=TIMESTAMP},",
          "Prescription_Type = #{prescriptionType,jdbcType=CHAR},",
          "Valid_Status = #{validStatus,jdbcType=CHAR}",
        "where Prescription_ID = #{prescriptionId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Prescription record);

    @Select({
            "select p.*,items.*,d.* " ,
            "from prescription p join prescription_items items on p.Prescription_ID = items.Prescription_ID join drugs d on items.Drags_ID = d.Drugs_ID " ,
            "where p.Prescription_ID = #{prescriptionId,jdbcType=INTEGER} "
    })
    @ResultMap("SecondResultMap")
    Prescription selectPrescriptionById(Integer prescriptionId);

    //成药
    @Select({
            "select p.*,items.*,d.* " ,
            "from prescription p join prescription_items items on p.Prescription_ID = items.Prescription_ID join drugs d on items.Drags_ID = d.Drugs_ID " ,
            "where p.Medical_Record_ID = #{medicalRecordId,jdbcType=INTEGER} and p.Prescription_Type = \"1\" "
    })
    @ResultMap("SecondResultMap")
    List<Prescription> listPatentPrescriptionByMedicalRecordId(Integer medicalRecordId);

    @Select({
            "select p.*,items.*,d.* " ,
            "from prescription p join prescription_items items on p.Prescription_ID = items.Prescription_ID join drugs d on items.Drags_ID = d.Drugs_ID " ,
            "where p.Prescription_ID = #{prescriptionId,jdbcType=INTEGER} and p.Prescription_Type = \"1\" "
    })
    @ResultMap("SecondResultMap")
    Prescription selectPatentPrescriptionById(Integer prescriptionId);

    //草药
    @Select({
            "select p.*,items.*,d.* " ,
            "from prescription p join prescription_items items on p.Prescription_ID = items.Prescription_ID join drugs d on items.Drags_ID = d.Drugs_ID " ,
            "where p.Medical_Record_ID = #{medicalRecordId,jdbcType=INTEGER} and p.Prescription_Type = \"2\" "
    })
    @ResultMap("SecondResultMap")
    List<Prescription> listHerbalPrescriptionByMedicalRecordId(Integer medicalRecordId);

    @Select({
            "select p.*,items.*,d.* " ,
            "from prescription p join prescription_items items on p.Prescription_ID = items.Prescription_ID join drugs d on items.Drags_ID = d.Drugs_ID " ,
            "where p.Prescription_ID = #{prescriptionId,jdbcType=INTEGER} and p.Prescription_Type = \"2\" "
    })
    @ResultMap("SecondResultMap")
    Prescription selectHerbalPrescriptionById(Integer prescriptionId);

//    获得所有药房处方药
    List<Prescription> getAllPrescriptionMedical();
}