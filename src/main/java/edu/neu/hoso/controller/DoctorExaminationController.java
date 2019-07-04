package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.Examination;
import edu.neu.hoso.model.ExaminationResult;
import edu.neu.hoso.model.GroupExamination;
import edu.neu.hoso.service.DoctorExaminationService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
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
@CrossOrigin
public class DoctorExaminationController {
    @Autowired
    DoctorExaminationService doctorExaminationService;

    /**
     * @title: listExaminationByMedicalRecordId
     * @description: 根据病历ID获取当前已开立的检查检验单列表
     * @author: 29y
     * @date: 2019-06-20 18:24
     * @param: [medicalRecordId, type]
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.Examination>>
     * @throws:
     */
    @RequestMapping("/listExaminationByMedicalRecordId")
    public ResultDTO<List<Examination>> listExaminationByMedicalRecordId(Integer medicalRecordId, String type){
        ResultDTO<List<Examination>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorExaminationService.listExaminationByMedicalRecordId(medicalRecordId,type));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("检查检验单列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("检查检验单列表获取失败！");
        }
        return resultDTO;
    }

    // 根据ID查询具体的检查检验条目 type表示检查检验的标识1检查 2检验
    @RequestMapping("/selectExaminationById")
    public ResultDTO<Examination> selectExaminationById(Integer examinationId,String type){
        ResultDTO<Examination> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorExaminationService.selectExaminationById(examinationId, type));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("检查检验单详细信息获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("检查检验单详细信息获取失败！");
        }
        return resultDTO;
    }

    // 列出检查检验组套 （ type: 1 检查 2 检验 ）（ scope: 1个人、2科室、3全院 ）
    @RequestMapping("/listGroupExamination")
    public ResultDTO<List<GroupExamination>> listGroupExamination(Integer userId, String type, String scope){
        ResultDTO<List<GroupExamination>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorExaminationService.listGroupExamination(userId, type, scope));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("检查检验组套列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("检查检验组套列表获取失败！");
        }
        return resultDTO;
    }

    // 删除检查检验组套
    @RequestMapping("/deleteGroupExamination")
    public ResultDTO deleteGroupExamination(Integer groupExaminationId){
        ResultDTO resultDTO = new ResultDTO();
        try {
            doctorExaminationService.deleteGroupExamination(groupExaminationId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("检查检验组套删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("检查检验组套删除失败！");
        }
        return resultDTO;
    }
    // 根据ID查找检查检验组套（ type: 1 检查 2 检验 ）
    @RequestMapping("/selectGroupExaminationById")
    public ResultDTO<GroupExamination> selectGroupExaminationById(Integer groupExaminationId, String type){
        ResultDTO<GroupExamination> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorExaminationService.selectGroupExaminationById(groupExaminationId,type));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("检查检验组套获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("检查检验组套获取失败！");
        }
        return resultDTO;
    }

    // 存为检查检验模板 根据 检查检验组套(List<检查检验组套非药品条目表(List<检查检验组套药品条目表>)>）
    @RequestMapping("/insertGroupExamination")
    public ResultDTO<Integer> insertGroupExamination(@RequestBody GroupExamination groupExamination){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorExaminationService.insertGroupExamination(groupExamination));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("检查检验组套保存成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("检查检验组套保存失败！");
        }
        return resultDTO;
    }

    // 开立项目 根据 检查检验申请表（List<检查检验非药品条目表（List<检查检验药品条目表>）>）并自动生成收费条目
    @RequestMapping("/insertExamination")
    public ResultDTO<Integer> insertExamination(@RequestBody Examination examination){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorExaminationService.insertExamination(examination));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("检查检验单开立成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("检查检验单开立失败！");
        }
        return resultDTO;
    }

    // 查看项目是否可作废 根据 非药品收费条目的ID 查找（非药品收费条目表的登记状态 【不管是否已缴费 已缴费的由用户自己去退费】）
    @RequestMapping("/ifExaminationItemsCanCancel")
    public ResultDTO<Integer> ifExaminationItemsCanCancel(Integer examinationFmedicalItemsId){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorExaminationService.ifExaminationFmedicalItemsCanCancel(examinationFmedicalItemsId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("检查检验项目可废除状态查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("检查检验项目可废除状态查询失败！");
        }
        return resultDTO;
    }

    // 作废项目 根据 非药品收费条目的ID 查找（更改非药品条目表的有效状态）
    @RequestMapping("/cancelExaminationItems")
    public ResultDTO cancelExaminationItems(Integer examinationItemsId){
        ResultDTO resultDTO = new ResultDTO();
        try {
            doctorExaminationService.cancelExaminationFmedicalItems(examinationItemsId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("检查检验项目作废成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("检查检验项目作废失败！");
        }
        return resultDTO;
    }

    // 查看结果 根据 非药品收费条目的ID （检查结果表的ID是否存在 存在时则查询 检查检验结果表*检查检验图像表）
    @RequestMapping("/selectExaminationResultById")
    public ResultDTO<ExaminationResult> selectExaminationResultById(Integer examinationResultId){
        ResultDTO<ExaminationResult> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorExaminationService.selectExaminationResultById(examinationResultId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("检查检验项目结果查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("检查检验项目结果查询失败！");
        }
        return resultDTO;
    }
}
