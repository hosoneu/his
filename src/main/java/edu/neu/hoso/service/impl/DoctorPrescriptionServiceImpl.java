package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.PrescriptionItemsExample;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.DoctorPrescriptionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @title: DoctorPrescriptionServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 实现对处方的操作
 * @author: 29-y
 * @date: 2019-06-18 11:22
 * @version: V1.0
*/
@Service
public class DoctorPrescriptionServiceImpl implements DoctorPrescriptionService {
    @Resource
    GroupPrescriptionMapper groupPrescriptionMapper;
    @Resource
    GroupPrescriptionItemsMapper groupPrescriptionItemsMapper;
    @Resource
    PrescriptionMapper prescriptionMapper;
    @Resource
    PrescriptionItemsMapper prescriptionItemsMapper;
    @Resource
    DrugsMapper drugsMapper;
    @Resource
    ExpenseItemsMapper expenseItemsMapper;

    /**
     * @title: listGroupPatentPrescription
     * @description: 展示成药处方组套
     * @author: 29-y
     * @date: 2019-06-18 11:34
     * @param: [userId, scope]
     * @return: java.util.List<edu.neu.hoso.model.GroupPrescription>
     * @throws:
     */
    @Override
    public List<GroupPrescription> listGroupPatentPrescription(Integer userId, String scope) {

        if(scope.equals("1")){
            return groupPrescriptionMapper.listGroupPatentPrescriptionFromUser(userId);
        }else if(scope.equals("2")){
            return groupPrescriptionMapper.listGroupPatentPrescriptionFromDepartment(userId);
        }else if(scope.equals("3")){
            return groupPrescriptionMapper.listGroupPatentPrescriptionFromHospital();
        }else{
            return null;
        }
    }

    /**
     * @title: listGroupHerbalPrescription
     * @description: 展示草药处方组套
     * @author: 29-y
     * @date: 2019-06-18 11:34
     * @param: [userId, scope]
     * @return: java.util.List<edu.neu.hoso.model.GroupPrescription>
     * @throws:
     */
    @Override
    public List<GroupPrescription> listGroupHerbalPrescription(Integer userId, String scope) {
        if(scope.equals("1")){
            return groupPrescriptionMapper.listGroupHerbalPrescriptionFromUser(userId);
        }else if(scope.equals("2")){
            return groupPrescriptionMapper.listGroupHerbalPrescriptionFromDepartment(userId);
        }else if(scope.equals("3")){
            return groupPrescriptionMapper.listGroupHerbalPrescriptionFromHospital();
        }else{
            return null;
        }
    }

    /**
     * @title: selectGroupPatentPrescriptionById
     * @description: 根据处方组套ID查找草药处方组套
     * @author: 29-y
     * @date: 2019-06-18 11:35
     * @param: [prescriptionId]
     * @return: edu.neu.hoso.model.GroupPrescription
     * @throws:
     */
    @Override
    public GroupPrescription selectGroupPatentPrescriptionById(Integer prescriptionId) {
        return groupPrescriptionMapper.selectGroupPatentPrescriptionById(prescriptionId);
    }

    /**
     * @title: selectGroupHerbalPrescriptionById
     * @description: 根据处方组套ID查找草药处方组套
     * @author: 29-y
     * @date: 2019-06-18 11:35
     * @param: [prescriptionId]
     * @return: edu.neu.hoso.model.GroupPrescription
     * @throws:
     */
    @Override
    public GroupPrescription selectGroupHerbalPrescriptionById(Integer prescriptionId) {
        return groupPrescriptionMapper.selectGroupHerbalPrescriptionById(prescriptionId);
    }

    /**
     * @title: insertGroupPatentPrescription
     * @description: 插入成药处方组套
     * @author: 29-y
     * @date: 2019-06-18 11:36
     * @param: [groupPrescription]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertGroupPatentPrescription(GroupPrescription groupPrescription) {
        groupPrescription.setPrescriptionType("1");//设置类型为1成药
        return insertGroupPrescription(groupPrescription);
    }

    /**
     * @title: insertGroupPatentPrescription
     * @description: 插入草药处方组套
     * @author: 29-y
     * @date: 2019-06-18 11:36
     * @param: [groupPrescription]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertGroupHerbalPrescription(GroupPrescription groupPrescription) {
        groupPrescription.setPrescriptionType("2");//设置类型为2草药
        return insertGroupPrescription(groupPrescription);
    }

    /**
     * @title: insertGroupPrescription
     * @description: 私有方法：用于实现处方组套的插入
     * @author: 29-y
     * @date: 2019-06-18 15:37
     * @param: [groupPrescription]
     * @return: java.lang.Integer
     * @throws:
     */
    private Integer insertGroupPrescription(GroupPrescription groupPrescription){
        groupPrescription.setCreateTime(new Date());//设置时间
        groupPrescriptionMapper.insert(groupPrescription);//插入到处方模板表中并得到主键
        Integer groupPrescriptionId = groupPrescription.getGroupPrescriptionId();
        List<GroupPrescriptionItems> groupPrescriptionItemsList = groupPrescription.getGroupPrescriptionItemsList();
        //插入到处方模板条目表中
        for(GroupPrescriptionItems groupPrescriptionItems : groupPrescriptionItemsList){
            groupPrescriptionItems.setGroupPrescriptionId(groupPrescriptionId);
            groupPrescriptionItemsMapper.insert(groupPrescriptionItems);
        }
        return groupPrescriptionId;
    }

