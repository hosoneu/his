package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.GroupPrescription;
import edu.neu.hoso.model.Prescription;
import edu.neu.hoso.service.DoctorPrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("doctor/prescription/herbal")
@RestController
@CrossOrigin
public class DoctorHerbalPrescriptionController {
    @Autowired
    DoctorPrescriptionService doctorPrescriptionService;

    //展示草药处方组套（个人、科室、医院）
    @RequestMapping("/listGroupPrescription")
    public ResultDTO<List<GroupPrescription>> listGroupHerbalPrescription(Integer userId,String scope){
        ResultDTO<List<GroupPrescription>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorPrescriptionService.listGroupHerbalPrescription(userId,scope));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("草药处方组套列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("草药处方组套列表获取失败！");
        }
        return resultDTO;
    }


    //根据组套ID查找草药处方组套
    @RequestMapping("/selectGroupPrescriptionById")
    public ResultDTO<GroupPrescription> selectGroupHerbalPrescriptionById(Integer prescriptionId){
        ResultDTO<GroupPrescription> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorPrescriptionService.selectGroupHerbalPrescriptionById(prescriptionId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("草药处方组套查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("草药处方组套查询失败！");
        }
        return resultDTO;
    }


    //插入草药组套
    @RequestMapping("/insertGroupPrescription")
    public ResultDTO<Integer> insertGroupHerbalPrescription(@RequestBody GroupPrescription groupPrescription){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorPrescriptionService.insertGroupHerbalPrescription(groupPrescription));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("草药组套保存成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("草药组套保存失败！");
        }
        return resultDTO;
    }


    //获取当前草药处方列表
    @RequestMapping("/listPrescriptionByMedicalRecordId")
    public ResultDTO<List<Prescription>> listHerbalPrescriptionByMedicalRecordId(Integer medicalRecordId){
        ResultDTO<List<Prescription>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorPrescriptionService.listHerbalPrescriptionByMedicalRecordId(medicalRecordId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("草药处方列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("草药处方列表获取失败！");
        }
        return resultDTO;
    }


    //开立草药处方
    @RequestMapping("/insertPrescription")
    public ResultDTO<Integer> insertHerbalPrescription(@RequestBody Prescription prescription){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorPrescriptionService.insertHerbalPrescription(prescription));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("草药处方开立成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("草药处方开立失败！");
        }
        return resultDTO;
    }


    //废除草药处方 在废除之前需要调用是否可废除函数 才能进行该操作
    @RequestMapping("/cancelPrescription")
    public ResultDTO cancelHerbalPrescription(Integer prescriptionId){
        ResultDTO resultDTO = new ResultDTO<>();
        try {
            doctorPrescriptionService.cancelHerbalPrescription(prescriptionId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("草药处方废除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("草药处方废除失败！");
        }
        return resultDTO;
    }

    //判断处方是否可废除 1可废除 2不可废除 3已废除
    @RequestMapping("/ifPrescriptionCanCancel")
    public ResultDTO<Integer> ifPrescriptionCanCancel(Integer prescriptionId){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorPrescriptionService.ifPrescriptionCanCancel(prescriptionId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("草药处方可废除状态查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("草药处方可废除状态查询失败！");
        }
        return resultDTO;
    }


    //根据处方ID查找草药处方
    @RequestMapping("/selectPrescription")
    public ResultDTO<Prescription> selectHerbalPrescription(Integer prescriptionId){
        ResultDTO<Prescription> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorPrescriptionService.selectHerbalPrescription(prescriptionId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("草药处方查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("草药处方查询失败！");
        }
        return resultDTO;
    }

}
