package edu.neu.hoso.service;

import edu.neu.hoso.model.SchedulingInfo;
import edu.neu.hoso.model.SchedulingRule;

import java.util.List;

/**
 * @title: SchedulingService
 * @package edu.neu.hoso.service
 * @description: 排班类业务接口
 * @author: Mike
 * @date: 2019-06-17 10:10
 * @version: V1.0
*/
public interface SchedulingService {
    Integer insertSelectiveInfo(SchedulingInfo schedulingInfo);
    void deleteInfoById(Integer id);
    void deleteInfoByDoctorId(Integer doctorId);
    void updateInfo(Integer doctorId, String weekday, String noonbreak, SchedulingRule schedulingRule);
    SchedulingInfo getSchedulingInfoById(Integer id);
    List<SchedulingInfo> getSchedulingInfoByDoctorId(Integer doctorId);
    List<SchedulingInfo> getSchedulingInfoByWeekday(String weekday);
    List<SchedulingInfo> getAllSchedulingInfo();

    Integer insertSelectiveRule(SchedulingInfo schedulingInfo);
    void deleteRuleById(Integer id);
    void deleteRuleByDoctorId(Integer doctorId);
    void updateRule(SchedulingRule schedulingRule);
    SchedulingRule getSchedulingRuleById(Integer id);
    List<SchedulingRule> getSchedulingRuleByDoctorId(Integer doctorId);
    List<SchedulingRule> getSchedulingRuleByWeekday(String weekday);
    List<SchedulingRule> getAllSchedulingRule();

    List<SchedulingInfo> getAllSchedulingInfoWithUserName();
}
