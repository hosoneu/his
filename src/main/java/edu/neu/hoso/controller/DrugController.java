package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.Drugs;
import edu.neu.hoso.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("drug")
public class DrugController {
    @Autowired
    DrugService drugService;

    @RequestMapping("/insert")
    public ResultDTO<Drugs> insert(@RequestBody Drugs drugs){
        /**
         *@title: insert
         *@description: 插入药品
         *@author: Mike
         *@date: 2019-06-19 10:35
         *@param: [drugs]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Drugs>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            drugService.insertSelective(drugs);
            resultDTO.setData(drugs);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入药品失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/delete")
    public ResultDTO<Drugs> delete(Integer id){
        /**
         *@title: delete
         *@description: 删除药品 经id
         *@author: Mike
         *@date: 2019-06-19 10:36
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Drugs>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            drugService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除药品失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/update")
    public ResultDTO<Drugs> update(@RequestBody Drugs drugs){
        /**
         *@title: update
         *@description: 更新药品
         *@author: Mike
         *@date: 2019-06-19 10:36
         *@param: [drugs]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Drugs>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            drugService.update(drugs);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新药品失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getDrugsById")
    public ResultDTO<Drugs> getDrugsById(Integer id){
        /**
         *@title: getDrugsById
         *@description: 查询药品 经id
         *@author: Mike
         *@date: 2019-06-19 10:37
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Drugs>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(drugService.getDrugsById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询药品失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllDrugs")
    public ResultDTO<Drugs> getAllDrugs(){
        /**
         *@title: getAllDrugs
         *@description: 展示所有药品
         *@author: Mike
         *@date: 2019-06-19 10:37
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Drugs>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(drugService.getAllDrugs());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示药品失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllDrugsWithTypeAndDosage")
    public ResultDTO<Drugs> getAllDrugsWithTypeAndDosage(){
        /**
         *@title: getAllDrugsWithTypeAndDosage
         *@description: 查询所有药品 附带drugsType,drugsDosage
         *@author: Mike
         *@date: 2019-07-01 21:38
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Drugs>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(drugService.getAllDrugsWithTypeAndDosage());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示药品失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getDrugsDosage")
    public ResultDTO<Drugs> getDrugsDosage(){
        /**
         *@title: getDrugsDosage
         *@description: 查询药品剂型常数
         *@author: Mike
         *@date: 2019-07-01 21:51
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Drugs>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(drugService.getDrugsDosage());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示药品失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getDrugsType")
    public ResultDTO<Drugs> getDrugsType(){
        /**
         *@title: getDrugsType
         *@description: 查询药品类型常数
         *@author: Mike
         *@date: 2019-07-01 21:51
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Drugs>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(drugService.getDrugsType());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示药品失败！");
        }
        return resultDTO;
    }
}
