package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.ExaminationDrugsItemsExample;
import edu.neu.hoso.example.ExaminationResultImageExample;
import edu.neu.hoso.example.GroupExaminationDrugsItemsExample;
import edu.neu.hoso.example.GroupExaminationFmedicalItemsExample;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.DoctorExaminationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @title: DoctorExaminationServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 实现门诊医生对检查检验单的操作
 * @author: 29-y
 * @date: 2019-06-19 9:57
 * @version: V1.0
 */
@Service
public class DoctorExaminationServiceImpl implements DoctorExaminationService {

    @Resource
    ExaminationMapper examinationMapper;
    @Resource
    ExaminationFmedicalItemsMapper examinationFmedicalItemsMapper;
    @Resource
    ExaminationDrugsItemsMapper examinationDrugsItemsMapper;
    @Resource
    ExaminationResultMapper examinationResultMapper;
    @Resource
    GroupExaminationMapper groupExaminationMapper;
    @Resource
    GroupExaminationDrugsItemsMapper groupExaminationDrugsItemsMapper;
    @Resource
    GroupExaminationFmedicalItemsMapper groupExaminationFmedicalItemsMapper;
    @Resource
    FmedicalItemsMapper fmedicalItemsMapper;
    @Resource
    ExpenseItemsMapper expenseItemsMapper;
    @Resource
    DrugsMapper drugsMapper;
    @Resource
    ExaminationResultImageMapper examinationResultImageMapper;

    /**
     * @title: listExaminationByMedicalRecordId
     * @description: 根据病历号列出所有的检查检验单
     * @author: 29-y
     * @date: 2019-06-19 10:00
     * @param: [medicalRecordId, type]
     * @return: java.util.List<edu.neu.hoso.model.Examination>
     * @throws:
     */
    @Override
    public List<Examination> listExaminationByMedicalRecordId(Integer medicalRecordId, String type) {
        //首先得到该病历下所有的Examination
        List<Examination> examinationList = examinationMapper.listExaminationByMedicalRecordId(medicalRecordId, type);
        for(Examination examination : examinationList){
            //得到每个Examination中的非药品项目条目
            List<ExaminationFmedicalItems> examinationFmedicalItemsList = examination.getExaminationFmedicalItemsList();
            //对检查检验药品列表进行赋值
            examination.setExaminationFmedicalItemsList(valueExaminationFmedicalItemsList(examinationFmedicalItemsList));
        }
        return examinationList;
    }

    /**
     * @title: selectExaminationById
     * @description: 根据检查检验单ID列出所有的条目
     * @author: 29-y
     * @date: 2019-06-19 10:01
     * @param: [examinationId, type]
     * @return: java.util.List<edu.neu.hoso.model.Examination>
     * @throws:
     */
    @Override
    public Examination selectExaminationById(Integer examinationId, String type) {
        //首先得到该Examination
        Examination examination = examinationMapper.selectExaminationById(examinationId, type);
        if(examination==null){
            return null;
        }
        //得到每个Examination中的非药品项目条目
        List<ExaminationFmedicalItems> examinationFmedicalItemsList = examination.getExaminationFmedicalItemsList();
        //对检查检验药品列表进行赋值
        examination.setExaminationFmedicalItemsList(valueExaminationFmedicalItemsList(examinationFmedicalItemsList));
        return examination;
    }


    /**
     * @title: valueExaminationFmedicalItemsList
     * @description: 私有方法:填充检查检验单非药品条目列表的内容
     * @author: 29-y
     * @date: 2019-06-19 12:10
     * @param: [examinationFmedicalItemsList]
     * @return: java.util.List<edu.neu.hoso.model.ExaminationFmedicalItems>
     * @throws:
     */
    private List<ExaminationFmedicalItems> valueExaminationFmedicalItemsList(List<ExaminationFmedicalItems> examinationFmedicalItemsList){
        for(int currentIndex = 0 ; currentIndex < examinationFmedicalItemsList.size() ; currentIndex++) {
            ExaminationFmedicalItems examinationFmedicalItems = examinationFmedicalItemsList.get(currentIndex);
            examinationFmedicalItems.setExaminationDrugsItemsList(examinationDrugsItemsMapper.listExaminationDrugsItemsByExaminationFmedicalItemsId(examinationFmedicalItems.getExaminationFmedicalItemsId()));
            examinationFmedicalItemsList.set(currentIndex,examinationFmedicalItems);
        }
        return examinationFmedicalItemsList;
    }

