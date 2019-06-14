package edu.neu.hoso.model;

import edu.neu.hoso.example.GroupExaminationExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface GroupExaminationMapper {
    int countByExample(GroupExaminationExample example);

    int deleteByExample(GroupExaminationExample example);

    @Delete({
        "delete from group_examination",
        "where Group_Examination_ID = #{groupExaminationId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer groupExaminationId);

    @Insert({
        "insert into group_examination (Doctor_ID, Group_Examination_Code, ",
        "Group_Examination_Name, Group_Examination_Scope, ",
        "Create_Time)",
        "values (#{doctorId,jdbcType=INTEGER}, #{groupExaminationCode,jdbcType=VARCHAR}, ",
        "#{groupExaminationName,jdbcType=VARCHAR}, #{groupExaminationScope,jdbcType=CHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="groupExaminationId", before=false, resultType=Integer.class)
    int insert(GroupExamination record);

    int insertSelective(GroupExamination record);

    List<GroupExamination> selectByExample(GroupExaminationExample example);

    @Select({
        "select",
        "Group_Examination_ID, Doctor_ID, Group_Examination_Code, Group_Examination_Name, ",
        "Group_Examination_Scope, Create_Time",
        "from group_examination",
        "where Group_Examination_ID = #{groupExaminationId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    GroupExamination selectByPrimaryKey(Integer groupExaminationId);

    int updateByExampleSelective(@Param("record") GroupExamination record, @Param("example") GroupExaminationExample example);

    int updateByExample(@Param("record") GroupExamination record, @Param("example") GroupExaminationExample example);

    int updateByPrimaryKeySelective(GroupExamination record);

    @Update({
        "update group_examination",
        "set Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Group_Examination_Code = #{groupExaminationCode,jdbcType=VARCHAR},",
          "Group_Examination_Name = #{groupExaminationName,jdbcType=VARCHAR},",
          "Group_Examination_Scope = #{groupExaminationScope,jdbcType=CHAR},",
          "Create_Time = #{createTime,jdbcType=TIMESTAMP}",
        "where Group_Examination_ID = #{groupExaminationId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GroupExamination record);
}