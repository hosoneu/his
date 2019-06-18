package edu.neu.hoso.model;

public class Workload {
    private  String Expense_Type_Name;
    private  double Costs;

    public Workload(String expense_Type_Name, double costs) {
        Expense_Type_Name = expense_Type_Name;
        Costs = costs;
    }

    @Override
    public String toString() {
        return "Workload{" +
                "Expense_Type_Name='" + Expense_Type_Name + '\'' +
                ", Costs=" + Costs +
                '}';
    }

    public String getExpense_Type_Name() {
        return Expense_Type_Name;
    }

    public void setExpense_Type_Name(String expense_Type_Name) {
        Expense_Type_Name = expense_Type_Name;
    }

    public double getCosts() {
        return Costs;
    }

    public void setCosts(double costs) {
        Costs = costs;
    }
}
