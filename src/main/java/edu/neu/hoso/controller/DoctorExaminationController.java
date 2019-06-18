package edu.neu.hoso.controller;

import edu.neu.hoso.model.Examination;
import edu.neu.hoso.model.ExaminationResult;
import edu.neu.hoso.model.GroupExamination;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @title: DoctorExaminationController
 * @package edu.neu.hoso.controller
 * @description: 门诊医生用户开立检查检验单的控制类
 * @author: 29-y
 * @date: 2019-06-17 17:30
 * @version: V1.0
 */

@RequestMapping("doctor/examination")
@RestController
public class DoctorExaminationController {
    // 获取当前已开立的检查检验单列表 根据 病历ID 获取当前病历的检查/检验申请表（检查检验申请表*（检查检验非药品表*（非药品条目表*常数项表）））
    @RequestMapping("/listExaminationByMedicalRecordId")
    public List<Examination> listExaminationByMedicalRecordId(Integer medicalRecordId,String mark){
        return null;
    }

    // 根据ID查询具体的检查检验条目 mark表示检查检验的标识1检查 2检验
    @RequestMapping("/selectExaminationById")
    public List<Examination> selectExaminationById(Integer examinationId,String mark){
        return null;
    }

    // 列出检查检验组套 （ mark: 1 检查 2 检验 ）（ scope: 1个人、2科室、3全院 ）
    public List<GroupExamination> listGroupExamination(Integer userId, String mark, String scope){
        return null;
    }
    // 根据ID查找检查检验组套（ mark: 1 检查 2 检验 ）
    public List<GroupExamination> selectGroupExaminationById(Integer userId, String mark){
        return null;
    }

    // 存为检查检验模板 根据 检查检验组套(List<检查检验组套非药品条目表(List<检查检验组套药品条目表>)>）
    public Integer insertGroupExamination(GroupExamination groupExamination){
        return null;
    }

    // 开立项目 根据 检查检验申请表（List<检查检验非药品条目表（List<检查检验药品条目表>）>）并自动生成收费条目
    public Integer insertExamination(Examination examination){
        return null;
    }

    // 查看项目是否可作废 根据 非药品收费条目的ID 查找（非药品收费条目表的登记状态 【不管是否已缴费 已缴费的由用户自己去退费】）
    public Integer ifExaminationItemsCanCancel(){
        return null;
    }

    // 作废项目 根据 非药品收费条目的ID 查找（更改非药品条目表的有效状态）
    public void cancelExaminationItems(Integer examinationItemsId){

    }

    // 查看结果 根据 非药品收费条目的ID （检查结果表的ID是否存在 存在时则查询 检查检验结果表*检查检验图像表）
    public ExaminationResult checkExaminationItemsResult(Integer examinationItemsId){
        return null;
    }

}
