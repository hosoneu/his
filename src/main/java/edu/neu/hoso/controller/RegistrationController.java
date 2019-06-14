package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.Registration;
import edu.neu.hoso.service.RegistrationService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @title: RegistrationController
 * @package edu.neu.hoso.controller
 * @description: 挂号控制类
 * @author: Mike
 * @date: 2019-06-13 14:22
 * @version: V1.0
*/
@RestController
@RequestMapping("registration")
public class RegistrationController {
    @Resource
    RegistrationService registrationService;

    @RequestMapping("/register")
    public ResultDTO register(@RequestBody Registration registration){
        /**
         *@title: register
         *@description: 挂号操作
         *@author: Mike
         *@date: 2019-06-13 14:45
         *@param: [registration]
         *@return: edu.neu.hoso.dto.ResultDTO
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            //插入病历
            //插入病人
//            registration.setMedicalRecordId();
//            registration.setPatientId();
            //插入挂号
            registrationService.insertSelective(registration);
            //插入费用明细

            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入失败！");
        }
        return resultDTO;
    }
    @RequestMapping("/showRegistration")
    public ResultDTO showRegistration(){
        /**
         *@title: showRegistration
         *@description: 展示挂号列表
         *@author: Mike
         *@date: 2019-06-13 14:45
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {

            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入失败！");
        }
        return resultDTO;
    }
    @RequestMapping("/charge")
    public ResultDTO charge(){
        /**
         *@title: charge
         *@description: 收费操作
         *@author: Mike
         *@date: 2019-06-13 14:45
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            //更新收费项目
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入失败！");
        }
        return resultDTO;
    }
}
