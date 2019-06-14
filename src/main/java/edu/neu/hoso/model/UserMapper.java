package edu.neu.hoso.model;

import edu.neu.hoso.example.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    @Delete({
        "delete from user",
        "where User_ID = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);

    @Insert({
        "insert into user (User_loginName, User_password, ",
        "Role_ID, User_Name, ",
        "Department_ID, User_Title_ID, ",
        "User_Gender, User_Status, ",
        "User_Scheduling_LimitCount)",
        "values (#{userLoginname,jdbcType=VARCHAR}, #{userPassword,jdbcType=VARCHAR}, ",
        "#{roleId,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{departmentId,jdbcType=INTEGER}, #{userTitleId,jdbcType=INTEGER}, ",
        "#{userGender,jdbcType=CHAR}, #{userStatus,jdbcType=CHAR}, ",
        "#{userSchedulingLimitcount,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="userId", before=false, resultType=Integer.class)
    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "User_ID, User_loginName, User_password, Role_ID, User_Name, Department_ID, User_Title_ID, ",
        "User_Gender, User_Status, User_Scheduling_LimitCount",
        "from user",
        "where User_ID = #{userId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user",
        "set User_loginName = #{userLoginname,jdbcType=VARCHAR},",
          "User_password = #{userPassword,jdbcType=VARCHAR},",
          "Role_ID = #{roleId,jdbcType=INTEGER},",
          "User_Name = #{userName,jdbcType=VARCHAR},",
          "Department_ID = #{departmentId,jdbcType=INTEGER},",
          "User_Title_ID = #{userTitleId,jdbcType=INTEGER},",
          "User_Gender = #{userGender,jdbcType=CHAR},",
          "User_Status = #{userStatus,jdbcType=CHAR},",
          "User_Scheduling_LimitCount = #{userSchedulingLimitcount,jdbcType=INTEGER}",
        "where User_ID = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}