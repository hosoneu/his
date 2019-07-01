package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.GroupPrescription;
import edu.neu.hoso.model.GroupTreatment;
import edu.neu.hoso.model.Prescription;
import edu.neu.hoso.service.DoctorPrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @title: DoctorPrescriptionController
 * @package edu.neu.hoso.controller
 * @description: 门诊医生用户开立处方的控制类（包括成药和草药）
 * @author: 29-y
 * @date: 2019-06-17 17:33
 * @version: V1.0
 */
@RequestMapping("doctor/prescription/patent")
@RestController
@CrossOrigin
public class DoctorPatentPrescriptionController {
    @Autowired
    DoctorPrescriptionService doctorPrescriptionService;

    //展示成药处方组套（个人、科室、医院）
    @RequestMapping("/listGroupPrescription")
    public ResultDTO<List<GroupPrescription>> listGroupPatentPrescription(Integer userId, String scope){
        ResultDTO<List<GroupPrescription>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorPrescriptionService.listGroupPatentPrescription(userId,scope));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("成药处方组套列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("成药处方组套列表获取失败！");
        }
        return resultDTO;
    }


    //根据组套ID查找成药处方组套
    @RequestMapping("/selectGroupPrescriptionById")
    public ResultDTO<GroupPrescription> selectGroupPatentPrescriptionById(Integer prescriptionId){
        ResultDTO<GroupPrescription> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorPrescriptionService.selectGroupPatentPrescriptionById(prescriptionId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("成药处方组套查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("成药处方组套查询失败！");
        }
        return resultDTO;
    }

    //插入成药组套
    @RequestMapping("/insertGroupPrescription")
    public ResultDTO<Integer> insertGroupPatentPrescription(@RequestBody GroupPrescription groupPrescription){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorPrescriptionService.insertGroupPatentPrescription(groupPrescription));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("成药组套保存成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("成药组套保存失败！");
        }
        return resultDTO;
    }

    //获取当前成药处方列表
    @RequestMapping("/listPrescriptionByMedicalRecordId")
    public ResultDTO<List<Prescription>> listPatentPrescriptionByMedicalRecordId(Integer medicalRecordId){
        ResultDTO<List<Prescription>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorPrescriptionService.listPatentPrescriptionByMedicalRecordId(medicalRecordId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("成药处方列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("成药处方列表获取失败！");
        }
        return resultDTO;
    }

    //开立成药处方
    @RequestMapping("/insertPrescription")
    public ResultDTO<Integer> insertPatentPrescription(@RequestBody Prescription prescription){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorPrescriptionService.insertPatentPrescription(prescription));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("成药处方开立成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("成药处方开立失败！");
        }
        return resultDTO;
    }

    //废除成药处方 在废除之前需要调用是否可废除函数 才能进行该操作
    @RequestMapping("/cancelPrescription")
    public ResultDTO cancelPatentPrescription(Integer prescriptionId){
        ResultDTO resultDTO = new ResultDTO<>();
        try {
            doctorPrescriptionService.cancelPatentPrescription(prescriptionId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("成药处方废除成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("成药处方废除失败！");
        }
        return resultDTO;

    }

    //判断处方是否可废除
    @RequestMapping("/ifPrescriptionCanCancel")
    public ResultDTO<Integer> ifPrescriptionCanCancel(Integer prescriptionId){//1可废除 2不可废除 3已废除
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorPrescriptionService.ifPrescriptionCanCancel(prescriptionId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("成药处方可废除状态查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("成药处方可废除状态查询失败！");
        }
        return resultDTO;
    }
    //根据处方ID查找处方
    @RequestMapping("/selectPrescription")
    public ResultDTO<Prescription> selectPatentPrescription(Integer prescriptionId){
        ResultDTO<Prescription> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorPrescriptionService.selectPatentPrescription(prescriptionId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("成药处方查询成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("成药处方查询失败！");
        }
        return resultDTO;
    }

}
