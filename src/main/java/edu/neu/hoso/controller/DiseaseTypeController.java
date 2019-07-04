package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.DiseaseType;
import edu.neu.hoso.service.DiseaseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("diseaseType")
public class DiseaseTypeController {
    @Autowired
    DiseaseTypeService diseaseTypeService;

    @RequestMapping("/insert")
    public ResultDTO<DiseaseType> insert(@RequestBody DiseaseType diseaseType){
        /**
         *@title: insert
         *@description: 插入疾病类别
         *@author: Mike
         *@date: 2019-06-19 10:31
         *@param: [diseaseType]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.DiseaseType>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            diseaseTypeService.insert(diseaseType);
            resultDTO.setData(diseaseType);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入疾病类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入疾病类别失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/delete")
    public ResultDTO<DiseaseType> delete(Integer id){
        /**
         *@title: delete
         *@description: 删除疾病类别
         *@author: Mike
         *@date: 2019-06-19 10:32
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.DiseaseType>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            diseaseTypeService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除疾病类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除疾病类别失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/update")
    public ResultDTO<DiseaseType> update(@RequestBody DiseaseType diseaseType){
        /**
         *@title: update
         *@description: 更新疾病类别
         *@author: Mike
         *@date: 2019-06-19 10:32
         *@param: [diseaseType]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.DiseaseType>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            diseaseTypeService.update(diseaseType);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新疾病类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新疾病类别失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getDiseaseTypeById")
    public ResultDTO<DiseaseType> getDiseaseTypeById(Integer id){
        /**
         *@title: getDiseaseTypeById
         *@description: 查询疾病文件夹 经id
         *@author: Mike
         *@date: 2019-06-19 10:33
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.DiseaseType>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(diseaseTypeService.getDiseaseTypeById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询疾病类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询疾病类别失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllDiseaseType")
    public ResultDTO<DiseaseType> getAllDiseaseType(){
        /**
         *@title: getAllDiseaseType
         *@description: 展示所有疾病类别
         *@author: Mike
         *@date: 2019-06-19 10:34
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.DiseaseType>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(diseaseTypeService.getAllDiseaseType());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示疾病类别成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示疾病类别失败！");
        }
        return resultDTO;
    }
}
