package edu.neu.hoso.model;

import java.util.List;

import edu.neu.hoso.example.SchedulingRuleExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface SchedulingRuleMapper {
    int countByExample(SchedulingRuleExample example);

    int deleteByExample(SchedulingRuleExample example);

    @Delete({
        "delete from scheduling_rule",
        "where Scheduling_Rule_ID = #{schedulingRuleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer schedulingRuleId);

    @Insert({
        "insert into scheduling_rule (Doctor_ID, Scheduling_Rule_NoonBreak, ",
        "Scheduling_Rule_StartTime, Scheduling_Rule_EndTime, ",
        "Scheduling_Rule_Weekday, Scheduling_Rule_LimitCount)",
        "values (#{doctorId,jdbcType=INTEGER}, #{schedulingRuleNoonbreak,jdbcType=VARCHAR}, ",
        "#{schedulingRuleStarttime,jdbcType=TIMESTAMP}, #{schedulingRuleEndtime,jdbcType=TIMESTAMP}, ",
        "#{schedulingRuleWeekday,jdbcType=VARCHAR}, #{schedulingRuleLimitcount,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="schedulingRuleId", before=false, resultType=Integer.class)
    int insert(SchedulingRule record);

    int insertSelective(SchedulingRule record);

    List<SchedulingRule> selectByExample(SchedulingRuleExample example);

    @Select({
        "select",
        "Scheduling_Rule_ID, Doctor_ID, Scheduling_Rule_NoonBreak, Scheduling_Rule_StartTime, ",
        "Scheduling_Rule_EndTime, Scheduling_Rule_Weekday, Scheduling_Rule_LimitCount",
        "from scheduling_rule",
        "where Scheduling_Rule_ID = #{schedulingRuleId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    SchedulingRule selectByPrimaryKey(Integer schedulingRuleId);

    int updateByExampleSelective(@Param("record") SchedulingRule record, @Param("example") SchedulingRuleExample example);

    int updateByExample(@Param("record") SchedulingRule record, @Param("example") SchedulingRuleExample example);

    int updateByPrimaryKeySelective(SchedulingRule record);

    @Update({
        "update scheduling_rule",
        "set Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Scheduling_Rule_NoonBreak = #{schedulingRuleNoonbreak,jdbcType=VARCHAR},",
          "Scheduling_Rule_StartTime = #{schedulingRuleStarttime,jdbcType=TIMESTAMP},",
          "Scheduling_Rule_EndTime = #{schedulingRuleEndtime,jdbcType=TIMESTAMP},",
          "Scheduling_Rule_Weekday = #{schedulingRuleWeekday,jdbcType=VARCHAR},",
          "Scheduling_Rule_LimitCount = #{schedulingRuleLimitcount,jdbcType=INTEGER}",
        "where Scheduling_Rule_ID = #{schedulingRuleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SchedulingRule record);
}