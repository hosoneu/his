package edu.neu.hoso.model;

import edu.neu.hoso.example.ExaminationExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ExaminationMapper {
    int countByExample(ExaminationExample example);

    int deleteByExample(ExaminationExample example);

    @Delete({
        "delete from examination",
        "where Examination_ID = #{examinationId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer examinationId);

    @Insert({
        "insert into examination (Medical_Record_ID, Doctor_ID, ",
        "Examination_Mark, Doctor_Advice, ",
        "Submit_Time)",
        "values (#{medicalRecordId,jdbcType=INTEGER}, #{doctorId,jdbcType=INTEGER}, ",
        "#{examinationMark,jdbcType=CHAR}, #{doctorAdvice,jdbcType=VARCHAR}, ",
        "#{submitTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="examinationId", before=false, resultType=Integer.class)
    int insert(Examination record);

    int insertSelective(Examination record);

    List<Examination> selectByExample(ExaminationExample example);

    @Select({
        "select",
        "Examination_ID, Medical_Record_ID, Doctor_ID, Examination_Mark, Doctor_Advice, ",
        "Submit_Time",
        "from examination",
        "where Examination_ID = #{examinationId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Examination selectByPrimaryKey(Integer examinationId);

    int updateByExampleSelective(@Param("record") Examination record, @Param("example") ExaminationExample example);

    int updateByExample(@Param("record") Examination record, @Param("example") ExaminationExample example);

    int updateByPrimaryKeySelective(Examination record);

    @Update({
        "update examination",
        "set Medical_Record_ID = #{medicalRecordId,jdbcType=INTEGER},",
          "Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Examination_Mark = #{examinationMark,jdbcType=CHAR},",
          "Doctor_Advice = #{doctorAdvice,jdbcType=VARCHAR},",
          "Submit_Time = #{submitTime,jdbcType=TIMESTAMP}",
        "where Examination_ID = #{examinationId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Examination record);
}