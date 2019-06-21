package edu.neu.hoso.converter;

import edu.neu.hoso.model.Workload;
import edu.neu.hoso.model.WorkloadItem;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WorkloadsConverter {
    public WorkloadItem convert(List<Workload> workloads) {
        WorkloadItem workloadItem = new WorkloadItem();


        for (Workload workload : workloads) {
            switch (workload.getExpense_Type_Name()) {
                case "挂号费":
                    workloadItem.setGHF(workload.getCosts());
                    break;
                case "诊疗费":
                    workloadItem.setZLF(workload.getCosts());
                    break;
                case "检验费":
                    workloadItem.setJYF(workload.getCosts());
                    break;
                case "检验材料费":
                    workloadItem.setJYCLF(workload.getCosts());
                    break;
                case "超声检查费":
                    workloadItem.setCSJCF(workload.getCosts());
                    break;
                case "超声材料费":
                    workloadItem.setCSCLF(workload.getCosts());
                    break;
                case "放射检查费":
                    workloadItem.setFSJCF(workload.getCosts());
                    break;
                case "放射材料费":
                    workloadItem.setFSCLF(workload.getCosts());
                    break;
                case "MRI检查费":
                    workloadItem.setMRIJCF(workload.getCosts());
                    break;
                case "MRI材料费":
                    workloadItem.setMRICLF(workload.getCosts());
                    break;
                case "CT检查费":
                    workloadItem.setCTJCF(workload.getCosts());
                    break;
                case "CT材料费":
                    workloadItem.setCTCLF(workload.getCosts());
                    break;
                case "西药费":
                    workloadItem.setXYF(workload.getCosts());
                    break;
                case "中成药费":
                    workloadItem.setZCPYF(workload.getCosts());
                    break;
                case "中草药费":
                    workloadItem.setZCYF(workload.getCosts());
                    break;
                case "处置费":
                    workloadItem.setCZF(workload.getCosts());
                    break;
                case "处置材料费":
                    workloadItem.setCZCLF(workload.getCosts());
                    break;
                case "麻醉费":
                    workloadItem.setMZF(workload.getCosts());
                    break;
                case "麻醉药费":
                    workloadItem.setMZYF(workload.getCosts());
                    break;
                case "门诊手术费":
                    workloadItem.setMZSSF(workload.getCosts());
                    break;
                default:
                    workloadItem.setQT(workload.getCosts());//其他
            }


        }
        return workloadItem;
    }
}
