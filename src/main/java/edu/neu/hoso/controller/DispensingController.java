package edu.neu.hoso.controller;

import edu.neu.hoso.dto.ResultDTO;
import edu.neu.hoso.model.ExaminationDrugsItems;
import edu.neu.hoso.service.DispensingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
@Controller
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
     *@return: void
     *@throws:
     */
    @RequestMapping("dispensing")
    public ResultDTO Dispensing(ArrayList<Integer> Medical_record_IDs, ArrayList<Integer> DrugsIds){
//        ArrayList<Integer> Medical_record_IDs = new ArrayList<Integer>();
//        ArrayList<Integer> DrugsIds = new ArrayList<Integer>();
//        Medical_record_IDs.add(1111);
//        Medical_record_IDs.add(1111);
//        DrugsIds.add(1);
//        DrugsIds.add(10);

        ResultDTO resultDTO = new ResultDTO();
        try {
            for (int i=0;i<Medical_record_IDs.size();i++){
                int status = dispensingService.dispensing(Medical_record_IDs.get(i), DrugsIds.get(i));
                if (status == 1){
                    System.out.println("complete");
                }
            }
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更改成功！");
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
     *@author: zhangjunzhi
     *@date: 2019/6/17 15:54
     *@param: [object]
     *@return: void
     *@throws:
     */
    @RequestMapping("returnDurgs")
    public ResultDTO returnDurgs(Object object){

//        Object object = new ExaminationDrugsItems();
//        ((ExaminationDrugsItems) object).setExaminationDrugsItemsId(1);
//        ((ExaminationDrugsItems) object).setActualQuantity(2);
//        ((ExaminationDrugsItems) object).setActualQuantity(3);
//        ((ExaminationDrugsItems) object).setQuantity(4);

        ResultDTO resultDTO = new ResultDTO();
        try {
            int status = dispensingService.returnDurgs(object);
            if (status == -1 || status == 0){
                resultDTO.setStatus("ERROR");
                resultDTO.setMsg("退药失败！");
            }
            else if (status == 1){
                resultDTO.setStatus("OK");
                resultDTO.setMsg("删除成功！");
            }
            else {
                resultDTO.setStatus("ERROR");
                resultDTO.setMsg("系统错误");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("退药失败！");
        }
        return resultDTO;
    }
}
