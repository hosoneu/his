package edu.neu.hoso.model;

import edu.neu.hoso.example.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    @Insert({
        "insert into user (User_ID, User_loginName, ",
        "User_password, Role_ID, ",
        "User_Name, Department_ID, ",
        "User_Title_ID, User_Gender)",
        "values (#{userId,jdbcType=INTEGER}, #{userLoginname,jdbcType=VARCHAR}, ",
        "#{userPassword,jdbcType=VARCHAR}, #{roleId,jdbcType=INTEGER}, ",
        "#{userName,jdbcType=VARCHAR}, #{departmentId,jdbcType=INTEGER}, ",
        "#{userTitleId,jdbcType=INTEGER}, #{userGender,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="userId", before=true, resultType=Integer.class)
    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}