    /**
     * @title: listGroupExamination
     * @description: 展示所有的检查检验组套(type:1检查 2检验)(scope:1个人2科室3医院)
     * @author: 29-y
     * @date: 2019-06-19 13:30
     * @param: [userId, type, scope]
     * @return: java.util.List<edu.neu.hoso.model.GroupExamination>
     * @throws:
     */
    @Override
    public List<GroupExamination> listGroupExamination(Integer userId, String type, String scope) {
        if(scope.equals("1")||scope.equals("2")||scope.equals("3")){
            //对检查检验组套列表赋值(不包括非药品组套条目中的药品组套条目列表)
            List<GroupExamination> groupExaminationList;
            if(scope.equals("1")){
                groupExaminationList = groupExaminationMapper.listGroupExaminationFromUser(userId,type);
            }else if(scope.equals("2")){
                groupExaminationList = groupExaminationMapper.listGroupExaminationFromDepartment(userId,type);
            }else{//scope.equals("3")
                groupExaminationList = groupExaminationMapper.listGroupExaminationFromHospital(type);
            }
            //填充非药品组套条目中的药品组套条目列表
            for(GroupExamination groupExamination : groupExaminationList){
                //得到每个GroupExamination中的非药品项目条目
                List<GroupExaminationFmedicalItems> groupExaminationFmedicalItemsList = groupExamination.getGroupExaminationFmedicalItemsList();
                //对检查检验组套药品列表进行赋值
                //填充药品条目
                groupExamination.setGroupExaminationFmedicalItemsList(valueGroupExaminationFmedicalItemsList(groupExaminationFmedicalItemsList));
            }
            return groupExaminationList;
        } else{
            return null;
        }
    }

    /**
     * @title: valueGroupExaminationFmedicalItemsList
     * @description: 私有方法:填充检查检验模板中非药品条目列表的内容
     * @author: 29-y
     * @date: 2019-06-19 13:41
     * @param: [groupExaminationFmedicalItemsList]
     * @return: java.util.List<edu.neu.hoso.model.GroupExaminationFmedicalItems>
     * @throws:
     */
    private List<GroupExaminationFmedicalItems> valueGroupExaminationFmedicalItemsList(List<GroupExaminationFmedicalItems> groupExaminationFmedicalItemsList){
        for(int currentIndex = 0 ; currentIndex < groupExaminationFmedicalItemsList.size() ; currentIndex++) {
            GroupExaminationFmedicalItems groupExaminationFmedicalItems = groupExaminationFmedicalItemsList.get(currentIndex);
            groupExaminationFmedicalItems.setGroupExaminationDrugsItemsList(groupExaminationDrugsItemsMapper.listGroupExaminationDrugsItemsByGroupExaminationFmedicalItemsId(groupExaminationFmedicalItems.getGroupExaminationFmedicalItemsId()));
            groupExaminationFmedicalItemsList.set(currentIndex,groupExaminationFmedicalItems);
        }
        return groupExaminationFmedicalItemsList;
    }


    /**
     * @title: selectGroupExaminationById
     * @description: 根据检查检验组套ID列出所有的条目
     * @author: 29-y
     * @date: 2019-06-19 14:06
     * @param: [groupExaminationId, type]
     * @return: edu.neu.hoso.model.GroupExamination
     * @throws:
     */
    @Override
    public GroupExamination selectGroupExaminationById(Integer groupExaminationId, String type) {
        GroupExamination groupExamination = groupExaminationMapper.selectGroupExaminationById(groupExaminationId,type);
        List<GroupExaminationFmedicalItems> groupExaminationFmedicalItemsList = groupExamination.getGroupExaminationFmedicalItemsList();
        groupExamination.setGroupExaminationFmedicalItemsList(valueGroupExaminationFmedicalItemsList(groupExaminationFmedicalItemsList));
        return groupExamination;
    }

