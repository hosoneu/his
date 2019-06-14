package edu.neu.hoso.service;

import edu.neu.hoso.model.CalculationType;

import java.util.List;

/**
 * @title: CalculationTypeService
 * @package edu.neu.hoso.service
 * @description: 结算类别类业务接口
 * @author: Mike
 * @date: 2019-06-11 14:37
 * @version: V1.0
*/
public interface CalculationTypeService {
    Integer insert(CalculationType calculationType);
    void deleteById(Integer id);
    void deleteByName(String name);
    void update(CalculationType calculationType);
    CalculationType getCalculationTypeById(Integer id);
    List<CalculationType> getCalculationTypeByName(String name);
    List<CalculationType> getAllCalculationType();
}
