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
        "insert into prescription (Prescription_ID, Medical_Record_ID, ",
        "Doctor_ID, Submit_Time, ",
        "Prescription_Type)",
        "values (#{prescriptionId,jdbcType=INTEGER}, #{medicalRecordId,jdbcType=INTEGER}, ",
        "#{doctorId,jdbcType=INTEGER}, #{submitTime,jdbcType=TIMESTAMP}, ",
        "#{prescriptionType,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="prescriptionId", before=true, resultType=Integer.class)
    int insert(Prescription record);

    int insertSelective(Prescription record);

    List<Prescription> selectByExample(PrescriptionExample example);

    @Select({
        "select",
        "Prescription_ID, Medical_Record_ID, Doctor_ID, Submit_Time, Prescription_Type",
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
          "Prescription_Type = #{prescriptionType,jdbcType=CHAR}",
        "where Prescription_ID = #{prescriptionId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Prescription record);
}