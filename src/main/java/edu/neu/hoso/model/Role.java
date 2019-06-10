package edu.neu.hoso.model;

public class Role {
    private Integer roleId;

    private Integer functionId;

    private String roleName;

    public Role(Integer roleId, Integer functionId, String roleName) {
        this.roleId = roleId;
        this.functionId = functionId;
        this.roleName = roleName;
    }

    public Role() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
}