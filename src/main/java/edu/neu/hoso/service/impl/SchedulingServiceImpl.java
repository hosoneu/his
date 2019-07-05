package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.SchedulingInfoExample;
import edu.neu.hoso.example.SchedulingRuleExample;
import edu.neu.hoso.model.SchedulingInfo;
import edu.neu.hoso.model.SchedulingInfoMapper;
import edu.neu.hoso.model.SchedulingRule;
import edu.neu.hoso.model.SchedulingRuleMapper;
import edu.neu.hoso.service.SchedulingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: SchedulingServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 排班类业务接口实现类
 * @author: Mike
 * @date: 2019-06-17 10:15
 * @version: V1.0
*/
@Service
public class SchedulingServiceImpl implements SchedulingService {
    @Resource
    SchedulingInfoMapper schedulingInfoMapper;

    @Resource
    SchedulingRuleMapper schedulingRuleMapper;


    @Override
    public Integer insertSelectiveInfo(SchedulingInfo schedulingInfo) {
        /**
         *@title: insertSelectiveInfo
         *@description: 选择性插入排班信息 根据排班规则
         *@author: Mike
         *@date: 2019-06-17 10:17
         *@param: [schedulingRule]
         *@return: java.lang.Integer
         *@throws:
         */
//        SchedulingInfo schedulingInfo = new SchedulingInfo();
//        schedulingInfo.setDoctorId(schedulingRule.getDoctorId());
//        schedulingInfo.setSchedulingNoonbreak(schedulingRule.getSchedulingRuleNoonbreak());
//        schedulingInfo.setSchedulingWeekday(schedulingRule.getSchedulingRuleWeekday());
//        schedulingInfo.setSchedulingStarttime(schedulingRule.getSchedulingRuleStarttime());
//        schedulingInfo.setSchedulingEndtime(schedulingRule.getSchedulingRuleEndtime());
//        schedulingInfo.setSchedulingLimitcount(schedulingRule.getSchedulingRuleLimitcount());
//        schedulingInfo.setSchedulingRestcount(schedulingRule.getSchedulingRuleLimitcount());
        schedulingInfo.setSchedulingRestcount(schedulingInfo.getSchedulingLimitcount());
        schedulingInfoMapper.insertSelective(schedulingInfo);
        return schedulingInfo.getSchedulingInfoId();
    }

