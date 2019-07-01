package edu.neu.hoso.service;

import edu.neu.hoso.model.ConstantItems;
import edu.neu.hoso.model.Department;

import java.util.List;

/**
 * @title: DepartmentService
 * @package edu.neu.hoso.service
 * @description: 科室类业务接口
 * @author: Mike
 * @date: 2019-06-11 11:07
 * @version: V1.0
*/
public interface DepartmentService {
    Integer insert(Department department);
    Integer insertSelective(Department department);
    void deleteById(Integer id);
    void deleteByCode(String code);
    void deleteByName(String name);
    void update(Department department);
    Department getDepartmentById(Integer id);
    List<Department> getDepartmentByCode(String code);
    List<Department> getDepartmentByName(String name);
    List<Department> getDepartmentByCategoryId(Integer categoryId);
    List<Department> getDepartmentByType(String type);
    List<Department> getAllDepartment();
    List<Department> getAllDepartmentWithCategory();
    List<ConstantItems> getAllDepartmentCategory();
}
