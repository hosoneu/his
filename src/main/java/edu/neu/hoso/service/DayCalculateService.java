package edu.neu.hoso.service;

import edu.neu.hoso.model.DayCal;
import edu.neu.hoso.model.Invoice;
import edu.neu.hoso.model.User;
import edu.neu.hoso.model.Workload;

import java.util.Date;
import java.util.List;


public interface DayCalculateService {
    /**
     方法类型：功能方法
     参数：userID
     返回值：发票列表
     涉及表：发票
     逻辑描述 ：通过收费员的ID获取其经手的发票
     */
    List<Invoice> FindCalInvoicesByUserID(Date startdate,Date enddate,int userID);
    /**
     方法类型：功能方法
     参数：开始时间 结束时间 uerID
     返回值：日结工作量
     涉及表：所有涉及到消费的表
     逻辑描述 ：通过用户号搜索其经手的所有收费项对应费用
     */
    List<Workload> FindWorkLoadByDateAndUserID(Date startdate, Date enddate ,int userID);
    List<Workload> FindWorkLoadByInvoices(List<Integer>invoiceIDs);
    List<User> FindNotCalUsers();
    List<Invoice> FindNotCalInvoicesByUserID(int userID);
    List<DayCal> UserDayCalculateHistory(Date sdate, Date edate,int userID);
    List<DayCal> AllUserDayCalculateHistory(Date startdate, Date enddate);
    void UpdateInvoice(List<Integer> invoiceIDs);
    void InsertNewDayCal(DayCal dayCal);
    List<User> FindHistoryCalUsers();
}
