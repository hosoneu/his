package edu.neu.hoso.model;

public class Function {
    private Integer functionId;

    private Integer roleId;

    private String functionUrl;

    private String functionName;

    private Integer reverse1;

    public Function(Integer functionId, Integer roleId, String functionUrl, String functionName, Integer reverse1) {
        this.functionId = functionId;
        this.roleId = roleId;
        this.functionUrl = functionUrl;
        this.functionName = functionName;
        this.reverse1 = reverse1;
    }

    public Function() {
        super();
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getFunctionUrl() {
        return functionUrl;
    }

    public void setFunctionUrl(String functionUrl) {
        this.functionUrl = functionUrl == null ? null : functionUrl.trim();
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    public Integer getReverse1() {
        return reverse1;
    }

    public void setReverse1(Integer reverse1) {
        this.reverse1 = reverse1;
    }
}