package edu.neu.hoso.model;

import edu.neu.hoso.example.GroupExaminationFmedicalItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface GroupExaminationFmedicalItemsMapper {
    int countByExample(GroupExaminationFmedicalItemsExample example);

    int deleteByExample(GroupExaminationFmedicalItemsExample example);

    @Delete({
        "delete from group_examination_fmedical_items",
        "where Group_Examination_Fmedical_Items_ID = #{groupExaminationFmedicalItemsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer groupExaminationFmedicalItemsId);

    @Insert({
        "insert into group_examination_fmedical_items (Group_Examination_ID, Fmedical_Items_ID, ",
        "Purpose_Requirements, Quantity)",
        "values (#{groupExaminationId,jdbcType=INTEGER}, #{fmedicalItemsId,jdbcType=INTEGER}, ",
        "#{purposeRequirements,jdbcType=VARCHAR}, #{quantity,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="groupExaminationFmedicalItemsId", before=false, resultType=Integer.class)
    int insert(GroupExaminationFmedicalItems record);

    int insertSelective(GroupExaminationFmedicalItems record);

    List<GroupExaminationFmedicalItems> selectByExample(GroupExaminationFmedicalItemsExample example);

    @Select({
        "select",
        "Group_Examination_Fmedical_Items_ID, Group_Examination_ID, Fmedical_Items_ID, ",
        "Purpose_Requirements, Quantity",
        "from group_examination_fmedical_items",
        "where Group_Examination_Fmedical_Items_ID = #{groupExaminationFmedicalItemsId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    GroupExaminationFmedicalItems selectByPrimaryKey(Integer groupExaminationFmedicalItemsId);

    int updateByExampleSelective(@Param("record") GroupExaminationFmedicalItems record, @Param("example") GroupExaminationFmedicalItemsExample example);

    int updateByExample(@Param("record") GroupExaminationFmedicalItems record, @Param("example") GroupExaminationFmedicalItemsExample example);

    int updateByPrimaryKeySelective(GroupExaminationFmedicalItems record);

    @Update({
        "update group_examination_fmedical_items",
        "set Group_Examination_ID = #{groupExaminationId,jdbcType=INTEGER},",
          "Fmedical_Items_ID = #{fmedicalItemsId,jdbcType=INTEGER},",
          "Purpose_Requirements = #{purposeRequirements,jdbcType=VARCHAR},",
          "Quantity = #{quantity,jdbcType=INTEGER}",
        "where Group_Examination_Fmedical_Items_ID = #{groupExaminationFmedicalItemsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GroupExaminationFmedicalItems record);
}