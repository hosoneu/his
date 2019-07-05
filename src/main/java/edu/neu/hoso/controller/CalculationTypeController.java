package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.CalculationType;
import edu.neu.hoso.model.CalculationTypeMapper;
import edu.neu.hoso.service.CalculationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @title: CalculationTypeController
 * @package edu.neu.hoso.controller
 * @description: 结算类别类控制类
 * @author: Mike
 * @date: 2019-06-18 13:27
 * @version: V1.0
*/
@RestController
@CrossOrigin
@RequestMapping("calculationType")
public class CalculationTypeController {
    @Autowired
    CalculationTypeService calculationTypeService;

    @Resource
    CalculationTypeMapper calculationTypeMapper;
    @RequestMapping("/insert")
    public ResultDTO<CalculationType> insert(@RequestBody CalculationType calculationType){
        /**
         *@title: insert
         *@description: 插入结算类别
         *@author: Mike
         *@date: 2019-06-18 13:39
         *@param: [calculationType]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.CalculationType>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            calculationTypeService.insert(calculationType);
            resultDTO.setData(calculationType);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入结算类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入结算类别失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/delete")
    public ResultDTO<CalculationType> delete(Integer id){
        /**
         *@title: delete
         *@description: 删除结算类别
         *@author: Mike
         *@date: 2019-06-18 13:39
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.CalculationType>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            calculationTypeService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除结算类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除结算类别失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/update")
    public ResultDTO<CalculationType> update(@RequestBody CalculationType calculationType){
        /**
         *@title: update
         *@description: 更新结算类别
         *@author: Mike
         *@date: 2019-06-18 13:40
         *@param: [calculationType]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.CalculationType>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            calculationTypeService.update(calculationType);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新结算类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新结算类别失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getCalculationTypeById")
    public ResultDTO<CalculationType> getCalculationTypeById(Integer id){
        /**
         *@title: getCalculationTypeById
         *@description: 查询结算类别 经id
         *@author: Mike
         *@date: 2019-06-18 13:40
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.CalculationType>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(calculationTypeService.getCalculationTypeById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询结算类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询结算类别失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllCalculationType")
    public ResultDTO<CalculationType> getAllCalculationType(){
        /**
         *@title: getAllCalculationType
         *@description: 展示所有结算类别
         *@author: Mike
         *@date: 2019-06-18 13:41
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.CalculationType>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(calculationTypeService.getAllCalculationType());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示结算类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示结算类别失败！");
        }
        return resultDTO;
    }

    /**
     *@title: get
     *@description: TODO
     *@author: zhangjunzhi
     *@date: 2019/7/4 10:02
     *@param: []
     *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.CalculationType>
     *@throws:
     */
    @RequestMapping("/get")
    public ResultDTO<CalculationType> get(){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(calculationTypeMapper.get());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示结算类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示结算类别失败！");
        }
        return resultDTO;
    }
}
