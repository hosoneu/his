package edu.neu.hoso;

import edu.neu.hoso.model.*;
import edu.neu.hoso.service.DepartmentService;
import edu.neu.hoso.service.TechService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HosoApplicationTests {

    @Autowired
    TechService techService;

    @Autowired
    DepartmentService departmentService;

    @Test
    public void getAllPatientByDepartmentIdTest() {
        int departmentId=128;
        List<Registration> registrationList = techService.getAllPatientByDepartmentId(departmentId);
        for (Registration registration:registrationList){
            System.out.println(registration.toString());
        }
    }

    @Test
    public void getCommonUsedDrugsTest(){
        int doctorId = 6;
        List<CommonlyUsedDrugs> commonlyUsedDrugsList = techService.getCommonUsedDrugs(doctorId);
        for (CommonlyUsedDrugs commonlyUsedDrugs:commonlyUsedDrugsList){
            System.out.println(commonlyUsedDrugs.toString());
        }
    }

    @Test
    public void getAllDrugsTest(){
        List<Drugs> drugsList = techService.getAllDrugs();
        for (Drugs drugs:drugsList){
            System.out.println(drugs.toString());
        }
    }

    @Test
    public void getAllFmedicalByMedicalIDTest(){
        List<FmedicalItems> fmedicalItemsList = techService.getAllFmedicalByMedicalID(14, 128);
        for (FmedicalItems fmedicalItems:fmedicalItemsList){
            System.out.println(fmedicalItems.toString());
        }
    }

    @Test
    public void getDepartmentByCodeTest(){
        List<Department> departmentList = departmentService.getDepartmentByCode("1");
        for (Department department:departmentList){
            System.out.println(department.toString());
        }
    }
}