    /**
     * @title: listPatentPrescriptionByMedicalRecordId
     * @description: 列出当前病历下的成药处方
     * @author: 29-y
     * @date: 2019-06-18 15:38
     * @param: [medicalRecordId]
     * @return: java.util.List<edu.neu.hoso.model.Prescription>
     * @throws:
     */
    @Override
    public List<Prescription> listPatentPrescriptionByMedicalRecordId(Integer medicalRecordId) {
        return prescriptionMapper.listPatentPrescriptionByMedicalRecordId(medicalRecordId);
    }

    /**
     * @title: listHerbalPrescriptionByMedicalRecordId
     * @description: 列出当前病历下的草药处方
     * @author: 29-y
     * @date: 2019-06-18 15:38
     * @param: [medicalRecordId]
     * @return: java.util.List<edu.neu.hoso.model.Prescription>
     * @throws:
     */
    @Override
    public List<Prescription> listHerbalPrescriptionByMedicalRecordId(Integer medicalRecordId) {
        return prescriptionMapper.listHerbalPrescriptionByMedicalRecordId(medicalRecordId);
    }

    /**
     * @title: insertPatentPrescription
     * @description: 插入成药处方
     * @author: 29-y
     * @date: 2019-06-18 15:39
     * @param: [prescription]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertPatentPrescription(Prescription prescription) {

        prescription.setPrescriptionType("1");//成药类型处方
        return insertPrescription(prescription);
    }

    /**
     * @title: insertHerbalPrescription
     * @description: 插入草药处方
     * @author: 29-y
     * @date: 2019-06-18 15:39
     * @param: [prescription]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertHerbalPrescription(Prescription prescription) {
        prescription.setPrescriptionType("2");//草药类型处方
        return insertPrescription(prescription);
    }

    /**
     * @title: convertDrugType2ExpenseType
     * @description: 得到药品对应的收费类型
     * @author: 29-y
     * @date: 2019-06-18 15:40
     * @param: [drugsTypeId]
     * @return: java.lang.Integer
     * @throws:
     */
    //convertDrugType2ExpenseType得到药品收费类型
    private Integer convertDrugType2ExpenseType(Integer drugsTypeId){

        //收费类型13西药 对应药品表中的药品类型101
        //收费类型14中成药 对应药品表中的药品类型102
        //收费类型15中草药 对应药品表中的药品类型103
        //两者相差88
        return drugsTypeId-88;
    }

    /**
     * @title: insertPrescription
     * @description: 私有方法：插入处方
     * @author: 29-y
     * @date: 2019-06-18 15:41
     * @param: [prescription]
     * @return: java.lang.Integer
     * @throws:
     */
    private Integer insertPrescription(Prescription prescription){
        prescription.setValidStatus("1");//设置有效状态
        prescription.setSubmitTime(new Date());//设置提交时间
        prescriptionMapper.insert(prescription);//插入到处方表中
        Integer prescriptionId = prescription.getPrescriptionId();//得到该条处方的主键
        Integer medicalRecordId = prescription.getMedicalRecordId();//得到病历ID
        //插入处方条目表中
        List<PrescriptionItems> prescriptionItemsList = prescription.getPrescriptionItemsList();
        for(PrescriptionItems prescriptionItems : prescriptionItemsList){
            //得到药品对象
            Drugs drugs = drugsMapper.selectByPrimaryKey(prescriptionItems.getDragsId());//得到药品对象便于给收费条目表中的收费类型赋值

            //插入expenseItems
            ExpenseItems expenseItems = new ExpenseItems();//新建一个收费条目
            expenseItems.setMedicalRecordId(medicalRecordId);
            expenseItems.setExpenseTypeId(convertDrugType2ExpenseType(drugs.getDrugsTypeId()));//得到收费类型
            expenseItems.setPayStatus("1");//默认为支付状态为未收费
            expenseItems.setTotalCost(prescriptionItems.getQuantity()*drugs.getDrugsPrice());//计算总额
            expenseItemsMapper.insert(expenseItems);//插入到expenseItems表中

            //插入prescriptionItems
            prescriptionItems.setPrescriptionId(prescriptionId);////设置处方单ID
            prescriptionItems.setActualQuantity(prescriptionItems.getQuantity());//设置实际数量为开立数量
            prescriptionItems.setDrugsDispensingStatus("1");//设置发药状态为未发药
            prescriptionItems.setExpenseItemsId(expenseItems.getExpenseItemsId());//填充收费ID
            prescriptionItemsMapper.insert(prescriptionItems);
        }
        return prescriptionId;
    }


