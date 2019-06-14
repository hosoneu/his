package edu.neu.hoso.service;

import edu.neu.hoso.model.DiseaseType;

import java.util.List;

/**
 * @title: DiseaseTypeService
 * @package edu.neu.hoso.service
 * @description: 疾病类别类业务接口
 * @author: Mike
 * @date: 2019-06-12 14:40
 * @version: V1.0
*/
public interface DiseaseTypeService {
    Integer insert(DiseaseType diseaseType);
    void deleteById(Integer id);
    void deleteByCode(String code);
    void deleteByName(String name);
    void deleteByType(String type);
    void update(DiseaseType diseaseType);
    DiseaseType getDiseaseTypeById(Integer id);
    List<DiseaseType> getDiseaseTypeByCode(String code);
    List<DiseaseType> getDiseaseTypeByName(String name);
    List<DiseaseType> getDiseaseTypeByType(String type);
    List<DiseaseType> getAllDiseaseType();
}
