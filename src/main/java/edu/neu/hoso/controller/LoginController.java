package edu.neu.hoso.controller;

import edu.neu.hoso.dto.LoginResult;
import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.Department;
import edu.neu.hoso.model.Role;
import edu.neu.hoso.model.User;
import edu.neu.hoso.service.DepartmentService;
import edu.neu.hoso.service.RoleService;
import edu.neu.hoso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    UserService userService;
    @Autowired
    DepartmentService departmentService;
    @Autowired
    RoleService roleService;
    @RequestMapping("/LoginUser")
    public ResultDTO findUser(String userLoginName,String password){
        ResultDTO result = new ResultDTO<>();
        List<User> users=userService.getUserByLoginname(userLoginName);
        if (users.size()==0){
            result.setStatus("Error");
            result.setMsg("用户名或密码错误");
        return result;
        }
        for (User user:users){
            if(user.getUserPassword().equals(password)){
                Department department=departmentService.getDepartmentById(user.getDepartmentId());
                Role role = roleService.findRoleByID(user.getRoleId());
                System.out.println("role:"+role.getRoleName());
                System.out.println("department"+department.getDepartmentName());
                System.out.println(role.getRoleId());
                LoginResult loginResult = new LoginResult(user,department,role);
                result.setData(loginResult);
                result.setStatus("OK");
                result.setMsg("请求成功");
                return result;
            }
        }
        result.setStatus("Error");
        result.setMsg("用户名或密码错误");
        return result;
    }
}
