package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.DiseaseFolderExample;
import edu.neu.hoso.model.DiseaseFolder;
import edu.neu.hoso.model.DiseaseFolderMapper;
import edu.neu.hoso.service.DiseaseFolderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: DiseaseFolderServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 疾病文件夹类业务接口实现类
 * @author: Mike
 * @date: 2019-06-17 9:35
 * @version: V1.0
*/
@Service
public class DiseaseFolderServiceImpl implements DiseaseFolderService {
    @Resource
    DiseaseFolderMapper diseaseFolderMapper;

    @Override
    public Integer insert(DiseaseFolder diseaseFolder) {
        /**
         *@title: insert
         *@description: 插入疾病文件夹
         *@author: Mike
         *@date: 2019-06-17 9:36
         *@param: [diseaseFolder]
         *@return: java.lang.Integer
         *@throws:
         */
        diseaseFolderMapper.insert(diseaseFolder);
        return diseaseFolder.getDiseaseFolderId();
    }

    @Override
    public void deleteById(Integer id) {
        /**
         *@title: deleteById
         *@description: 删除疾病文件夹 经id
         *@author: Mike
         *@date: 2019-06-17 9:36
         *@param: [id]
         *@return: void
         *@throws:
         */
        diseaseFolderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByName(String name) {
        /**
         *@title: deleteByName
         *@description: 删除疾病文件夹 经name
         *@author: Mike
         *@date: 2019-06-17 9:38
         *@param: [name]
         *@return: void
         *@throws:
         */
        DiseaseFolderExample diseaseFolderExample = new DiseaseFolderExample();
        DiseaseFolderExample.Criteria criteria = diseaseFolderExample.createCriteria();
        criteria.andDiseaseFolderNameEqualTo(name);
        diseaseFolderMapper.deleteByExample(diseaseFolderExample);
    }

    @Override
    public void update(DiseaseFolder diseaseFolder) {
        /**
         *@title: update
         *@description: 更新疾病文件夹
         *@author: Mike
         *@date: 2019-06-17 9:38
         *@param: [diseaseFolder]
         *@return: void
         *@throws:
         */
        diseaseFolderMapper.updateByPrimaryKeySelective(diseaseFolder);
    }

    @Override
    public DiseaseFolder getDiseaseFolderById(Integer id) {
        /**
         *@title: getDiseaseFolderById
         *@description: 查询疾病文件夹 经id
         *@author: Mike
         *@date: 2019-06-17 9:39
         *@param: [id]
         *@return: edu.neu.hoso.model.DiseaseFolder
         *@throws:
         */
        return diseaseFolderMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<DiseaseFolder> getDiseaseFolderByName(String name) {
        /**
         *@title: getDiseaseFolderByName
         *@description: 查询疾病文件夹 经name
         *@author: Mike
         *@date: 2019-06-17 9:40
         *@param: [name]
         *@return: java.util.List<edu.neu.hoso.model.DiseaseFolder>
         *@throws:
         */
        DiseaseFolderExample diseaseFolderExample = new DiseaseFolderExample();
        DiseaseFolderExample.Criteria criteria = diseaseFolderExample.createCriteria();
        criteria.andDiseaseFolderNameEqualTo(name);
        return diseaseFolderMapper.selectByExample(diseaseFolderExample);
    }

    @Override
    public List<DiseaseFolder> getAllDiseaseFolder() {
        /**
         *@title: getAllDiseaseFolder
         *@description: 查询所有疾病文件夹
         *@author: Mike
         *@date: 2019-06-17 9:40
         *@param: []
         *@return: java.util.List<edu.neu.hoso.model.DiseaseFolder>
         *@throws:
         */
        DiseaseFolderExample diseaseFolderExample = new DiseaseFolderExample();
        return diseaseFolderMapper.selectByExample(diseaseFolderExample);
    }
}
