package edu.neu.hoso.model;

import java.util.List;

import edu.neu.hoso.example.CommonlyUsedDrugsExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
}