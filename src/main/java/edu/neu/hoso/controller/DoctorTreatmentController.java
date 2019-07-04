package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.DoctorTreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @title: DoctorTreatmentController
 * @package edu.neu.hoso.controller
 * @description: 门诊医生用户开立处置的控制类
 * @author: 29-y
 * @date: 2019-06-17 17:37
 * @version: V1.0
 */
@RequestMapping("doctor/treatment")
@RestController
@CrossOrigin
public class DoctorTreatmentController {
    @Autowired
    DoctorTreatmentService doctorTreatmentService;

    //获取当前病历号下已开立的处置申请单列表 根据 病历ID 获取当前病历的处置申请单列表（List<处置非药品条目表（非药品目录表*常数项表）>）
    @RequestMapping("/listTreatmentByMedicalRecordId")
    public ResultDTO<List<Treatment>> listTreatmentByMedicalRecordId(Integer medicalRecordId){
        ResultDTO<List<Treatment>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorTreatmentService.listTreatmentByMedicalRecordId(medicalRecordId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("处置申请单列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("处置申请单列表获取失败！");
        }
        return resultDTO;
    }

    //根据处置单ID得到处置单的详细内容
    @RequestMapping("/selectTreatmentById")
    public ResultDTO<Treatment> selectTreatmentById(Integer treatmentId){
        ResultDTO<Treatment> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorTreatmentService.selectTreatmentById(treatmentId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("处置单的详细内容获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("处置单的详细内容获取失败！");
        }
        return resultDTO;
    }

    // 开立项目（一个处置单一起开立） 根据 处置申请表（List<处置非药品条目表>） 并自动生成收费条目
    @RequestMapping("/insertTreatment")
    public ResultDTO<Integer> insertTreatment(@RequestBody Treatment treatment){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorTreatmentService.insertTreatment(treatment));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("处置单开立成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("处置单开立失败！");
        }
        return resultDTO;
    }

    // 作废项目 根据 非药品收费条目的ID 查找（非药品收费条目表的登记状态  不管是否已缴费 已缴费的由用户自己去退费 ）
    @RequestMapping("/cancelTreatmentItemsById")
    public ResultDTO cancelTreatmentItemsById(Integer treatmentItemsId){
        ResultDTO resultDTO = new ResultDTO<>();
        try {
            doctorTreatmentService.cancelTreatmentItemsById(treatmentItemsId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("处置项目作废成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("处置项目作废失败！");
        }
        return resultDTO;
    }
    // 判断处置条目是否可废除  1可废除 2不可废除 3已废除
    @RequestMapping("/ifTreatmentItemsCanCancel")
    public ResultDTO<Integer> ifTreatmentItemsCanCancel(Integer treatmentItemsId){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorTreatmentService.ifTreatmentItemsCanCancel(treatmentItemsId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("处置项目作废状态查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("处置项目作废状态查询失败！");
        }
        return resultDTO;
    }

    // 列出处置组套 （scope 1个人、2科室、3全院）
    @RequestMapping("/listGroupTreatment")
    public ResultDTO<List<GroupTreatment>> listGroupTreatment(Integer userId, String scope){
        ResultDTO<List<GroupTreatment>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorTreatmentService.listGroupTreatment(userId,scope));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("处置组套列表查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("处置组套列表查询失败！");
        }
        return resultDTO;
    }
    // 存为处置组套
    @RequestMapping("/insertGroupTreatment")
    public ResultDTO<Integer> insertGroupTreatment(@RequestBody GroupTreatment groupTreatment){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorTreatmentService.insertGroupTreatment(groupTreatment));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("处置组套存储成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("处置组套存储失败！");
        }
        return resultDTO;
    }

    //根据处置组套ID查询处置组套
    @RequestMapping("/selectGroupTreatmentById")
    public ResultDTO<GroupTreatment> selectGroupTreatmentById(Integer groupTreatmentId){
        ResultDTO<GroupTreatment> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorTreatmentService.selectGroupTreatmentById(groupTreatmentId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("处置组套查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("处置组套查询失败！");
        }
        return resultDTO;
    }

    //根据处置组套ID删除处置组套
    @RequestMapping("/deleteGroupTreatmentById")
    public ResultDTO deleteGroupTreatmentById(Integer groupTreatmentId){
        ResultDTO<GroupTreatment> resultDTO = new ResultDTO<>();
        try {
            doctorTreatmentService.deleteGroupTreatmentById(groupTreatmentId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("处置组套删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("处置组套删除失败！");
        }
        return resultDTO;
    }
}
