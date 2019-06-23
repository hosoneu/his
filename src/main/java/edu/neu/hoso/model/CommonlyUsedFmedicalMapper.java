package edu.neu.hoso.model;

import edu.neu.hoso.example.CommonlyUsedFmedicalExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface CommonlyUsedFmedicalMapper {
    int countByExample(CommonlyUsedFmedicalExample example);

    int deleteByExample(CommonlyUsedFmedicalExample example);

    @Delete({
        "delete from commonly_used_fmedical",
        "where Commonly_Used_Fmedical_ID = #{commonlyUsedFmedicalId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer commonlyUsedFmedicalId);

    @Insert({
        "insert into commonly_used_fmedical (Doctor_ID, Fmedical_Items_ID)",
        "values (#{doctorId,jdbcType=INTEGER}, #{fmedicalItemsId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="commonlyUsedFmedicalId", before=false, resultType=Integer.class)
    int insert(CommonlyUsedFmedical record);

    int insertSelective(CommonlyUsedFmedical record);

    List<CommonlyUsedFmedical> selectByExample(CommonlyUsedFmedicalExample example);

    @Select({
        "select",
        "Commonly_Used_Fmedical_ID, Doctor_ID, Fmedical_Items_ID",
        "from commonly_used_fmedical",
        "where Commonly_Used_Fmedical_ID = #{commonlyUsedFmedicalId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    CommonlyUsedFmedical selectByPrimaryKey(Integer commonlyUsedFmedicalId);

    int updateByExampleSelective(@Param("record") CommonlyUsedFmedical record, @Param("example") CommonlyUsedFmedicalExample example);

    int updateByExample(@Param("record") CommonlyUsedFmedical record, @Param("example") CommonlyUsedFmedicalExample example);

    int updateByPrimaryKeySelective(CommonlyUsedFmedical record);

    @Update({
        "update commonly_used_fmedical",
        "set Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Fmedical_Items_ID = #{fmedicalItemsId,jdbcType=INTEGER}",
        "where Commonly_Used_Fmedical_ID = #{commonlyUsedFmedicalId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CommonlyUsedFmedical record);

    // 获取常用检查 1检查 2 检验 3处置
    @Select({
            "select c.*,f.*",
            "from commonly_used_fmedical c join fmedical_items f on c.Fmedical_Items_ID = f.Fmedical_Items_ID",
            "where f.Fmedical_Items_Type = '1' and c.Doctor_ID = #{userId,jdbcType=INTEGER}"
    })
    @ResultMap("SecondResultMap")
    List<CommonlyUsedFmedical> listCommonlyUsedExamination1ByUserId(Integer userId);
    // 获取常用检验
    @Select({
            "select c.*,f.*",
            "from commonly_used_fmedical c join fmedical_items f on c.Fmedical_Items_ID = f.Fmedical_Items_ID",
            "where f.Fmedical_Items_Type = '2' and c.Doctor_ID = #{userId,jdbcType=INTEGER}"
    })
    @ResultMap("SecondResultMap")
    List<CommonlyUsedFmedical> listCommonlyUsedExamination2ByUserId(Integer userId);
    // 获取常用处置
    @Select({
            "select c.*,f.*",
            "from commonly_used_fmedical c join fmedical_items f on c.Fmedical_Items_ID = f.Fmedical_Items_ID",
            "where f.Fmedical_Items_Type = '3' and c.Doctor_ID = #{userId,jdbcType=INTEGER}"
    })
    @ResultMap("SecondResultMap")
    List<CommonlyUsedFmedical> listCommonlyUsedTreatmentByUserId(Integer userId);


}