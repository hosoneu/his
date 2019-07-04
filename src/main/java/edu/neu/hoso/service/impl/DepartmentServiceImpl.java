package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.ConstantItemsExample;
import edu.neu.hoso.example.DepartmentExample;
import edu.neu.hoso.model.ConstantItems;
import edu.neu.hoso.model.ConstantItemsMapper;
import edu.neu.hoso.model.Department;
import edu.neu.hoso.model.DepartmentMapper;
import edu.neu.hoso.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: DepartmentServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 科室类业务实现类
 * @author: Mike
 * @date: 2019-06-11 10:09
 * @version: V1.0
*/
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    DepartmentMapper departmentMapper;

    @Resource
    ConstantItemsMapper constantItemsMapper;

    @Override
    public Integer insert(Department department) {
        /**
         *@title: insert
         *@description: 插入科室
         *@author: Mike
         *@date: 2019-06-11 10:10
         *@param: [department]
         *@return: java.lang.Integer
         *@throws:
         */
        departmentMapper.insert(department);
        return department.getDepartmentId();
    }

    @Override
    public Integer insertSelective(Department department) {
        /**
         *@title: insertSelective
         *@description: 选择性插入科室
         *@author: Mike
         *@date: 2019-06-13 10:14
         *@param: [department]
         *@return: java.lang.Integer
         *@throws:
         */
        departmentMapper.insertSelective(department);
        return department.getDepartmentId();
    }

    @Override
    public void deleteById(Integer id) {
        /**
         *@title: deleteById
         *@description: 删除科室 经id
         *@author: Mike
         *@date: 2019-06-11 10:10
         *@param: [id]
         *@return: void
         *@throws:
         */
        departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByCode(String code) {
        /**
         *@title: deleteByCode
         *@description: 删除科室 经code
         *@author: Mike
         *@date: 2019-06-11 10:11
         *@param: [code]
         *@return: void
         *@throws:
         */
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria= departmentExample.createCriteria();
        criteria.andDepartmentCodeEqualTo(code);
        departmentMapper.deleteByExample(departmentExample);
    }

    @Override
    public void deleteByName(String name) {
        /**
         *@title: deleteByName
         *@description: 删除科室 经name
         *@author: Mike
         *@date: 2019-06-11 10:11
         *@param: [name]
         *@return: void
         *@throws:
         */
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria= departmentExample.createCriteria();
        criteria.andDepartmentNameEqualTo(name);
        departmentMapper.deleteByExample(departmentExample);
    }

    @Override
    public void update(Department department) {
        /**
         *@title: update
         *@description: 更新科室
         *@author: Mike
         *@date: 2019-06-11 10:11
         *@param: [department]
         *@return: void
         *@throws:
         */
        departmentMapper.updateByPrimaryKeySelective(department);
    }

    @Override
    public Department getDepartmentById(Integer id) {
        /**
         *@title: getDepartmentById
         *@description: 查询科室 经id
         *@author: Mike
         *@date: 2019-06-11 10:20
         *@param: [id]
         *@return: edu.neu.hoso.model.Department
         *@throws:
         */
        return departmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Department> getDepartmentByCode(String code) {
        /**
         *@title: getDepartmentByCode
         *@description: 查询科室 经code
         *@author: Mike
         *@date: 2019-06-11 10:21
         *@param: [code]
         *@return: java.util.List<edu.neu.hoso.model.Department>
         *@throws:
         */
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andDepartmentCodeEqualTo(code);
        return departmentMapper.selectByExample(departmentExample);
    }

    @Override
    public List<Department> getDepartmentByName(String name) {
        /**
         *@title: getDepartmentByName
         *@description: 查询科室 经name
         *@author: Mike
         *@date: 2019-06-11 10:22
         *@param: [name]
         *@return: java.util.List<edu.neu.hoso.model.Department>
         *@throws:
         */
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andDepartmentNameEqualTo(name);
        return departmentMapper.selectByExample(departmentExample);
    }

    @Override
    public List<Department> getDepartmentByCategoryId(Integer categoryId) {
        /**
         *@title: getDepartmentByCategoryId
         *@description: 查询科室 经categoryId
         *@author: Mike
         *@date: 2019-06-11 10:22
         *@param: [categoryId]
         *@return: java.util.List<edu.neu.hoso.model.Department>
         *@throws:
         */
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andDepartmentCategoryIdEqualTo(categoryId);
        return departmentMapper.selectByExample(departmentExample);
    }

    @Override
    public List<Department> getDepartmentByType(String type) {
        /**
         *@title: getDepartmentByType
         *@description: 查询科室 经type
         *@author: Mike
         *@date: 2019-06-11 10:23
         *@param: [type]
         *@return: java.util.List<edu.neu.hoso.model.Department>
         *@throws:
         */
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andDepartmentTypeEqualTo(type);
        return departmentMapper.selectByExample(departmentExample);
    }

    @Override
    public List<Department> getAllDepartment() {
        /**
         *@title: getAllDepartment
         *@description: 查询所有科室
         *@author: Mike
         *@date: 2019-06-11 10:23
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.Department>*
         *@throws:
         */
        DepartmentExample departmentExample = new DepartmentExample();
        return departmentMapper.selectByExample(departmentExample);
    }

    @Override
    public List<Department> getAllDepartmentWithCategory() {
        /**
         *@title: getAllDepartmentWithCategory
         *@description: 查询所有科室 附带Category信息
         *@author: Mike
         *@date: 2019-06-25 12:05
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.Department>
         *@throws:
         */
        return departmentMapper.getAllDepartmentWithCategory();
    }

    @Override
    public List<ConstantItems> getAllDepartmentCategory() {
        /**
         *@title: getAllDepartmentCategory
         *@description: 查询所有科室分类
         *@author: Mike
         *@date: 2019-06-30 20:25
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.ConstantItems>
         *@throws:
         */
        ConstantItemsExample constantItemsExample = new ConstantItemsExample();
        ConstantItemsExample.Criteria criteria = constantItemsExample.createCriteria();
        criteria.andConstantTypeIdEqualTo(1);
        return constantItemsMapper.selectByExample(constantItemsExample);
    }
}
