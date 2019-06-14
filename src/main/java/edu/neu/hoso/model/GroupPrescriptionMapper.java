package edu.neu.hoso.model;

import edu.neu.hoso.example.GroupPrescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface GroupPrescriptionMapper {
    int countByExample(GroupPrescriptionExample example);

    int deleteByExample(GroupPrescriptionExample example);

    @Delete({
        "delete from group_prescription",
        "where Group_Prescription_ID = #{groupPrescriptionId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer groupPrescriptionId);

    @Insert({
        "insert into group_prescription (Doctor_ID, Group_Prescription_Code, ",
        "Group_Prescription_Name, Group_Prescription_Scope, ",
        "Create_Time, Prescription_Type)",
        "values (#{doctorId,jdbcType=INTEGER}, #{groupPrescriptionCode,jdbcType=VARCHAR}, ",
        "#{groupPrescriptionName,jdbcType=VARCHAR}, #{groupPrescriptionScope,jdbcType=CHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{prescriptionType,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="groupPrescriptionId", before=false, resultType=Integer.class)
    int insert(GroupPrescription record);

    int insertSelective(GroupPrescription record);

    List<GroupPrescription> selectByExample(GroupPrescriptionExample example);

    @Select({
        "select",
        "Group_Prescription_ID, Doctor_ID, Group_Prescription_Code, Group_Prescription_Name, ",
        "Group_Prescription_Scope, Create_Time, Prescription_Type",
        "from group_prescription",
        "where Group_Prescription_ID = #{groupPrescriptionId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    GroupPrescription selectByPrimaryKey(Integer groupPrescriptionId);

    int updateByExampleSelective(@Param("record") GroupPrescription record, @Param("example") GroupPrescriptionExample example);

    int updateByExample(@Param("record") GroupPrescription record, @Param("example") GroupPrescriptionExample example);

    int updateByPrimaryKeySelective(GroupPrescription record);

    @Update({
        "update group_prescription",
        "set Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Group_Prescription_Code = #{groupPrescriptionCode,jdbcType=VARCHAR},",
          "Group_Prescription_Name = #{groupPrescriptionName,jdbcType=VARCHAR},",
          "Group_Prescription_Scope = #{groupPrescriptionScope,jdbcType=CHAR},",
          "Create_Time = #{createTime,jdbcType=TIMESTAMP},",
          "Prescription_Type = #{prescriptionType,jdbcType=CHAR}",
        "where Group_Prescription_ID = #{groupPrescriptionId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GroupPrescription record);
}