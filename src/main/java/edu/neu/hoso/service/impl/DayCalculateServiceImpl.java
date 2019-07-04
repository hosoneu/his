package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.DayCalExample;
import edu.neu.hoso.example.InvoiceExample;
import edu.neu.hoso.example.UserExample;
import edu.neu.hoso.model.*;
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
    @Resource
    UserMapper userMapper;
    @Resource
    DayCalMapper dayCalMapper;
    /**
     方法类型：功能方法
     参数：userID
     返回值：发票列表
     涉及表：发票
     逻辑描述 ：通过收费员的ID获取其经手的已经日结的发票
     */
    public List<Invoice> FindCalInvoicesByUserID(Date startdate,Date enddate,int userID){
        InvoiceExample invoiceExample = new InvoiceExample();
        InvoiceExample.Criteria  invoiceExampleCriteria= invoiceExample.createCriteria();
        invoiceExampleCriteria.andUserIdEqualTo(userID);
        invoiceExampleCriteria.andIsDayCalEqualTo("2");
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
    public List<Workload> FindWorkLoadByDateAndUserID(Date startdate, Date enddate ,int userID){
        return workloadMapper.FindWorkLoadByDateAndUserID(startdate,enddate ,userID);
    }

    @Override
    public List<Workload> FindWorkLoadByInvoices(List<Integer> invoiceIDs) {
        return workloadMapper.FindWorkLoadByInvoices(invoiceIDs);
    }


    @Override
    public List<User> FindNotCalUsers() {
        UserExample userExample = new UserExample();
        UserExample.Criteria userExampleCriteria= userExample.createCriteria();
        userExampleCriteria.andUserIdIn(invoiceMapper.FindNotCalUsers());
        System.out.println(invoiceMapper.FindNotCalUsers());
        return userMapper.selectByExample(userExample);
    }

    //得到该员工所有未日结的发票
    @Override
    public List<Invoice> FindNotCalInvoicesByUserID(int userID) {
        InvoiceExample invoiceExample = new InvoiceExample();
        InvoiceExample.Criteria  invoiceExampleCriteria= invoiceExample.createCriteria();
        invoiceExampleCriteria.andUserIdEqualTo(userID);
        invoiceExampleCriteria.andIsDayCalEqualTo("1");
        return invoiceMapper.selectByExample(invoiceExample);
    }

    @Override
    public List<DayCal> UserDayCalculateHistory(Date sdate, Date edate, int userID) {
        DayCalExample dayCalExample = new DayCalExample();
        DayCalExample.Criteria dayCalExampleCriteria= dayCalExample.createCriteria();
        dayCalExampleCriteria.andDayCalDateBetween(sdate,edate);
        dayCalExampleCriteria.andUserIdEqualTo(userID);
        return dayCalMapper.selectByExample(dayCalExample);
    }

    @Override
    public List<DayCal> AllUserDayCalculateHistory(Date startdate, Date enddate) {
        DayCalExample dayCalExample = new DayCalExample();
        DayCalExample.Criteria dayCalExampleCriteria= dayCalExample.createCriteria();
        dayCalExampleCriteria.andDayCalDateBetween(startdate,enddate);
        return dayCalMapper.selectByExample(dayCalExample);
    }

    @Override
    public void UpdateInvoice(List<Integer> invoiceIDs) {
        InvoiceExample invoiceExample = new InvoiceExample();
        InvoiceExample.Criteria invoiceExampleCriteria= invoiceExample.createCriteria();
        invoiceExampleCriteria.andInvoiceIdIn(invoiceIDs);
        Invoice invoice =new Invoice();
        invoice.setIsDayCal("2");
        invoiceMapper.updateByExampleSelective(invoice,invoiceExample);
    }

    @Override
    public void InsertNewDayCal(DayCal dayCal) {
        dayCalMapper.insert(dayCal);
    }

    @Override
    public List<User> FindHistoryCalUsers() {
        UserExample userExample = new UserExample();
        UserExample.Criteria userExampleCriteria= userExample.createCriteria();
        userExampleCriteria.andUserIdIn(dayCalMapper.FindHistoryDalUserID());
        //System.out.println(invoiceMapper.FindNotCalUsers());
        return userMapper.selectByExample(userExample);
    }
}
