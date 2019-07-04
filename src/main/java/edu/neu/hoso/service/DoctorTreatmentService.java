package edu.neu.hoso.service;

import edu.neu.hoso.model.GroupTreatment;
import edu.neu.hoso.model.Treatment;

import java.util.List;

/**
 * @title: DoctorTreatmentService
 * @package edu.neu.hoso.service
 * @description: 定义对处置的操作：展示处置模板、添加处置单等
 * @author: 29-y
 * @date: 2019-06-17 20:49
 * @version: V1.0
*/
public interface DoctorTreatmentService {
    // 列出病历ID对应的处置单列表
    List<Treatment> listTreatmentByMedicalRecordId(Integer medicalRecordId);
    // 根据处置单ID得到处置单的详细内容
    Treatment selectTreatmentById(Integer treatmentId);
    // 开立处置项目
    Integer insertTreatment(Treatment treatment);
    // 插入处置组套
    Integer insertGroupTreatment(GroupTreatment groupTreatment);
    // 作废处置条目
    void cancelTreatmentItemsById(Integer treatmentItemsId);
    //判断处置条目是否可废除 1可废除 2不可废除 3已废除
    Integer ifTreatmentItemsCanCancel(Integer treatmentItemsId);
    // 展示处置组套列表 （scope 1个人、2科室、3全院）
    List<GroupTreatment> listGroupTreatment(Integer userId, String scope);
    // 查找处置组套的详细信息
    GroupTreatment selectGroupTreatmentById(Integer groupTreatmentId);
    // 删除处置组套
    void deleteGroupTreatmentById(Integer groupTreatmentId);
}
