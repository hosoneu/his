package edu.neu.hoso.model;

public class ExpenseType {
    private Integer expenseTypeId;

    private String expenseTypeCode;

    private String expenseTypeName;

    public ExpenseType(Integer expenseTypeId, String expenseTypeCode, String expenseTypeName) {
        this.expenseTypeId = expenseTypeId;
        this.expenseTypeCode = expenseTypeCode;
        this.expenseTypeName = expenseTypeName;
    }

    public ExpenseType() {
        super();
    }

    public Integer getExpenseTypeId() {
        return expenseTypeId;
    }

    public void setExpenseTypeId(Integer expenseTypeId) {
        this.expenseTypeId = expenseTypeId;
    }

    public String getExpenseTypeCode() {
        return expenseTypeCode;
    }

    public void setExpenseTypeCode(String expenseTypeCode) {
        this.expenseTypeCode = expenseTypeCode == null ? null : expenseTypeCode.trim();
    }

    public String getExpenseTypeName() {
        return expenseTypeName;
    }

    public void setExpenseTypeName(String expenseTypeName) {
        this.expenseTypeName = expenseTypeName == null ? null : expenseTypeName.trim();
    }
}