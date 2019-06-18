package edu.neu.hoso.controller;

import edu.neu.hoso.converter.DateConverter;
import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.Workload;
import edu.neu.hoso.service.PersonalWorkloadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("workload")
public class WorkloadController {
    @Resource
    PersonalWorkloadService personalWorkloadService;
    @Resource
    DateConverter dateConverter;
    @RequestMapping("/departmentWorkload")
    public ResultDTO<Workload> DepartmentWorkload(String sdate, String edate, int departmentID) {
        Date startdate = dateConverter.convert(sdate);
        Date enddate = dateConverter.convert(edate);
        //1 临床 2 医技 3 财务 4 行政 5 其他
        ResultDTO resultDTO = new ResultDTO<Workload>();
        switch (personalWorkloadService.FindDepartmentTypeByDeportmentID(departmentID)) {
        case "1":
            Workload paitents = new Workload("PaitentsNumber",personalWorkloadService.FindPatientsByDateAnddepartmentID(startdate,enddate,departmentID));
            Workload registrationCosts = new Workload("RegistrationCosts",personalWorkloadService.FindSumRegistrationCostsByDateAnddepartmentID(startdate, enddate, departmentID));
            List<Workload> workloads = personalWorkloadService.FindWorkloadByDateAndDoctordepartmentID(startdate, enddate, departmentID);
            workloads.add(paitents);
            workloads.add(registrationCosts);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("门诊科室工作查询成功");
            resultDTO.setData(workloads);
            break;
        case"2":
            paitents = new Workload("PaitentsNumber",personalWorkloadService.FindPaitentsByDateAndTechdepartmentID(startdate,enddate,departmentID));
            workloads = personalWorkloadService.FindWorkloadByDateAndTechdepartmentID(startdate, enddate, departmentID);
            workloads.add(paitents);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("医技科室工作查询成功");
            resultDTO.setData(workloads);
            break;
        default:
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("科室工作查询失败");
            break;
        }

    return resultDTO ;
    }
    @RequestMapping("/personalWorkload")
    public ResultDTO<Workload> PersonalWorkload(String sdate, String edate, int doctorID) {
        //1 临床 2 医技 3 财务 4 行政 5 其他
        Date startdate = dateConverter.convert(sdate);
        Date enddate = dateConverter.convert(edate);
        ResultDTO resultDTO = new ResultDTO<Workload>();
        switch (personalWorkloadService.FindDepartmentTypeByDoctorID(doctorID)) {
            case "1":
                Workload paitents = new Workload("PaitentsNumber",personalWorkloadService.FindPatientsByDateAndDoctorID(startdate,enddate,doctorID));
                Workload registrationCosts = new Workload("RegistrationCosts",personalWorkloadService.FindSumRegistrationCostsByDateAndDoctorID(startdate, enddate, doctorID));
                List<Workload> workloads = personalWorkloadService.FindWorkloadByDateAndDoctorID(startdate, enddate, doctorID);
                workloads.add(paitents);
                workloads.add(registrationCosts);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("门诊医生工作查询成功");
                resultDTO.setData(workloads);
                break;
            case"2":
                paitents = new Workload("PaitentsNumber",personalWorkloadService.FindPaitentsByDateAndTechID(startdate,enddate,doctorID));
                workloads = personalWorkloadService.FindWorkloadByDateAndTechID(startdate, enddate, doctorID);
                workloads.add(paitents);
                resultDTO.setStatus("OK");
                resultDTO.setMsg("医技医生工作查询成功");
                resultDTO.setData(workloads);
                break;
            default:
                resultDTO.setStatus("ERROR");
                resultDTO.setMsg("个人工作查询失败");
        }

        return resultDTO ;
    }


}