    /**
     * @title: insertGroupExamination
     * @description: 插入检查检验组套
     * @author: 29-y
     * @date: 2019-06-19 14:08
     * @param: [groupExamination]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertGroupExamination(GroupExamination groupExamination) {
        groupExamination.setCreateTime(new Date());//设置创建时间
        groupExaminationMapper.insert(groupExamination);//插入组套表
        Integer groupExaminationId = groupExamination.getGroupExaminationId();//得到组套ID
        List<GroupExaminationFmedicalItems> groupExaminationFmedicalItemsList = groupExamination.getGroupExaminationFmedicalItemsList();
        //插入组套非药品条目
        for(GroupExaminationFmedicalItems groupExaminationFmedicalItems : groupExaminationFmedicalItemsList){
            groupExaminationFmedicalItems.setGroupExaminationId(groupExaminationId);
            groupExaminationFmedicalItemsMapper.insert(groupExaminationFmedicalItems);
            Integer groupExaminationFmedicalItemsId = groupExaminationFmedicalItems.getGroupExaminationFmedicalItemsId();
            //插入非药品条目中的药品条目
            List<GroupExaminationDrugsItems> groupExaminationDrugsItemsList = groupExaminationFmedicalItems.getGroupExaminationDrugsItemsList();
            for(GroupExaminationDrugsItems groupExaminationDrugsItems : groupExaminationDrugsItemsList){
                groupExaminationDrugsItems.setGroupExaminationFmedicalItemsId(groupExaminationFmedicalItemsId);
                groupExaminationDrugsItemsMapper.insert(groupExaminationDrugsItems);
            }
        }
        return groupExaminationId;
    }

    @Override
    public void deleteGroupExamination(Integer groupExaminationId) {
        groupExaminationMapper.deleteByPrimaryKey(groupExaminationId);
    }

    /**
     * @title: insertExamination
     * @description: 开立检查检验单
     * @author: 29-y
     * @date: 2019-06-19 14:20
     * @param: [examination]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer insertExamination(Examination examination) {
        //插入检查检验
        examination.setSubmitTime(new Date());
        examinationMapper.insert(examination);
        Integer examinationId = examination.getExaminationId();
        Integer medicalRecordId = examination.getMedicalRecordId();

        List<ExaminationFmedicalItems> examinationFmedicalItemsList = examination.getExaminationFmedicalItemsList();
        //插入检查检验非药品条目以及对应的收费条目
        for(ExaminationFmedicalItems examinationFmedicalItems : examinationFmedicalItemsList){
            //设置检查检验非药品条目部分属性
            examinationFmedicalItems.setActualQuantity(examinationFmedicalItems.getQuantity());//设置实际数量
            examinationFmedicalItems.setExaminationId(examinationId);
            examinationFmedicalItems.setRegistrationStatus("1");//登记状态 1未登记 2已登记
            examinationFmedicalItems.setValidStatus("1");//有效状态 1有效 2无效

            //查找检查检验非药品条目对应的药品 计算条目的价格 并插入收费条目
            FmedicalItems fmedicalItems = fmedicalItemsMapper.selectByPrimaryKey(examinationFmedicalItems.getFmedicalItemsId());
            ExpenseItems expenseItems = new ExpenseItems();
            expenseItems.setPayStatus("1");//支付状态 未支付
            expenseItems.setExpenseTypeId(fmedicalItems.getExpenseTypeId());//获取收费类型
            expenseItems.setMedicalRecordId(medicalRecordId);
            expenseItems.setTotalCost(examinationFmedicalItems.getActualQuantity()*fmedicalItems.getFmedicalItemsPrice());
            expenseItemsMapper.insert(expenseItems);

            //插入检查检验非药品条目
            examinationFmedicalItems.setExpenseItemsId(expenseItems.getExpenseItemsId());//设置收费条目的ID
            examinationFmedicalItemsMapper.insert(examinationFmedicalItems);

            Integer examinationFmedicalItemsId = examinationFmedicalItems.getExaminationFmedicalItemsId();
            //插入检查检验非药品条目中的药品条目
            List<ExaminationDrugsItems> examinationDrugsItemsList = examinationFmedicalItems.getExaminationDrugsItemsList();
            for(ExaminationDrugsItems examinationDrugsItems : examinationDrugsItemsList){
                //设置检查检验药品条目部分属性
                examinationDrugsItems.setExaminationFmedicalItemsId(examinationFmedicalItemsId);
                examinationDrugsItems.setActualQuantity(examinationDrugsItems.getQuantity());//设置实际数量
                examinationDrugsItems.setDrugsDispensingStatus("1");//发药状态

                //获取药品 计算条目的价格 并插入收费条目
                Drugs drugs = drugsMapper.selectByPrimaryKey(examinationDrugsItems.getDrugsId());
                ExpenseItems expenseItemsDrugs = new ExpenseItems();
                expenseItemsDrugs.setPayStatus("1");//支付状态 未支付
                expenseItemsDrugs.setExpenseTypeId(drugs.getDrugsTypeId()-88);//获取收费类型
                expenseItemsDrugs.setMedicalRecordId(medicalRecordId);
                expenseItemsDrugs.setTotalCost(examinationDrugsItems.getActualQuantity()*drugs.getDrugsPrice());
                expenseItemsMapper.insert(expenseItemsDrugs);

                //插入检查检验药品条目
                examinationDrugsItems.setExpenseItemsId(expenseItemsDrugs.getExpenseItemsId());
                examinationDrugsItemsMapper.insert(examinationDrugsItems);
            }
        }
        return examinationId;
    }

    /**
     * @title: ifExaminationFmedicalItemsCanCancel
     * @description: 判断检查检验非药品项目是否可以废除 1可废除 2不可废除 3已废除
     * @author: 29-y
     * @date: 2019-06-19 14:48
     * @param: [examinationFmedicalItemsId]
     * @return: java.lang.Integer
     * @throws:
     */
    @Override
    public Integer ifExaminationFmedicalItemsCanCancel(Integer examinationFmedicalItemsId) {
        ExaminationFmedicalItems examinationFmedicalItems = examinationFmedicalItemsMapper.selectByPrimaryKey(examinationFmedicalItemsId);
        if(examinationFmedicalItems.getValidStatus().equals("2")){//无效
            return 3;
        }else if(examinationFmedicalItems.getRegistrationStatus().equals("1")){//未登记
            return 1;
        }
        return 2;
    }