    @Override
    public void deleteInfoById(Integer id) {
        /**
         *@title: deleteInfoById
         *@description: 删除排班信息
         *@author: Mike
         *@date: 2019-06-17 10:17
         *@param: [id]
         *@return: void
         *@throws:
         */
        schedulingInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteInfoByDoctorId(Integer doctorId) {
        /**
         *@title: deleteInfoByDoctorId
         *@description: 删除排班信息 经doctorId
         *@author: Mike
         *@date: 2019-06-17 10:18
         *@param: [doctorId]
         *@return: void
         *@throws:
         */
        SchedulingInfoExample schedulingInfoExample = new SchedulingInfoExample();
        SchedulingInfoExample.Criteria criteria = schedulingInfoExample.createCriteria();
        criteria.andDoctorIdEqualTo(doctorId);
        schedulingInfoMapper.deleteByExample(schedulingInfoExample);
    }

    @Override
    public void updateInfo(Integer doctorId, String weekday, String noonbreak, SchedulingRule schedulingRule) {
        /**
         *@title: updateInfo
         *@description: 更新排班信息
         *@author: Mike
         *@date: 2019-06-17 10:52
         *@param: [doctorId, weekday, noonbreak, schedulingRule]
         *@return: void
         *@throws:
         */
        SchedulingInfoExample schedulingInfoExample = new SchedulingInfoExample();
        SchedulingInfoExample.Criteria criteria = schedulingInfoExample.createCriteria();
        criteria.andDoctorIdEqualTo(doctorId);
        criteria.andSchedulingWeekdayEqualTo(weekday);
        criteria.andSchedulingNoonbreakEqualTo(noonbreak);
        List<SchedulingInfo> schedulingInfos = schedulingInfoMapper.selectByExample(schedulingInfoExample);
        SchedulingInfo schedulingInfo = schedulingInfos.get(0);
        schedulingInfo.setDoctorId(schedulingRule.getDoctorId());
        schedulingInfo.setSchedulingNoonbreak(schedulingRule.getSchedulingRuleNoonbreak());
        schedulingInfo.setSchedulingWeekday(schedulingRule.getSchedulingRuleWeekday());
        schedulingInfo.setSchedulingStarttime(schedulingRule.getSchedulingRuleStarttime());
        schedulingInfo.setSchedulingEndtime(schedulingRule.getSchedulingRuleEndtime());
        schedulingInfo.setSchedulingLimitcount(schedulingRule.getSchedulingRuleLimitcount());
        schedulingInfo.setSchedulingRestcount(schedulingRule.getSchedulingRuleLimitcount());
        schedulingInfoMapper.updateByPrimaryKeySelective(schedulingInfo);
    }

    @Override
    public SchedulingInfo getSchedulingInfoById(Integer id) {
        /**
         *@title: getSchedulingInfoById
         *@description: 查询排班信息 经id
         *@author: Mike
         *@date: 2019-06-17 10:19
         *@param: [id]
         *@return: edu.neu.hoso.model.SchedulingInfo
         *@throws:
         */
        return schedulingInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SchedulingInfo> getSchedulingInfoByDoctorId(Integer doctorId) {
        /**
         *@title: getSchedulingInfoByDoctorId
         *@description: 查询排班信息 经doctorId
         *@author: Mike
         *@date: 2019-06-17 10:19
         *@param: [doctorId]
         *@return: java.util.List<edu.neu.hoso.model.SchedulingInfo>
         *@throws:
         */
        SchedulingInfoExample schedulingInfoExample = new SchedulingInfoExample();
        SchedulingInfoExample.Criteria criteria = schedulingInfoExample.createCriteria();
        criteria.andDoctorIdEqualTo(doctorId);
        return schedulingInfoMapper.selectByExample(schedulingInfoExample);
    }

    @Override
    public List<SchedulingInfo> getSchedulingInfoByWeekday(String weekday) {
        /**
         *@title: getSchedulingInfoByWeekday
         *@description: 查询排班信息 经weekday
         *@author: Mike
         *@date: 2019-06-17 10:20
         *@param: [weekday]
         *@return: java.util.List<edu.neu.hoso.model.SchedulingInfo>
         *@throws:
         */
        SchedulingInfoExample schedulingInfoExample = new SchedulingInfoExample();
        SchedulingInfoExample.Criteria criteria = schedulingInfoExample.createCriteria();
        criteria.andSchedulingWeekdayEqualTo(weekday);
        return schedulingInfoMapper.selectByExample(schedulingInfoExample);
    }

    @Override
    public List<SchedulingInfo> getAllSchedulingInfo() {
        /**
         *@title: getAllSchedulingInfo
         *@description: 查询所有排班信息
         *@author: Mike
         *@date: 2019-06-17 10:21
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.SchedulingInfo>
         *@throws:
         */
        SchedulingInfoExample schedulingInfoExample = new SchedulingInfoExample();
        return schedulingInfoMapper.selectByExample(schedulingInfoExample);
    }

    @Override
    public Integer insertSelectiveRule(SchedulingInfo schedulingInfo) {
        /**
         *@title: insertSelectiveRule
         *@description: 选择性插入排班规则
         *@author: Mike
         *@date: 2019-06-17 10:54
         *@param: [schedulingRule]
         *@return: java.lang.Integer
         *@throws:
         */
        SchedulingRule schedulingRule = new SchedulingRule();
        schedulingRule.setDoctorId(schedulingRule.getDoctorId());
        schedulingRule.setSchedulingRuleNoonbreak(schedulingInfo.getSchedulingNoonbreak());
        schedulingRule.setSchedulingRuleWeekday(schedulingInfo.getSchedulingWeekday());
        schedulingRule.setSchedulingRuleStarttime(schedulingInfo.getSchedulingStarttime());
        schedulingRule.setSchedulingRuleEndtime(schedulingInfo.getSchedulingEndtime());
        schedulingRule.setSchedulingRuleLimitcount(schedulingInfo.getSchedulingLimitcount());
        schedulingRuleMapper.insertSelective(schedulingRule);
        return schedulingRule.getSchedulingRuleId();
    }

    @Override
    public void deleteRuleById(Integer id) {
        /**
         *@title: deleteRuleById
         *@description: 删除排班规则 经id
         *@author: Mike
         *@date: 2019-06-17 10:54
         *@param: [id]
         *@return: void
         *@throws:
         */
        schedulingRuleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteRuleByDoctorId(Integer doctorId) {
        /**
         *@title: deleteRuleByDoctorId
         *@description: 删除排班规则 经doctorId
         *@author: Mike
         *@date: 2019-06-17 10:57
         *@param: [doctorId]
         *@return: void
         *@throws:
         */
        SchedulingRuleExample schedulingRuleExample = new SchedulingRuleExample();
        SchedulingRuleExample.Criteria criteria = schedulingRuleExample.createCriteria();
        criteria.andDoctorIdEqualTo(doctorId);
        schedulingRuleMapper.deleteByExample(schedulingRuleExample);
    }

    @Override
    public void updateRule(SchedulingRule schedulingRule) {
        /**
         *@title: updateRule
         *@description: 更新排班规则
         *@author: Mike
         *@date: 2019-06-17 10:57
         *@param: [schedulingRule]
         *@return: void
         *@throws:
         */
        schedulingRuleMapper.updateByPrimaryKeySelective(schedulingRule);
    }

    @Override
    public SchedulingRule getSchedulingRuleById(Integer id) {
        /**
         *@title: getSchedulingRuleById
         *@description: 查询排班规则 经id
         *@author: Mike
         *@date: 2019-06-17 10:58
         *@param: [id]
         *@return: edu.neu.hoso.model.SchedulingRule
         *@throws:
         */
        return schedulingRuleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SchedulingRule> getSchedulingRuleByDoctorId(Integer doctorId) {
        /**
         *@title: getSchedulingRuleByDoctorId
         *@description: 查询排班规则 经doctorId
         *@author: Mike
         *@date: 2019-06-17 11:00
         *@param: [doctorId]
         *@return: java.util.List<edu.neu.hoso.model.SchedulingRule>
         *@throws:
         */
        SchedulingRuleExample schedulingRuleExample = new SchedulingRuleExample();
        SchedulingRuleExample.Criteria criteria = schedulingRuleExample.createCriteria();
        criteria.andDoctorIdEqualTo(doctorId);
        return schedulingRuleMapper.selectByExample(schedulingRuleExample);
    }

    @Override
    public List<SchedulingRule> getSchedulingRuleByWeekday(String weekday) {
        /**
         *@title: getSchedulingRuleByWeekday
         *@description: 查询排班规则 经weekday
         *@author: Mike
         *@date: 2019-06-17 11:01
         *@param: [weekday]
         *@return: java.util.List<edu.neu.hoso.model.SchedulingRule>
         *@throws:
         */
        SchedulingRuleExample schedulingRuleExample = new SchedulingRuleExample();
        SchedulingRuleExample.Criteria criteria = schedulingRuleExample.createCriteria();
        criteria.andSchedulingRuleWeekdayEqualTo(weekday);
        return schedulingRuleMapper.selectByExample(schedulingRuleExample);
    }

    @Override
    public List<SchedulingRule> getAllSchedulingRule() {
        /**
         *@title: getAllSchedulingRule
         *@description: 查询所有排班规则
         *@author: Mike
         *@date: 2019-06-17 11:01
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.SchedulingRule>
         *@throws:
         */
        SchedulingRuleExample schedulingRuleExample = new SchedulingRuleExample();
        return schedulingRuleMapper.selectByExample(schedulingRuleExample);
    }

    @Override
    public List<SchedulingInfo> getAllSchedulingInfoWithUserName() {
        /**
         *@title: getAllSchedulingInfoWithUserName
         *@description: 查询所有排班信息 携带userName
         *@author: Mike
         *@date: 2019-07-04 23:40
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.SchedulingInfo>
         *@throws:
         */
        return schedulingInfoMapper.getAllSchedulingInfoWithUserName();
    }
}
