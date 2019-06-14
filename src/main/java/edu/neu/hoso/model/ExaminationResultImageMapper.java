package edu.neu.hoso.model;

import edu.neu.hoso.example.ExaminationResultImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ExaminationResultImageMapper {
    int countByExample(ExaminationResultImageExample example);

    int deleteByExample(ExaminationResultImageExample example);

    @Delete({
        "delete from examination_result_image",
        "where Examination_Result_Image_ID = #{examinationResultImageId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer examinationResultImageId);

    @Insert({
        "insert into examination_result_image (Examination_Result_ID, Image_URL, ",
        "Image_Name)",
        "values (#{examinationResultId,jdbcType=INTEGER}, #{imageUrl,jdbcType=VARCHAR}, ",
        "#{imageName,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="examinationResultImageId", before=false, resultType=Integer.class)
    int insert(ExaminationResultImage record);

    int insertSelective(ExaminationResultImage record);

    List<ExaminationResultImage> selectByExample(ExaminationResultImageExample example);

    @Select({
        "select",
        "Examination_Result_Image_ID, Examination_Result_ID, Image_URL, Image_Name",
        "from examination_result_image",
        "where Examination_Result_Image_ID = #{examinationResultImageId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    ExaminationResultImage selectByPrimaryKey(Integer examinationResultImageId);

    int updateByExampleSelective(@Param("record") ExaminationResultImage record, @Param("example") ExaminationResultImageExample example);

    int updateByExample(@Param("record") ExaminationResultImage record, @Param("example") ExaminationResultImageExample example);

    int updateByPrimaryKeySelective(ExaminationResultImage record);

    @Update({
        "update examination_result_image",
        "set Examination_Result_ID = #{examinationResultId,jdbcType=INTEGER},",
          "Image_URL = #{imageUrl,jdbcType=VARCHAR},",
          "Image_Name = #{imageName,jdbcType=VARCHAR}",
        "where Examination_Result_Image_ID = #{examinationResultImageId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ExaminationResultImage record);
}