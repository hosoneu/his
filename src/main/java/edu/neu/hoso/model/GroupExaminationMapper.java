package edu.neu.hoso.model;

import edu.neu.hoso.model.GroupExamination;
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
        "Create_Time, Group_Examination_Type)",
        "values (#{doctorId,jdbcType=INTEGER}, #{groupExaminationCode,jdbcType=VARCHAR}, ",
        "#{groupExaminationName,jdbcType=VARCHAR}, #{groupExaminationScope,jdbcType=CHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{groupExaminationType,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="groupExaminationId", before=false, resultType=Integer.class)
    int insert(GroupExamination record);

    int insertSelective(GroupExamination record);

    List<GroupExamination> selectByExample(GroupExaminationExample example);

    @Select({
        "select",
        "Group_Examination_ID, Doctor_ID, Group_Examination_Code, Group_Examination_Name, ",
        "Group_Examination_Scope, Create_Time, Group_Examination_Type",
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
          "Create_Time = #{createTime,jdbcType=TIMESTAMP},",
          "Group_Examination_Type = #{groupExaminationType,jdbcType=CHAR}",
        "where Group_Examination_ID = #{groupExaminationId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GroupExamination record);

    /**
     * @title: listGroupExaminationFromUser
     * @description: 获取个人检查检验模板
     * @author: 29-y
     * @date: 2019-06-19 11:30
     * @param: [userId, type]
     * @return: java.util.List<edu.neu.hoso.model.GroupExamination>
     * @throws:
     */
    @Select({
            "select group_e.*,fmedical_items.*,fmedical.* " ,
            "from group_examination group_e join group_examination_fmedical_items fmedical_items on group_e.Group_Examination_ID = fmedical_items.Group_Examination_ID join fmedical_items fmedical on fmedical.Fmedical_Items_ID = fmedical_items.Fmedical_Items_ID " ,
            "where group_e.Doctor_ID = #{userId,jdbcType=INTEGER} and group_e.Group_Examination_Scope = \"1\" and group_e.Group_Examination_Type = #{type,jdbcType=CHAR} "
    })
    @ResultMap("SecondResultMap")
    List<GroupExamination> listGroupExaminationFromUser(Integer userId,String type);

    /**
     * @title: listGroupExaminationFromDepartment
     * @description: 获取科室检查检验模板
     * @author: 29-y
     * @date: 2019-06-19 11:30
     * @param: [userId, type]
     * @return: java.util.List<edu.neu.hoso.model.GroupExamination>
     * @throws:
     */
    @Select({
            "select group_e.*,fmedical_items.*,fmedical.* " ,
            "from group_examination group_e join `user` create_doctor on group_e.Doctor_ID = create_doctor.User_ID join group_examination_fmedical_items fmedical_items on group_e.Group_Examination_ID = fmedical_items.Group_Examination_ID join fmedical_items fmedical on fmedical.Fmedical_Items_ID = fmedical_items.Fmedical_Items_ID " ,
            "where group_e.Group_Examination_Scope = \"2\" and group_e.Group_Examination_Type = #{type,jdbcType=CHAR} " ,
            "and exists( " ,
            "select * " ,
            "from `user` doctor " ,
            "where doctor.Department_ID = create_doctor.Department_ID and doctor.User_ID = #{userId,jdbcType=INTEGER} " ,
            ")"
    })
    @ResultMap("SecondResultMap")
    List<GroupExamination> listGroupExaminationFromDepartment(Integer userId,String type);

    /**
     * @title: listGroupExaminationFromHospital
     * @description: 获取医院检查检验模板
     * @author: 29-y
     * @date: 2019-06-19 11:30
     * @param: [userId, type]
     * @return: java.util.List<edu.neu.hoso.model.GroupExamination>
     * @throws:
     */
    @Select({
            "select group_e.*,fmedical_items.*,fmedical.* " ,
            "from group_examination group_e join group_examination_fmedical_items fmedical_items on group_e.Group_Examination_ID = fmedical_items.Group_Examination_ID join fmedical_items fmedical on fmedical.Fmedical_Items_ID = fmedical_items.Fmedical_Items_ID " ,
            "where group_e.Group_Examination_Scope = \"3\" and group_e.Group_Examination_Type = #{type,jdbcType=CHAR};"
    })
    @ResultMap("SecondResultMap")
    List<GroupExamination> listGroupExaminationFromHospital(String type);


    /**
     * @title: selectGroupExaminationById
     * @description: 根据组套模板ID获取模板
     * @author: 29-y
     * @date: 2019-06-19 11:59
     * @param: [userId, type]
     * @return: edu.neu.hoso.model.GroupExamination
     * @throws:
     */
    @Select({
            "select group_e.*,fmedical_items.*,fmedical.* " ,
            "from group_examination group_e join group_examination_fmedical_items fmedical_items on group_e.Group_Examination_ID = fmedical_items.Group_Examination_ID join fmedical_items fmedical on fmedical.Fmedical_Items_ID = fmedical_items.Fmedical_Items_ID " ,
            "where group_e.Group_Examination_ID = #{groupExaminationId,jdbcType=INTEGER} and group_e.Group_Examination_Type = #{type,jdbcType=CHAR} "
    })
    @ResultMap("SecondResultMap")
    GroupExamination selectGroupExaminationById(Integer groupExaminationId, String type);
}