package edu.neu.hoso.model;

import edu.neu.hoso.example.CommonlyUsedDrugsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.RequestMapping;

public interface CommonlyUsedDrugsMapper {
    int countByExample(CommonlyUsedDrugsExample example);

    int deleteByExample(CommonlyUsedDrugsExample example);

    @Delete({
        "delete from commonly_used_drugs",
        "where Commonly_Used_Drugs = #{commonlyUsedDrugs,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer commonlyUsedDrugs);

    @Insert({
        "insert into commonly_used_drugs (Commonly_Used_Drugs, Doctor_ID, ",
        "Drugs_ID)",
        "values (#{commonlyUsedDrugs,jdbcType=INTEGER}, #{doctorId,jdbcType=INTEGER}, ",
        "#{drugsId,jdbcType=INTEGER})"
    })
    int insert(CommonlyUsedDrugs record);

    int insertSelective(CommonlyUsedDrugs record);

    List<CommonlyUsedDrugs> selectByExample(CommonlyUsedDrugsExample example);

    @Select({
        "select",
        "Commonly_Used_Drugs, Doctor_ID, Drugs_ID",
        "from commonly_used_drugs",
        "where Commonly_Used_Drugs = #{commonlyUsedDrugs,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    CommonlyUsedDrugs selectByPrimaryKey(Integer commonlyUsedDrugs);

    int updateByExampleSelective(@Param("record") CommonlyUsedDrugs record, @Param("example") CommonlyUsedDrugsExample example);

    int updateByExample(@Param("record") CommonlyUsedDrugs record, @Param("example") CommonlyUsedDrugsExample example);

    int updateByPrimaryKeySelective(CommonlyUsedDrugs record);

    @Update({
        "update commonly_used_drugs",
        "set Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Drugs_ID = #{drugsId,jdbcType=INTEGER}",
        "where Commonly_Used_Drugs = #{commonlyUsedDrugs,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CommonlyUsedDrugs record);

    /**
     * @title: listCommonlyUsedDrugsByUserId
     * @description: 列出常用药品
     * @author:
     * @date: 2019-06-26 18:26
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.CommonlyUsedDrugs>
     * @throws:
     */
    @Select({
        "select d.*,c.* ",
        "from drugs d join commonly_used_drugs c on d.Drugs_ID=c.Drugs_ID",
        "where c.Doctor_ID = #{userId , jdbcType=INTEGER}"
    })
    @ResultMap("SecondResultMap")
    List<CommonlyUsedDrugs> listCommonlyUsedDrugsByUserId(Integer userId);

    /**
     * @title: listCommonlyUsedPatentDrugsByUserId
     * @description: 列出常用成药药品
     * @author:
     * @date: 2019-06-26 18:26
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.CommonlyUsedDrugs>
     * @throws:
     */
    @Select({
            "select d.*,c.* ",
            "from drugs d join commonly_used_drugs c on d.Drugs_ID=c.Drugs_ID",
            "where c.Doctor_ID = #{userId , jdbcType=INTEGER} and d.Drugs_Type_ID!=103"
    })
    @ResultMap("SecondResultMap")
    List<CommonlyUsedDrugs> listCommonlyUsedPatentDrugsByUserId(Integer userId);

    /**
     * @title: listCommonlyUsedHerbalDrugsByUserId
     * @description: 列出常用草药药品
     * @author:
     * @date: 2019-06-26 18:26
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.CommonlyUsedDrugs>
     * @throws:
     */
    @Select({
            "select d.*,c.* ",
            "from drugs d join commonly_used_drugs c on d.Drugs_ID=c.Drugs_ID",
            "where c.Doctor_ID = #{userId , jdbcType=INTEGER} and d.Drugs_Type_ID=103"
    })
    @ResultMap("SecondResultMap")
    List<CommonlyUsedDrugs> listCommonlyUsedHerbalDrugsByUserId(Integer userId);
    List<CommonlyUsedDrugs> getCommonUsedDrugs(@Param("doctorId")int doctorId);
}