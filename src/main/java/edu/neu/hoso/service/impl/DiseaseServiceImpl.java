package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.DiseaseExample;
import edu.neu.hoso.model.Disease;
import edu.neu.hoso.model.DiseaseMapper;
import edu.neu.hoso.service.DiseaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: DiseaseServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 疾病类业务接口实现类
 * @author: Mike
 * @date: 2019-06-12 14:50
 * @version: V1.0
*/
@Service
public class DiseaseServiceImpl implements DiseaseService {
    @Resource
    DiseaseMapper diseaseMapper;


    @Override
    public Integer insert(Disease disease) {
        /**
         *@title: insert
         *@description: 插入疾病类
         *@author: Mike
         *@date: 2019-06-12 14:51
         *@param: [disease]
         *@return: java.lang.Integer
         *@throws:
         */
        diseaseMapper.insert(disease);
        return disease.getDiseaseId();
    }

    @Override
    public void deleteById(Integer id) {
        /**
         *@title: deleteById
         *@description: 删除疾病 经id
         *@author: Mike
         *@date: 2019-06-12 14:53
         *@param: [id]
         *@return: void
         *@throws:
         */
        diseaseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByCode(String code) {
        /**
         *@title: deleteByCode
         *@description: 删除疾病 经code
         *@author: Mike
         *@date: 2019-06-12 14:54
         *@param: [code]
         *@return: void
         *@throws:
         */
        DiseaseExample diseaseExample = new DiseaseExample();
        DiseaseExample.Criteria criteria = diseaseExample.createCriteria();
        criteria.andDiseaseCodeEqualTo(code);
        diseaseMapper.deleteByExample(diseaseExample);
    }

    @Override
    public void deleteByName(String name) {
        /**
         *@title: deleteByName
         *@description: 删除疾病 经name
         *@author: Mike
         *@date: 2019-06-12 15:02
         *@param: [name]
         *@return: void
         *@throws:
         */
        DiseaseExample diseaseExample = new DiseaseExample();
        DiseaseExample.Criteria criteria = diseaseExample.createCriteria();
        criteria.andDiseaseNameEqualTo(name);
        diseaseMapper.deleteByExample(diseaseExample);
    }

    @Override
    public void deleteByICD(String icd) {
        /**
         *@title: deleteByICD
         *@description: 删除疾病 经icd
         *@author: Mike
         *@date: 2019-06-12 15:02
         *@param: [icd]
         *@return: void
         *@throws:
         */
        DiseaseExample diseaseExample = new DiseaseExample();
        DiseaseExample.Criteria criteria = diseaseExample.createCriteria();
        criteria.andDiseaseIcdEqualTo(icd);
        diseaseMapper.deleteByExample(diseaseExample);
    }

    @Override
    public void update(Disease disease) {
        /**
         *@title: update
         *@description: 更新疾病
         *@author: Mike
         *@date: 2019-06-12 15:03
         *@param: [disease]
         *@return: void
         *@throws:
         */
        diseaseMapper.updateByPrimaryKeySelective(disease);
    }

    @Override
    public Disease getDiseaseById(Integer id) {
        /**
         *@title: getDiseaseById
         *@description: 查询疾病 经id
         *@author: Mike
         *@date: 2019-06-12 15:04
         *@param: [id]
         *@return: edu.neu.hoso.model.Disease
         *@throws:
         */
        return diseaseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Disease> getDiseaseByCode(String code) {
        /**
         *@title: getDiseaseByCode
         *@description: 查询疾病 经code
         *@author: Mike
         *@date: 2019-06-12 15:05
         *@param: [code]
         *@return: java.util.List<edu.neu.hoso.model.Disease>
         *@throws:
         */
        DiseaseExample diseaseExample = new DiseaseExample();
        DiseaseExample.Criteria criteria = diseaseExample.createCriteria();
        criteria.andDiseaseCodeEqualTo(code);
        return diseaseMapper.selectByExample(diseaseExample);
    }

    @Override
    public List<Disease> getDiseaseByName(String name) {
        /**
         *@title: getDiseaseByName
         *@description: 查询疾病 经name
         *@author: Mike
         *@date: 2019-06-12 15:06
         *@param: [name]
         *@return: java.util.List<edu.neu.hoso.model.Disease>
         *@throws:
         */
        DiseaseExample diseaseExample = new DiseaseExample();
        DiseaseExample.Criteria criteria = diseaseExample.createCriteria();
        criteria.andDiseaseNameEqualTo(name);
        return diseaseMapper.selectByExample(diseaseExample);
    }

    @Override
    public List<Disease> getDiseaseByICD(String icd) {
        /**
         *@title: getDiseaseByICD
         *@description: 查询疾病 经icd
         *@author: Mike
         *@date: 2019-06-12 15:06
         *@param: [icd]
         *@return: java.util.List<edu.neu.hoso.model.Disease>
         *@throws:
         */
        DiseaseExample diseaseExample = new DiseaseExample();
        DiseaseExample.Criteria criteria = diseaseExample.createCriteria();
        criteria.andDiseaseIcdEqualTo(icd);
        return diseaseMapper.selectByExample(diseaseExample);
    }

    @Override
    public List<Disease> getDiseaseByTypeId(Integer typeId) {
        /**
         *@title: getDiseaseByType
         *@description: 查询疾病 经type
         *@author: Mike
         *@date: 2019-06-12 15:07
         *@param: [type]
         *@return: java.util.List<edu.neu.hoso.model.Disease>
         *@throws:
         */
        DiseaseExample diseaseExample = new DiseaseExample();
        DiseaseExample.Criteria criteria = diseaseExample.createCriteria();
        criteria.andDiseaseTypeIdEqualTo(typeId);
        return diseaseMapper.selectByExample(diseaseExample);
    }

    @Override
    public List<Disease> getAllDisease() {
        /**
         *@title: getAllDisease
         *@description: 查询所有疾病
         *@author: Mike
         *@date: 2019-06-12 15:09
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.Disease>
         *@throws:
         */
        DiseaseExample diseaseExample = new DiseaseExample();
        return diseaseMapper.selectByExample(diseaseExample);
    }

    @Override
    public List<Disease> getAllDiseaseWithType() {
        /**
         *@title: getAllDiseaseWithType
         *@description: 查询所有疾病 附带diseaseType
         *@author: Mike
         *@date: 2019-07-01 18:32
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.Disease>
         *@throws:
         */
        return diseaseMapper.getAllDiseaseWithType();
    }
}
