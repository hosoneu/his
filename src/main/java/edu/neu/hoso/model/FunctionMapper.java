package edu.neu.hoso.model;

import edu.neu.hoso.example.FunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface FunctionMapper {
    int countByExample(FunctionExample example);

    int deleteByExample(FunctionExample example);

    @Delete({
        "delete from function",
        "where Function_ID = #{functionId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer functionId);

    @Insert({
        "insert into function (Role_ID, Function_URL, ",
        "Function_Name, Reverse1)",
        "values (#{roleId,jdbcType=INTEGER}, #{functionUrl,jdbcType=VARCHAR}, ",
        "#{functionName,jdbcType=VARCHAR}, #{reverse1,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="functionId", before=false, resultType=Integer.class)
    int insert(Function record);

    int insertSelective(Function record);

    List<Function> selectByExample(FunctionExample example);

    @Select({
        "select",
        "Function_ID, Role_ID, Function_URL, Function_Name, Reverse1",
        "from function",
        "where Function_ID = #{functionId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Function selectByPrimaryKey(Integer functionId);

    int updateByExampleSelective(@Param("record") Function record, @Param("example") FunctionExample example);

    int updateByExample(@Param("record") Function record, @Param("example") FunctionExample example);

    int updateByPrimaryKeySelective(Function record);

    @Update({
        "update function",
        "set Role_ID = #{roleId,jdbcType=INTEGER},",
          "Function_URL = #{functionUrl,jdbcType=VARCHAR},",
          "Function_Name = #{functionName,jdbcType=VARCHAR},",
          "Reverse1 = #{reverse1,jdbcType=INTEGER}",
        "where Function_ID = #{functionId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Function record);
}