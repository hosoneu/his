package edu.neu.hoso.service;

import edu.neu.hoso.model.DiseaseFolder;

import java.util.List;

/**
 * @title: DiseaseFolderService
 * @package edu.neu.hoso.service
 * @description: 疾病文件夹类业务接口
 * @author: Mike
 * @date: 2019-06-17 9:32
 * @version: V1.0
*/
public interface DiseaseFolderService {
    Integer insert(DiseaseFolder diseaseFolder);
    void deleteById(Integer id);
    void deleteByName(String name);
    void update(DiseaseFolder diseaseFolder);
    DiseaseFolder getDiseaseFolderById(Integer id);
    List<DiseaseFolder> getDiseaseFolderByName(String name);
    List<DiseaseFolder> getAllDiseaseFolder();
}
