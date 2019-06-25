package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.ExaminationDrugsItems;
import edu.neu.hoso.service.DispensingService;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("dispensing")
public class DispensingController {

    @Autowired
    DispensingService dispensingService;

    /**
     *@title: Dispensing
     *@description: 发药
     *@author: zhangjunzhi
     *@date: 2019/6/17 11:32
     *@param: [List<Integer> Medical_record_IDs, List<Integer> DrugsIds]
     *@return: ResultDTO<List<Integer>>
     *@throws:
     */
    @RequestMapping("dispensing")
    public ResultDTO<List<Integer>> Dispensing(List<Integer> Medical_record_IDs, List<Integer> DrugsIds){
//        ArrayList<Integer> Medical_record_IDs = new ArrayList<Integer>();
//        ArrayList<Integer> DrugsIds = new ArrayList<Integer>();
//        Medical_record_IDs.add(1111);
//        Medical_record_IDs.add(1111);
//        DrugsIds.add(1);
//        DrugsIds.add(12);

        ResultDTO<List<Integer>> resultDTO = new ResultDTO<List<Integer>>();
        List<Integer> results = new ArrayList<Integer>();
        try {
            for (int i=0;i<Medical_record_IDs.size();i++){
                int status = dispensingService.dispensing(Medical_record_IDs.get(i), DrugsIds.get(i));
                if (status == 1){
                    results.add(status);
                    System.out.println("complete");
                    resultDTO.setStatus("OK");
                    resultDTO.setMsg("更改成功！");
                }
                else {
                    results.add(status);
                    System.out.println(status);
                    resultDTO.setStatus("ERROR");
                    resultDTO.setMsg("更改失败！");
                }
            }
            resultDTO.setData(results);
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更改失败！");
        }
        return resultDTO;
    }

    /**
     *@title: returnDurgs
     *@description: 退药
     *@author: alan
     *@date: 2019/6/17 15:54
     *@param: [List<Object> objects]
     *@return: void
     *@throws:
     */
    @RequestMapping("returnDurgs")
    public ResultDTO returnDurgs(List<Object> objects){
//        Object object1 = new ExaminationDrugsItems();
//        ((ExaminationDrugsItems) object1).setExaminationDrugsItemsId(1);
//        ((ExaminationDrugsItems) object1).setActualQuantity(2);
//        ((ExaminationDrugsItems) object1).setQuantity(4);
//
//        Object object1 = new ExaminationDrugsItems();
//        ((ExaminationDrugsItems) object2).setExaminationDrugsItemsId(2);
//        ((ExaminationDrugsItems) object2).setActualQuantity(3);
//        ((ExaminationDrugsItems) object2).setQuantity(5);
//
//        List<Object> objects = new ArrayList<Object>();
//        objects.add(object1);
//        objects.add(object2);

        ResultDTO<List<Integer>> resultDTO = new ResultDTO();
        List<Integer> results = new ArrayList<Integer>();
        try {
            for (Object object:objects) {
                int status = dispensingService.returnDurgs(object);
                System.out.println("fail");
                if (status == -1 || status == 0) {
                    resultDTO.setStatus("ERROR");
                    resultDTO.setMsg("退药失败！");
                    System.out.println(0);
                    results.add(0);
                } else if (status == 1) {
                    resultDTO.setStatus("OK");
                    resultDTO.setMsg("退药成功！");
                    System.out.println(0);
                    results.add(1);
                } else {
                    resultDTO.setStatus("ERROR");
                    resultDTO.setMsg("系统错误");
                    results.add(0);
                }
            }
            resultDTO.setData(results);
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("退药失败！");
        }
        return resultDTO;
    }
}
