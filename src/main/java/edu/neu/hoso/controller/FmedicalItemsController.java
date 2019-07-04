package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.FmedicalItems;
import edu.neu.hoso.service.FmedicalItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("fmedicalItems")
public class FmedicalItemsController {
    @Autowired
    FmedicalItemsService fmedicalItemsService;

    @RequestMapping("/insert")
    public ResultDTO<FmedicalItems> insert(@RequestBody FmedicalItems fmedicalItems){
        /**
         *@title: insert
         *@description: 插入非药品
         *@author: Mike
         *@date: 2019-06-19 10:43
         *@param: [fmedicalItems]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.FmedicalItems>
         *@throws:
         */
        System.out.println("插入费用科目"+fmedicalItems);
        ResultDTO resultDTO = new ResultDTO();
        try {
            fmedicalItemsService.insertSelective(fmedicalItems);
            resultDTO.setData(fmedicalItems);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入非药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入非药品失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/delete")
    public ResultDTO<FmedicalItems> delete(Integer id){
        /**
         *@title: delete
         *@description: 删除非药品 经id
         *@author: Mike
         *@date: 2019-06-19 10:43
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.FmedicalItems>
         *@throws:
         */
        System.out.println("删除费用科目"+id);
        ResultDTO resultDTO = new ResultDTO();
        try {
            fmedicalItemsService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除非药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除非药品失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/update")
    public ResultDTO<FmedicalItems> update(@RequestBody FmedicalItems fmedicalItems){
        /**
         *@title: update
         *@description: 更新非药品
         *@author: Mike
         *@date: 2019-06-19 10:43
         *@param: [fmedicalItems]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.FmedicalItems>
         *@throws:
         */
        System.out.println("更新费用科目"+fmedicalItems);
        ResultDTO resultDTO = new ResultDTO();
        try {
            fmedicalItemsService.update(fmedicalItems);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新非药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新非药品失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getFmedicalItemsById")
    public ResultDTO<FmedicalItems> getFmedicalItemsById(Integer id){
        /**
         *@title: getFmedicalItemsById
         *@description: 查询非药品 经id
         *@author: Mike
         *@date: 2019-06-19 10:43
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.FmedicalItems>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(fmedicalItemsService.getFmedicalItemsById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询非药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询非药品失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllFmedicalItems")
    public ResultDTO<FmedicalItems> getAllFmedicalItems(){
        /**
         *@title: getAllFmedicalItems
         *@description: 展示所有非药品
         *@author: Mike
         *@date: 2019-06-19 10:43
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.FmedicalItems>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(fmedicalItemsService.getAllFmedicalItems());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示非药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示非药品失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllFmedicalItemsForShow")
    public ResultDTO<FmedicalItems> getAllFmedicalItemsForShow(){
        /**
         *@title: getAllFmedicalItemsForShow
         *@description: 展示所有非药品项目 附带department,expenseType
         *@author: Mike
         *@date: 2019-06-26 14:07
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.FmedicalItems>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(fmedicalItemsService.getAllFmedicalItemsForShow());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示非药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示非药品失败！");
        }
        return resultDTO;
    }
}
