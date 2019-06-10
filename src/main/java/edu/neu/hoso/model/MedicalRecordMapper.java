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
        "insert into medical_record (Medical_Record_ID, Is_Treament_Over)",
        "values (#{medicalRecordId,jdbcType=INTEGER}, #{isTreamentOver,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="medicalRecordId", before=true, resultType=Integer.class)
    int insert(MedicalRecord record);

    int insertSelective(MedicalRecord record);

    List<MedicalRecord> selectByExample(MedicalRecordExample example);

    @Select({
        "select",
        "Medical_Record_ID, Is_Treament_Over",
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
        "set Is_Treament_Over = #{isTreamentOver,jdbcType=CHAR}",
        "where Medical_Record_ID = #{medicalRecordId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MedicalRecord record);
}