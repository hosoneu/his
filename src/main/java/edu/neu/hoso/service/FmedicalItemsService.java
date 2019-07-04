package edu.neu.hoso.service;

import edu.neu.hoso.model.FmedicalItems;

import java.util.List;

/**
 * @title: FmedicalItemsService
 * @package edu.neu.hoso.service
 * @description: 非药品项目类业务接口
 * @author: Mike
 * @date: 2019-06-17 9:41
 * @version: V1.0
*/
public interface FmedicalItemsService {
    Integer insert(FmedicalItems fmedicalItems);
    Integer insertSelective(FmedicalItems fmedicalItems);
    void deleteById(Integer id);
    void deleteByCode(String code);
    void deleteByName(String name);
    void update(FmedicalItems fmedicalItems);
    FmedicalItems getFmedicalItemsById(Integer id);
    List<FmedicalItems> getFmedicalItemsByCode(String code);
    List<FmedicalItems> getFmedicalItemsByName(String name);
    List<FmedicalItems> getFmedicalItemsByDepartmentId(Integer departmentId);
    List<FmedicalItems> getFmedicalItemsByMnemoniccode(String mnemoniccode);
    List<FmedicalItems> getAllFmedicalItems();
    List<FmedicalItems> getAllFmedicalItemsForShow();
}
