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
    // 获取常用诊断
    List<CommonlyUsedDiagnosis> listCommonlyUsedDiagnosisByUserId(Integer userId);
    // 获取常用检查
    List<CommonlyUsedFmedical> listCommonlyUsedExamination1ByUserId(Integer userId);
    // 获取常用检验
    List<CommonlyUsedFmedical> listCommonlyUsedExamination2ByUserId(Integer userId);
    // 获取常用处置
    List<CommonlyUsedFmedical> listCommonlyUsedTreatmentByUserId(Integer userId);
}
