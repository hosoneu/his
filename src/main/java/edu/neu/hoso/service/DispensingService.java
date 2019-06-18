package edu.neu.hoso.service;

/**
 * @title: DispensingService
 * @package edu.neu.hoso.service
 * @description:用于提供门诊发药退药服务
 * @author: alan
 * @date: 2019/6/17 11:13
 * @version: V1.0
 */
public interface DispensingService {

    //更改发药状态
    int dispensing(int Medical_record_ID, int DrugsId);

    //退药
    int returnDurgs(Object object);
}
