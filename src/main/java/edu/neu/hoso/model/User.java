package edu.neu.hoso.model;

public class User {
    private Integer userId;

    private String userLoginname;

    private String userPassword;

    private Integer roleId;

    private String userName;

    private Integer departmentId;

    private Integer userTitleId;

    private String userGender;

    public User(Integer userId, String userLoginname, String userPassword, Integer roleId, String userName, Integer departmentId, Integer userTitleId, String userGender) {
        this.userId = userId;
        this.userLoginname = userLoginname;
        this.userPassword = userPassword;
        this.roleId = roleId;
        this.userName = userName;
        this.departmentId = departmentId;
        this.userTitleId = userTitleId;
        this.userGender = userGender;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserLoginname() {
        return userLoginname;
    }

    public void setUserLoginname(String userLoginname) {
        this.userLoginname = userLoginname == null ? null : userLoginname.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getUserTitleId() {
        return userTitleId;
    }

    public void setUserTitleId(Integer userTitleId) {
        this.userTitleId = userTitleId;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender == null ? null : userGender.trim();
    }
}