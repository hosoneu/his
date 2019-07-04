package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.ConstantItems;
import edu.neu.hoso.model.Department;
import edu.neu.hoso.model.User;
import edu.neu.hoso.service.DepartmentService;
import edu.neu.hoso.service.UserService;
import edu.neu.hoso.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**   
 * @title: DepartmentController
 * @package edu.neu.hoso.controller
 * @description: 科室控制类
 * @author: Mike
 * @date: 2019-06-11 17:44
 * @version: V1.0   
*/
@RestController
@CrossOrigin
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @Autowired
    UserService userService;

    @Resource
    private RedisUtils redisUtils;
    @RequestMapping("/findUser")
    public ResultDTO findUser(int departmentID){
        System.out.println("进来了");
        List<User> userList = userService.getUserByDepartmentID(departmentID);
        System.out.println(userList.size());
        ResultDTO result = new ResultDTO<>();
        result.setData(userList);
        result.setStatus("OK");
        result.setMsg("请求成功");
        return result;
    }
    @RequestMapping("/findAll")
    public ResultDTO findAll(){
        List<Department> departmentList = departmentService.getAllDepartment();
        System.out.println(departmentList.size());
        ResultDTO result = new ResultDTO<>();
        result.setData(departmentList);
        result.setStatus("OK");
        result.setMsg("请求成功");
        return result;
    }


    @RequestMapping("/insert")
    public ResultDTO<Department> insert(@RequestBody Department department){
        /**  
         *@title: insert
         *@description: 插入科室  
         *@author: Mike  
         *@date: 2019-06-11 16:28   
         *@param: [department]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Department> 
         *@throws:
         */ 
        ResultDTO resultDTO = new ResultDTO();
        try {
            departmentService.insert(department);
            resultDTO.setData(department);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/delete")
    public ResultDTO<Department> delete(Integer id){
        /**  
         *@title: delete
         *@description: 删除科室  
         *@author: Mike  
         *@date: 2019-06-11 16:27   
         *@param: [departmentId]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Department> 
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            departmentService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/update")
    public ResultDTO<Department> update(@RequestBody Department department){
        /**
         *@title: update
         *@description: 更新科室
         *@author: Mike
         *@date: 2019-06-19 11:07
         *@param: [department]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Department>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            departmentService.update(department);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新科室成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新科室失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getDepartmentById")
    public ResultDTO<Department> getDepartmentById(Integer id){
        /**
         *@title: getDepartmentById
         *@description: 查询科室 经id
         *@author: Mike
         *@date: 2019-06-19 11:06
         *@param: [id]
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Department>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(departmentService.getDepartmentById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询科室成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询科室失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllDepartment")
    public ResultDTO<List<Department>> getAllDepartment(){
        /**
         *@title: getAllDepartment
         *@description: 展示所有科室
         *@author: Mike
         *@date: 2019-06-19 11:06
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Department>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            List<Department> diseaseList = departmentService.getAllDepartment();
            String key = "AllDepartment";
            redisUtils.set(key, diseaseList);
            resultDTO.setData(diseaseList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示科室成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示科室失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllDepartmentWithCategory")
    public ResultDTO<Department> getAllDepartmentWithCategory(){
        /**
         *@title: getAllDepartmentWithCategory
         *@description: 查询所有科室 附带Category
         *@author: Mike
         *@date: 2019-06-25 12:10
         *@param: []
         *@return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Department>
         *@throws:
         */
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(departmentService.getAllDepartmentWithCategory());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示科室成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示科室失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getAllDepartmentCategory")
    public ResultDTO<ConstantItems> getAllDepartmentCategory(){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(departmentService.getAllDepartmentCategory());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询科室分类成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询科室分类失败！");
        }
        return resultDTO;
    }
}
