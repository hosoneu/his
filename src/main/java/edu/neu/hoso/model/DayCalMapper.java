package edu.neu.hoso.model;

import edu.neu.hoso.example.DayCalExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface DayCalMapper {
    int countByExample(DayCalExample example);

    int deleteByExample(DayCalExample example);

    @Delete({
        "delete from day_cal",
        "where Day_Cal_ID = #{dayCalId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer dayCalId);

    @Insert({
        "insert into day_cal (User_ID, Day_Cal_StartDate, ",
        "Day_Cal_EndDate, Day_Cal_Total)",
        "values (#{userId,jdbcType=INTEGER}, #{dayCalStartdate,jdbcType=TIMESTAMP}, ",
        "#{dayCalEnddate,jdbcType=TIMESTAMP}, #{dayCalTotal,jdbcType=DOUBLE})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="dayCalId", before=false, resultType=Integer.class)
    int insert(DayCal record);

    int insertSelective(DayCal record);

    List<DayCal> selectByExample(DayCalExample example);

    @Select({
        "select",
        "Day_Cal_ID, User_ID, Day_Cal_StartDate, Day_Cal_EndDate, Day_Cal_Total",
        "from day_cal",
        "where Day_Cal_ID = #{dayCalId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    DayCal selectByPrimaryKey(Integer dayCalId);

    int updateByExampleSelective(@Param("record") DayCal record, @Param("example") DayCalExample example);

    int updateByExample(@Param("record") DayCal record, @Param("example") DayCalExample example);

    int updateByPrimaryKeySelective(DayCal record);

    @Update({
        "update day_cal",
        "set User_ID = #{userId,jdbcType=INTEGER},",
          "Day_Cal_StartDate = #{dayCalStartdate,jdbcType=TIMESTAMP},",
          "Day_Cal_EndDate = #{dayCalEnddate,jdbcType=TIMESTAMP},",
          "Day_Cal_Total = #{dayCalTotal,jdbcType=DOUBLE}",
        "where Day_Cal_ID = #{dayCalId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DayCal record);
}