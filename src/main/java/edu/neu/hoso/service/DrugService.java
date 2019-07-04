package edu.neu.hoso.service;

import edu.neu.hoso.model.ConstantItems;
import edu.neu.hoso.model.Drugs;

import java.util.List;

/**
 * @title: DrugService
 * @package edu.neu.hoso.service
 * @description: 药品类业务接口
 * @author: Mike
 * @date: 2019-06-17 11:03
 * @version: V1.0
*/
public interface DrugService {
    Integer insertSelective(Drugs drugs);
    void deleteById(Integer id);
    void deleteByCode(String code);
    void deleteByName(String name);
    void update(Drugs drugs);
    Drugs getDrugsById(Integer id);
    List<Drugs> getDrugsByCode(String code);
    List<Drugs> getDrugsByName(String name);
    List<Drugs> getDrugsByDrugsManufacturer(String drugsManufacturer);
    List<Drugs> getDrugsByMnemoniccode(String mnemoniccode);
    List<Drugs> getAllDrugs();
    List<Drugs> getAllDrugsWithTypeAndDosage();
    List<ConstantItems> getDrugsDosage();
    List<ConstantItems> getDrugsType();


}
