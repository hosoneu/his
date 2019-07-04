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

    /**
     * @title: listExaminationByMedicalRecordId
     * @description: 列出病历下的所有检查/检验单（mark: 1 检查 2 检验）（不包括药品条目细节 通过example填充）
     * @author: 29-y
     * @date: 2019-06-19 9:31
     * @param: [medicalRecordId, mark]
     * @return: java.util.List<edu.neu.hoso.model.Examination>
     * @throws:
     */
    @Select({
            "select e.*,e_fmedical_items.*,fmedical.*,d.* " ,
            "from examination e join examination_fmedical_items e_fmedical_items on e_fmedical_items.Examination_ID = e.Examination_ID join fmedical_items fmedical on fmedical.Fmedical_Items_ID = e_fmedical_items.Fmedical_Items_ID join department d on fmedical.Department_ID = d.Department_ID " ,
            "where e.Medical_Record_ID = #{medicalRecordId,jdbcType=INTEGER} and e.Examination_Mark = #{mark,jdbcType=CHAR} "
    })
    @ResultMap("SecondResultMap")
    List<Examination> listExaminationByMedicalRecordId(Integer medicalRecordId, String mark);

    /**
     * @title: selectExaminationById
     * @description: 根据ID查找检查/检验单的内容（mark: 1 检查 2 检验）（不包括药品条目细节 通过example填充）
     * @author: 29-y
     * @date: 2019-06-19 9:43
     * @param: [examinationId, mark]
     * @return: edu.neu.hoso.model.Examination
     * @throws:
     */
    @Select({
            "select e.*,e_fmedical_items.*,fmedical.*,d.*  " ,
            "from examination e join examination_fmedical_items e_fmedical_items on e_fmedical_items.Examination_ID = e.Examination_ID join fmedical_items fmedical on fmedical.Fmedical_Items_ID = e_fmedical_items.Fmedical_Items_ID join department d on fmedical.Department_ID = d.Department_ID" ,
            "where e.Examination_ID = #{examinationId,jdbcType=INTEGER} and e.Examination_Mark = #{mark,jdbcType=CHAR} "
    })
    @ResultMap("SecondResultMap")
    Examination selectExaminationById(Integer examinationId, String mark);


    //获得所有药房检查检验的药
    List<Examination> getAllExaminationMedical();

}