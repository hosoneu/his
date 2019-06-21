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
        "insert into group_examination_drugs_items (Group_Examination_Fmedical_Items_ID, ",
        "Drugs_ID, Drugs_Usage, ",
        "Quantity, Times, ",
        "Days, Dosage)",
        "values (#{groupExaminationFmedicalItemsId,jdbcType=INTEGER}, ",
        "#{drugsId,jdbcType=INTEGER}, #{drugsUsage,jdbcType=CHAR}, ",
        "#{quantity,jdbcType=INTEGER}, #{times,jdbcType=INTEGER}, ",
        "#{days,jdbcType=INTEGER}, #{dosage,jdbcType=DOUBLE})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="groupExaminationDrugsItemsId", before=false, resultType=Integer.class)
    int insert(GroupExaminationDrugsItems record);

    int insertSelective(GroupExaminationDrugsItems record);

    List<GroupExaminationDrugsItems> selectByExample(GroupExaminationDrugsItemsExample example);

    @Select({
        "select",
        "Group_Examination_Drugs_Items_ID, Group_Examination_Fmedical_Items_ID, Drugs_ID, ",
        "Drugs_Usage, Quantity, Times, Days, Dosage",
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
          "Drugs_Usage = #{drugsUsage,jdbcType=CHAR},",
          "Quantity = #{quantity,jdbcType=INTEGER},",
          "Times = #{times,jdbcType=INTEGER},",
          "Days = #{days,jdbcType=INTEGER},",
          "Dosage = #{dosage,jdbcType=DOUBLE}",
        "where Group_Examination_Drugs_Items_ID = #{groupExaminationDrugsItemsId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GroupExaminationDrugsItems record);

    /**
     * @title: listGroupExaminationDrugsItemsByGroupExaminationFmedicalItemsId
     * @description: 用于填充检查检验非药品条目中的检查检验药品列表
     * @author: 29-y
     * @date: 2019-06-19 13:53
     * @param: [groupExaminationFmedicalItemsId]
     * @return: java.util.List<edu.neu.hoso.model.GroupExaminationDrugsItems>
     * @throws:
     */
    @Select({
            "select drugs_items.*,d.* " ,
            "from group_examination_drugs_items drugs_items join drugs d on drugs_items.Drugs_ID = d.Drugs_ID " ,
            "where drugs_items.Group_Examination_Fmedical_Items_ID = #{groupExaminationFmedicalItemsId,jdbcType=INTEGER} "
    })
    @ResultMap("SecondResultMap")
    List<GroupExaminationDrugsItems> listGroupExaminationDrugsItemsByGroupExaminationFmedicalItemsId(Integer groupExaminationFmedicalItemsId);
}