package edu.neu.hoso.service.impl;

import edu.neu.hoso.model.*;
import edu.neu.hoso.service.CommonlyUsedService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: CommonlyUsedServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 实现对常用项的操作：获取常用检查、检验、初诊、药品等
 * @author: 29-y
 * @date: 2019-06-14 10:23
 * @version: V1.0
*/
@Service
public class CommonlyUsedServiceImpl implements CommonlyUsedService {
    @Resource
    CommonlyUsedDiagnosisMapper commonlyUsedDiagnosisMapper;
    @Resource
    CommonlyUsedFmedicalMapper commonlyUsedFmedicalMapper;
    @Resource
    CommonlyUsedDrugsMapper commonlyUsedDrugsMapper;

    /**
     * @title: listCommonlyUsedDrugsByUserId
     * @description: 列出用户的常用药品
     * @author: 29-y
     * @date: 2019-06-17 9:57
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.CommonlyUsedDrugs>
     * @throws:
     */
    @Override
    public List<CommonlyUsedDrugs> listCommonlyUsedDrugsByUserId(Integer userId) {
        return commonlyUsedDrugsMapper.listCommonlyUsedDrugsByUserId(userId);
    }

    /**
     * @title: listCommonlyUsedPatentDrugsByUserId
     * @description: 列出用户的常用成药药品
     * @author:
     * @date: 2019-06-26 18:24
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.CommonlyUsedDrugs>
     * @throws:
     */
    @Override
    public List<CommonlyUsedDrugs> listCommonlyUsedPatentDrugsByUserId(Integer userId) {
        return commonlyUsedDrugsMapper.listCommonlyUsedPatentDrugsByUserId(userId);
    }

    /**
     * @title: listCommonlyUsedHerbalDrugsByUserId
     * @description: 列出用户的常用草药药品
     * @author:
     * @date: 2019-06-26 18:24
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.CommonlyUsedDrugs>
     * @throws:
     */
    @Override
    public List<CommonlyUsedDrugs> listCommonlyUsedHerbalDrugsByUserId(Integer userId) {
        return commonlyUsedDrugsMapper.listCommonlyUsedHerbalDrugsByUserId(userId);
    }

    /**
     * @title: listCommonlyUsedDiagnosisByUserId
     * @description: 列出用户的常用诊断
     * @author: 29-y
     * @date: 2019-06-17 9:57
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.CommonlyUsedDiagnosis>
     * @throws:
     */
    @Override
    public List<CommonlyUsedDiagnosis> listCommonlyUsedDiagnosisByUserId(Integer userId) {
        return commonlyUsedDiagnosisMapper.listCommonlyUsedDiagnosisByUserId(userId);
    }

    /**
     * @title: listCommonlyUsedExamination1ByUserId
     * @description: 列出用户的常用检查项目
     * @author: 29-y
     * @date: 2019-06-17 9:57
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.CommonlyUsedFmedical>
     * @throws:
     */
    @Override
    public List<CommonlyUsedFmedical> listCommonlyUsedExamination1ByUserId(Integer userId) {
        return commonlyUsedFmedicalMapper.listCommonlyUsedExamination1ByUserId(userId);
    }

    /**
     * @title: listCommonlyUsedExamination2ByUserId
     * @description: 列出用户的常用检验项目
     * @author: 29-y
     * @date: 2019-06-17 9:57
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.CommonlyUsedFmedical>
     * @throws:
     */
    @Override
    public List<CommonlyUsedFmedical> listCommonlyUsedExamination2ByUserId(Integer userId) {
        return commonlyUsedFmedicalMapper.listCommonlyUsedExamination2ByUserId(userId);
    }

    /**
     * @title: listCommonlyUsedTreatmentByUserId
     * @description: 列出用户的常用处置项目
     * @author: 29-y
     * @date: 2019-06-17 9:57
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.CommonlyUsedFmedical>
     * @throws:
     */
    @Override
    public List<CommonlyUsedFmedical> listCommonlyUsedTreatmentByUserId(Integer userId) {
        return commonlyUsedFmedicalMapper.listCommonlyUsedTreatmentByUserId(userId);
    }

    /**
     * @title: listCommonlyUsedChineseDiagnosisByUserId
     * @description: 列出常用中医诊断
     * @author: 29-y
     * @date: 2019-06-24 22:35
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.CommonlyUsedDiagnosis>
     * @throws:
     */
    @Override
    public List<CommonlyUsedDiagnosis> listCommonlyUsedChineseDiagnosisByUserId(Integer userId) {
        return commonlyUsedDiagnosisMapper.listCommonlyUsedChineseDiagnosisByUserId(userId);
    }

    /**
     * @title: listCommonlyUsedWesternDiagnosisByUserId
     * @description: 列出常用西医诊断
     * @author: 29-y
     * @date: 2019-06-24 22:36
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.CommonlyUsedDiagnosis>
     * @throws:
     */
    @Override
    public List<CommonlyUsedDiagnosis> listCommonlyUsedWesternDiagnosisByUserId(Integer userId) {
        return commonlyUsedDiagnosisMapper.listCommonlyUsedWesternDiagnosisByUserId(userId);
    }

    @Override
    public Integer insertCommonlyUsedDrugs(CommonlyUsedDrugs commonlyUsedDrugs) {
        return null;
    }

    @Override
    public Integer insertCommonlyUsedDiagnosis(CommonlyUsedDiagnosis commonlyUsedDiagnosis) {
        return null;
    }

    @Override
    public Integer insertCommonlyUsedFmedical(CommonlyUsedFmedical commonlyUsedFmedical) {
        return null;
    }

    @Override
    public void deleteCommonlyUsedDrugs(Integer commonlyUsedDrugsId) {

    }

    @Override
    public void deleteCommonlyUsedDiagnosis(Integer commonlyUsedDiagnosisId) {

    }

    @Override
    public void deleteCommonlyUsedFmedical(Integer commonlyUsedFmedicalId) {

    }
}
