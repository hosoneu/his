package edu.neu.hoso.controller;

import edu.neu.hoso.example.DepartmentExample;
import edu.neu.hoso.model.Department;
import edu.neu.hoso.model.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//SpringBoot 测试
@RestController
@RequestMapping("/hi")
public class TestController {
    @Autowired
    private DepartmentMapper departmentMapper;

    @RequestMapping("/test")
    public String index(){
        System.out.println("jeladfas");
        return ("hello");
    }
    @RequestMapping("/insert")
    public String insert(){
        Department department = new Department();
        department.setDepartmentName("测试插入自增ID");
        department.setDepartmentCode("mike");
        department.setDepartmentType("1");
        department.setDepartmentCategoryId(1);
        departmentMapper.insert(department);
        return ("insert success!");
    }
    @RequestMapping("/delete")
    public String delete(){
        DepartmentExample example = new DepartmentExample();
        DepartmentExample.Criteria criteria = example.createCriteria();
        criteria.andDepartmentCodeEqualTo("mike");
        departmentMapper.deleteByExample(example);
        //相当于：delete from department where department_code='mike'
        return ("delete success!");
    }

}
