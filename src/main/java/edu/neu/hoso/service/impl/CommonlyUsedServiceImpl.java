package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.CommonlyUsedDiagnosisExample;
import edu.neu.hoso.example.CommonlyUsedDrugsExample;
import edu.neu.hoso.example.CommonlyUsedFmedicalExample;
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
     * @author: 29-y
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
     * @author: 29-y
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

    /**
     * @title: insertCommonlyUsedDrugs
     * @description: 插入常用药品
     * @author: 29-y
     * @date: 2019-07-01 9:53
     * @param: [commonlyUsedDrugs]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertCommonlyUsedDrugs(CommonlyUsedDrugs commonlyUsedDrugs) {
        //首先判断是否存在
        CommonlyUsedDrugsExample commonlyUsedDrugsExample = new CommonlyUsedDrugsExample();
        CommonlyUsedDrugsExample.Criteria criteria = commonlyUsedDrugsExample.createCriteria();
        criteria.andDrugsIdEqualTo(commonlyUsedDrugs.getDrugsId());
        List<CommonlyUsedDrugs> commonlyUsedDrugsList = commonlyUsedDrugsMapper.selectByExample(commonlyUsedDrugsExample);
        if(commonlyUsedDrugsList.size()!=0){//已存在
            return 0;
        }else{//不存在则进行插入
            System.out.println(commonlyUsedDrugs.getDrugsId());
            System.out.println(commonlyUsedDrugs.getDoctorId());
            commonlyUsedDrugsMapper.insert(commonlyUsedDrugs);
            return commonlyUsedDrugs.getCommonlyUsedDrugs();
        }
    }

    /**
     * @title: insertCommonlyUsedDiagnosis
     * @description: 插入常用疾病
     * @author: 29-y
     * @date: 2019-07-01 9:53
     * @param: [commonlyUsedDiagnosis]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertCommonlyUsedDiagnosis(CommonlyUsedDiagnosis commonlyUsedDiagnosis) {
        //首先判断是否存在
        CommonlyUsedDiagnosisExample commonlyUsedDiagnosisExample = new CommonlyUsedDiagnosisExample();
        CommonlyUsedDiagnosisExample.Criteria criteria = commonlyUsedDiagnosisExample.createCriteria();
        criteria.andDiseaseIdEqualTo(commonlyUsedDiagnosis.getDiseaseId());
        List<CommonlyUsedDiagnosis> commonlyUsedDiagnosisList = commonlyUsedDiagnosisMapper.selectByExample(commonlyUsedDiagnosisExample);
        if(commonlyUsedDiagnosisList.size()!=0){
            return 0;
        }else{
            commonlyUsedDiagnosisMapper.insert(commonlyUsedDiagnosis);
            return commonlyUsedDiagnosis.getCommonlyUsedDiagnosisId();
        }
    }

    /**
     * @title: insertCommonlyUsedFmedical
     * @description: 插入常用非药品
     * @author: 29-y
     * @date: 2019-07-01 9:54
     * @param: [commonlyUsedFmedical]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertCommonlyUsedFmedical(CommonlyUsedFmedical commonlyUsedFmedical) {
        CommonlyUsedFmedicalExample commonlyUsedFmedicalExample = new CommonlyUsedFmedicalExample();
        CommonlyUsedFmedicalExample.Criteria criteria = commonlyUsedFmedicalExample.createCriteria();
        criteria.andFmedicalItemsIdEqualTo(commonlyUsedFmedical.getFmedicalItemsId());
        List<CommonlyUsedFmedical> commonlyUsedFmedicalList = commonlyUsedFmedicalMapper.selectByExample(commonlyUsedFmedicalExample);
        if(commonlyUsedFmedicalList.size()!=0){
            return 0;
        }else{
            commonlyUsedFmedicalMapper.insert(commonlyUsedFmedical);
            return commonlyUsedFmedical.getCommonlyUsedFmedicalId();
        }

    }

    /**
     * @title: deleteCommonlyUsedDrugs
     * @description: 删除常用药品
     * @author: 29-y
     * @date: 2019-07-01 9:54
     * @param: [commonlyUsedDrugsId]
     * @return: void
     * @throws:
     */
    @Override
    public void deleteCommonlyUsedDrugs(Integer commonlyUsedDrugsId) {
        commonlyUsedDrugsMapper.deleteByPrimaryKey(commonlyUsedDrugsId);
    }

    /**
     * @title: deleteCommonlyUsedDiagnosis
     * @description: 删除常用诊断
     * @author: 29-y
     * @date: 2019-07-01 9:54
     * @param: [commonlyUsedDiagnosisId]
     * @return: void
     * @throws:
     */
    @Override
    public void deleteCommonlyUsedDiagnosis(Integer commonlyUsedDiagnosisId) {
        commonlyUsedDiagnosisMapper.deleteByPrimaryKey(commonlyUsedDiagnosisId);
    }

    /**
     * @title: deleteCommonlyUsedFmedical
     * @description: 删除常用非药品
     * @author: 29-y
     * @date: 2019-07-01 9:55
     * @param: [commonlyUsedFmedicalId]
     * @return: void
     * @throws:
     */
    @Override
    public void deleteCommonlyUsedFmedical(Integer commonlyUsedFmedicalId) {
        commonlyUsedFmedicalMapper.deleteByPrimaryKey(commonlyUsedFmedicalId);
    }
}
