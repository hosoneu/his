package edu.neu.hoso.model;

import edu.neu.hoso.example.DiseaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface DiseaseMapper {
    int countByExample(DiseaseExample example);

    int deleteByExample(DiseaseExample example);

    @Delete({
        "delete from disease",
        "where Disease_ID = #{diseaseId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer diseaseId);

    @Insert({
        "insert into disease (Disease_Code, Disease_Name, ",
        "Disease_ICD, Disease_Type_ID, ",
        "Disease_Customize_Name1, Disease_Customize_Name2)",
        "values (#{diseaseCode,jdbcType=VARCHAR}, #{diseaseName,jdbcType=VARCHAR}, ",
        "#{diseaseIcd,jdbcType=VARCHAR}, #{diseaseTypeId,jdbcType=INTEGER}, ",
        "#{diseaseCustomizeName1,jdbcType=VARCHAR}, #{diseaseCustomizeName2,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="diseaseId", before=false, resultType=Integer.class)
    int insert(Disease record);

    int insertSelective(Disease record);

    List<Disease> selectByExample(DiseaseExample example);

    @Select({
        "select",
        "Disease_ID, Disease_Code, Disease_Name, Disease_ICD, Disease_Type_ID, Disease_Customize_Name1, ",
        "Disease_Customize_Name2",
        "from disease",
        "where Disease_ID = #{diseaseId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Disease selectByPrimaryKey(Integer diseaseId);

    int updateByExampleSelective(@Param("record") Disease record, @Param("example") DiseaseExample example);

    int updateByExample(@Param("record") Disease record, @Param("example") DiseaseExample example);

    int updateByPrimaryKeySelective(Disease record);

    @Update({
        "update disease",
        "set Disease_Code = #{diseaseCode,jdbcType=VARCHAR},",
          "Disease_Name = #{diseaseName,jdbcType=VARCHAR},",
          "Disease_ICD = #{diseaseIcd,jdbcType=VARCHAR},",
          "Disease_Type_ID = #{diseaseTypeId,jdbcType=INTEGER},",
          "Disease_Customize_Name1 = #{diseaseCustomizeName1,jdbcType=VARCHAR},",
          "Disease_Customize_Name2 = #{diseaseCustomizeName2,jdbcType=VARCHAR}",
        "where Disease_ID = #{diseaseId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Disease record);

    List<Disease> getAllDiseaseWithType();
}