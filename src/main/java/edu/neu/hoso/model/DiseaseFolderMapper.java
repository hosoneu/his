package edu.neu.hoso.model;

import edu.neu.hoso.example.DiseaseFolderExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface DiseaseFolderMapper {
    int countByExample(DiseaseFolderExample example);

    int deleteByExample(DiseaseFolderExample example);

    @Delete({
        "delete from disease_folder",
        "where Disease_Folder_ID = #{diseaseFolderId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer diseaseFolderId);

    @Insert({
        "insert into disease_folder (Disease_Folder_Name)",
        "values (#{diseaseFolderName,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="diseaseFolderId", before=false, resultType=Integer.class)
    int insert(DiseaseFolder record);

    int insertSelective(DiseaseFolder record);

    List<DiseaseFolder> selectByExample(DiseaseFolderExample example);

    @Select({
        "select",
        "Disease_Folder_ID, Disease_Folder_Name",
        "from disease_folder",
        "where Disease_Folder_ID = #{diseaseFolderId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    DiseaseFolder selectByPrimaryKey(Integer diseaseFolderId);

    int updateByExampleSelective(@Param("record") DiseaseFolder record, @Param("example") DiseaseFolderExample example);

    int updateByExample(@Param("record") DiseaseFolder record, @Param("example") DiseaseFolderExample example);

    int updateByPrimaryKeySelective(DiseaseFolder record);

    @Update({
        "update disease_folder",
        "set Disease_Folder_Name = #{diseaseFolderName,jdbcType=VARCHAR}",
        "where Disease_Folder_ID = #{diseaseFolderId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DiseaseFolder record);
}