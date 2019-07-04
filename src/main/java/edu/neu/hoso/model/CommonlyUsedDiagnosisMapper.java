package edu.neu.hoso.model;

import edu.neu.hoso.example.CommonlyUsedDiagnosisExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface CommonlyUsedDiagnosisMapper {
    int countByExample(CommonlyUsedDiagnosisExample example);

    int deleteByExample(CommonlyUsedDiagnosisExample example);

    @Delete({
        "delete from commonly_used_diagnosis",
        "where Commonly_Used_Diagnosis_ID = #{commonlyUsedDiagnosisId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer commonlyUsedDiagnosisId);

    @Insert({
        "insert into commonly_used_diagnosis (Doctor_ID, Disease_ID)",
        "values (#{doctorId,jdbcType=INTEGER}, #{diseaseId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="commonlyUsedDiagnosisId", before=false, resultType=Integer.class)
    int insert(CommonlyUsedDiagnosis record);

    int insertSelective(CommonlyUsedDiagnosis record);

    List<CommonlyUsedDiagnosis> selectByExample(CommonlyUsedDiagnosisExample example);

    @Select({
        "select",
        "Commonly_Used_Diagnosis_ID, Doctor_ID, Disease_ID",
        "from commonly_used_diagnosis",
        "where Commonly_Used_Diagnosis_ID = #{commonlyUsedDiagnosisId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    CommonlyUsedDiagnosis selectByPrimaryKey(Integer commonlyUsedDiagnosisId);

    int updateByExampleSelective(@Param("record") CommonlyUsedDiagnosis record, @Param("example") CommonlyUsedDiagnosisExample example);

    int updateByExample(@Param("record") CommonlyUsedDiagnosis record, @Param("example") CommonlyUsedDiagnosisExample example);

    int updateByPrimaryKeySelective(CommonlyUsedDiagnosis record);

    @Update({
        "update commonly_used_diagnosis",
        "set Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Disease_ID = #{diseaseId,jdbcType=INTEGER}",
        "where Commonly_Used_Diagnosis_ID = #{commonlyUsedDiagnosisId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CommonlyUsedDiagnosis record);

    /**
     * @title: listCommonlyUsedDiagnosisByUserId
     * @description: 列出常用诊断
     * @author: 29-y
     * @date: 2019-06-24 22:28
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.CommonlyUsedDiagnosis>
     * @throws:
     */
    @Select({
            "select c.*,d.*",
            "from commonly_used_diagnosis c join disease d on c.Disease_ID = d.Disease_ID",
            "where c.Doctor_ID = #{userId,jdbcType=INTEGER}"
    })
    @ResultMap("SecondResultMap")
    List<CommonlyUsedDiagnosis> listCommonlyUsedDiagnosisByUserId(Integer userId);

    /**
     * @title: listCommonlyUsedChineseDiagnosisByUserId
     * @description: 列出常用中医诊断
     * @author: 29-y
     * @date: 2019-06-24 22:28
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.CommonlyUsedDiagnosis>
     * @throws:
     */
    @Select({
            "select c.*,d.*",
            "from commonly_used_diagnosis c join disease d on c.Disease_ID = d.Disease_ID",
            "where c.Doctor_ID = #{userId,jdbcType=INTEGER} and d.Disease_Type_ID=472"
    })
    @ResultMap("SecondResultMap")
    List<CommonlyUsedDiagnosis> listCommonlyUsedChineseDiagnosisByUserId(Integer userId);

    /**
     * @title: listCommonlyUsedWesternDiagnosisByUserId
     * @description: 列出常用西医诊断
     * @author: 29-y
     * @date: 2019-06-24 22:28
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.CommonlyUsedDiagnosis>
     * @throws:
     */
    @Select({
            "select c.*,d.*",
            "from commonly_used_diagnosis c join disease d on c.Disease_ID = d.Disease_ID",
            "where c.Doctor_ID = #{userId,jdbcType=INTEGER} and d.Disease_Type_ID!=472"
    })
    @ResultMap("SecondResultMap")
    List<CommonlyUsedDiagnosis> listCommonlyUsedWesternDiagnosisByUserId(Integer userId);
}