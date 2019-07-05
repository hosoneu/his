package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.DrugsExample;
import edu.neu.hoso.model.ConstantItems;
import edu.neu.hoso.model.ConstantItemsMapper;
import edu.neu.hoso.model.Drugs;
import edu.neu.hoso.model.DrugsMapper;
import edu.neu.hoso.service.DrugService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: DrugServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 药品类接口实现类
 * @author: Mike
 * @date: 2019-06-17 11:07
 * @version: V1.0
*/
@Service
public class DrugServiceImpl implements DrugService {
    @Resource
    DrugsMapper drugsMapper;

    @Resource
    ConstantItemsMapper constantItemsMapper;

    @Override
    public Integer insertSelective(Drugs drugs) {
        /**
         *@title: insertSelective
         *@description: 插入药品
         *@author: Mike
         *@date: 2019-06-17 11:08
         *@param: [drugs]
         *@return: java.lang.Integer
         *@throws:
         */
        drugsMapper.insertSelective(drugs);
        return drugs.getDrugsId();
    }

    @Override
    public void deleteById(Integer id) {
        /**
         *@title: deleteById
         *@description: 删除药品 经id
         *@author: Mike
         *@date: 2019-06-17 11:08
         *@param: [id]
         *@return: void
         *@throws:
         */
        drugsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByCode(String code) {
        /**
         *@title: deleteByCode
         *@description: 删除药品 经code
         *@author: Mike
         *@date: 2019-06-17 11:09
         *@param: [code]
         *@return: void
         *@throws:
         */
        DrugsExample drugsExample = new DrugsExample();
        DrugsExample.Criteria criteria = drugsExample.createCriteria();
        criteria.andDrugsCodeEqualTo(code);
        drugsMapper.deleteByExample(drugsExample);
    }

    @Override
    public void deleteByName(String name) {
        /**
         *@title: deleteByName
         *@description: 删除药品 经name
         *@author: Mike
         *@date: 2019-06-17 11:10
         *@param: [name]
         *@return: void
         *@throws:
         */
        DrugsExample drugsExample = new DrugsExample();
        DrugsExample.Criteria criteria = drugsExample.createCriteria();
        criteria.andDrugsNameEqualTo(name);
        drugsMapper.deleteByExample(drugsExample);

    }

    @Override
    public void update(Drugs drugs) {
        /**
         *@title: update
         *@description: 更新药品
         *@author: Mike
         *@date: 2019-06-17 11:10
         *@param: [drugs]
         *@return: void
         *@throws:
         */
        drugsMapper.updateByPrimaryKeySelective(drugs);
    }

    @Override
    public Drugs getDrugsById(Integer id) {
        /**
         *@title: getDrugsById
         *@description: 查询药品 经id
         *@author: Mike
         *@date: 2019-06-17 11:10
         *@param: [id]
         *@return: edu.neu.hoso.model.Drugs
         *@throws:
         */
        return drugsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Drugs> getDrugsByCode(String code) {
        /**
         *@title: getDrugsByCode
         *@description: 查询药品 经code
         *@author: Mike
         *@date: 2019-06-17 11:11
         *@param: [code]
         *@return: java.util.List<edu.neu.hoso.model.Drugs>
         *@throws:
         */
        DrugsExample drugsExample = new DrugsExample();
        DrugsExample.Criteria criteria = drugsExample.createCriteria();
        criteria.andDrugsCodeEqualTo(code);
        return drugsMapper.selectByExample(drugsExample);
    }

    @Override
    public List<Drugs> getDrugsByName(String name) {
        /**
         *@title: getDrugsByName
         *@description: 查询药品 经name
         *@author: Mike
         *@date: 2019-06-17 11:11
         *@param: [name]
         *@return: java.util.List<edu.neu.hoso.model.Drugs>
         *@throws:
         */
        DrugsExample drugsExample = new DrugsExample();
        DrugsExample.Criteria criteria = drugsExample.createCriteria();
        criteria.andDrugsNameEqualTo(name);
        return drugsMapper.selectByExample(drugsExample);
    }

    @Override
    public List<Drugs> getDrugsByDrugsManufacturer(String drugsManufacturer) {
        /**
         *@title: getDrugsByDrugsManufacturer
         *@description: 查询药品 经drugsManufacturer
         *@author: Mike
         *@date: 2019-06-17 11:11
         *@param: [drugsManufacturer]
         *@return: java.util.List<edu.neu.hoso.model.Drugs>
         *@throws:
         */
        DrugsExample drugsExample = new DrugsExample();
        DrugsExample.Criteria criteria = drugsExample.createCriteria();
        criteria.andDrugsManufacturerEqualTo(drugsManufacturer);
        return drugsMapper.selectByExample(drugsExample);
    }

    @Override
    public List<Drugs> getDrugsByMnemoniccode(String mnemoniccode) {
        /**
         *@title: getDrugsByMnemoniccode
         *@description: 查询药品 经mnemoniccode
         *@author: Mike
         *@date: 2019-06-17 11:12
         *@param: [mnemoniccode]
         *@return: java.util.List<edu.neu.hoso.model.Drugs>
         *@throws:
         */
        DrugsExample drugsExample = new DrugsExample();
        DrugsExample.Criteria criteria = drugsExample.createCriteria();
        criteria.andDrugsMnemoniccodeEqualTo(mnemoniccode);
        return drugsMapper.selectByExample(drugsExample);
    }

    @Override
    public List<Drugs> getAllDrugs() {
        /**
         *@title: getAllDrugs
         *@description: 查询所有药品
         *@author: Mike
         *@date: 2019-06-17 11:12
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.Drugs>
         *@throws:
         */
        DrugsExample drugsExample = new DrugsExample();
        return drugsMapper.selectByExample(drugsExample);
    }

    @Override
    public List<Drugs> getAllDrugsWithTypeAndDosage() {
        /**
         *@title: getAllDrugsWithTypeAndDosage
         *@description: 查询所有药品 附带drugsType,drugsDosage
         *@author: Mike
         *@date: 2019-07-01 21:37
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.Drugs>
         *@throws:
         */
        return drugsMapper.getAllDrugsWithTypeAndDosage();
    }

    @Override
    public List<ConstantItems> getDrugsDosage() {
        /**
         *@title: getDrugsDosage
         *@description: 查询药品剂型常数
         *@author: Mike
         *@date: 2019-07-01 21:53
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.ConstantItems>
         *@throws:
         */
        return constantItemsMapper.getDrugsDosage();
    }

    @Override
    public List<ConstantItems> getDrugsType() {
        /**
         *@title: getDrugsType
         *@description: 查询药品类型常数
         *@author: Mike
         *@date: 2019-07-01 21:53
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.ConstantItems>
         *@throws:
         */
        return constantItemsMapper.getDrugsType();
    }
}
