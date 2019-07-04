package edu.neu.hoso.service;

import edu.neu.hoso.model.Disease;

import java.util.List;

/**
 * @title: DiseaseService
 * @package edu.neu.hoso.service
 * @description: 疾病类业务接口
 * @author: Mike
 * @date: 2019-06-12 14:34
 * @version: V1.0
*/
public interface DiseaseService {
    Integer insert(Disease disease);
    void deleteById(Integer id);
    void deleteByCode(String code);
    void deleteByName(String name);
    void deleteByICD(String icd);
    void update(Disease disease);
    Disease getDiseaseById(Integer id);
    List<Disease> getDiseaseByCode(String code);
    List<Disease> getDiseaseByName(String name);
    List<Disease> getDiseaseByICD(String icd);
    List<Disease> getDiseaseByTypeId(Integer typeId);
    List<Disease> getAllDisease();
    List<Disease> getAllDiseaseWithType();
}
