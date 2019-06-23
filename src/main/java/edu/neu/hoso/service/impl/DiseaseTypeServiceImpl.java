package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.DiseaseTypeExample;
import edu.neu.hoso.model.DiseaseType;
import edu.neu.hoso.model.DiseaseTypeMapper;
import edu.neu.hoso.service.DiseaseTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: DiseaseTypeServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 疾病分类类业务接口实现类
 * @author: Mike
 * @date: 2019-06-12 15:27
 * @version: V1.0
*/
@Service
public class DiseaseTypeServiceImpl implements DiseaseTypeService{
    @Resource
    DiseaseTypeMapper diseaseTypeMapper;


    @Override
    public Integer insert(DiseaseType diseaseType) {
        /**
         *@title: insert
         *@description: 插入疾病分类
         *@author: Mike
         *@date: 2019-06-12 15:28
         *@param: [diseaseType]
         *@return: java.lang.Integer
         *@throws:
         */
        diseaseTypeMapper.insert(diseaseType);
        return diseaseType.getDiseaseTypeId();
    }

    @Override
    public void deleteById(Integer id) {
        /**
         *@title: deleteById
         *@description: 删除疾病分类 经id
         *@author: Mike
         *@date: 2019-06-12 15:30
         *@param: [id]
         *@return: void
         *@throws:
         */
        diseaseTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByCode(String code) {
        /**
         *@title: deleteByCode
         *@description: 删除疾病分类 经code
         *@author: Mike
         *@date: 2019-06-12 15:30
         *@param: [code]
         *@return: void
         *@throws:
         */
        DiseaseTypeExample diseaseTypeExample = new DiseaseTypeExample();
        DiseaseTypeExample.Criteria criteria = diseaseTypeExample.createCriteria();
        criteria.andDiseaseTypeCodeEqualTo(code);
        diseaseTypeMapper.deleteByExample(diseaseTypeExample);
    }

    @Override
    public void deleteByName(String name) {
        /**
         *@title: deleteByName
         *@description: 删除疾病分类 经name
         *@author: Mike
         *@date: 2019-06-12 15:32
         *@param: [name]
         *@return: void
         *@throws:
         */
        DiseaseTypeExample diseaseTypeExample = new DiseaseTypeExample();
        DiseaseTypeExample.Criteria criteria = diseaseTypeExample.createCriteria();
        criteria.andDiseaseTypeNameEqualTo(name);
        diseaseTypeMapper.deleteByExample(diseaseTypeExample);
    }

    @Override
    public void deleteByType(String type) {
        /**
         *@title: deleteByType
         *@description: 删除疾病分类 经type
         *@author: Mike
         *@date: 2019-06-12 15:32
         *@param: [type]
         *@return: void
         *@throws:
         */
        DiseaseTypeExample diseaseTypeExample = new DiseaseTypeExample();
        DiseaseTypeExample.Criteria criteria = diseaseTypeExample.createCriteria();
        criteria.andDiseaseTypeTypeEqualTo(type);
        diseaseTypeMapper.deleteByExample(diseaseTypeExample);
    }

    @Override
    public void update(DiseaseType diseaseType) {
        /**
         *@title: update
         *@description: 更新疾病分类
         *@author: Mike
         *@date: 2019-06-12 15:33
         *@param: [diseaseType]
         *@return: void
         *@throws:
         */
        diseaseTypeMapper.updateByPrimaryKeySelective(diseaseType);
    }

    @Override
    public DiseaseType getDiseaseTypeById(Integer id) {
        /**
         *@title: getDiseaseTypeById
         *@description: 查询疾病分类 经id
         *@author: Mike
         *@date: 2019-06-12 15:33
         *@param: [id]
         *@return: edu.neu.hoso.model.DiseaseType
         *@throws:
         */
        return diseaseTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<DiseaseType> getDiseaseTypeByCode(String code) {
        /**
         *@title: getDiseaseTypeByCode
         *@description: 查询疾病分类 经code
         *@author: Mike
         *@date: 2019-06-12 15:34
         *@param: [code]
         *@return: java.util.List<edu.neu.hoso.model.DiseaseType>
         *@throws:
         */
        DiseaseTypeExample diseaseTypeExample = new DiseaseTypeExample();
        DiseaseTypeExample.Criteria criteria = diseaseTypeExample.createCriteria();
        criteria.andDiseaseTypeCodeEqualTo(code);
        return diseaseTypeMapper.selectByExample(diseaseTypeExample);
    }

    @Override
    public List<DiseaseType> getDiseaseTypeByName(String name) {
        /**
         *@title: getDiseaseTypeByName
         *@description: 查询疾病分类 经name
         *@author: Mike
         *@date: 2019-06-12 15:35
         *@param: [name]
         *@return: java.util.List<edu.neu.hoso.model.DiseaseType>
         *@throws:
         */
        DiseaseTypeExample diseaseTypeExample = new DiseaseTypeExample();
        DiseaseTypeExample.Criteria criteria = diseaseTypeExample.createCriteria();
        criteria.andDiseaseTypeNameEqualTo(name);
        return diseaseTypeMapper.selectByExample(diseaseTypeExample);
    }

    @Override
    public List<DiseaseType> getDiseaseTypeByType(String type) {
        /**
         *@title: getDiseaseTypeByType
         *@description: 查询疾病分类 经type
         *@author: Mike
         *@date: 2019-06-12 15:35
         *@param: [type]
         *@return: java.util.List<edu.neu.hoso.model.DiseaseType>
         *@throws:
         */
        DiseaseTypeExample diseaseTypeExample = new DiseaseTypeExample();
        DiseaseTypeExample.Criteria criteria = diseaseTypeExample.createCriteria();
        criteria.andDiseaseTypeTypeEqualTo(type);
        return diseaseTypeMapper.selectByExample(diseaseTypeExample);
    }

    @Override
    public List<DiseaseType> getAllDiseaseType() {
        /**
         *@title: getAllDiseaseType
         *@description: 查询所有疾病分类
         *@author: Mike
         *@date: 2019-06-12 15:36
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.DiseaseType>
         *@throws:
         */
        DiseaseTypeExample diseaseTypeExample = new DiseaseTypeExample();
        return diseaseTypeMapper.selectByExample(diseaseTypeExample);
    }
}
