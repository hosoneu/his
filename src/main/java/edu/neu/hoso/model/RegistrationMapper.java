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
        "#{registrationDate,jdbcType=TIMESTAMP}, #{buyMedicalRecord,jdbcType=CHAR}, ",
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
          "Registration_Date = #{registrationDate,jdbcType=TIMESTAMP},",
          "Buy_Medical_Record = #{buyMedicalRecord,jdbcType=CHAR},",
          "Registration_Total_Cost = #{registrationTotalCost,jdbcType=DOUBLE},",
          "Expense_Type_ID = #{expenseTypeId,jdbcType=INTEGER},",
          "Expense_Items_ID = #{expenseItemsId,jdbcType=INTEGER},",
          "Registration_Status = #{registrationStatus,jdbcType=CHAR}",
        "where Registration_ID = #{registrationId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Registration record);

    /**
     * @title: listRegistrationFromUserByUserId
     * @description: 展示挂号列表（个人）
     * @author: 29-y
     * @date: 2019-06-16 21:36
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.Registration>
     * @throws:
     */
    @Select({
            "select r.*,p.*,m.* " ,
            "from registration r join patient p on p.Patient_ID = r.Patient_ID join medical_record m on m.Medical_Record_ID=r.Medical_Record_ID " ,
            "WHERE TO_DAYS(r.Registration_Date) = TO_DAYS(NOW()) " ,
            "and r.Registration_Status = \"1\" " ,
            "and ( m.Doctor_ID = #{userId,jdbcType=INTEGER} " ,
            "or ( m.Doctor_ID != #{userId,jdbcType=INTEGER} and r.Doctor_ID = #{userId,jdbcType=INTEGER} " ,
            "and EXISTS( " ,
            "select * " ,
            "from `user` operate_doctor " ,
            "where operate_doctor.User_ID = m.Doctor_ID and operate_doctor.User_Status=\"2\" " ,
            ")))"
    })
    @ResultMap("SecondResultMap")
    List<Registration> listRegistrationFromUserByUserId(Integer userId);

    /**
     * @title: listRegistrationFromDepartmentByUserId
     * @description: 展示挂号列表（科室）
     * @author: 29-y
     * @date: 2019-06-16 21:36
     * @param: [userId]
     * @return: java.util.List<edu.neu.hoso.model.Registration>
     * @throws:
     */
    @Select({
            "select r.*,p.*,m.* " ,
            "from registration r join patient p on p.Patient_ID = r.Patient_ID join medical_record m on m.Medical_Record_ID = r.Medical_Record_ID " ,
            "WHERE TO_DAYS(r.Registration_Date) = TO_DAYS(NOW()) " ,
            "and r.Registration_Status = \"1\" " ,
            "and r.Department_ID = (select u.Department_ID from `user` u where u.User_ID = #{userId,jdbcType=INTEGER}) " ,
            "and (r.Doctor_ID is null or (m.Final_Diagnosis_Doctor_ID is null and m.Doctor_ID in ( " ,
            "SELECT record.Doctor_ID " ,
            "from medical_record record join `user` operate_doctor on record.Doctor_ID = operate_doctor.User_ID " ,
            "WHERE operate_doctor.User_Status = \"2\" and operate_doctor.User_ID != #{userId,jdbcType=INTEGER}) " ,
            "and exists( select * from `user` reg_doctor where reg_doctor.User_ID = r.Doctor_ID and reg_doctor.User_Status = \"2\" " ,
            ")))"
    })
    @ResultMap("SecondResultMap")
    List<Registration> listRegistrationFromDepartmentByUserId(Integer userId);

    List<Registration> getRegistrationByMedicalRecordId(Integer medicalRecordId);

    List<Registration> getRegistration();

    List<Registration> getAllPatientByDepartmentId(int departmentId);
}
    
