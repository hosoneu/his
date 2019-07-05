package edu.neu.hoso.model;

import edu.neu.hoso.example.ExaminationResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ExaminationResultMapper {
    int countByExample(ExaminationResultExample example);

    int deleteByExample(ExaminationResultExample example);

    @Delete({
        "delete from examination_result",
        "where Examination_Result_ID = #{examinationResultId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer examinationResultId);

    @Insert({
        "insert into examination_result (Doctor_ID, Findings, ",
        "Diagnostic_Suggestion, Submit_Time)",
        "values (#{doctorId,jdbcType=INTEGER}, #{findings,jdbcType=VARCHAR}, ",
        "#{diagnosticSuggestion,jdbcType=VARCHAR}, #{submitTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="examinationResultId", before=false, resultType=Integer.class)
    int insert(ExaminationResult record);

    int insertSelective(ExaminationResult record);

    List<ExaminationResult> selectByExample(ExaminationResultExample example);

    @Select({
        "select",
        "Examination_Result_ID, Doctor_ID, Findings, Diagnostic_Suggestion, Submit_Time",
        "from examination_result",
        "where Examination_Result_ID = #{examinationResultId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    ExaminationResult selectByPrimaryKey(Integer examinationResultId);

    int updateByExampleSelective(@Param("record") ExaminationResult record, @Param("example") ExaminationResultExample example);

    int updateByExample(@Param("record") ExaminationResult record, @Param("example") ExaminationResultExample example);

    int updateByPrimaryKeySelective(ExaminationResult record);

    @Update({
        "update examination_result",
        "set Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Findings = #{findings,jdbcType=VARCHAR},",
          "Diagnostic_Suggestion = #{diagnosticSuggestion,jdbcType=VARCHAR},",
          "Submit_Time = #{submitTime,jdbcType=TIMESTAMP}",
        "where Examination_Result_ID = #{examinationResultId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ExaminationResult record);

}