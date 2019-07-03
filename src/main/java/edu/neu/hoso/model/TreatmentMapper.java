package edu.neu.hoso.model;

import edu.neu.hoso.example.TreatmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface TreatmentMapper {
    int countByExample(TreatmentExample example);

    int deleteByExample(TreatmentExample example);

    @Delete({
        "delete from treatment",
        "where Treatment_ID = #{treatmentId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer treatmentId);

    @Insert({
        "insert into treatment (Medical_Record_ID, Doctor_ID, ",
        "Submit_Time)",
        "values (#{medicalRecordId,jdbcType=INTEGER}, #{doctorId,jdbcType=INTEGER}, ",
        "#{submitTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="treatmentId", before=false, resultType=Integer.class)
    int insert(Treatment record);

    int insertSelective(Treatment record);

    List<Treatment> selectByExample(TreatmentExample example);

    @Select({
        "select",
        "Treatment_ID, Medical_Record_ID, Doctor_ID, Submit_Time",
        "from treatment",
        "where Treatment_ID = #{treatmentId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Treatment selectByPrimaryKey(Integer treatmentId);

    int updateByExampleSelective(@Param("record") Treatment record, @Param("example") TreatmentExample example);

    int updateByExample(@Param("record") Treatment record, @Param("example") TreatmentExample example);

    int updateByPrimaryKeySelective(Treatment record);

    @Update({
        "update treatment",
        "set Medical_Record_ID = #{medicalRecordId,jdbcType=INTEGER},",
          "Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Submit_Time = #{submitTime,jdbcType=TIMESTAMP}",
        "where Treatment_ID = #{treatmentId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Treatment record);

    @Select({
            "select t.*,ti.*,f.* " ,
            "from treatment t join treatment_items ti on t.Treatment_ID = ti.Treatment_ID join fmedical_items f on f.Fmedical_Items_ID=ti.Fmedical_Items_ID " ,
            "where t.Treatment_ID =  #{treatmentId,jdbcType=INTEGER} "
    })
    @ResultMap("SecondResultMap")
    Treatment selectTreatmentById(Integer treatmentId);

    @Select({
            "select t.*,ti.*,f.*,d.* " ,
            "from treatment t join treatment_items ti on t.Treatment_ID = ti.Treatment_ID join fmedical_items f on f.Fmedical_Items_ID=ti.Fmedical_Items_ID join department d on d.Department_ID = f.Department_ID " ,
            "where t.Medical_Record_ID = #{medicalRecordId,jdbcType=INTEGER} "
    })
    @ResultMap("SecondResultMap")
    List<Treatment> listTreatmentByMedicalRecordId(Integer medicalRecordId);
}