package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.SchedulingInfo;
import edu.neu.hoso.model.SchedulingRule;
import edu.neu.hoso.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("scheduling")
public class SchedulingController {
    @Autowired
    SchedulingService schedulingService;

    @RequestMapping("/insertInfo")
    public ResultDTO<SchedulingInfo> insertInfo(@RequestBody SchedulingInfo schedulingInfo){
        /**
         *@title: insert
         *@description: 插入排班信息
         *@author: Mike
         *@date: 2019-06-19 10:50
         *@param: [schedulingRule]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.SchedulingInfo>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            System.out.println(schedulingInfo.getDoctorId());
            System.out.println(schedulingInfo.getSchedulingNoonbreak());
            schedulingService.insertSelectiveInfo(schedulingInfo);
            resultDTO.setData(schedulingInfo);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入排班信息成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入排班信息失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/deleteInfo")
    public ResultDTO<SchedulingInfo> deleteInfo(Integer id){
        /**
         *@title: delete
         *@description: 删除排班信息 经id
         *@author: Mike
         *@date: 2019-06-19 10:51
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.SchedulingInfo>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            schedulingService.deleteInfoById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除排班信息成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除排班信息失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/updateInfo")
    public ResultDTO<SchedulingInfo> updateInfo(@RequestBody Map<String, Object> map){
        /**
         *@title: updateInfo
         *@description: 更新排班信息
         *@author: Mike
         *@date: 2019-06-19 10:52
         *@param: [schedulingRule]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.SchedulingInfo>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            schedulingService.updateInfo((Integer)map.get("doctorId"), (String)map.get("weekday"), (String)map.get("noonbreak"), (SchedulingRule)map.get("schedulingRule"));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新排班信息成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新排班信息失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getSchedulingInfoById")
    public ResultDTO<SchedulingInfo> getSchedulingInfoById(Integer id){
        /**
         *@title: getSchedulingInfoById
         *@description: 查询排班信息 经id
         *@author: Mike
         *@date: 2019-06-19 10:55
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.SchedulingInfo>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(schedulingService.getSchedulingInfoById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询排班信息成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询排班信息失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllSchedulingInfo")
    public ResultDTO<SchedulingInfo> getAllSchedulingInfo(){
        /**
         *@title: getAllSchedulingInfo
         *@description: 展示所有排班信息
         *@author: Mike
         *@date: 2019-06-19 10:56
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.SchedulingInfo>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(schedulingService.getAllSchedulingInfo());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示排班信息成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示排班信息失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/insertRule")
    public ResultDTO<SchedulingRule> insertRule(@RequestBody SchedulingInfo schedulingInfo){
        /**
         *@title: insertRule
         *@description: 插入排班规则
         *@author: Mike
         *@date: 2019-06-19 10:57
         *@param: [schedulingRule]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.SchedulingRule>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            schedulingService.insertSelectiveRule(schedulingInfo);
            resultDTO.setData(schedulingInfo);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入排班规则成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入排班规则失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/deleteRule")
    public ResultDTO<SchedulingRule> deleteRule(Integer id){
        /**
         *@title: deleteRule
         *@description: 删除排班规则 经id
         *@author: Mike
         *@date: 2019-06-19 11:00
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.SchedulingRule>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            schedulingService.deleteRuleById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除排班规则成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除排班规则失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/updateRule")
    public ResultDTO<SchedulingRule> updateRule(@RequestBody SchedulingRule schedulingRule){
        /**
         *@title: updateRule
         *@description: 更新排班规则
         *@author: Mike
         *@date: 2019-06-19 11:00
         *@param: [schedulingRule]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.SchedulingRule>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            schedulingService.updateRule(schedulingRule);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新排班规则成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新排班规则失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getSchedulingRuleById")
    public ResultDTO<SchedulingRule> getSchedulingRuleById(Integer id){
        /**
         *@title: getSchedulingRuleById
         *@description: 查询排班规则 经id
         *@author: Mike
         *@date: 2019-06-19 10:58
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.SchedulingRule>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(schedulingService.getSchedulingRuleById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询排班规则成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询排班规则失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllSchedulingRule")
    public ResultDTO<SchedulingRule> getAllSchedulingRule(){
        /**
         *@title: getAllSchedulingRule
         *@description: 展示所有排班规则
         *@author: Mike
         *@date: 2019-06-19 10:58
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.SchedulingRule>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(schedulingService.getAllSchedulingRule());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示排班规则成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示排班规则失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllSchedulingInfoWithUserName")
    public ResultDTO<SchedulingRule> getAllSchedulingInfoWithUserName(){
        /**
         *@title: getAllSchedulingInfoWithUserName
         *@description: 查询所有排班信息 携带userName
         *@author: Mike
         *@date: 2019-07-04 23:41
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.SchedulingRule>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(schedulingService.getAllSchedulingInfoWithUserName());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示排班规则成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示排班规则失败！");
        }
        return resultDTO;
    }
}
