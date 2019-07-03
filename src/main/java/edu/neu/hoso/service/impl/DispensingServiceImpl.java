package edu.neu.hoso.service.impl;

import edu.neu.hoso.model.*;
import edu.neu.hoso.service.DispensingService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: DispensingServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 用于提供门诊发药退药服务
 * @author: alan
 * @date: 2019/6/17 11:30
 * @version: V1.0
 */
@Service
public class DispensingServiceImpl implements DispensingService {

    @Resource
    PrescriptionItemsMapper prescriptionItemsMapper;

    @Resource
    ExaminationDrugsItemsMapper examinationDrugsItemsMapper;

    /**
     *@title: dispensing
     *@description: 更改发药状态
     *@author: alan
     *@date: 2019/6/17 11:30
     *@param: [Medical_record_ID, DrugsId]
     *@return: int
     *@throws:
     */
    public int dispensing(int Medical_record_ID, int DrugsId){
        //现在处方中寻找
        List<PrescriptionItems> DispensingInPrescriptions = prescriptionItemsMapper.selectDispensingInPrescription(Medical_record_ID,DrugsId);
        if (DispensingInPrescriptions.size() == 0){//在处方中未找到
            List<ExaminationDrugsItems>  DispensingInExaminations = examinationDrugsItemsMapper.selectDispensingInExamination(Medical_record_ID,DrugsId);
            if (DispensingInExaminations.size() == 0){//在检查检验药品中未找到
                return 0;
            }
            else {
                if(DispensingInExaminations.get(0).getActualQuantity()<DispensingInExaminations.get(0).getQuantity()){ //实际数量小于开立数量
                    DispensingInExaminations.get(0).setDrugsDispensingStatus("3");
                }
                else if(DispensingInExaminations.get(0).getActualQuantity()==DispensingInExaminations.get(0).getQuantity()) { //实际数量等于开立数量
                    DispensingInExaminations.get(0).setDrugsDispensingStatus("2");
                }
            }
            return examinationDrugsItemsMapper.updateByPrimaryKeySelective(DispensingInExaminations.get(0));
        }
        else {//在处方中找到
            if(DispensingInPrescriptions.get(0).getActualQuantity()<DispensingInPrescriptions.get(0).getQuantity()){ //实际数量小于开立数量
                DispensingInPrescriptions.get(0).setDrugsDispensingStatus("3");
            }
            else if(DispensingInPrescriptions.get(0).getActualQuantity()==DispensingInPrescriptions.get(0).getQuantity()) { //实际数量等于开立数量
                DispensingInPrescriptions.get(0).setDrugsDispensingStatus("2");
            }
            return prescriptionItemsMapper.updateByPrimaryKeySelective(DispensingInPrescriptions.get(0));
        }
    }

    /**
     *@title: returnDurgs
     *@description: 退药
     *@author: alan
     *@date: 2019/6/17 15:48
     *@param: [object]
     *@return: void
     *@throws:
     */
    public int returnDurgs(Object object){
        if (object instanceof ExaminationDrugsItems){
            System.out.println("ExaminationDrugsItems");
            if (((ExaminationDrugsItems) object).getActualQuantity() >= ((ExaminationDrugsItems) object).getQuantity()){
                return -1;
            }
            int i = examinationDrugsItemsMapper.updateByPrimaryKeySelective((ExaminationDrugsItems) object);
            return i;
        }
        else if (object instanceof PrescriptionItems){
            System.out.println("ExaminationDrugsItems");
            if (((PrescriptionItems) object).getActualQuantity() < ((PrescriptionItems) object).getQuantity()){
                return -1;
            }
            return prescriptionItemsMapper.updateByPrimaryKeySelective((PrescriptionItems)object);
        }
        return -1;
    }

//    //退检查检验药
//    public int returExaminationDrugs(ExaminationDrugsItems examinationDrugsItems){
//
//    }
//
//    //退处方药
//    public int returPrescriptionDrugs(PrescriptionItems prescriptionItems){
//
//    }
}
