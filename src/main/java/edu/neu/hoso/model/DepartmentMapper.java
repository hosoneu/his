package edu.neu.hoso.model;

import edu.neu.hoso.example.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface DepartmentMapper {
    int countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    @Delete({
        "delete from department",
        "where Department_ID = #{departmentId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer departmentId);

    @Insert({
        "insert into department (Department_Code, Department_Name, ",
        "Department_Category_ID, Department_Type)",
        "values (#{departmentCode,jdbcType=VARCHAR}, #{departmentName,jdbcType=VARCHAR}, ",
        "#{departmentCategoryId,jdbcType=INTEGER}, #{departmentType,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="departmentId", before=false, resultType=Integer.class)
    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);

    @Select({
        "select",
        "Department_ID, Department_Code, Department_Name, Department_Category_ID, Department_Type",
        "from department",
        "where Department_ID = #{departmentId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Department selectByPrimaryKey(Integer departmentId);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    @Update({
        "update department",
        "set Department_Code = #{departmentCode,jdbcType=VARCHAR},",
          "Department_Name = #{departmentName,jdbcType=VARCHAR},",
          "Department_Category_ID = #{departmentCategoryId,jdbcType=INTEGER},",
          "Department_Type = #{departmentType,jdbcType=CHAR}",
        "where Department_ID = #{departmentId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Department record);

    List<Department> getAllDepartmentWithCategory();
}