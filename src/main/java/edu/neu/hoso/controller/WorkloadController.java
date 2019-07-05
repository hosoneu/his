package edu.neu.hoso.controller;

import edu.neu.hoso.converter.DateConverter;
import edu.neu.hoso.converter.WorkloadsConverter;
import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.Department;
import edu.neu.hoso.model.User;
import edu.neu.hoso.model.WorkLoadRequest;
import edu.neu.hoso.model.WorkloadItem;
import edu.neu.hoso.service.DepartmentService;
import edu.neu.hoso.service.PersonalWorkloadService;
import edu.neu.hoso.service.UserService;
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
@RequestMapping("workload")
public class WorkloadController {
    @Resource
    PersonalWorkloadService personalWorkloadService;
    @Resource
    DepartmentService departmentService;
    @Resource
    DateConverter dateConverter;
    @Resource
    WorkloadsConverter workloadsConverter;
    @Resource
    UserService userService;
    @RequestMapping("/findAllDepartmentWorkload")
    public ResultDTO<List<WorkloadItem>> DepartmentsWorkload(@RequestBody WorkLoadRequest workLoadRequest) {
        String sdate = workLoadRequest.getSdate();
        String edate = workLoadRequest.getEdate();
        System.out.println(sdate);
        Date startdate = dateConverter.convert(sdate);
        Date enddate = dateConverter.convert(edate);
        //1 临床 2 医技 3 财务 4 行政 5 其他
        ResultDTO resultDTO = new ResultDTO<List<WorkloadItem>>();
        List<WorkloadItem> departmentWorkloads = new ArrayList<WorkloadItem>();
        for (Department department : departmentService.getAllDepartment()){
            WorkLoadRequest workLoadRequesttemp =new WorkLoadRequest();
            workLoadRequesttemp.setSdate(sdate);
            workLoadRequesttemp.setEdate(edate);
            workLoadRequesttemp.setDepartmentID(department.getDepartmentId());
            WorkloadItem tempWorkloadlist = DepartmentWorkload(workLoadRequesttemp).getData();
            departmentWorkloads.add(tempWorkloadlist);
        }
        resultDTO.setStatus("OK");
        resultDTO.setData(departmentWorkloads);
        resultDTO.setMsg("所有科室数据请求成功");
        return resultDTO;
    }
    @RequestMapping("/findAllDoctorsWorkload")
    public ResultDTO<List<WorkloadItem>> DoctorsWorkload(@RequestBody WorkLoadRequest workLoadRequest) {
        String sdate = workLoadRequest.getSdate();
        String edate = workLoadRequest.getEdate();
        int departmentID = workLoadRequest.getDepartmentID();
        Date startdate = dateConverter.convert(sdate);
        Date enddate = dateConverter.convert(edate);
        //1 临床 2 医技 3 财务 4 行政 5 其他
        ResultDTO resultDTO = new ResultDTO<List<WorkloadItem>>();
        List<WorkloadItem> doctorWorkloads = new ArrayList<WorkloadItem>();
        for (User doctor: userService.getUserByDepartmentID(departmentID)){
            WorkLoadRequest workLoadRequesttemp =new WorkLoadRequest();
            workLoadRequesttemp.setSdate(sdate);
            workLoadRequesttemp.setEdate(edate);
            workLoadRequesttemp.setDoctorID(doctor.getUserId());
            WorkloadItem tempWorkloadlist = PersonalWorkload(workLoadRequesttemp).getData();
            doctorWorkloads.add(tempWorkloadlist);
        }
        resultDTO.setStatus("OK");
        resultDTO.setData(doctorWorkloads);
        resultDTO.setMsg("科室所有医生数据请求成功");
        return resultDTO;
    }
    @RequestMapping("/departmentWorkload")
    public ResultDTO<WorkloadItem> DepartmentWorkload(@RequestBody WorkLoadRequest workLoadRequest) {
        String sdate = workLoadRequest.getSdate();
        String edate = workLoadRequest.getEdate();
        int departmentID = workLoadRequest.getDepartmentID();
        Date startdate = dateConverter.convert(sdate);
        Date enddate = dateConverter.convert(edate);
        //1 临床 2 医技 3 财务 4 行政 5 其他
        ResultDTO resultDTO = new ResultDTO<WorkloadItem>();
        WorkloadItem workloadItem = new WorkloadItem();
        switch (personalWorkloadService.FindDepartmentTypeByDeportmentID(departmentID)) {
        case "1":
            workloadItem =workloadsConverter.convert(personalWorkloadService.FindWorkloadByDateAndDoctordepartmentID(startdate, enddate, departmentID));
            workloadItem.setItemID(departmentID);
            workloadItem.setItemname(departmentService.getDepartmentById(departmentID).getDepartmentName());
            workloadItem.setPaitents(personalWorkloadService.FindPatientsByDateAnddepartmentID(startdate,enddate,departmentID));
            workloadItem.setGHF(personalWorkloadService.FindSumRegistrationCostsByDateAnddepartmentID(startdate, enddate, departmentID));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("门诊科室工作查询成功");
            resultDTO.setData(workloadItem);
            break;
        case"2":
            workloadItem =workloadsConverter.convert(personalWorkloadService.FindWorkloadByDateAndTechdepartmentID(startdate, enddate, departmentID));
            workloadItem.setItemID(departmentID);
            workloadItem.setItemname(departmentService.getDepartmentById(departmentID).getDepartmentName());
            workloadItem.setPaitents(personalWorkloadService.FindPaitentsByDateAndTechdepartmentID(startdate,enddate,departmentID));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("医技科室工作查询成功");
            resultDTO.setData(workloadItem);
            break;
        default:
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("科室工作查询失败");
            break;
        }

    return resultDTO ;
    }
    @RequestMapping("/personalWorkload")
    public ResultDTO<WorkloadItem> PersonalWorkload(@RequestBody WorkLoadRequest workLoadRequest) {
        String sdate = workLoadRequest.getSdate();
        String edate = workLoadRequest.getEdate();
        int doctorID = workLoadRequest.getDoctorID();
        //1 临床 2 医技 3 财务 4 行政 5 其他
        Date startdate = dateConverter.convert(sdate);
        Date enddate = dateConverter.convert(edate);
        ResultDTO resultDTO = new ResultDTO<WorkloadItem>();
        WorkloadItem workloadItem = new WorkloadItem();
        switch (personalWorkloadService.FindDepartmentTypeByDoctorID(doctorID)) {
            case "1":
                workloadItem =workloadsConverter.convert(personalWorkloadService.FindWorkloadByDateAndDoctorID(startdate, enddate, doctorID));
                workloadItem.setItemID(doctorID);
                workloadItem.setItemname(userService.getUserById(doctorID).getUserName());
                workloadItem.setPaitents(personalWorkloadService.FindPatientsByDateAndDoctorID(startdate,enddate,doctorID));
                workloadItem.setGHF(personalWorkloadService.FindSumRegistrationCostsByDateAndDoctorID(startdate, enddate, doctorID));
                resultDTO.setStatus("OK");
                resultDTO.setMsg("门诊医生工作查询成功");
                resultDTO.setData(workloadItem);
                break;
            case"2":
                workloadItem =workloadsConverter.convert(personalWorkloadService.FindWorkloadByDateAndTechID(startdate, enddate, doctorID));
                workloadItem.setItemID(doctorID);
                workloadItem.setItemname(userService.getUserById(doctorID).getUserName());
                workloadItem.setPaitents(personalWorkloadService.FindPaitentsByDateAndTechID(startdate,enddate,doctorID));
                resultDTO.setStatus("OK");
                resultDTO.setMsg("医技医生工作查询成功");
                resultDTO.setData(workloadItem);
                break;
            default:
                resultDTO.setStatus("ERROR");
                resultDTO.setMsg("个人工作查询失败");
        }

        return resultDTO ;
    }


}
