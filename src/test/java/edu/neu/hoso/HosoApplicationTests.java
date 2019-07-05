package edu.neu.hoso;

import edu.neu.hoso.model.*;
import edu.neu.hoso.service.*;
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
    CommonlyUsedService commonlyUsedService;
    @Autowired
    DoctorRegistrationService doctorRegistrationService;
    @Autowired
    InfoListService infoListService;
    @Autowired
    MedicalRecordHomePageService medicalRecordHomePageService;
    @Autowired
    MedicalRecordService medicalRecordService;
    @Autowired
    DoctorTreatmentService doctorTreatmentService;

    @Test
    public void listCommonlyUsedDrugsByUserId(){
        Integer userId=1;
        List<CommonlyUsedDrugs> commonlyUsedDrugsList = commonlyUsedService.listCommonlyUsedDrugsByUserId(userId);
        for(CommonlyUsedDrugs commonlyUsedDrugs : commonlyUsedDrugsList){
            System.out.println(commonlyUsedDrugs.toString());
        }
    }

    // 获取常用成药
    @Test
    public void listCommonlyUsedPatentDrugsByUserId(){
        commonlyUsedService.listCommonlyUsedPatentDrugsByUserId(1);
    }
    // 获取常用成药
    @Test
    public void listCommonlyUsedHerbalDrugsByUserId(){
        commonlyUsedService.listCommonlyUsedHerbalDrugsByUserId(1);
    }

    // 获取常用诊断
    @Test
    public void listCommonlyUsedDiagnosisByUserId(){
        commonlyUsedService.listCommonlyUsedDiagnosisByUserId(1);
    }
    // 获取常用检查
    @Test
    public void listCommonlyUsedExamination1ByUserId(){
        commonlyUsedService.listCommonlyUsedExamination1ByUserId(1);
    }

    // 获取常用检验
    @Test
    public void listCommonlyUsedExamination2ByUserId(){
        commonlyUsedService.listCommonlyUsedExamination2ByUserId(1);
    }

    // 获取常用处置
    @Test
    public void listCommonlyUsedTreatmentByUserId(){
        commonlyUsedService.listCommonlyUsedTreatmentByUserId(1);
    }
    //获取常用中医诊断
    @Test
    public void listCommonlyUsedChineseDiagnosisByUserId(){
        commonlyUsedService.listCommonlyUsedChineseDiagnosisByUserId(1);
    }
    //获取常用西医诊断
    @Test
    public void listCommonlyUsedWesternDiagnosisByUserId(){
        commonlyUsedService.listCommonlyUsedWesternDiagnosisByUserId(1);
    }

    @Test
    public void listRegistrationFromUserByUserId(){
        Integer userId=1;
        List<Registration> registrationList = doctorRegistrationService.listRegistrationFromUserByUserId(userId);
        for(Registration registration : registrationList){
            System.out.println(registration.toString());
        }
    }

    @Test
    public void listRegistrationFromDepartmentByUserId(){
        Integer userId=1;
        List<Registration> registrationList = doctorRegistrationService.listRegistrationFromDepartmentByUserId(userId);
        for(Registration registration : registrationList){
            System.out.println(registration.toString());
        }
    }

    @Test
    public void listTreatmentByMedicalRecordId(){
        List<Treatment> treatmentList = doctorTreatmentService.listTreatmentByMedicalRecordId(16);
        System.out.println(treatmentList.toString());
    }

    @Test
    public void listExamination1(){
        List<FmedicalItems> fmedicalItemsList =  infoListService.listExamination1();
        for(FmedicalItems fmedicalItems : fmedicalItemsList){
            System.out.println(fmedicalItems.toString());
        }
    }
    @Test
    public void listExamination2(){
        List<FmedicalItems> fmedicalItemsList =  infoListService.listExamination2();
        for(FmedicalItems fmedicalItems : fmedicalItemsList){
            System.out.println(fmedicalItems.toString());
        }
    }

    @Test
    public void selectMedicalRecordHomePageByMedicalRecordId(){
        MedicalRecordHomePage medicalRecordHomePage = medicalRecordHomePageService.selectMedicalRecordHomePageByMedicalRecordId(16);
        System.out.println(medicalRecordHomePage.toString());
    }


    @Test
    public void contextLoads() {

    }

}
