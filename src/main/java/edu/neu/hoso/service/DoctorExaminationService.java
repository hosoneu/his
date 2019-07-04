package edu.neu.hoso.service;

import edu.neu.hoso.model.Examination;
import edu.neu.hoso.model.ExaminationResult;
import edu.neu.hoso.model.GroupExamination;

import java.util.List;

/**
 * @title: DoctorExaminationService
 * @package edu.neu.hoso.service
 * @description:
 * @author: 29-y
 * @date: 2019-06-18 22:40
 * @version: V1.0
 */
public interface DoctorExaminationService {
    // 获取当前已开立的检查检验单列表（ type: 1 检查 2 检验 ）
    List<Examination> listExaminationByMedicalRecordId(Integer medicalRecordId, String type);

    // 根据ID查询具体的检查检验条目 （ type: 1 检查 2 检验 ）
    Examination selectExaminationById(Integer examinationId,String type);

    // 列出检查检验组套 （ type: 1 检查 2 检验 ）（ scope: 1个人、2科室、3全院 ）
    List<GroupExamination> listGroupExamination(Integer userId, String type, String scope);

    // 根据ID查找检查检验组套（ type: 1 检查 2 检验 ）
    GroupExamination selectGroupExaminationById(Integer groupExaminationId, String type);

    // 存为检查检验模板 根据 检查检验组套(List<检查检验组套非药品条目表(List<检查检验组套药品条目表>)>）
    Integer insertGroupExamination(GroupExamination groupExamination);
    // 删除检查检验模板
    void deleteGroupExamination(Integer groupExaminationId);

    // 开立项目 根据 检查检验申请表（List<检查检验非药品条目表（List<检查检验药品条目表>）>）并自动生成收费条目
    Integer insertExamination(Examination examination);

    // 查看项目是否可作废 根据 非药品收费条目的ID 查找（非药品收费条目表的登记状态 【不管是否已缴费 已缴费的由用户自己去退费】）
    Integer ifExaminationFmedicalItemsCanCancel(Integer examinationFmedicalItemsId);

    // 作废项目 根据 非药品收费条目的ID 查找（更改非药品条目表的有效状态）
    void cancelExaminationFmedicalItems(Integer examinationFmedicalItemsId);

    // 查看结果 根据 examinationResultId
    ExaminationResult selectExaminationResultById(Integer examinationResultId);
}
