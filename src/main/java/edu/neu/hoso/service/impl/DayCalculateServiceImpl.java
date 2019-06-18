package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.InvoiceExample;
import edu.neu.hoso.model.Invoice;
import edu.neu.hoso.model.InvoiceMapper;
import edu.neu.hoso.model.WorkLoadMapper;
import edu.neu.hoso.model.Workload;
import edu.neu.hoso.service.DayCalculateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class DayCalculateServiceImpl implements DayCalculateService {
    @Resource
    InvoiceMapper invoiceMapper;
    @Resource
    WorkLoadMapper workloadMapper;
    /**
     方法类型：功能方法
     参数：userID
     返回值：发票列表
     涉及表：发票
     逻辑描述 ：通过收费员的ID获取其经手的发票
     */
    public List<Invoice> FindInvoicesByUserID(Date startdate,Date enddate,int userID){
        InvoiceExample invoiceExample = new InvoiceExample();
        InvoiceExample.Criteria  invoiceExampleCriteria= invoiceExample.createCriteria();
        invoiceExampleCriteria.andUserIdEqualTo(userID);
        invoiceExampleCriteria.andPayTimeBetween(startdate,enddate);
        return invoiceMapper.selectByExample(invoiceExample);
    }
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 uerID
     返回值：日结工作量
     涉及表：所有涉及到消费的表
     逻辑描述 ：通过用户号搜索其经手的所有收费项对应费用
     */
    public List<Workload> FindWorkLoadByDateAndUserID(Date startdate, Date enddate , int userID){
        return workloadMapper.FindWorkLoadByDateAndUserID(startdate,enddate ,userID);
    }
}
