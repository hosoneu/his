package edu.neu.hoso.model;

import edu.neu.hoso.example.GroupTreatmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface GroupTreatmentMapper {
    int countByExample(GroupTreatmentExample example);

    int deleteByExample(GroupTreatmentExample example);

    @Delete({
        "delete from group_treatment",
        "where Group_Treatment_ID = #{groupTreatmentId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer groupTreatmentId);

    @Insert({
        "insert into group_treatment (Group_Treatment_ID, Doctor_ID, ",
        "Group_Treatment_Code, Group_Treatment_Name, ",
        "Group_Treatment_Scope, Create_Time)",
        "values (#{groupTreatmentId,jdbcType=INTEGER}, #{doctorId,jdbcType=INTEGER}, ",
        "#{groupTreatmentCode,jdbcType=VARCHAR}, #{groupTreatmentName,jdbcType=VARCHAR}, ",
        "#{groupTreatmentScope,jdbcType=CHAR}, #{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="groupTreatmentId", before=true, resultType=Integer.class)
    int insert(GroupTreatment record);

    int insertSelective(GroupTreatment record);

    List<GroupTreatment> selectByExample(GroupTreatmentExample example);

    @Select({
        "select",
        "Group_Treatment_ID, Doctor_ID, Group_Treatment_Code, Group_Treatment_Name, Group_Treatment_Scope, ",
        "Create_Time",
        "from group_treatment",
        "where Group_Treatment_ID = #{groupTreatmentId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    GroupTreatment selectByPrimaryKey(Integer groupTreatmentId);

    int updateByExampleSelective(@Param("record") GroupTreatment record, @Param("example") GroupTreatmentExample example);

    int updateByExample(@Param("record") GroupTreatment record, @Param("example") GroupTreatmentExample example);

    int updateByPrimaryKeySelective(GroupTreatment record);

    @Update({
        "update group_treatment",
        "set Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Group_Treatment_Code = #{groupTreatmentCode,jdbcType=VARCHAR},",
          "Group_Treatment_Name = #{groupTreatmentName,jdbcType=VARCHAR},",
          "Group_Treatment_Scope = #{groupTreatmentScope,jdbcType=CHAR},",
          "Create_Time = #{createTime,jdbcType=TIMESTAMP}",
        "where Group_Treatment_ID = #{groupTreatmentId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GroupTreatment record);
}