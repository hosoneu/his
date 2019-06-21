package edu.neu.hoso.service;

import edu.neu.hoso.model.GroupPrescription;
import edu.neu.hoso.model.Prescription;

import java.util.List;

/**
 * @title: DoctorPrescriptionService
 * @package edu.neu.hoso.service
 * @description: 定义对处方的操作
 * @author: 29-y
 * @date: 2019-06-18 10:40
 * @version: V1.0
*/
public interface DoctorPrescriptionService {
    //展示成药处方组套（个人、科室、医院）
    List<GroupPrescription> listGroupPatentPrescription(Integer userId,String scope);
    //展示草药处方组套（个人、科室、医院）
    List<GroupPrescription> listGroupHerbalPrescription(Integer userId,String scope);
    //根据组套ID查找成药处方组套
    GroupPrescription selectGroupPatentPrescriptionById(Integer prescriptionId);
    //根据组套ID查找草药处方组套
    GroupPrescription selectGroupHerbalPrescriptionById(Integer prescriptionId);
    //插入成药组套
    Integer insertGroupPatentPrescription(GroupPrescription groupPrescription);
    //插入草药组套
    Integer insertGroupHerbalPrescription(GroupPrescription groupPrescription);
    //获取当前成药处方列表
    List<Prescription> listPatentPrescriptionByMedicalRecordId(Integer medicalRecordId);
    //获取当前草药处方列表
    List<Prescription> listHerbalPrescriptionByMedicalRecordId(Integer medicalRecordId);
    //开立成药处方
    Integer insertPatentPrescription(Prescription prescription);
    //开立草药处方
    Integer insertHerbalPrescription(Prescription prescription);
    //废除成药处方 在废除之前需要调用是否可废除函数 才能进行该操作
    void cancelPatentPrescription(Integer prescriptionId);
    //废除草药处方 在废除之前需要调用是否可废除函数 才能进行该操作
    void cancelHerbalPrescription(Integer prescriptionId);
    //判断处方是否可废除 1可废除 2不可废除 3已废除
    Integer ifPrescriptionCanCancel(Integer prescriptionId);
    //根据处方ID查找处方
    Prescription selectPatentPrescription(Integer prescriptionId);
    //根据处方ID查找草药处方
    Prescription selectHerbalPrescription(Integer prescriptionId);
}
