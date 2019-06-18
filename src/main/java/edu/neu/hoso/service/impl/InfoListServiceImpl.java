package edu.neu.hoso.service.impl;

import edu.neu.hoso.example.DiseaseExample;
import edu.neu.hoso.example.DrugsExample;
import edu.neu.hoso.example.FmedicalItemsExample;
import edu.neu.hoso.model.*;
import edu.neu.hoso.service.InfoListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: InfoListServiceImpl
 * @package edu.neu.hoso.service.impl
 * @description: 医生常用项：获取疾病列表、药品列表、非药品列表
 * @author: 29-y
 * @date: 2019-06-17 16:57
 * @version: V1.0
*/
@Service
public class InfoListServiceImpl implements InfoListService {

    @Resource
    DrugsMapper drugsMapper;
    @Resource
    FmedicalItemsMapper fmedicalItemsMapper;
    @Resource
    DiseaseMapper diseaseMapper;

    /**
     * @title: listPatentDrugs
     * @description: 展示所有的成药
     * @author: 29-y
     * @date: 2019-06-17 17:00
     * @param: []
     * @return: java.util.List<edu.neu.hoso.model.Drugs>
     * @throws:
     */
    @Override
    public List<Drugs> listPatentDrugs() {
        DrugsExample drugsExample = new DrugsExample();
        DrugsExample.Criteria criteria = drugsExample.createCriteria();
        criteria.andDrugsTypeIdNotEqualTo(103);//不是101西药 102中成药 103草药
        return drugsMapper.selectByExample(drugsExample);
    }

    /**
     * @title: listHerbalDrugs
     * @description: 展示所有的草药
     * @author: 29-y
     * @date: 2019-06-17 17:01
     * @param: []
     * @return: java.util.List<edu.neu.hoso.model.Drugs>
     * @throws:
     */
    @Override
    public List<Drugs> listHerbalDrugs() {
        DrugsExample drugsExample = new DrugsExample();
        DrugsExample.Criteria criteria = drugsExample.createCriteria();
        criteria.andDrugsTypeIdEqualTo(103);//不是101西药 102中成药 103草药
        return drugsMapper.selectByExample(drugsExample);
    }

    /**
     * @title: listExamination1
     * @description: 展示所有的检查
     * @author: 29-y
     * @date: 2019-06-17 17:02
     * @param: []
     * @return: java.util.List<edu.neu.hoso.model.FmedicalItems>
     * @throws:
     */
    @Override
    public List<FmedicalItems> listExamination1() {

        FmedicalItemsExample fmedicalItemsExample = new FmedicalItemsExample();
        FmedicalItemsExample.Criteria criteria = fmedicalItemsExample.createCriteria();
        criteria.andFmedicalItemsTypeEqualTo("1");//如果是检查
        return fmedicalItemsMapper.selectByExample(fmedicalItemsExample);
    }

    /**
     * @title: listExamination2
     * @description: 展示所有的检验
     * @author: 29-y
     * @date: 2019-06-17 17:03
     * @param: []
     * @return: java.util.List<edu.neu.hoso.model.FmedicalItems>
     * @throws:
     */
    @Override
    public List<FmedicalItems> listExamination2() {
        FmedicalItemsExample fmedicalItemsExample = new FmedicalItemsExample();
        FmedicalItemsExample.Criteria criteria = fmedicalItemsExample.createCriteria();
        criteria.andFmedicalItemsTypeEqualTo("2");//如果是检验
        return fmedicalItemsMapper.selectByExample(fmedicalItemsExample);
    }

    /**
     * @title: listTreatment
     * @description: 展示所有的处置
     * @author: 29-y
     * @date: 2019-06-17 17:03
     * @param: []
     * @return: java.util.List<edu.neu.hoso.model.FmedicalItems>
     * @throws:
     */
    @Override
    public List<FmedicalItems> listTreatment() {
        FmedicalItemsExample fmedicalItemsExample = new FmedicalItemsExample();
        FmedicalItemsExample.Criteria criteria = fmedicalItemsExample.createCriteria();
        criteria.andFmedicalItemsTypeEqualTo("3");//如果是处置
        return fmedicalItemsMapper.selectByExample(fmedicalItemsExample);
    }

    /**
     * @title: listChineseDisease
     * @description: 展示所有的中医疾病
     * @author: 29-y
     * @date: 2019-06-17 17:03
     * @param: []
     * @return: java.util.List<edu.neu.hoso.model.Disease>
     * @throws:
     */
    @Override
    public List<Disease> listChineseDisease() {
        DiseaseExample diseaseExample = new DiseaseExample();
        DiseaseExample.Criteria criteria = diseaseExample.createCriteria();
        criteria.andDiseaseTypeIdEqualTo(472);//472为中医疾病
        return diseaseMapper.selectByExample(diseaseExample);
    }

    /**
     * @title: listWesternDisease
     * @description: 展示所有的西医疾病
     * @author: 29-y
     * @date: 2019-06-17 17:04
     * @param: []
     * @return: java.util.List<edu.neu.hoso.model.Disease>
     * @throws:
     */
    @Override
    public List<Disease> listWesternDisease() {
        DiseaseExample diseaseExample = new DiseaseExample();
        DiseaseExample.Criteria criteria = diseaseExample.createCriteria();
        criteria.andDiseaseTypeIdNotEqualTo(472);//472为中医疾病
        return diseaseMapper.selectByExample(diseaseExample);
    }
}
