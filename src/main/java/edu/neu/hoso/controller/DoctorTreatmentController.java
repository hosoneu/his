package edu.neu.hoso.controller;

import edu.neu.hoso.model.*;
import edu.neu.hoso.service.DoctorTreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class DoctorTreatmentController {
    @Autowired
    DoctorTreatmentService doctorTreatmentService;

    //获取当前病历号下已开立的处置申请单列表 根据 病历ID 获取当前病历的处置申请单列表（List<处置非药品条目表（非药品目录表*常数项表）>）
    @RequestMapping("/listTreatmentByMedicalRecordId")
    public List<Treatment> listTreatmentByMedicalRecordId(Integer medicalRecordId){
        return null;
    }

    //根据处置单ID得到处置单的详细内容
    @RequestMapping("/selectTreatmentById")
    public Treatment selectTreatmentById(Integer treatmentId){
        return doctorTreatmentService.selectTreatmentById(treatmentId);
    }

    // 开立项目（一个处置单一起开立） 根据 处置申请表（List<处置非药品条目表>） 并自动生成收费条目
    @RequestMapping("/insertTreatment")
    public Integer insertTreatment(Treatment treatment){
//        Treatment treatment = new Treatment();
//        treatment.setDoctorId(1);
//        treatment.setSubmitTime(new Date());
//        treatment.setMedicalRecordId(2);
//        List<TreatmentItems> treatmentItemsList = new ArrayList<>();
//        TreatmentItems treatmentItems = new TreatmentItems();
//        treatmentItems.setQuantity(10);
//        treatmentItems.setFmedicalItemsId(1);
//        treatmentItemsList.add(treatmentItems);
//        TreatmentItems treatmentItems1 = new TreatmentItems();
//        treatmentItems1.setQuantity(1);
//        treatmentItems1.setFmedicalItemsId(10);
//        treatmentItemsList.add(treatmentItems1);
//        treatment.setTreatmentItemsList(treatmentItemsList);
        return doctorTreatmentService.insertTreatment(treatment);
    }

    // 作废项目 根据 非药品收费条目的ID 查找（非药品收费条目表的登记状态  不管是否已缴费 已缴费的由用户自己去退费 ）
    @RequestMapping("/cancelTreatmentItemsById")
    public void cancelTreatmentItemsById(Integer treatmentItemsId){
        doctorTreatmentService.cancelTreatmentItemsById(treatmentItemsId);
    }
    // 列出处置组套 （scope 1个人、2科室、3全院）
    @RequestMapping("/listGroupTreatment")
    public List<GroupTreatment> listGroupTreatment(Integer userId, String scope){
        return doctorTreatmentService.listGroupTreatment(userId,scope);
    }
    // 存为处置组套
    @RequestMapping("/insertGroupTreatment")
    public Integer insertGroupTreatment(GroupTreatment groupTreatment){
//        GroupTreatment groupTreatment = new GroupTreatment();
//        groupTreatment.setDoctorId(1);
//        groupTreatment.setCreateTime(new Date());
//        groupTreatment.setGroupTreatmentCode("dsad");
//        groupTreatment.setGroupTreatmentName("测试");
//        groupTreatment.setGroupTreatmentScope("1");
//        GroupTreatmentItems groupTreatmentItems = new GroupTreatmentItems();
//        groupTreatmentItems.setFmedicalItemsId(5);
//        groupTreatmentItems.setQuantity(4);
//        GroupTreatmentItems groupTreatmentItems1 = new GroupTreatmentItems();
//        groupTreatmentItems1.setFmedicalItemsId(14);
//        groupTreatmentItems1.setQuantity(2);
//        List<GroupTreatmentItems> groupTreatmentItemsList = new ArrayList<>();
//        groupTreatmentItemsList.add(groupTreatmentItems);
//        groupTreatmentItemsList.add(groupTreatmentItems1);
//        groupTreatment.setGroupTreatmentItemsList(groupTreatmentItemsList);
        return doctorTreatmentService.insertGroupTreatment(groupTreatment);
    }

    //根据处置组套ID查询处置组套
    @RequestMapping("/selectGroupTreatmentById")
    public GroupTreatment selectGroupTreatmentById(Integer groupTreatmentId){
        return doctorTreatmentService.selectGroupTreatmentById(groupTreatmentId);
    }
}
