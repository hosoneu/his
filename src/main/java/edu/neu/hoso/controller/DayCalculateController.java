package edu.neu.hoso.controller;

import edu.neu.hoso.converter.DateConverter;
import edu.neu.hoso.converter.WorkloadsConverter;
import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.DayCalculateService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("dayCalculate")
public class DayCalculateController {
    @Resource
    DayCalculateService dayCalculateService;
    @Resource
    DateConverter dateConverter;
    @Resource
    WorkloadsConverter workloadsConverter;
    @RequestMapping("/personalDayCalculate")
    public ResultDTO PersonalDayCalculate(@RequestBody WorkLoadRequest workLoadRequest) {//根据选择的要日结的发票号，查询并计算各个要显示的费用条目明细
        int userID=workLoadRequest.getUserID();
        String date=workLoadRequest.getDate();
        Double drugCost=workLoadRequest.getDrugCost();
        Double registrateCost=workLoadRequest.getRegistrateCost();
        Double materialCost=workLoadRequest.getMaterialCost();
        Double examinateCost=workLoadRequest.getExaminateCost();
        Double treatCost=workLoadRequest.getTreatCost();
        Double qtCost =workLoadRequest.getQtCost();
        Double totalCost=workLoadRequest.getTotalCost();
        int[] invoiceIDs=workLoadRequest.getInvoiceIDs();
        ResultDTO resultDTO = new ResultDTO();
        DayCal dayCal= new DayCal();
        dayCal.setClTotal(materialCost);
        dayCal.setCzTotal(treatCost);
        dayCal.setDayCalDate(dateConverter.convert(date));
        dayCal.setDayCalTotal(totalCost);
        dayCal.setGhTotal(registrateCost);
        dayCal.setJcTotal(examinateCost);
        dayCal.setYfTotal(drugCost);
        dayCal.setUserId(userID);
        dayCal.setQtTotal(qtCost);
        List<Integer> invoices = new ArrayList<>();
        for (int i :invoiceIDs){
            invoices.add(i);
        }
        dayCalculateService.InsertNewDayCal(dayCal);
        dayCalculateService.UpdateInvoice(invoices);
        resultDTO.setMsg("日结成功");
        resultDTO.setStatus("OK");
        return resultDTO;
    }
    @RequestMapping("/allUserDayCalculateHistory")
    public ResultDTO AllUserDayCalculateHistory(@RequestBody WorkLoadRequest workLoadRequest) {
        String sdate = workLoadRequest.getSdate();
        String edate = workLoadRequest.getEdate();
        ResultDTO resultDTO = new ResultDTO();
        Date startdate = dateConverter.convert(sdate);
        Date enddate = dateConverter.convert(edate);
        //找到时间区间内所有该用户经手的
        resultDTO.setData(dayCalculateService.AllUserDayCalculateHistory(startdate,enddate));
        resultDTO.setMsg("所有员工日结历史数据请求成功");
        resultDTO.setStatus("OK");
        return resultDTO;
    }
    @RequestMapping("/userDayCalculateHistory")
    public ResultDTO UserDayCalculateHistory(@RequestBody WorkLoadRequest workLoadRequest) {
        String sdate = workLoadRequest.getSdate();
        String edate = workLoadRequest.getEdate();
        int userID = workLoadRequest.getUserID();
        ResultDTO resultDTO = new ResultDTO();
        Date startdate = dateConverter.convert(sdate);
        Date enddate = dateConverter.convert(edate);
        //找到时间区间内所有该用户经手的
        resultDTO.setData(dayCalculateService.UserDayCalculateHistory(startdate,enddate,userID));
        resultDTO.setMsg("员工日结历史数据请求成功");
        resultDTO.setStatus("OK");
        return resultDTO;
    }
    @RequestMapping("/userDayCalculate")
    public ResultDTO UserDayCalculate(@RequestBody WorkLoadRequest workLoadRequest) {//根据选择的要日结的发票号，查询并计算各个要显示的费用条目明细
        int[] invoiceIDs =workLoadRequest.getInvoiceIDs();
        ResultDTO resultDTO = new ResultDTO();
        System.out.println(invoiceIDs);
        WorkloadItem workloadItem = new WorkloadItem();
        workloadItem.setInvoiceNumber(invoiceIDs.length);
        List<Integer> invoices = new ArrayList<>();
        for (int i :invoiceIDs){
            invoices.add(i);
        }
        System.out.println(invoiceIDs);
        workloadItem =workloadsConverter.convert(dayCalculateService.FindWorkLoadByInvoices(invoices));
        resultDTO.setData(workloadItem);
        resultDTO.setMsg("员工日结数据请求成功");
        resultDTO.setStatus("OK");
        return resultDTO;
    }
    //找未日结的发票
    @RequestMapping("/findInvoices")
    public ResultDTO FindNotCalInvoices(@RequestBody WorkLoadRequest workLoadRequest) {
        int userID = workLoadRequest.getUserID();
        System.out.println("员工号");
        System.out.println(userID);
        ResultDTO resultDTO = new ResultDTO();
        List<Invoice> invoices = dayCalculateService.FindNotCalInvoicesByUserID(userID);
        resultDTO.setData(invoices);
        resultDTO.setMsg("员工日结数据请求成功");
        resultDTO.setStatus("OK");
        return resultDTO;
    }
    //找有未日结的发票的人
    @RequestMapping("/findNotCalUsers")
    public ResultDTO FindNotCalUsers() {
        ResultDTO resultDTO = new ResultDTO();
        List<User> users = dayCalculateService.FindNotCalUsers();
        System.out.println(users);
        resultDTO.setData(users);
        resultDTO.setMsg("未日结员工数据请求成功");
        resultDTO.setStatus("OK");
        return resultDTO;
    }
    @RequestMapping("/findHistoryCalUsers")
    public ResultDTO FindHistoryCalUsers() {
        ResultDTO resultDTO = new ResultDTO();
        List<User> users = dayCalculateService.FindHistoryCalUsers();
        System.out.println(users);
        resultDTO.setData(users);
        resultDTO.setMsg("未日结员工数据请求成功");
        resultDTO.setStatus("OK");
        return resultDTO;
    }
}
