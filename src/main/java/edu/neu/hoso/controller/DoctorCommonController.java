package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.*;
import edu.neu.hoso.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: DoctorCommonController
 * @package edu.neu.hoso.controller
 * @description: 门诊医生用户查看基础数据的控制类
 * @author: 29-y
 * @date: 2019-06-17 17:40
 * @version: V1.0
*/

@RequestMapping("doctor/common")
@RestController
@CrossOrigin
public class DoctorCommonController {
    @Autowired
    DepartmentService departmentService;
    @Autowired
    UserService userService;
    @Autowired
    DoctorRegistrationService doctorRegistrationService;
    @Autowired
    CommonlyUsedService commonlyUsedService;
    @Autowired
    InfoListService infoListService;
    @Autowired
    MedicalRecordService medicalRecordService;

    @Resource
    private RedisUtils redisUtils;

    /**
     * @title: selectDoctorByUserID
     * @description: 登陆后根据用户ID查找出用户信息
     * @author: 29-y
     * @date: 2019-06-20 17:53
     * @param: [userId]
     * @return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.User>
     * @throws:
     */
    @RequestMapping("/selectDoctorById")
    public ResultDTO<User> selectDoctorByUserID(Integer userId){
        ResultDTO<User> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(userService.getUserById(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查找医生信息成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查找医生信息失败！");
        }
        return resultDTO;
    }

    /**
     * @title: selectDepartmentById
     * @description: 根据ID得到门诊医生的科室信息
     * @author:
     * @date: 2019-06-20 17:55
     * @param: [departmentId]
     * @return: edu.neu.hoso.dto.ResultDTO<edu.neu.hoso.model.Department>
     * @throws:
     */
    @RequestMapping("/selectDepartmentById")
    public ResultDTO<Department> selectDepartmentById(Integer departmentId){
        ResultDTO<Department> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(departmentService.getDepartmentById(departmentId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查找科室信息成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查找科室信息失败！");
        }
        return resultDTO;
    }

    /**
     * @title: listRegistrationFromUserByUserId
     * @description: 得到该医生正在处理的挂号列表（挂号日期为当天）
     * @author: 29-y
     * @date: 2019-06-20 18:00
     * @param: [userId]
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.Registration>>
     * @throws:
     */
    @RequestMapping("/listRegistrationFromUserByUserId")
    public ResultDTO<List<Registration>> listRegistrationFromUserByUserId(Integer userId){
        ResultDTO<List<Registration>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorRegistrationService.listRegistrationFromUserByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("医生个人挂号列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("医生个人挂号列表获取失败！");
        }
        return resultDTO;
    }

    /**
     * @title: listRegistrationFromDepartmentByUserId
     * @description: 得到该医生所在科室的挂号列表（挂号日期为当天）
     * @author: 29-y
     * @date: 2019-06-20 18:01
     * @param: [userId]
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.Registration>>
     * @throws:
     */
    @RequestMapping("/listRegistrationFromDepartmentByUserId")
    public ResultDTO<List<Registration>> listRegistrationFromDepartmentByUserId(Integer userId){
        ResultDTO<List<Registration>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(doctorRegistrationService.listRegistrationFromDepartmentByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("医生科室挂号列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("医生科室挂号列表获取失败！");
        }
        return resultDTO;
    }

    /**
     * @title: changePatientFromUser
     * @description: 从个人的患者列表中切换病人
     * @author: 29-y
     * @date: 2019-06-20 18:02
     * @param: [medicalRecordId, userId]
     * @return: edu.neu.hoso.dto.ResultDTO
     * @throws:
     */
    @RequestMapping("/changePatientFromUser")
    public ResultDTO changePatientFromUser(Integer medicalRecordId,Integer userId){
        ResultDTO resultDTO = new ResultDTO<>();
        try {
            doctorRegistrationService.changePatientFromUserByMedicalRecordId(medicalRecordId,userId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("从医生个人患者列表中切换患者成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("从医生个人患者列表中切换患者失败！");
        }
        return resultDTO;
    }

    /**
     * @title: changePatientFromDepartment
     * @description: 从科室的患者列表中切换病人
     * @author: 29-y
     * @date: 2019-06-20 18:02
     * @param: [medicalRecordId, userId]
     * @return: edu.neu.hoso.dto.ResultDTO
     * @throws:
     */
    @RequestMapping("/changePatientFromDepartment")
    public ResultDTO changePatientFromDepartment(Integer medicalRecordId,Integer userId){
        ResultDTO resultDTO = new ResultDTO<>();
        try {
            doctorRegistrationService.changePatientFromDepartmentByMedicalRecordId(medicalRecordId,userId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("从医生科室患者列表中切换患者成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("从医生科室患者列表中切换患者失败！");
        }
        return resultDTO;
    }

    /**
     * @title: listCommonlyUsedDrugsByUserId
     * @description: 获取常用药品
     * @author: 29-y
     * @date: 2019-06-20 18:03
     * @param: [userId]
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.CommonlyUsedDrugs>>
     * @throws:
     */
    @RequestMapping("/listCommonlyUsedDrugsByUserId")
    public ResultDTO<List<CommonlyUsedDrugs>> listCommonlyUsedDrugsByUserId(Integer userId){
        ResultDTO<List<CommonlyUsedDrugs>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.listCommonlyUsedDrugsByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用药品获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用药品获取失败！");
        }
        return resultDTO;
    }

    /**
     * @title: listCommonlyUsedDrugsByUserId
     * @description: 获取常用成药
     * @author: 29-y
     * @date: 2019-06-20 18:03
     * @param: [userId]
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.CommonlyUsedDrugs>>
     * @throws:
     */
    @RequestMapping("/listCommonlyUsedPatentDrugsByUserId")
    public ResultDTO<List<CommonlyUsedDrugs>> listCommonlyUsedPatentDrugsByUserId(Integer userId){
        ResultDTO<List<CommonlyUsedDrugs>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.listCommonlyUsedPatentDrugsByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用成药获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用成药获取失败！");
        }
        return resultDTO;
    }

    /**
     * @title: listCommonlyUsedHerbalDrugsByUserId
     * @description: 获取常用草药
     * @author: 29-y
     * @date: 2019-06-20 18:03
     * @param: [userId]
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.CommonlyUsedDrugs>>
     * @throws:
     */
    @RequestMapping("/listCommonlyUsedHerbalDrugsByUserId")
    public ResultDTO<List<CommonlyUsedDrugs>> listCommonlyUsedHerbalDrugsByUserId(Integer userId){
        ResultDTO<List<CommonlyUsedDrugs>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.listCommonlyUsedHerbalDrugsByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用草药获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用草药获取失败！");
        }
        return resultDTO;
    }

    /**
     * @title: listCommonlyUsedDiagnosisByUserId
     * @description: 获取常用诊断
     * @author: 29-y
     * @date: 2019-06-20 18:03
     * @param: [userId]
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.CommonlyUsedDiagnosis>>
     * @throws:
     */
    @RequestMapping("/listCommonlyUsedDiagnosisByUserId")
    public ResultDTO<List<CommonlyUsedDiagnosis>> listCommonlyUsedDiagnosisByUserId(Integer userId){
        ResultDTO<List<CommonlyUsedDiagnosis>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.listCommonlyUsedDiagnosisByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用诊断获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用诊断获取失败！");
        }
        return resultDTO;
    }

    /**
     * @title: listCommonlyUsedChineseDiagnosisByUserId
     * @description: 获取常用中医医诊断
     * @author: 29-y
     * @date: 2019-06-24 22:31
     * @param: [userId]
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.CommonlyUsedDiagnosis>>
     * @throws:
     */
    @RequestMapping("/listCommonlyUsedChineseDiagnosisByUserId")
    public ResultDTO<List<CommonlyUsedDiagnosis>> listCommonlyUsedChineseDiagnosisByUserId(Integer userId){
        ResultDTO<List<CommonlyUsedDiagnosis>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.listCommonlyUsedChineseDiagnosisByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用中医诊断获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用中医诊断获取失败！");
        }
        return resultDTO;
    }

    /**
     * @title: listCommonlyUsedWesternDiagnosisByUserId
     * @description: 获取常用西医诊断
     * @author: 29-y
     * @date: 2019-06-24 22:31
     * @param: [userId]
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.CommonlyUsedDiagnosis>>
     * @throws:
     */
    @RequestMapping("/listCommonlyUsedWesternDiagnosisByUserId")
    public ResultDTO<List<CommonlyUsedDiagnosis>> listCommonlyUsedWesternDiagnosisByUserId(Integer userId){
        ResultDTO<List<CommonlyUsedDiagnosis>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.listCommonlyUsedWesternDiagnosisByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用西医诊断获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用西医诊断获取失败！");
        }
        return resultDTO;
    }

    /**
     * @title: listCommonlyUsedExamination1ByUserId
     * @description: 获取常用检查
     * @author: 29-y
     * @date: 2019-06-20 18:04
     * @param: [userId]
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.CommonlyUsedFmedical>>
     * @throws:
     */
    @RequestMapping("/listCommonlyUsedExamination1ByUserId")
    public ResultDTO<List<CommonlyUsedFmedical>> listCommonlyUsedExamination1ByUserId(Integer userId){
        ResultDTO<List<CommonlyUsedFmedical>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.listCommonlyUsedExamination1ByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用检查获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用检查获取失败！");
        }
        return resultDTO;
    }
    /**
     * @title: listCommonlyUsedExamination2ByUserId
     * @description: 获取常用检验
     * @author: 29-y
     * @date: 2019-06-20 18:04
     * @param: [userId]
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.CommonlyUsedFmedical>>
     * @throws:
     */
    @RequestMapping("/listCommonlyUsedExamination2ByUserId")
    public ResultDTO<List<CommonlyUsedFmedical>> listCommonlyUsedExamination2ByUserId(Integer userId){
        ResultDTO<List<CommonlyUsedFmedical>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.listCommonlyUsedExamination2ByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用检验获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用检验获取失败！");
        }
        return resultDTO;
    }
    /**
     * @title: listCommonlyUsedTreatmentByUserId
     * @description: 获取常用处置
     * @author: 29-y
     * @date: 2019-06-20 18:05
     * @param: [userId]
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.CommonlyUsedFmedical>>
     * @throws:
     */
    @RequestMapping("/listCommonlyUsedTreatmentByUserId")
    public ResultDTO<List<CommonlyUsedFmedical>> listCommonlyUsedTreatmentByUserId(Integer userId){
        ResultDTO<List<CommonlyUsedFmedical>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.listCommonlyUsedTreatmentByUserId(userId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用处置获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用处置获取失败！");
        }
        return resultDTO;
    }
    /**
     * @title: listPatentDrugs
     * @description: 展示所有的成药
     * @author:
     * @date: 2019-06-20 18:05
     * @param: []
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.Drugs>>
     * @throws:
     */
    @RequestMapping("/listPatentDrugs")
    public ResultDTO<List<Drugs>> listPatentDrugs(){
        ResultDTO<List<Drugs>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(infoListService.listPatentDrugs());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("成药列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("成药列表获取失败！");
        }
        return resultDTO;
    }
    /**
     * @title: listHerbalDrugs
     * @description: 展示所有的草药
     * @author: 29-y
     * @date: 2019-06-20 18:06
     * @param: []
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.Drugs>>
     * @throws:
     */
    @RequestMapping("/listHerbalDrugs")
    public ResultDTO<List<Drugs>> listHerbalDrugs(){
        ResultDTO<List<Drugs>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(infoListService.listHerbalDrugs());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("草药列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("草药列表获取失败！");
        }
        return resultDTO;
    }

    /**
     * @title: listExamination1
     * @description: 展示所有的检查非药品项目
     * @author:
     * @date: 2019-06-20 18:06
     * @param: []
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.FmedicalItems>>
     * @throws:
     */
    @RequestMapping("/listExamination1")
    public ResultDTO<List<FmedicalItems>> listExamination1(){
        ResultDTO<List<FmedicalItems>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(infoListService.listExamination1());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("检查非药品列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("检查非药品列表获取失败！");
        }
        return resultDTO;
    }
    /**
     * @title: listExamination2
     * @description: 展示所有的检验非药品项目
     * @author:
     * @date: 2019-06-20 18:07
     * @param: []
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.FmedicalItems>>
     * @throws:
     */
    @RequestMapping("/listExamination2")
    public ResultDTO<List<FmedicalItems>> listExamination2(){
        ResultDTO<List<FmedicalItems>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(infoListService.listExamination2());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("检验非药品列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("检验非药品列表获取失败！");
        }
        return resultDTO;
    }
    /**
     * @title: listTreatment
     * @description: 展示所有的处置非药品项目
     * @author: 29-y
     * @date: 2019-06-20 18:10
     * @param: []
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.FmedicalItems>>
     * @throws:
     */
    @RequestMapping("/listTreatment")
    public ResultDTO<List<FmedicalItems>> listTreatment(){
        ResultDTO<List<FmedicalItems>> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(infoListService.listTreatment());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("处置非药品列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("处置非药品列表获取失败！");
        }
        return resultDTO;
    }
    /**
     * @title: listChineseDisease
     * @description: 展示所有的中医疾病
     * @author: 29-y
     * @date: 2019-06-20 18:11
     * @param: []
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.Disease>>
     * @throws:
     */
    @RequestMapping("/listChineseDisease")
    public ResultDTO<List<Disease>> listChineseDisease(){
        ResultDTO<List<Disease>> resultDTO = new ResultDTO<>();
        try {
            List<Disease> diseaseList = infoListService.listChineseDisease();
            String key = "ChineseDisease";
            redisUtils.set(key, diseaseList);
            resultDTO.setData(diseaseList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("中医疾病列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("中医疾病列表获取失败！");
        }
        return resultDTO;
    }
    /**
     * @title: listWesternDisease
     * @description: 展示所有的西医疾病
     * @author:
     * @date: 2019-06-20 18:12
     * @param: []
     * @return: edu.neu.hoso.dto.ResultDTO<java.util.List<edu.neu.hoso.model.Disease>>
     * @throws:
     */
    @RequestMapping("/listWesternDisease")
    public ResultDTO<List<Disease>> listWesternDisease(){
        ResultDTO<List<Disease>> resultDTO = new ResultDTO<>();
        try {
            List<Disease> diseaseList = infoListService.listWesternDisease();
            String key = "WesternDisease";
            redisUtils.set(key, diseaseList);
            resultDTO.setData(diseaseList);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("西医疾病列表获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("西医疾病列表获取失败！");
        }
        return resultDTO;
    }

    // 新增常用药品
    @RequestMapping("/insertCommonlyUsedDrugs")
    public ResultDTO<Integer> insertCommonlyUsedDrugs(@RequestBody CommonlyUsedDrugs commonlyUsedDrugs){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.insertCommonlyUsedDrugs(commonlyUsedDrugs));
            if(resultDTO.getData()==null){
                resultDTO.setStatus("OK");
                resultDTO.setMsg("常用药品插入成功！");
            }else {
                if (resultDTO.getData() == 0) {//如果已经插入了
                    resultDTO.setStatus("OK");
                    resultDTO.setMsg("该项已经是您的常用项了，请勿重新插入！");
                }else{
                    resultDTO.setMsg("常用药品插入成功！");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用药品插入失败！");
        }
        return resultDTO;
    }

    //新增常用List
    @RequestMapping("/insertCommonlyUsedDrugsList")
    public ResultDTO insertCommonlyUsedDrugs(@RequestBody List<CommonlyUsedDrugs> commonlyUsedDrugsList){
        ResultDTO resultDTO = new ResultDTO<>();
        System.out.println("开始输出insertCommonlyUsedDrugsList");
        for (CommonlyUsedDrugs commonlyUsedDrugs:commonlyUsedDrugsList){
            System.out.println(commonlyUsedDrugs.toString());
        }
        try {
            for (CommonlyUsedDrugs commonlyUsedDrugs:commonlyUsedDrugsList){
                commonlyUsedService.insertCommonlyUsedDrugs(commonlyUsedDrugs);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("常用药品插入成功！");
            }
//            if(resultDTO.getData()==null){
//                resultDTO.setStatus("OK");
//                resultDTO.setMsg("常用药品插入成功！");
//            }else {
//                if (resultDTO.getData() == 0) {//如果已经插入了
//                    resultDTO.setStatus("OK");
//                    resultDTO.setMsg("该项已经是您的常用项了，请勿重新插入！");
//                }else{
//                    resultDTO.setMsg("常用药品插入成功！");
//                }
//            }
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用药品插入失败！");
        }
        return resultDTO;
    }


    // 新增常用诊断
    @RequestMapping("/insertCommonlyUsedDiagnosis")
    public ResultDTO<Integer> insertCommonlyUsedDiagnosis(@RequestBody CommonlyUsedDiagnosis commonlyUsedDiagnosis){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.insertCommonlyUsedDiagnosis(commonlyUsedDiagnosis));

            if(resultDTO.getData()==0){//如果已经插入了
                resultDTO.setStatus("OK");
                resultDTO.setMsg("该项已经是您的常用项了，请勿重新插入！");
            }else{
                resultDTO.setStatus("OK");
                resultDTO.setMsg("常用诊断插入成功！");
            }

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用诊断插入失败！");
        }
        return resultDTO;
    }
    // 新增常用检查\检验\处置 需要在后台判断类型
    @RequestMapping("/insertCommonlyUsedFmedical")
    public ResultDTO<Integer> insertCommonlyUsedFmedical(@RequestBody CommonlyUsedFmedical commonlyUsedFmedical){
        ResultDTO<Integer> resultDTO = new ResultDTO<>();
        try {
            resultDTO.setData(commonlyUsedService.insertCommonlyUsedFmedical(commonlyUsedFmedical));
            if(resultDTO.getData()==0){//如果已经插入了
                resultDTO.setStatus("OK");
                resultDTO.setMsg("该项已经是您的常用项了，请勿重新插入！");
            }else{
                resultDTO.setStatus("OK");
                resultDTO.setMsg("常用项目插入成功！");
            }

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用项目插入失败！");
        }
        return resultDTO;
    }

    // 删除常用药品
    @RequestMapping("/deleteCommonlyUsedDrugs")
    public ResultDTO deleteCommonlyUsedDrugs(Integer commonlyUsedDrugsId){
        ResultDTO resultDTO = new ResultDTO();
        try {
            commonlyUsedService.deleteCommonlyUsedDrugs(commonlyUsedDrugsId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用药品删除成功！");

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用药品删除失败！");
        }
        return resultDTO;
    }
    // 删除常用诊断
    @RequestMapping("/deleteCommonlyUsedDiagnosis")
    public ResultDTO deleteCommonlyUsedDiagnosis(Integer commonlyUsedDiagnosisId){
        ResultDTO resultDTO = new ResultDTO();
        try {
            commonlyUsedService.deleteCommonlyUsedDiagnosis(commonlyUsedDiagnosisId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用诊断删除成功！");

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用诊断删除失败！");
        }
        return resultDTO;
    }
    // 删除常用检查\检验\处置 需要在后台判断类型
    @RequestMapping("/deleteCommonlyUsedFmedical")
    public ResultDTO deleteCommonlyUsedFmedical(Integer commonlyUsedFmedicalId){
        ResultDTO resultDTO = new ResultDTO();
        try {
            commonlyUsedService.deleteCommonlyUsedFmedical(commonlyUsedFmedicalId);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("常用项目删除成功！");

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("常用项目删除失败！");
        }
        return resultDTO;
    }

    @RequestMapping("/getPatientExpenseItems")
    public ResultDTO<List<ExpenseItems>> getPatientExpenseItems(Integer medicalRecordId){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(medicalRecordService.getPatientExpenseItems(medicalRecordId));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("患者费用明细查询成功！");

        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("患者费用明细查询失败！");
        }
        return resultDTO;
    }
}
