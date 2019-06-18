package edu.neu.hoso.controller;

import edu.neu.hoso.converter.DateConverter;
import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.Invoice;
import edu.neu.hoso.model.Workload;
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
    @RequestMapping("/userDayCalculate")
    public ResultDTO<Workload> UserDayCalculate(String sdate, String edate, int userID) {
        Date startdate = dateConverter.convert(sdate);
        Date enddate = dateConverter.convert(edate);
        ResultDTO resultDTO = new ResultDTO<Workload>();
        Workload invoiceNumber = new Workload("InvoiceNumber",dayCalculateService.FindInvoicesByUserID(startdate,enddate,userID).size());
        List<Workload> workloads = dayCalculateService.FindWorkLoadByDateAndUserID(startdate, enddate, userID);
        workloads.add(invoiceNumber);
        resultDTO.setData(workloads);
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
