package edu.neu.hoso.service;

import edu.neu.hoso.model.Disease;
import edu.neu.hoso.model.Drugs;
import edu.neu.hoso.model.FmedicalItems;

import java.util.List;

public interface InfoListService {
    //展示所有的成药
    List<Drugs> listPatentDrugs();
    //展示所有的草药
    List<Drugs> listHerbalDrugs();
    //展示所有的检查
    List<FmedicalItems> listExamination1();
    //展示所有的检验
    List<FmedicalItems> listExamination2();
    //展示所有的处置
    List<FmedicalItems> listTreatment();
    //展示所有的中医疾病
    List<Disease> listChineseDisease();
    //展示所有的西医疾病
    List<Disease> listWesternDisease();
}
