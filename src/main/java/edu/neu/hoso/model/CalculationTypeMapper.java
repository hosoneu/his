package edu.neu.hoso.model;

import edu.neu.hoso.example.CalculationTypeExample;

import java.sql.Time;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import javax.xml.crypto.Data;

public interface CalculationTypeMapper {
    int countByExample(CalculationTypeExample example);

    int deleteByExample(CalculationTypeExample example);

    @Delete({
        "delete from calculation_type",
        "where Calculation_Type_ID = #{calculationTypeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer calculationTypeId);

    @Insert({
        "insert into calculation_type (Calculation_Type_Name)",
        "values (#{calculationTypeName,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="calculationTypeId", before=false, resultType=Integer.class)
    int insert(CalculationType record);

    int insertSelective(CalculationType record);

    List<CalculationType> selectByExample(CalculationTypeExample example);

    @Select({
        "select",
        "Calculation_Type_ID, Calculation_Type_Name",
        "from calculation_type",
        "where Calculation_Type_ID = #{calculationTypeId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    CalculationType selectByPrimaryKey(Integer calculationTypeId);

    int updateByExampleSelective(@Param("record") CalculationType record, @Param("example") CalculationTypeExample example);

    int updateByExample(@Param("record") CalculationType record, @Param("example") CalculationTypeExample example);

    int updateByPrimaryKeySelective(CalculationType record);

    @Update({
        "update calculation_type",
        "set Calculation_Type_Name = #{calculationTypeName,jdbcType=VARCHAR}",
        "where Calculation_Type_ID = #{calculationTypeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CalculationType record);

    Time get();
}