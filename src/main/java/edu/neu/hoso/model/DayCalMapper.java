package edu.neu.hoso.model;

import edu.neu.hoso.example.DayCalExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DayCalMapper {
    int countByExample(DayCalExample example);

    int deleteByExample(DayCalExample example);

    @Delete({
        "delete from day_cal",
        "where Day_Cal_ID = #{dayCalId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer dayCalId);

    @Insert({
        "insert into day_cal (User_ID, Day_Cal_Date, ",
        "YF_Total, GH_Total, ",
        "Day_Cal_Total, CL_Total, ",
        "JC_Total, CZ_Total, ",
        "QT_Total)",
        "values (#{userId,jdbcType=INTEGER}, #{dayCalDate,jdbcType=TIMESTAMP}, ",
        "#{yfTotal,jdbcType=DOUBLE}, #{ghTotal,jdbcType=DOUBLE}, ",
        "#{dayCalTotal,jdbcType=DOUBLE}, #{clTotal,jdbcType=DOUBLE}, ",
        "#{jcTotal,jdbcType=DOUBLE}, #{czTotal,jdbcType=DOUBLE}, ",
        "#{qtTotal,jdbcType=DOUBLE})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="dayCalId", before=false, resultType=Integer.class)
    int insert(DayCal record);

    int insertSelective(DayCal record);

    List<DayCal> selectByExample(DayCalExample example);

    @Select({
        "select",
        "Day_Cal_ID, User_ID, Day_Cal_Date, YF_Total, GH_Total, Day_Cal_Total, CL_Total, ",
        "JC_Total, CZ_Total, QT_Total",
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
          "Day_Cal_Date = #{dayCalDate,jdbcType=TIMESTAMP},",
          "YF_Total = #{yfTotal,jdbcType=DOUBLE},",
          "GH_Total = #{ghTotal,jdbcType=DOUBLE},",
          "Day_Cal_Total = #{dayCalTotal,jdbcType=DOUBLE},",
          "CL_Total = #{clTotal,jdbcType=DOUBLE},",
          "JC_Total = #{jcTotal,jdbcType=DOUBLE},",
          "CZ_Total = #{czTotal,jdbcType=DOUBLE},",
          "QT_Total = #{qtTotal,jdbcType=DOUBLE}",
        "where Day_Cal_ID = #{dayCalId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DayCal record);
    @Select({"SELECT DISTINCT User_ID FROM day_cal"})
    List<Integer> FindHistoryDalUserID();
}