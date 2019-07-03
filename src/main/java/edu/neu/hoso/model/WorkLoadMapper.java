package edu.neu.hoso.model;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface WorkLoadMapper {
    @Select({
            "SELECT expense_type.Expense_Type_Name,SUM(expense_items.Total_Cost) as Costs " ,
                    "FROM expense_items , expense_type " ,
                    "WHERE expense_items.Expense_Type_ID = expense_type.Expense_Type_ID AND expense_items.Expense_Items_ID IN " ,
                    "(SELECT prescription_items.Expense_Items_ID " ,
                    "FROM prescription,prescription_items " ,
                    "WHERE prescription_items.Prescription_ID = prescription.Prescription_ID AND prescription.Medical_Record_ID IN (SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN #{startdate}AND #{enddate}) AND prescription.Doctor_ID = #{doctorID} " ,
                    "UNION " ,
                    "SELECT examination_fmedical_items.Expense_Items_ID " ,
                    "FROM examination ,examination_fmedical_items " ,
                    "WHERE examination.Examination_ID =examination_fmedical_items.Examination_ID AND examination.Medical_Record_ID IN(SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN #{startdate} AND #{enddate}) AND examination.Doctor_ID = #{doctorID} " ,
                    "UNION " ,
                    "SELECT treatment_items.Expense_Items_ID " ,
                    "FROM treatment , treatment_items " ,
                    "WHERE treatment.Treatment_ID =treatment_items.Treatment_ID AND treatment.Medical_Record_ID IN(SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN #{startdate}AND #{enddate})AND treatment.Doctor_ID= #{doctorID}) " ,
                    "GROUP BY expense_type.Expense_Type_Name; "
    })
    List<Workload> FindWorkLoadByDateAndDoctorID(Date startdate, Date enddate, int doctorID);
    @Select({
            "SELECT expense_type.Expense_Type_Name,SUM(expense_items.Total_Cost) as Costs  " ,
                    "FROM expense_items , expense_type " ,
                    "WHERE expense_items.Expense_Type_ID = expense_type.Expense_Type_ID AND expense_items.Expense_Items_ID IN ",
                    "(SELECT prescription_items.Expense_Items_ID " ,
                    "FROM prescription,prescription_items " ,
                    "WHERE prescription_items.Prescription_ID = prescription.Prescription_ID AND prescription.Medical_Record_ID IN (SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN #{startdate}AND #{enddate} ) AND prescription.Doctor_ID IN (SELECT User_ID FROM `user` WHERE Department_ID = #{departmentID}) " ,
                    "UNION " ,
                    "SELECT examination_fmedical_items.Expense_Items_ID " ,
                    "FROM examination ,examination_fmedical_items " ,
                    "WHERE examination.Examination_ID =examination_fmedical_items.Examination_ID AND examination.Medical_Record_ID IN(SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN #{startdate}AND #{enddate} ) AND examination.Doctor_ID IN (SELECT User_ID FROM `user` WHERE Department_ID = #{departmentID}) " ,
                    "UNION " ,
                    "SELECT treatment_items.Expense_Items_ID " ,
                    "FROM treatment , treatment_items " ,
                    "WHERE treatment.Treatment_ID =treatment_items.Treatment_ID AND treatment.Medical_Record_ID IN(SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN #{startdate}AND #{enddate} )AND treatment.Doctor_ID IN (SELECT User_ID FROM `user` WHERE Department_ID = #{departmentID})) " ,
                    "GROUP BY expense_type.Expense_Type_Name; "
    })
    List<Workload> FindWorkLoadByDateAndDoctordepartmentID(Date startdate, Date enddate, int departmentID);
    @Select({
            "SELECT expense_type.Expense_Type_Name,SUM(expense_items.Total_Cost) as Costs  " ,
                    "FROM expense_items , expense_type " ,
                    "WHERE expense_items.Expense_Type_ID = expense_type.Expense_Type_ID AND expense_items.Expense_Items_ID IN (SELECT examination_fmedical_items.Expense_Items_ID " ,
                    "FROM examination ,examination_fmedical_items " ,
                    "WHERE examination.Examination_ID =examination_fmedical_items.Examination_ID AND examination.Medical_Record_ID IN(SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN #{startdate}AND #{enddate}) AND examination_fmedical_items.Doctor_ID = #{techID} " ,
                    "UNION " ,
                    "SELECT examination_drugs_items.Expense_Items_ID " ,
                    "FROM examination ,examination_fmedical_items,examination_drugs_items " ,
                    "WHERE examination.Examination_ID =examination_fmedical_items.Examination_ID AND examination_fmedical_items.Examination_Fmedical_Items_ID = examination_drugs_items.Examination_Fmedical_Items_ID AND examination.Medical_Record_ID IN(SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN #{startdate}AND #{enddate}) AND examination_drugs_items.Doctor_ID = #{techID}) " ,
                    "GROUP BY expense_type.Expense_Type_Name;"
    })
    List<Workload> FindWorkLoadByDateAndTechID(Date startdate, Date enddate, int techID);
    @Select({
            "SELECT expense_type.Expense_Type_Name,SUM(expense_items.Total_Cost) as Costs  " ,
                    "FROM expense_items , expense_type " ,
                    "WHERE expense_items.Expense_Type_ID = expense_type.Expense_Type_ID AND expense_items.Expense_Items_ID IN (SELECT examination_fmedical_items.Expense_Items_ID " ,
                    "FROM examination ,examination_fmedical_items " ,
                    "WHERE examination.Examination_ID =examination_fmedical_items.Examination_ID AND examination.Medical_Record_ID IN(SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN #{startdate}AND #{enddate}) AND examination_fmedical_items.Doctor_ID IN (SELECT User_ID FROM `user` WHERE Department_ID = #{departmentID}) " ,
                    "UNION " ,
                    "SELECT examination_drugs_items.Expense_Items_ID " ,
                    "FROM examination ,examination_fmedical_items,examination_drugs_items " ,
                    "WHERE examination.Examination_ID =examination_fmedical_items.Examination_ID AND examination_fmedical_items.Examination_Fmedical_Items_ID = examination_drugs_items.Examination_Fmedical_Items_ID AND examination.Medical_Record_ID IN(SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN #{startdate}AND #{enddate}) AND examination_drugs_items.Doctor_ID IN (SELECT User_ID FROM `user` WHERE Department_ID = #{departmentID})) " ,
                    "GROUP BY expense_type.Expense_Type_Name;"
    })
    List<Workload> FindWorkLoadByDateAndTechdepartmentID(Date startdate, Date enddate, int departmentID);
    @Select({
            "SELECT DISTINCT COUNT(Medical_Record_ID) AS SumPatient " ,
                    "FROM examination ,examination_fmedical_items " ,
                    "WHERE examination.Examination_ID =examination_fmedical_items.Examination_ID AND examination.Medical_Record_ID IN(SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN #{startdate}AND #{enddate}) AND examination_fmedical_items.Doctor_ID = #{techID};"
    })
    int FindPaitentsByDateAndTechID(Date startdate, Date enddate, int techID);
    @Select({
            "SELECT DISTINCT COUNT(Medical_Record_ID) AS SumPatient " ,
            "FROM examination ,examination_fmedical_items " ,
            "WHERE examination.Examination_ID =examination_fmedical_items.Examination_ID AND examination.Medical_Record_ID IN(SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN #{startdate}AND #{enddate}) AND examination_fmedical_items.Doctor_ID IN (SELECT User_ID FROM `user` WHERE Department_ID = #{techDepartmentID});"
    })
    int FindPaitentsByDateAndTechdepartmentID(Date startdate, Date enddate, int techDepartmentID);
    @Select({"SELECT expense_type.Expense_Type_Name,SUM(expense_items.Total_Cost) " ,
            "FROM expense_items , expense_type ,invoice " ,
            "WHERE invoice.Invoice_ID=expense_items.Invoice_ID AND invoice.Is_Day_Cal='2' AND expense_items.Expense_Type_ID = expense_type.Expense_Type_ID AND invoice.User_ID = #{userID} AND expense_items.Expense_Items_ID IN (SELECT examination_fmedical_items.Expense_Items_ID " ,
            "FROM examination ,examination_fmedical_items " ,
            "WHERE examination.Examination_ID =examination_fmedical_items.Examination_ID AND examination.Medical_Record_ID IN(SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN  #{startdate}AND #{enddate}) " ,
            "UNION " ,
            "SELECT examination_drugs_items.Expense_Items_ID " ,
            "FROM examination ,examination_fmedical_items,examination_drugs_items " ,
            "WHERE examination.Examination_ID =examination_fmedical_items.Examination_ID AND examination_fmedical_items.Examination_Fmedical_Items_ID = examination_drugs_items.Examination_Fmedical_Items_ID AND examination.Medical_Record_ID IN(SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN  #{startdate}AND #{enddate}) " ,
            "UNION " ,
            "SELECT prescription_items.Expense_Items_ID " ,
            "FROM prescription,prescription_items " ,
            "WHERE prescription_items.Prescription_ID = prescription.Prescription_ID AND prescription.Medical_Record_ID IN (SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN  #{startdate}AND #{enddate}) " ,
            "UNION " ,
            "SELECT examination_fmedical_items.Expense_Items_ID " ,
            "FROM examination ,examination_fmedical_items " ,
            "WHERE examination.Examination_ID =examination_fmedical_items.Examination_ID AND examination.Medical_Record_ID IN(SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN  #{startdate}AND #{enddate}) " ,
            "UNION " ,
            "SELECT treatment_items.Expense_Items_ID " ,
            "FROM treatment , treatment_items " ,
            "WHERE treatment.Treatment_ID =treatment_items.Treatment_ID AND treatment.Medical_Record_ID IN(SELECT Medical_Record_ID FROM registration WHERE Registration_Date BETWEEN  #{startdate}AND #{enddate}) " ,
            "UNION " ,
            "SELECT Expense_Items_ID " ,
            "FROM registration " ,
            "WHERE Registration_Date BETWEEN  #{startdate}AND #{enddate} " ,
            ") " ,
            "GROUP BY expense_type.Expense_Type_Name;"})
    List<Workload> FindWorkLoadByDateAndUserID(Date startdate, Date enddate ,int userID );
    @Select({
            "<script>",
            "SELECT expense_type.Expense_Type_Name,SUM(expense_items.Total_Cost) " ,
            "FROM expense_items , expense_type ,invoice " ,
            "WHERE invoice.Invoice_ID=expense_items.Invoice_ID AND invoice.Invoice_ID IN  ",
            "<foreach collection='invoiceIDs' item='invoiceid' open='(' separator=',' close=')'>",
            "#{invoiceid}",
            "</foreach>",
            " AND expense_items.Expense_Type_ID = expense_type.Expense_Type_ID AND expense_items.Expense_Items_ID IN (SELECT examination_fmedical_items.Expense_Items_ID " ,
            "FROM examination ,examination_fmedical_items " ,
            "WHERE examination.Examination_ID =examination_fmedical_items.Examination_ID  " ,
            "UNION " ,
            "SELECT examination_drugs_items.Expense_Items_ID " ,
            "FROM examination ,examination_fmedical_items,examination_drugs_items " ,
            "WHERE examination.Examination_ID =examination_fmedical_items.Examination_ID AND examination_fmedical_items.Examination_Fmedical_Items_ID = examination_drugs_items.Examination_Fmedical_Items_ID  " ,
            "UNION " ,
            "SELECT prescription_items.Expense_Items_ID " ,
            "FROM prescription,prescription_items " ,
            "WHERE prescription_items.Prescription_ID = prescription.Prescription_ID  " ,
            "UNION " ,
            "SELECT examination_fmedical_items.Expense_Items_ID " ,
            "FROM examination ,examination_fmedical_items " ,
            "WHERE examination.Examination_ID =examination_fmedical_items.Examination_ID  " ,
            "UNION " ,
            "SELECT treatment_items.Expense_Items_ID " ,
            "FROM treatment , treatment_items " ,
            "WHERE treatment.Treatment_ID =treatment_items.Treatment_ID " ,
            "UNION " ,
            "SELECT Expense_Items_ID " ,
            "FROM registration " ,
            ") " ,
            "GROUP BY expense_type.Expense_Type_Name;",
            "</script>"
    })
    
    List<Workload> FindWorkLoadByInvoices(@Param("invoiceIDs") List<Integer> invoiceIDs);

}
