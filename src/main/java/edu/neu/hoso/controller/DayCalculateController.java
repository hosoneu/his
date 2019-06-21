package edu.neu.hoso.controller;

import edu.neu.hoso.converter.DateConverter;
import edu.neu.hoso.converter.WorkloadsConverter;
import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.Invoice;
import edu.neu.hoso.model.Workload;
import edu.neu.hoso.model.WorkloadItem;
import edu.neu.hoso.service.DayCalculateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("dayCalculate")
public class DayCalculateController {
    @Resource
    DayCalculateService dayCalculateService;
    @Resource
    DateConverter dateConverter;
    @Resource
    WorkloadsConverter workloadsConverter;
    @RequestMapping("/userDayCalculate")
    public ResultDTO<WorkloadItem> UserDayCalculate(String sdate, String edate, int userID) {
        Date startdate = dateConverter.convert(sdate);
        Date enddate = dateConverter.convert(edate);
        ResultDTO resultDTO = new ResultDTO<Workload>();
        WorkloadItem workloadItem = new WorkloadItem();
        workloadItem.setInvoiceNumber(dayCalculateService.FindInvoicesByUserID(startdate,enddate,userID).size());
        workloadItem =workloadsConverter.convert(dayCalculateService.FindWorkLoadByDateAndUserID(startdate, enddate, userID));
        resultDTO.setData(workloadItem);
        resultDTO.setMsg("员工日结数据请求成功");
        resultDTO.setStatus("OK");
        return resultDTO;
    }
    @RequestMapping("/findInvoices")
    public ResultDTO<Invoice> FindInvoices(String sdate, String edate, int userID) {
        Date startdate = dateConverter.convert(sdate);
        Date enddate = dateConverter.convert(edate);
        ResultDTO resultDTO = new ResultDTO<Invoice>();
        List<Invoice> invoices = dayCalculateService.FindInvoicesByUserID(startdate, enddate, userID);
        resultDTO.setData(invoices);
        resultDTO.setMsg("员工日结数据请求成功");
        resultDTO.setStatus("OK");
        return resultDTO;
    }
}
