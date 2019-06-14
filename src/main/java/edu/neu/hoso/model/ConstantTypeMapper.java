package edu.neu.hoso.model;

import edu.neu.hoso.example.ConstantTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ConstantTypeMapper {
    int countByExample(ConstantTypeExample example);

    int deleteByExample(ConstantTypeExample example);

    @Delete({
        "delete from constant_type",
        "where Constant_Type_ID = #{constantTypeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer constantTypeId);

    @Insert({
        "insert into constant_type (Constant_Type_Code, Constant_Type_Name)",
        "values (#{constantTypeCode,jdbcType=VARCHAR}, #{constantTypeName,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="constantTypeId", before=false, resultType=Integer.class)
    int insert(ConstantType record);

    int insertSelective(ConstantType record);

    List<ConstantType> selectByExample(ConstantTypeExample example);

    @Select({
        "select",
        "Constant_Type_ID, Constant_Type_Code, Constant_Type_Name",
        "from constant_type",
        "where Constant_Type_ID = #{constantTypeId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    ConstantType selectByPrimaryKey(Integer constantTypeId);

    int updateByExampleSelective(@Param("record") ConstantType record, @Param("example") ConstantTypeExample example);

    int updateByExample(@Param("record") ConstantType record, @Param("example") ConstantTypeExample example);

    int updateByPrimaryKeySelective(ConstantType record);

    @Update({
        "update constant_type",
        "set Constant_Type_Code = #{constantTypeCode,jdbcType=VARCHAR},",
          "Constant_Type_Name = #{constantTypeName,jdbcType=VARCHAR}",
        "where Constant_Type_ID = #{constantTypeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ConstantType record);
}