package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.ExaminationDrugsItemsExample;
import edu.neu.hoso.example.PatientExample;
import edu.neu.hoso.example.RegistrationExample;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.TechService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @title: TechServiceImpl
 * @package edu.neu.hoso.service.Impl
 * @description:医技工作站
 * @author: alan
 * @date: 2019/6/11 15:49
 * @version: V1.0
 */
@Service
public class TechServiceImpl implements TechService {

    @Resource
    RegistrationMapper registrationMapper;

    @Resource
    ExaminationMapper examinationMapper;

    @Resource
    PatientMapper patientMapper;

    @Resource
    FmedicalItemsMapper fmedicalItemsMapper;

    @Resource
    ExaminationFmedicalItemsMapper examinationFmedicalItemsMapper;

    @Resource
    ExaminationDrugsItemsMapper examinationDrugsItemsMapper;

    @Resource
    ExpenseItemsMapper expenseItemsMapper;

    @Resource
    DrugsMapper drugsMapper;

    @Resource
    CommonlyUsedFmedicalMapper commonlyUsedFmedicalMapper;

    @Resource
    ExaminationResultMapper examinationResultMapper;

    @Resource
    ExaminationResultImageMapper examinationResultImageMapper;

    @Resource
    CommonlyUsedDrugsMapper commonlyUsedDrugsMapper;

    /**
     *@title: getInfoByMedical_record_ID
     *@description: 根据病历号得到患者的基本信息
     *@author: alan
     *@date: 2019/6/11 15:48
     *@param: [Medical_record_ID:病历号]
     *@return: edu.neu.hoso.model.Patient
     *@throws:
     */
    @Override
    public Patient getInfoByMedical_record_ID(int Medical_record_ID){
        RegistrationExample registrationExample = new RegistrationExample();
        registrationExample.createCriteria().andMedicalRecordIdEqualTo(Medical_record_ID);
        List<Registration> registrations = registrationMapper.selectByExample(registrationExample);

        //若查询结果为空
        if(registrations.size()==0)
            return null;

        int patient_id = registrations.get(0).getPatientId();
        Patient patient = patientMapper.selectByPrimaryKey(patient_id);
        return patient;
    }

    /**
     *@title: getInfoByPatient_Name
     *@description: 根据患者姓名得到患者的基本信息
     *@author: alan
     *@date: 2019/6/11 15:46
     *@param: [patient_name:患者姓名]
     *@return: java.util.List<edu.neu.hoso.model.Patient>
     *@throws:
     */
    @Override
    public List<Patient> getInfoByPatient_Name(String patient_name){
        PatientExample patientExample = new PatientExample();
        patientExample.createCriteria().andPatientNameEqualTo(patient_name);
        List<Patient> patients = patientMapper.selectByExample(patientExample);
        if (patients.size()==0){
            return null;
        }
        return patients;
    }

    /**
     *@title: getAllFmedicalByMedicalID
     *@description: 根据患者病历号得到该患者在该科室的所有非药品项目
     *@author: alan
     *@date: 2019/6/11 15:47
     *@param: [Medical_record_ID:病历号, Department_ID:科室号]
     *@return: java.util.List<edu.neu.hoso.model.FmedicalItems>
     *@throws:
     */
    @Override
    public List<FmedicalItems> getAllFmedicalByMedicalID(int Medical_record_ID, int Department_ID){
        List<FmedicalItems> fmedicalItems = fmedicalItemsMapper.getAllFmedicalByMedicalID(Medical_record_ID, Department_ID);
        if (fmedicalItems.size()==0){
            System.out.println("weikong");
            return null;
        }
        return fmedicalItems;
    }

    /**
     *@title: updateRegistrationStatus
     *@description: 更新患者在该科室的登记状态，该科室的Registration_Status1->2
     *@author: alan
     *@date: 2019/6/11 16:10
     *@param: [Medical_record_ID:病历号, Department_ID:科室号]
     *@return: boolean
     *@throws:
     */
    public void updateRegistrationStatus(int examinationFmedicalItemdId){
        ExaminationFmedicalItems examinationFmedicalItems = examinationFmedicalItemsMapper.selectByPrimaryKey(examinationFmedicalItemdId);
        examinationFmedicalItems.setRegistrationStatus("2");
        examinationFmedicalItemsMapper.updateByPrimaryKeySelective(examinationFmedicalItems);
    }

    /**
     *@title: getAllFmedical
     *@description: 输出该患者在该科室的全部项目
     *@author: alan
     *@date: 2019/6/12 11:55
     *@param: [Medical_record_ID, Department_ID]
     *@return: java.util.List<edu.neu.hoso.model.ExaminationFmedicalItems>
     *@throws:
     */
    public List<ExaminationFmedicalItems> getAllFmedical(int Medical_record_ID, int Department_ID){
        List<ExaminationFmedicalItems> examinationFmedicalItems = examinationFmedicalItemsMapper.getAllFmedical(Medical_record_ID, Department_ID);
        if (examinationFmedicalItems.size()==0){
            System.out.println("为空");
            return null;
        }
//        for (ExaminationFmedicalItems examinationFmedicalItems1:examinationFmedicalItems){
//            for (FmedicalItems fmedicalItems:examinationFmedicalItems1.getFmedicalItems()){
//                System.out.println(fmedicalItems.toString());
//                for (Drugs drugs:fmedicalItems.getDrugsList()){
//                    System.out.println(drugs.toString());
//                }
//            }
//        }
        return examinationFmedicalItems;
    }

