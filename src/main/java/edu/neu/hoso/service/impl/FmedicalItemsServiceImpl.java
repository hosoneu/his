package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.FmedicalItemsExample;
import edu.neu.hoso.model.FmedicalItems;
import edu.neu.hoso.model.FmedicalItemsMapper;
import edu.neu.hoso.service.FmedicalItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: FmedicalItemsServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 非药品项目类业务接口实现类
 * @author: Mike
 * @date: 2019-06-17 9:47
 * @version: V1.0
*/
@Service
public class FmedicalItemsServiceImpl implements FmedicalItemsService {
    @Resource
    FmedicalItemsMapper fmedicalItemsMapper;

    @Override
    public Integer insert(FmedicalItems fmedicalItems) {
        /**
         *@title: insert
         *@description: 插入非药品项目
         *@author: Mike
         *@date: 2019-06-17 9:49
         *@param: [fmedicalItems]
         *@return: java.lang.Integer
         *@throws:
         */
        fmedicalItemsMapper.insert(fmedicalItems);
        return fmedicalItems.getFmedicalItemsId();
    }

    @Override
    public Integer insertSelective(FmedicalItems fmedicalItems) {
        /**
         *@title: insertSelective
         *@description: 选择性插入非药品项目
         *@author: Mike
         *@date: 2019-06-17 9:49
         *@param: [fmedicalItems]
         *@return: java.lang.Integer
         *@throws:
         */
        fmedicalItemsMapper.insertSelective(fmedicalItems);
        return fmedicalItems.getFmedicalItemsId();
    }

    @Override
    public void deleteById(Integer id) {
        /**
         *@title: deleteById
         *@description: 删除非药品项目
         *@author: Mike
         *@date: 2019-06-17 9:49
         *@param: [id]
         *@return: void
         *@throws:
         */
        fmedicalItemsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByCode(String code) {
        /**
         *@title: deleteByCode
         *@description: 删除非药品项目 经code
         *@author: Mike
         *@date: 2019-06-17 9:51
         *@param: [code]
         *@return: void
         *@throws:
         */
        FmedicalItemsExample fmedicalItemsExample = new FmedicalItemsExample();
        FmedicalItemsExample.Criteria criteria = fmedicalItemsExample.createCriteria();
        criteria.andFmedicalItemsCodeEqualTo(code);
        fmedicalItemsMapper.deleteByExample(fmedicalItemsExample);
    }

    @Override
    public void deleteByName(String name) {
        /**
         *@title: deleteByName
         *@description: 删除非药品项目 经name
         *@author: Mike
         *@date: 2019-06-17 9:51
         *@param: [name]
         *@return: void
         *@throws:
         */
        FmedicalItemsExample fmedicalItemsExample = new FmedicalItemsExample();
        FmedicalItemsExample.Criteria criteria = fmedicalItemsExample.createCriteria();
        criteria.andFmedicalItemsNameEqualTo(name);
        fmedicalItemsMapper.deleteByExample(fmedicalItemsExample);
    }

    @Override
    public void update(FmedicalItems fmedicalItems) {
        /**
         *@title: update
         *@description: 更新非药品项目
         *@author: Mike
         *@date: 2019-06-17 9:52
         *@param: [fmedicalItems]
         *@return: void
         *@throws:
         */
        fmedicalItemsMapper.updateByPrimaryKeySelective(fmedicalItems);
    }

    @Override
    public FmedicalItems getFmedicalItemsById(Integer id) {
        /**
         *@title: getFmedicalItemsById
         *@description: 查询非药品项目 经id
         *@author: Mike
         *@date: 2019-06-17 9:52
         *@param: [id]
         *@return: edu.neu.hoso.model.FmedicalItems
         *@throws:
         */
        return fmedicalItemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<FmedicalItems> getFmedicalItemsByCode(String code) {
        /**
         *@title: getFmedicalItemsByCode
         *@description: 查询非药品项目 经code
         *@author: Mike
         *@date: 2019-06-17 9:53
         *@param: [code]
         *@return: java.util.List<edu.neu.hoso.model.FmedicalItems>
         *@throws:
         */
        FmedicalItemsExample fmedicalItemsExample = new FmedicalItemsExample();
        FmedicalItemsExample.Criteria criteria = fmedicalItemsExample.createCriteria();
        criteria.andFmedicalItemsCodeEqualTo(code);
        return fmedicalItemsMapper.selectByExample(fmedicalItemsExample);
    }

    @Override
    public List<FmedicalItems> getFmedicalItemsByName(String name) {
        /**
         *@title: getFmedicalItemsByName
         *@description: 查询非药品项目 经name
         *@author: Mike
         *@date: 2019-06-17 9:54
         *@param: [name]
         *@return: java.util.List<edu.neu.hoso.model.FmedicalItems>
         *@throws:
         */
        FmedicalItemsExample fmedicalItemsExample = new FmedicalItemsExample();
        FmedicalItemsExample.Criteria criteria = fmedicalItemsExample.createCriteria();
        criteria.andFmedicalItemsNameEqualTo(name);
        return fmedicalItemsMapper.selectByExample(fmedicalItemsExample);
    }

    @Override
    public List<FmedicalItems> getFmedicalItemsByDepartmentId(Integer departmentId) {
        /**
         *@title: getFmedicalItemsByDepartmentId
         *@description: 查询非药品项目 经departmentId
         *@author: Mike
         *@date: 2019-06-17 9:55
         *@param: [departmentId]
         *@return: java.util.List<edu.neu.hoso.model.FmedicalItems>
         *@throws:
         */
        FmedicalItemsExample fmedicalItemsExample = new FmedicalItemsExample();
        FmedicalItemsExample.Criteria criteria = fmedicalItemsExample.createCriteria();
        criteria.andDepartmentIdEqualTo(departmentId);
        return fmedicalItemsMapper.selectByExample(fmedicalItemsExample);
    }

    @Override
    public List<FmedicalItems> getFmedicalItemsByMnemoniccode(String mnemoniccode) {
        /**
         *@title: getFmedicalItemsByMnemoniccode
         *@description: 查询非药品项目 经mnemoniccode
         *@author: Mike
         *@date: 2019-06-17 9:55
         *@param: [mnemoniccode]
         *@return: java.util.List<edu.neu.hoso.model.FmedicalItems>
         *@throws:
         */
        FmedicalItemsExample fmedicalItemsExample = new FmedicalItemsExample();
        FmedicalItemsExample.Criteria criteria = fmedicalItemsExample.createCriteria();
        criteria.andFmedicalItemsMnemoniccodeEqualTo(mnemoniccode);
        return fmedicalItemsMapper.selectByExample(fmedicalItemsExample);
    }

    @Override
    public List<FmedicalItems> getAllFmedicalItems() {
        /**
         *@title: getAllFmedicalItems
         *@description: 查询所有非药品项目
         *@author: Mike
         *@date: 2019-06-17 9:55
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.FmedicalItems>
         *@throws:
         */
        FmedicalItemsExample fmedicalItemsExample = new FmedicalItemsExample();
        return fmedicalItemsMapper.selectByExample(fmedicalItemsExample);
    }

    @Override
    public List<FmedicalItems> getAllFmedicalItemsForShow() {
        /**
         *@title: getAllFmedicalItemsForShow
         *@description: 展示所有非药品项目 附带department,expenseType
         *@author: Mike
         *@date: 2019-06-26 14:06
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.FmedicalItems>
         *@throws:
         */
        return fmedicalItemsMapper.getAllFmedicalForShow();
    }
}
