package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.Department;
import edu.neu.hoso.model.User;
import edu.neu.hoso.service.DepartmentService;
import edu.neu.hoso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**   
 * @title: DepartmentController
 * @package edu.neu.hoso.controller
 * @description: 科室控制类
 * @author: Mike
 * @date: 2019-06-11 17:44
 * @version: V1.0   
*/
@CrossOrigin
@RestController
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @Autowired
    UserService userService;
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
    public ResultDTO<Department> insert(Department department){
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
    public ResultDTO<Department> delete(Integer departmentId){
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
            departmentService.deleteById(departmentId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除失败！");
        }
        return resultDTO;
    }
}