    /**
     *@title: insertExaminationDrugsAndExpense
     *@description: 将数据插入Examination_Drugs_Items表中并加入Expense_Items中，并将其生成的expenseid加入Examination_Drugs_Items表中
     *@author: alan
     *@date: 2019/6/13 11:53
     *@param: [examinationDrugsItems, Medical_record_ID]
     *@return: void
     *@throws:
     */
    public void insertExaminationDrugsAndExpense(List<ExaminationDrugsItems> examinationDrugsItems, int Medical_record_ID){
        for (ExaminationDrugsItems examinationDrugsItem : examinationDrugsItems){
            ExpenseItems expenseItems = new ExpenseItems();
            //插入Examination_Drugs_Items表
            examinationDrugsItemsMapper.insertSelective(examinationDrugsItem);
            System.out.println("Examination_Drugs_Items表:" + examinationDrugsItem.getExaminationDrugsItemsId());

            //加入Expense_Items表中
            //病历id，总费用不为空,pay_Status:1
            expenseItems.setMedicalRecordId(Medical_record_ID);//id
            Double drugsPrice = drugsMapper.selectByPrimaryKey(examinationDrugsItem.getDrugsId()).getDrugsPrice();
            expenseItems.setTotalCost(drugsPrice * examinationDrugsItem.getQuantity());//total_cost
            expenseItems.setPayStatus("1");//pay_status
            expenseItemsMapper.insertSelective(expenseItems);
            System.out.println("Expense_Items表:" + expenseItems.getExpenseItemsId());

            //update Examination_Drugs_Items表的ExpenseItems_Id
            examinationDrugsItem.setExpenseItemsId(expenseItems.getExpenseItemsId());
            examinationDrugsItemsMapper.updateByPrimaryKeySelective(examinationDrugsItem);
            System.out.println();
        }
    }

    /**
     *@title: maintainCommonFmedical
     *@description: 医技医生维护常用项目，向Commonly_Used_Fmedical表里面插入数据
     *@author: alan
     *@date: 2019/6/13 14:05
     *@param: [commonlyUsedFmedicals]
     *@return: void
     *@throws:
     */
    public void maintainCommonFmedical(List<CommonlyUsedFmedical> commonlyUsedFmedicals){
        for (CommonlyUsedFmedical commonlyUsedFmedical : commonlyUsedFmedicals) {
            commonlyUsedFmedicalMapper.insertSelective(commonlyUsedFmedical);
        }
    }

    /**
     *@title: insertExaminationResult
     *@description: 检查检验结果录入
     *@author: alan
     *@date: 2019/6/13 15:29
     *@param: [examinationResult]
     *@return: void
     *@throws:
     */
    public void insertExaminationResult(ExaminationResult examinationResult, int examinationFmedicalItemsId){
        Timestamp timeStamp = new Timestamp(new Date().getTime());
        examinationResult.setSubmitTime(timeStamp);
        examinationResultMapper.insertSelective(examinationResult);
        //将结果id插回去
        ExaminationFmedicalItems examinationFmedicalItems = examinationFmedicalItemsMapper.selectByPrimaryKey(examinationFmedicalItemsId);
        examinationFmedicalItems.setExaminationResultId(examinationResult.getExaminationResultId());
        examinationFmedicalItemsMapper.updateByPrimaryKeySelective(examinationFmedicalItems);
    }

    /**
     *@title: insertExaminationResultImage
     *@description: 检查检验照片录入
     *@author: alan
     *@date: 2019/6/13 16:25
     *@param: [examinationResultImages]
     *@return: void
     *@throws:
     */
    public void insertExaminationResultImage(int examinationResultId, String imageURL, String imageName){
        ExaminationResultImage examinationResultImage = new ExaminationResultImage();
        examinationResultImage.setExaminationResultId(examinationResultId);
        examinationResultImage.setImageUrl(imageURL);
        examinationResultImage.setImageName(imageName);
        examinationResultImageMapper.insertSelective(examinationResultImage);
//        for (ExaminationResultImage examinationResultImage : examinationResultImages){
//            examinationResultImage.setExaminationResultId(examinationResultId);
//            examinationResultImageMapper.insertSelective(examinationResultImage);
//        }
    }

    /**
     *@title: getAllPatientByDepartmentId
     *@description: 获得该科室的所有病人
     *@author: alan
     *@date: 2019/6/28 18:42
     *@param: [departmentId]
     *@return: java.util.List<edu.neu.hoso.model.Registration>
     *@throws:
     */
    public List<Registration> getAllPatientByDepartmentId(int departmentId){
        List<Registration> registrations = registrationMapper.getAllPatientByDepartmentId(departmentId);
        return (registrations.size()==0?null:registrations);
    }

    public List<Drugs> getAllDrugs(){
        List<Drugs> drugsList = drugsMapper.getAllDrugs();
        return drugsList;
    }

    //根据医生id获得其常用项目
    public List<CommonlyUsedDrugs> getCommonUsedDrugs(int doctorId){
        List<CommonlyUsedDrugs> commonlyUsedDrugsList = commonlyUsedDrugsMapper.getCommonUsedDrugs(doctorId);
        return commonlyUsedDrugsList;
    }

    //删除常用项
    public void deleteCommonUsedDrugs(CommonlyUsedDrugs commonlyUsedDrugsList){
        int i = commonlyUsedDrugsMapper.deleteByPrimaryKey(commonlyUsedDrugsList.getCommonlyUsedDrugs());
    }
}
