package edu.neu.hoso.model;

import edu.neu.hoso.example.RegistrationLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RegistrationLevelMapper {
    int countByExample(RegistrationLevelExample example);

    int deleteByExample(RegistrationLevelExample example);

    @Delete({
        "delete from registration_level",
        "where Registration_Level_ID = #{registrationLevelId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer registrationLevelId);

    @Insert({
        "insert into registration_level (Registration_Level_Name, Is_Default, ",
        "Registration_Sequence, Registration_Cost)",
        "values (#{registrationLevelName,jdbcType=VARCHAR}, #{isDefault,jdbcType=VARCHAR}, ",
        "#{registrationSequence,jdbcType=INTEGER}, #{registrationCost,jdbcType=DOUBLE})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="registrationLevelId", before=false, resultType=Integer.class)
    int insert(RegistrationLevel record);

    int insertSelective(RegistrationLevel record);

    List<RegistrationLevel> selectByExample(RegistrationLevelExample example);

    @Select({
        "select",
        "Registration_Level_ID, Registration_Level_Name, Is_Default, Registration_Sequence, ",
        "Registration_Cost",
        "from registration_level",
        "where Registration_Level_ID = #{registrationLevelId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    RegistrationLevel selectByPrimaryKey(Integer registrationLevelId);

    int updateByExampleSelective(@Param("record") RegistrationLevel record, @Param("example") RegistrationLevelExample example);

    int updateByExample(@Param("record") RegistrationLevel record, @Param("example") RegistrationLevelExample example);

    int updateByPrimaryKeySelective(RegistrationLevel record);

    @Update({
        "update registration_level",
        "set Registration_Level_Name = #{registrationLevelName,jdbcType=VARCHAR},",
          "Is_Default = #{isDefault,jdbcType=VARCHAR},",
          "Registration_Sequence = #{registrationSequence,jdbcType=INTEGER},",
          "Registration_Cost = #{registrationCost,jdbcType=DOUBLE}",
        "where Registration_Level_ID = #{registrationLevelId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(RegistrationLevel record);
}