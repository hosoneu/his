package edu.neu.hoso.model;

import edu.neu.hoso.example.DiseaseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface DiseaseTypeMapper {
    int countByExample(DiseaseTypeExample example);

    int deleteByExample(DiseaseTypeExample example);

    @Delete({
        "delete from disease_type",
        "where Disease_Type_ID = #{diseaseTypeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer diseaseTypeId);

    @Insert({
        "insert into disease_type (Disease_Type_Code, Disease_Type_Name, ",
        "Disease_Type_Sequence, Disease_Type_Type, ",
        "Disease_Folder_ID)",
        "values (#{diseaseTypeCode,jdbcType=VARCHAR}, #{diseaseTypeName,jdbcType=VARCHAR}, ",
        "#{diseaseTypeSequence,jdbcType=INTEGER}, #{diseaseTypeType,jdbcType=CHAR}, ",
        "#{diseaseFolderId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="diseaseTypeId", before=false, resultType=Integer.class)
    int insert(DiseaseType record);

    int insertSelective(DiseaseType record);

    List<DiseaseType> selectByExample(DiseaseTypeExample example);

    @Select({
        "select",
        "Disease_Type_ID, Disease_Type_Code, Disease_Type_Name, Disease_Type_Sequence, ",
        "Disease_Type_Type, Disease_Folder_ID",
        "from disease_type",
        "where Disease_Type_ID = #{diseaseTypeId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    DiseaseType selectByPrimaryKey(Integer diseaseTypeId);

    int updateByExampleSelective(@Param("record") DiseaseType record, @Param("example") DiseaseTypeExample example);

    int updateByExample(@Param("record") DiseaseType record, @Param("example") DiseaseTypeExample example);

    int updateByPrimaryKeySelective(DiseaseType record);

    @Update({
        "update disease_type",
        "set Disease_Type_Code = #{diseaseTypeCode,jdbcType=VARCHAR},",
          "Disease_Type_Name = #{diseaseTypeName,jdbcType=VARCHAR},",
          "Disease_Type_Sequence = #{diseaseTypeSequence,jdbcType=INTEGER},",
          "Disease_Type_Type = #{diseaseTypeType,jdbcType=CHAR},",
          "Disease_Folder_ID = #{diseaseFolderId,jdbcType=INTEGER}",
        "where Disease_Type_ID = #{diseaseTypeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DiseaseType record);
}