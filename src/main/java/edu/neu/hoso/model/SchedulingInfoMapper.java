package edu.neu.hoso.model;

import java.util.List;

import edu.neu.hoso.example.SchedulingInfoExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface SchedulingInfoMapper {
    int countByExample(SchedulingInfoExample example);

    int deleteByExample(SchedulingInfoExample example);

    @Delete({
        "delete from scheduling_info",
        "where Scheduling_Info_ID = #{schedulingInfoId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer schedulingInfoId);

    @Insert({
        "insert into scheduling_info (Doctor_ID, Scheduling_NoonBreak, ",
        "Scheduling_StartTime, Scheduling_EndTime, ",
        "Scheduling_Weekday, Scheduling_LimitCount, ",
        "Scheduling_RestCount)",
        "values (#{doctorId,jdbcType=INTEGER}, #{schedulingNoonbreak,jdbcType=CHAR}, ",
        "#{schedulingStarttime,jdbcType=TIMESTAMP}, #{schedulingEndtime,jdbcType=TIMESTAMP}, ",
        "#{schedulingWeekday,jdbcType=VARCHAR}, #{schedulingLimitcount,jdbcType=INTEGER}, ",
        "#{schedulingRestcount,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="schedulingInfoId", before=false, resultType=Integer.class)
    int insert(SchedulingInfo record);

    int insertSelective(SchedulingInfo record);

    List<SchedulingInfo> selectByExample(SchedulingInfoExample example);

    @Select({
        "select",
        "Scheduling_Info_ID, Doctor_ID, Scheduling_NoonBreak, Scheduling_StartTime, Scheduling_EndTime, ",
        "Scheduling_Weekday, Scheduling_LimitCount, Scheduling_RestCount",
        "from scheduling_info",
        "where Scheduling_Info_ID = #{schedulingInfoId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    SchedulingInfo selectByPrimaryKey(Integer schedulingInfoId);

    int updateByExampleSelective(@Param("record") SchedulingInfo record, @Param("example") SchedulingInfoExample example);

    int updateByExample(@Param("record") SchedulingInfo record, @Param("example") SchedulingInfoExample example);

    int updateByPrimaryKeySelective(SchedulingInfo record);

    @Update({
        "update scheduling_info",
        "set Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Scheduling_NoonBreak = #{schedulingNoonbreak,jdbcType=CHAR},",
          "Scheduling_StartTime = #{schedulingStarttime,jdbcType=TIMESTAMP},",
          "Scheduling_EndTime = #{schedulingEndtime,jdbcType=TIMESTAMP},",
          "Scheduling_Weekday = #{schedulingWeekday,jdbcType=VARCHAR},",
          "Scheduling_LimitCount = #{schedulingLimitcount,jdbcType=INTEGER},",
          "Scheduling_RestCount = #{schedulingRestcount,jdbcType=INTEGER}",
        "where Scheduling_Info_ID = #{schedulingInfoId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SchedulingInfo record);
    List<SchedulingInfo> getAllSchedulingInfoWithUserName();
}