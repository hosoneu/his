package edu.neu.hoso.model;

import edu.neu.hoso.example.ConstantItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ConstantItemsMapper {
    int countByExample(ConstantItemsExample example);

    int deleteByExample(ConstantItemsExample example);

    @Delete({
        "delete from constant_items",
        "where Constant_Items_ID = #{constantItemsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer constantItemsId);

    @Insert({
        "insert into constant_items (Constant_Type_ID, Constant_Items_Code, ",
        "Constant_Items_Name)",
        "values (#{constantTypeId,jdbcType=INTEGER}, #{constantItemsCode,jdbcType=VARCHAR}, ",
        "#{constantItemsName,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="constantItemsId", before=false, resultType=Integer.class)
    int insert(ConstantItems record);

    int insertSelective(ConstantItems record);

    List<ConstantItems> selectByExample(ConstantItemsExample example);

    @Select({
        "select",
        "Constant_Items_ID, Constant_Type_ID, Constant_Items_Code, Constant_Items_Name",
        "from constant_items",
        "where Constant_Items_ID = #{constantItemsId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    ConstantItems selectByPrimaryKey(Integer constantItemsId);

    int updateByExampleSelective(@Param("record") ConstantItems record, @Param("example") ConstantItemsExample example);

    int updateByExample(@Param("record") ConstantItems record, @Param("example") ConstantItemsExample example);

    int updateByPrimaryKeySelective(ConstantItems record);

    @Update({
        "update constant_items",
        "set Constant_Type_ID = #{constantTypeId,jdbcType=INTEGER},",
          "Constant_Items_Code = #{constantItemsCode,jdbcType=VARCHAR},",
          "Constant_Items_Name = #{constantItemsName,jdbcType=VARCHAR}",
        "where Constant_Items_ID = #{constantItemsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ConstantItems record);

    List<ConstantItems> getDrugsDosage();

    List<ConstantItems> getDrugsType();
}