package edu.neu.hoso.model;

import edu.neu.hoso.example.FmedicalItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface FmedicalItemsMapper {
    int countByExample(FmedicalItemsExample example);

    int deleteByExample(FmedicalItemsExample example);

    @Delete({
        "delete from fmedical_items",
        "where Fmedical_Items_ID = #{fmedicalItemsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer fmedicalItemsId);

    @Insert({
        "insert into fmedical_items (Fmedical_Items_Code, Fmedical_Items_Name, ",
        "Fmedical_Items_Format, Fmedical_Items_Price, ",
        "Expense_Type_ID, Department_ID, ",
        "Fmedical_Items_MnemonicCode, Fmedical_Items_Type, ",
        "Create_Time, Reverse1, ",
        "Reverse2, Reverse3)",
        "values (#{fmedicalItemsCode,jdbcType=VARCHAR}, #{fmedicalItemsName,jdbcType=VARCHAR}, ",
        "#{fmedicalItemsFormat,jdbcType=VARCHAR}, #{fmedicalItemsPrice,jdbcType=DOUBLE}, ",
        "#{expenseTypeId,jdbcType=INTEGER}, #{departmentId,jdbcType=INTEGER}, ",
        "#{fmedicalItemsMnemoniccode,jdbcType=VARCHAR}, #{fmedicalItemsType,jdbcType=CHAR}, ",
        "#{createTime,jdbcType=DATE}, #{reverse1,jdbcType=VARCHAR}, ",
        "#{reverse2,jdbcType=VARCHAR}, #{reverse3,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="fmedicalItemsId", before=false, resultType=Integer.class)
    int insert(FmedicalItems record);

    int insertSelective(FmedicalItems record);

    List<FmedicalItems> selectByExample(FmedicalItemsExample example);

    @Select({
        "select",
        "Fmedical_Items_ID, Fmedical_Items_Code, Fmedical_Items_Name, Fmedical_Items_Format, ",
        "Fmedical_Items_Price, Expense_Type_ID, Department_ID, Fmedical_Items_MnemonicCode, ",
        "Fmedical_Items_Type, Create_Time, Reverse1, Reverse2, Reverse3",
        "from fmedical_items",
        "where Fmedical_Items_ID = #{fmedicalItemsId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    FmedicalItems selectByPrimaryKey(Integer fmedicalItemsId);

    int updateByExampleSelective(@Param("record") FmedicalItems record, @Param("example") FmedicalItemsExample example);

    int updateByExample(@Param("record") FmedicalItems record, @Param("example") FmedicalItemsExample example);

    int updateByPrimaryKeySelective(FmedicalItems record);

    @Update({
        "update fmedical_items",
        "set Fmedical_Items_Code = #{fmedicalItemsCode,jdbcType=VARCHAR},",
          "Fmedical_Items_Name = #{fmedicalItemsName,jdbcType=VARCHAR},",
          "Fmedical_Items_Format = #{fmedicalItemsFormat,jdbcType=VARCHAR},",
          "Fmedical_Items_Price = #{fmedicalItemsPrice,jdbcType=DOUBLE},",
          "Expense_Type_ID = #{expenseTypeId,jdbcType=INTEGER},",
          "Department_ID = #{departmentId,jdbcType=INTEGER},",
          "Fmedical_Items_MnemonicCode = #{fmedicalItemsMnemoniccode,jdbcType=VARCHAR},",
          "Fmedical_Items_Type = #{fmedicalItemsType,jdbcType=CHAR},",
          "Create_Time = #{createTime,jdbcType=DATE},",
          "Reverse1 = #{reverse1,jdbcType=VARCHAR},",
          "Reverse2 = #{reverse2,jdbcType=VARCHAR},",
          "Reverse3 = #{reverse3,jdbcType=VARCHAR}",
        "where Fmedical_Items_ID = #{fmedicalItemsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmedicalItems record);

    List<FmedicalItems> getAllFmedicalByMedicalID(@Param("Medical_record_ID")int Medical_record_ID, @Param("Department_ID")int Department_ID);

    //输出该患者在该科室的全部已缴费且未做非药品项目
    List<FmedicalItems> getFmedical(@Param("Medical_record_ID")int Medical_record_ID, @Param("Department_ID")int Department_ID);

    //用于展示所有非药品项目
    List<FmedicalItems> getAllFmedicalForShow();
}