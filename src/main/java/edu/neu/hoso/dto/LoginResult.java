package edu.neu.hoso.dto;

import edu.neu.hoso.model.Department;
import edu.neu.hoso.model.Role;
import edu.neu.hoso.model.User;

public class LoginResult {
   private User user;
   private Department department;
   private Role role;

    public LoginResult(User user, Department department, Role role) {
        this.user = user;
        this.department = department;
        this.role = role;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
