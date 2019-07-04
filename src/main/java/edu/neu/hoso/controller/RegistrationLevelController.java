package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.RegistrationLevel;
import edu.neu.hoso.service.RegistrationLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("registrationLevel")
public class RegistrationLevelController {
    @Autowired
    RegistrationLevelService registrationLevelService;

    @RequestMapping("/insert")
    public ResultDTO<RegistrationLevel> insert(@RequestBody RegistrationLevel registrationLevel){
        /**
         *@title: insert
         *@description: 插入挂号级别
         *@author: Mike
         *@date: 2019-06-19 10:46
         *@param: [registrationLevel]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.RegistrationLevel>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            registrationLevelService.insert(registrationLevel);
            resultDTO.setData(registrationLevel);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入挂号级别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入挂号级别失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/delete")
    public ResultDTO<RegistrationLevel> delete(Integer id){
        /**
         *@title: delete
         *@description: 删除挂号级别 经id
         *@author: Mike
         *@date: 2019-06-19 10:46
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.RegistrationLevel>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            registrationLevelService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除挂号级别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除挂号级别失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/update")
    public ResultDTO<RegistrationLevel> update(@RequestBody RegistrationLevel registrationLevel){
        /**
         *@title: update
         *@description: 更新挂号级别
         *@author: Mike
         *@date: 2019-06-19 10:46
         *@param: [registrationLevel]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.RegistrationLevel>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            registrationLevelService.update(registrationLevel);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新挂号级别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新挂号级别失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getRegistrationLevelById")
    public ResultDTO<RegistrationLevel> getRegistrationLevelById(Integer id){
        /**
         *@title: getRegistrationLevelById
         *@description: 查询挂号级别 经id
         *@author: Mike
         *@date: 2019-06-19 10:47
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.RegistrationLevel>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(registrationLevelService.getRegistrationLevelById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询挂号级别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询挂号级别失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllRegistrationLevel")
    public ResultDTO<RegistrationLevel> getAllRegistrationLevel(){
        /**
         *@title: getAllRegistrationLevel
         *@description: 展示所有挂号级别
         *@author: Mike
         *@date: 2019-06-19 10:47
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.RegistrationLevel>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(registrationLevelService.getAllRegistrationLevel());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示挂号级别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示挂号级别失败！");
        }
        return resultDTO;
    }
}
