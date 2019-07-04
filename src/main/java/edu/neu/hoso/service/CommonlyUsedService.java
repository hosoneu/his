package edu.neu.hoso.service;

import edu.neu.hoso.model.CommonlyUsedDiagnosis;
import edu.neu.hoso.model.CommonlyUsedDrugs;
import edu.neu.hoso.model.CommonlyUsedFmedical;

import java.util.List;

/**
 * @title: CommonlyUsedService
 * @package edu.neu.hoso.service
 * @description: 定义对医生常用项的操作
 * @author: 29-y
 * @date: 2019-06-14 10:26
 * @version: V1.0
*/
public interface CommonlyUsedService {
    // 获取常用药品
    List<CommonlyUsedDrugs> listCommonlyUsedDrugsByUserId(Integer userId);
    // 获取常用成药
    List<CommonlyUsedDrugs> listCommonlyUsedPatentDrugsByUserId(Integer userId);
    // 获取常用草药
    List<CommonlyUsedDrugs> listCommonlyUsedHerbalDrugsByUserId(Integer userId);
    // 获取常用诊断
    List<CommonlyUsedDiagnosis> listCommonlyUsedDiagnosisByUserId(Integer userId);
    // 获取常用检查
    List<CommonlyUsedFmedical> listCommonlyUsedExamination1ByUserId(Integer userId);
    // 获取常用检验
    List<CommonlyUsedFmedical> listCommonlyUsedExamination2ByUserId(Integer userId);
    // 获取常用处置
    List<CommonlyUsedFmedical> listCommonlyUsedTreatmentByUserId(Integer userId);
    //获取常用中医诊断
    List<CommonlyUsedDiagnosis> listCommonlyUsedChineseDiagnosisByUserId(Integer userId);
    //获取常用西医诊断
    List<CommonlyUsedDiagnosis> listCommonlyUsedWesternDiagnosisByUserId(Integer userId);

    // 新增常用药品
    Integer insertCommonlyUsedDrugs(CommonlyUsedDrugs commonlyUsedDrugs);
    // 新增常用诊断
    Integer insertCommonlyUsedDiagnosis(CommonlyUsedDiagnosis commonlyUsedDiagnosis);
    // 新增常用检查\检验\处置 需要在后台判断类型
    Integer insertCommonlyUsedFmedical(CommonlyUsedFmedical commonlyUsedFmedical);

    // 删除常用药品
    void deleteCommonlyUsedDrugs(Integer commonlyUsedDrugsId);
    // 删除常用诊断
    void deleteCommonlyUsedDiagnosis(Integer commonlyUsedDiagnosisId);
    // 删除常用检查\检验\处置 需要在后台判断类型
    void deleteCommonlyUsedFmedical(Integer commonlyUsedFmedicalId);
}
