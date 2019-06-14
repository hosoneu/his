package edu.neu.hoso.model;

import edu.neu.hoso.example.RegistrationExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RegistrationMapper {
    int countByExample(RegistrationExample example);

    int deleteByExample(RegistrationExample example);

    @Delete({
        "delete from registration",
        "where Registration_ID = #{registrationId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer registrationId);

    @Insert({
        "insert into registration (Medical_Record_ID, Registration_Level_ID, ",
        "Patient_ID, Department_ID, ",
        "Calculation_Type_ID, Doctor_ID, ",
        "Registration_Date, Buy_Medical_Record, ",
        "Registration_Total_Cost, Expense_Type_ID, ",
        "Expense_Items_ID, Registration_Status)",
        "values (#{medicalRecordId,jdbcType=INTEGER}, #{registrationLevelId,jdbcType=INTEGER}, ",
        "#{patientId,jdbcType=INTEGER}, #{departmentId,jdbcType=INTEGER}, ",
        "#{calculationTypeId,jdbcType=INTEGER}, #{doctorId,jdbcType=INTEGER}, ",
        "#{registrationDate,jdbcType=DATE}, #{buyMedicalRecord,jdbcType=CHAR}, ",
        "#{registrationTotalCost,jdbcType=DOUBLE}, #{expenseTypeId,jdbcType=INTEGER}, ",
        "#{expenseItemsId,jdbcType=INTEGER}, #{registrationStatus,jdbcType=CHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="registrationId", before=false, resultType=Integer.class)
    int insert(Registration record);

    int insertSelective(Registration record);

    List<Registration> selectByExample(RegistrationExample example);

    @Select({
        "select",
        "Registration_ID, Medical_Record_ID, Registration_Level_ID, Patient_ID, Department_ID, ",
        "Calculation_Type_ID, Doctor_ID, Registration_Date, Buy_Medical_Record, Registration_Total_Cost, ",
        "Expense_Type_ID, Expense_Items_ID, Registration_Status",
        "from registration",
        "where Registration_ID = #{registrationId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Registration selectByPrimaryKey(Integer registrationId);

    int updateByExampleSelective(@Param("record") Registration record, @Param("example") RegistrationExample example);

    int updateByExample(@Param("record") Registration record, @Param("example") RegistrationExample example);

    int updateByPrimaryKeySelective(Registration record);

    @Update({
        "update registration",
        "set Medical_Record_ID = #{medicalRecordId,jdbcType=INTEGER},",
          "Registration_Level_ID = #{registrationLevelId,jdbcType=INTEGER},",
          "Patient_ID = #{patientId,jdbcType=INTEGER},",
          "Department_ID = #{departmentId,jdbcType=INTEGER},",
          "Calculation_Type_ID = #{calculationTypeId,jdbcType=INTEGER},",
          "Doctor_ID = #{doctorId,jdbcType=INTEGER},",
          "Registration_Date = #{registrationDate,jdbcType=DATE},",
          "Buy_Medical_Record = #{buyMedicalRecord,jdbcType=CHAR},",
          "Registration_Total_Cost = #{registrationTotalCost,jdbcType=DOUBLE},",
          "Expense_Type_ID = #{expenseTypeId,jdbcType=INTEGER},",
          "Expense_Items_ID = #{expenseItemsId,jdbcType=INTEGER},",
          "Registration_Status = #{registrationStatus,jdbcType=CHAR}",
        "where Registration_ID = #{registrationId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Registration record);
}