package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.ExpenseType;
import edu.neu.hoso.service.ExpenseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("expenseType")
public class ExpenseTypeController {
    @Autowired
    ExpenseTypeService expenseTypeService;

    @RequestMapping("/insert")
    public ResultDTO<ExpenseType> insert(@RequestBody ExpenseType expenseType){
        /**
         *@title: insert
         *@description: 插入费用科目
         *@author: Mike
         *@date: 2019-06-19 10:40
         *@param: [expenseType]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.ExpenseType>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            expenseTypeService.insertSelective(expenseType);
            resultDTO.setData(expenseType);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入费用科目成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入费用科目失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/delete")
    public ResultDTO<ExpenseType> delete(Integer id){
        /**
         *@title: delete
         *@description: 删除费用科目 经id
         *@author: Mike
         *@date: 2019-06-19 10:40
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.ExpenseType>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            expenseTypeService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除费用科目成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除费用科目失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/update")
    public ResultDTO<ExpenseType> update(@RequestBody ExpenseType expenseType){
        /**
         *@title: update
         *@description: 更新费用科目
         *@author: Mike
         *@date: 2019-06-19 10:40
         *@param: [expenseType]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.ExpenseType>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            expenseTypeService.update(expenseType);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新费用科目成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新费用科目失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getExpenseTypeById")
    public ResultDTO<ExpenseType> getExpenseTypeById(Integer id){
        /**
         *@title: getExpenseTypeById
         *@description: 查询费用科目 经id
         *@author: Mike
         *@date: 2019-06-19 10:40
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.ExpenseType>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(expenseTypeService.getExpenseTypeById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询费用科目成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询费用科目失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllExpenseType")
    public ResultDTO<ExpenseType> getAllExpenseType(){
        /**
         *@title: getAllExpenseType
         *@description: 展示所有费用科目
         *@author: Mike
         *@date: 2019-06-19 10:40
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.ExpenseType>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(expenseTypeService.getAllExpenseType());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示费用科目成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示费用科目失败！");
        }
        return resultDTO;
    }
}