    /**
     * @title: cancelExaminationFmedicalItems
     * @description: 废除已开立的检查检验非药品项目
     * @author:
     * @date: 2019-06-19 14:55
     * @param: [examinationItemsId]
     * @return: void
     * @throws:
     */
    @Override
    public void cancelExaminationFmedicalItems(Integer examinationFmedicalItemsId) {
        if(ifExaminationFmedicalItemsCanCancel(examinationFmedicalItemsId)==1){//如果可以废除
            //获取检查检验非药品项目
            ExaminationFmedicalItems examinationFmedicalItems = examinationFmedicalItemsMapper.selectByPrimaryKey(examinationFmedicalItemsId);

            //获取收费条目
            ExpenseItems expenseItems = expenseItemsMapper.selectByPrimaryKey(examinationFmedicalItems.getExpenseItemsId());
            String payStatus = expenseItems.getPayStatus();//得到收费状态
            //收费状态: 1 未缴费 2 已缴费 3 退费 4 无效 5 已付费但无效
            if(payStatus.equals("1")){
                expenseItems.setPayStatus("4");
            }else if(payStatus.equals("2")){
                expenseItems.setPayStatus("5");
            }else{
                //do nothing
            }
            expenseItemsMapper.updateByPrimaryKeySelective(expenseItems);
            examinationFmedicalItems.setValidStatus("2");
            examinationFmedicalItemsMapper.updateByPrimaryKeySelective(examinationFmedicalItems);

            //获取该非药品条目对应的药品条目
            ExaminationDrugsItemsExample examinationDrugsItemsExample = new ExaminationDrugsItemsExample();
            ExaminationDrugsItemsExample.Criteria criteria = examinationDrugsItemsExample.createCriteria();
            criteria.andExaminationFmedicalItemsIdEqualTo(examinationFmedicalItemsId);
            List<ExaminationDrugsItems> examinationDrugsItemsList = examinationDrugsItemsMapper.selectByExample(examinationDrugsItemsExample);

            if(examinationDrugsItemsList!=null) {
                for (ExaminationDrugsItems examinationDrugsItems : examinationDrugsItemsList) {
                    ExpenseItems expenseItemsDrugs = expenseItemsMapper.selectByPrimaryKey(examinationDrugsItems.getExpenseItemsId());
                    String payStatusDrugs = expenseItemsDrugs.getPayStatus();//得到收费状态
                    if (payStatusDrugs.equals("1")) {//未缴费
                        expenseItemsDrugs.setPayStatus("4");
                        expenseItemsMapper.updateByPrimaryKeySelective(expenseItemsDrugs);
                    } else if (payStatusDrugs.equals("2")) {//已缴费
                        expenseItemsDrugs.setPayStatus("5");
                        expenseItemsMapper.updateByPrimaryKeySelective(expenseItemsDrugs);
                    } else if (payStatusDrugs.equals("3")) {//退费 (退费的不管了)
                        //do nothing
                    } else {
                        //do nothing
                    }
                }
            }
        }
    }

    /**
     * @title: selectExaminationResultById
     * @description: 获取检查检验结果
     * @author: 29-y
     * @date: 2019-06-19 14:55
     * @param: [examinationResultId]
     * @return: edu.neu.hoso.model.ExaminationResult
     * @throws:
     */
    @Override
    public ExaminationResult selectExaminationResultById(Integer examinationResultId) {
        ExaminationResult examinationResult = examinationResultMapper.selectByPrimaryKey(examinationResultId);
        ExaminationResultImageExample examinationResultImageExample = new ExaminationResultImageExample();
        ExaminationResultImageExample.Criteria criteria = examinationResultImageExample.createCriteria();
        criteria.andExaminationResultIdEqualTo(examinationResultId);
        examinationResult.setExaminationResultImageList(examinationResultImageMapper.selectByExample(examinationResultImageExample));
        return examinationResult;
    }

}
