package edu.neu.hoso.model;

import edu.neu.hoso.example.DrugsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface DrugsMapper {
    int countByExample(DrugsExample example);

    int deleteByExample(DrugsExample example);

    @Delete({
        "delete from drugs",
        "where Drugs_ID = #{drugsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer drugsId);

    @Insert({
        "insert into drugs (Drugs_Code, Drugs_Name, ",
        "Drugs_Format, Drugs_Unit, ",
        "Drugs_Manufacturer, Drugs_Dosage_ID, ",
        "Drugs_Type_ID, Drugs_Price, ",
        "Drugs_MnemonicCode, Create_Time, ",
        "Reverse1, Reverse2, ",
        "Reverse3)",
        "values (#{drugsCode,jdbcType=VARCHAR}, #{drugsName,jdbcType=VARCHAR}, ",
        "#{drugsFormat,jdbcType=VARCHAR}, #{drugsUnit,jdbcType=VARCHAR}, ",
        "#{drugsManufacturer,jdbcType=VARCHAR}, #{drugsDosageId,jdbcType=INTEGER}, ",
        "#{drugsTypeId,jdbcType=INTEGER}, #{drugsPrice,jdbcType=DOUBLE}, ",
        "#{drugsMnemoniccode,jdbcType=VARCHAR}, #{createTime,jdbcType=DATE}, ",
        "#{reverse1,jdbcType=VARCHAR}, #{reverse2,jdbcType=VARCHAR}, ",
        "#{reverse3,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="drugsId", before=false, resultType=Integer.class)
    int insert(Drugs record);

    int insertSelective(Drugs record);

    List<Drugs> selectByExample(DrugsExample example);

    @Select({
        "select",
        "Drugs_ID, Drugs_Code, Drugs_Name, Drugs_Format, Drugs_Unit, Drugs_Manufacturer, ",
        "Drugs_Dosage_ID, Drugs_Type_ID, Drugs_Price, Drugs_MnemonicCode, Create_Time, ",
        "Reverse1, Reverse2, Reverse3",
        "from drugs",
        "where Drugs_ID = #{drugsId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Drugs selectByPrimaryKey(Integer drugsId);

    int updateByExampleSelective(@Param("record") Drugs record, @Param("example") DrugsExample example);

    int updateByExample(@Param("record") Drugs record, @Param("example") DrugsExample example);

    int updateByPrimaryKeySelective(Drugs record);

    @Update({
        "update drugs",
        "set Drugs_Code = #{drugsCode,jdbcType=VARCHAR},",
          "Drugs_Name = #{drugsName,jdbcType=VARCHAR},",
          "Drugs_Format = #{drugsFormat,jdbcType=VARCHAR},",
          "Drugs_Unit = #{drugsUnit,jdbcType=VARCHAR},",
          "Drugs_Manufacturer = #{drugsManufacturer,jdbcType=VARCHAR},",
          "Drugs_Dosage_ID = #{drugsDosageId,jdbcType=INTEGER},",
          "Drugs_Type_ID = #{drugsTypeId,jdbcType=INTEGER},",
          "Drugs_Price = #{drugsPrice,jdbcType=DOUBLE},",
          "Drugs_MnemonicCode = #{drugsMnemoniccode,jdbcType=VARCHAR},",
          "Create_Time = #{createTime,jdbcType=DATE},",
          "Reverse1 = #{reverse1,jdbcType=VARCHAR},",
          "Reverse2 = #{reverse2,jdbcType=VARCHAR},",
          "Reverse3 = #{reverse3,jdbcType=VARCHAR}",
        "where Drugs_ID = #{drugsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Drugs record);

    List<Drugs> getAllDrugsWithTypeAndDosage();
    //by-alan
    List<Drugs> getAllDrugs();
}