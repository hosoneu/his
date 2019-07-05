package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.DiseaseFolder;
import edu.neu.hoso.service.DiseaseFolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("diseaseFolder")
public class DiseaseFolderController {
    @Autowired
    DiseaseFolderService diseaseFolderService;

    @RequestMapping("/insert")
    public ResultDTO<DiseaseFolder> insert(@RequestBody DiseaseFolder diseaseFolder){
        /**
         *@title: insert
         *@description: 插入疾病文件夹
         *@author: Mike
         *@date: 2019-06-19 10:27
         *@param: [diseaseFolder]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.DiseaseFolder>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            diseaseFolderService.insert(diseaseFolder);
            resultDTO.setData(diseaseFolder);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入疾病文件夹成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入疾病文件夹失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/delete")
    public ResultDTO<DiseaseFolder> delete(Integer id){
        /**
         *@title: delete
         *@description: 删除疾病文件夹 经id
         *@author: Mike
         *@date: 2019-06-19 10:27
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.DiseaseFolder>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            diseaseFolderService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除疾病文件夹成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除疾病文件夹失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/update")
    public ResultDTO<DiseaseFolder> update(@RequestBody DiseaseFolder diseaseFolder){
        /**
         *@title: update
         *@description: 更新疾病文件夹
         *@author: Mike
         *@date: 2019-06-19 10:28
         *@param: [diseaseFolder]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.DiseaseFolder>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            diseaseFolderService.update(diseaseFolder);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新疾病文件夹成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新疾病文件夹失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getDiseaseFolderById")
    public ResultDTO<DiseaseFolder> getDiseaseFolderById(Integer id){
        /**
         *@title: getDiseaseFolderById
         *@description: 查询疾病文件夹 经id
         *@author: Mike
         *@date: 2019-06-19 10:28
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.DiseaseFolder>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(diseaseFolderService.getDiseaseFolderById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询疾病文件夹成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询疾病文件夹失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllDiseaseFolder")
    public ResultDTO<DiseaseFolder> getAllDiseaseFolder(){
        /**
         *@title: getAllDiseaseFolder
         *@description: 展示所有疾病文件夹
         *@author: Mike
         *@date: 2019-06-19 10:29
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.DiseaseFolder>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(diseaseFolderService.getAllDiseaseFolder());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示疾病文件夹成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示疾病文件夹失败！");
        }
        return resultDTO;
    }
}
