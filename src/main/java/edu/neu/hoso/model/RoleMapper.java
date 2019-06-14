package edu.neu.hoso.model;

import edu.neu.hoso.example.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RoleMapper {
    int countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    @Delete({
        "delete from role",
        "where Role_ID = #{roleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer roleId);

    @Insert({
        "insert into role (Function_id, Role_Name)",
        "values (#{functionId,jdbcType=INTEGER}, #{roleName,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="roleId", before=false, resultType=Integer.class)
    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    @Select({
        "select",
        "Role_ID, Function_id, Role_Name",
        "from role",
        "where Role_ID = #{roleId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Role selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    @Update({
        "update role",
        "set Function_id = #{functionId,jdbcType=INTEGER},",
          "Role_Name = #{roleName,jdbcType=VARCHAR}",
        "where Role_ID = #{roleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Role record);
}