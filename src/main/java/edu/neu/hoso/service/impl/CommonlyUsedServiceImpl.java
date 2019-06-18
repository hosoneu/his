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
}
