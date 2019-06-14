package edu.neu.hoso.model;

import edu.neu.hoso.example.GroupTreatmentItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface GroupTreatmentItemsMapper {
    int countByExample(GroupTreatmentItemsExample example);

    int deleteByExample(GroupTreatmentItemsExample example);

    @Delete({
        "delete from group_treatment_items",
        "where Group_Treatment_Items_ID = #{groupTreatmentItemsId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer groupTreatmentItemsId);

    @Insert({
        "insert into group_treatment_items (Group_Treatment_ID, Fmedical_Items_ID, ",
        "Quantity, Group_Treatment_Scope)",
        "values (#{groupTreatmentId,jdbcType=INTEGER}, #{fmedicalItemsId,jdbcType=INTEGER}, ",
        "#{quantity,jdbcType=INTEGER}, #{groupTreatmentScope,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="groupTreatmentItemsId", before=false, resultType=Integer.class)
    int insert(GroupTreatmentItems record);

    int insertSelective(GroupTreatmentItems record);

    List<GroupTreatmentItems> selectByExample(GroupTreatmentItemsExample example);

    @Select({
        "select",
        "Group_Treatment_Items_ID, Group_Treatment_ID, Fmedical_Items_ID, Quantity, Group_Treatment_Scope",
        "from group_treatment_items",
        "where Group_Treatment_Items_ID = #{groupTreatmentItemsId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    GroupTreatmentItems selectByPrimaryKey(Integer groupTreatmentItemsId);

    int updateByExampleSelective(@Param("record") GroupTreatmentItems record, @Param("example") GroupTreatmentItemsExample example);

    int updateByExample(@Param("record") GroupTreatmentItems record, @Param("example") GroupTreatmentItemsExample example);

    int updateByPrimaryKeySelective(GroupTreatmentItems record);

    @Update({
        "update group_treatment_items",
        "set Group_Treatment_ID = #{groupTreatmentId,jdbcType=INTEGER},",
          "Fmedical_Items_ID = #{fmedicalItemsId,jdbcType=INTEGER},",
          "Quantity = #{quantity,jdbcType=INTEGER},",
          "Group_Treatment_Scope = #{groupTreatmentScope,jdbcType=CHAR}",
        "where Group_Treatment_Items_ID = #{groupTreatmentItemsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GroupTreatmentItems record);
}