    /**
     * @title: cancelPatentPrescription
     * @description: 废除已开立的成药处方
     * @author: 29-y
     * @date: 2019-06-18 15:42
     * @param: [prescriptionId]
     * @return: void
     * @throws:
     */
    @Override
    public void cancelPatentPrescription(Integer prescriptionId) {
        if(prescriptionMapper.selectByPrimaryKey(prescriptionId).getPrescriptionType().equals("1")){
            cancelPrescription(prescriptionId);
        }
    }

    /**
     * @title: cancelHerbalPrescription
     * @description: 废除已开立的草药处方
     * @author: 29-y
     * @date: 2019-06-18 15:42
     * @param: [prescriptionId]
     * @return: void
     * @throws:
     */
    @Override
    public void cancelHerbalPrescription(Integer prescriptionId) {
        if(prescriptionMapper.selectByPrimaryKey(prescriptionId).getPrescriptionType().equals("2")){
            cancelPrescription(prescriptionId);
        }
    }

    /**
     * @title: cancelPrescription
     * @description: 私有方法：废除已开立的处方
     * @author: 29-y
     * @date: 2019-06-18 15:42
     * @param: [prescriptionId]
     * @return: void
     * @throws:
     */
    private void cancelPrescription(Integer prescriptionId){
        if(ifPrescriptionCanCancel(prescriptionId)==1){//如果可废除
            Prescription prescription = prescriptionMapper.selectPrescriptionById(prescriptionId);//得到处方和处方列表
            List<PrescriptionItems> prescriptionItemsList = prescription.getPrescriptionItemsList();//得到处方条目列表
            for(PrescriptionItems prescriptionItems : prescriptionItemsList){
                //查找到对应的收费条目 并更新收费状态为无效
                ExpenseItems expenseItems = new ExpenseItems();
                expenseItems.setExpenseItemsId(prescriptionItems.getExpenseItemsId());
                expenseItems.setPayStatus("4");//设置收费条目为无效状态
                expenseItemsMapper.updateByPrimaryKeySelective(expenseItems);//更新该状态
            }
            prescription.setValidStatus("2");//设置处方单为无效状态
            prescriptionMapper.updateByPrimaryKeySelective(prescription);
        }
    }

    /**
     * @title: ifPrescriptionCanCancel
     * @description: 查看处方是否可废除：1可废除 2不可废除 3已废除
     * @author: 29-y
     * @date: 2019-06-18 15:43
     * @param: [prescriptionId]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer ifPrescriptionCanCancel(Integer prescriptionId) {

        Prescription prescription = prescriptionMapper.selectByPrimaryKey(prescriptionId);
        if(prescription.getValidStatus().equals("1")){
            //查找该处方单下对应的所有处方条目
            PrescriptionItemsExample prescriptionItemsExample = new PrescriptionItemsExample();
            PrescriptionItemsExample.Criteria criteria = prescriptionItemsExample.createCriteria();
            criteria.andPrescriptionIdEqualTo(prescriptionId);
            List<PrescriptionItems> prescriptionItemsList = prescriptionItemsMapper.selectByExample(prescriptionItemsExample);
            //遍历处方条目的收费状态是不是全部都为未收费 否则不可废除
            for(PrescriptionItems prescriptionItems : prescriptionItemsList){
                if(!expenseItemsMapper.selectByPrimaryKey(prescriptionItems.getExpenseItemsId()).getPayStatus().equals("1")){//如果不是未缴费 则不可废除
                    return 2;//不可废除
                }
            }
        }else{
            return 3;//已废除
        }
        return 1;//可废除
    }

    /**
     * @title: selectPatentPrescription
     * @description: 查找成药处方
     * @author: 29-y
     * @date: 2019-06-18 15:44
     * @param: [prescriptionId]
     * @return: edu.neu.hoso.model.Prescription
     * @throws:
     */
    @Override
    public Prescription selectPatentPrescription(Integer prescriptionId) {


        return prescriptionMapper.selectPatentPrescriptionById(prescriptionId);
    }

    /**
     * @title: selectHerbalPrescription
     * @description: 查找草药处方
     * @author: 29-y
     * @date: 2019-06-18 15:44
     * @param: [prescriptionId]
     * @return: edu.neu.hoso.model.Prescription
     * @throws:
     */
    @Override
    public Prescription selectHerbalPrescription(Integer prescriptionId) {
        return prescriptionMapper.selectPatentPrescriptionById(prescriptionId);
    }
}
