package edu.neu.hoso.model;

import edu.neu.hoso.example.GroupExaminationDrugsItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface GroupExaminationDrugsItemsMapper {
    int countByExample(GroupExaminationDrugsItemsExample example);

    int deleteByExample(GroupExaminationDrugsItemsExample example);

    @Delete({
        "delete from group_examination_drugs_items",
        "where Group_Examination_Drugs_Items_ID = #{groupExaminationDrugsItemsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer groupExaminationDrugsItemsId);

    @Insert({
        "insert into group_examination_drugs_items (Group_Examination_Drugs_Items_ID, ",
        "Group_Examination_Fmedical_Items_ID, Drugs_ID, ",
        "Usage, Quantity)",
        "values (#{groupExaminationDrugsItemsId,jdbcType=INTEGER}, ",
        "#{groupExaminationFmedicalItemsId,jdbcType=INTEGER}, #{drugsId,jdbcType=INTEGER}, ",
        "#{usage,jdbcType=CHAR}, #{quantity,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="groupExaminationDrugsItemsId", before=true, resultType=Integer.class)
    int insert(GroupExaminationDrugsItems record);

    int insertSelective(GroupExaminationDrugsItems record);

    List<GroupExaminationDrugsItems> selectByExample(GroupExaminationDrugsItemsExample example);

    @Select({
        "select",
        "Group_Examination_Drugs_Items_ID, Group_Examination_Fmedical_Items_ID, Drugs_ID, ",
        "Usage, Quantity",
        "from group_examination_drugs_items",
        "where Group_Examination_Drugs_Items_ID = #{groupExaminationDrugsItemsId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    GroupExaminationDrugsItems selectByPrimaryKey(Integer groupExaminationDrugsItemsId);

    int updateByExampleSelective(@Param("record") GroupExaminationDrugsItems record, @Param("example") GroupExaminationDrugsItemsExample example);

    int updateByExample(@Param("record") GroupExaminationDrugsItems record, @Param("example") GroupExaminationDrugsItemsExample example);

    int updateByPrimaryKeySelective(GroupExaminationDrugsItems record);

    @Update({
        "update group_examination_drugs_items",
        "set Group_Examination_Fmedical_Items_ID = #{groupExaminationFmedicalItemsId,jdbcType=INTEGER},",
          "Drugs_ID = #{drugsId,jdbcType=INTEGER},",
          "Usage = #{usage,jdbcType=CHAR},",
          "Quantity = #{quantity,jdbcType=INTEGER}",
        "where Group_Examination_Drugs_Items_ID = #{groupExaminationDrugsItemsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GroupExaminationDrugsItems record);
}