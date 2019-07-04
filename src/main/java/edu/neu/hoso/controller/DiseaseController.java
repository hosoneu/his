package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.Disease;
import edu.neu.hoso.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("disease")
public class DiseaseController {
    @Autowired
    DiseaseService diseaseService;

    @RequestMapping("/insert")
    public ResultDTO<Disease> insert(@RequestBody Disease disease){
        /**
         *@title: insert
         *@description: 插入疾病
         *@author: Mike
         *@date: 2019-06-19 0:38
         *@param: [disease]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Disease>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            diseaseService.insert(disease);
            resultDTO.setData(disease);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入疾病成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入疾病失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/delete")
    public ResultDTO<Disease> delete(Integer id){
        /**
         *@title: delete
         *@description: 删除疾病
         *@author: Mike
         *@date: 2019-06-19 0:38
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Disease>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            diseaseService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除疾病成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除疾病失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/update")
    public ResultDTO<Disease> update(@RequestBody Disease disease){
        /**
         *@title: update
         *@description: 更新疾病
         *@author: Mike
         *@date: 2019-06-19 0:39
         *@param: [disease]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Disease>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            diseaseService.update(disease);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新疾病成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新疾病失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getDiseaseById")
    public ResultDTO<Disease> getDiseaseById(Integer id){
        /**
         *@title: getDiseaseById
         *@description: 查询疾病 经id
         *@author: Mike
         *@date: 2019-06-19 10:24
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Disease>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(diseaseService.getDiseaseById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询疾病成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询疾病失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllDisease")
    public ResultDTO<Disease> getAllDisease(){
        /**
         *@title: getAllDisease
         *@description: 展示所有疾病
         *@author: Mike
         *@date: 2019-06-19 10:24
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Disease>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(diseaseService.getAllDisease());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示疾病成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示疾病失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllDiseaseWithType")
    public ResultDTO<Disease> getAllDiseaseWithType(){
        /**
         *@title: getAllDiseaseWithType
         *@description: 查询所有疾病 附带diseaseType
         *@author: Mike
         *@date: 2019-07-01 18:33
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Disease>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(diseaseService.getAllDiseaseWithType());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示疾病成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示疾病失败！");
        }
        return resultDTO;
    }
}
