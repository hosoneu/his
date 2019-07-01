package edu.neu.hoso.service;

import edu.neu.hoso.model.Role;
import edu.neu.hoso.model.User;

import java.util.List;

/**
 * @title: UserService
 * @package edu.neu.hoso.service
 * @description: 用户类业务接口
 * @author: Mike
 * @date: 2019-06-11 11:07
 * @version: V1.0
*/
public interface UserService {
    Integer insert(User user);
    void deleteById(Integer id);
    void deleteByLoginname(String loginname);
    void deleteByUserName(String userName);
    void update(User user);
    User getUserById(Integer id);
    List<User> getUserByLoginname(String loginname);
    List<User> getUserByUserName(String userName);
    List<User> getUserByRoleId(Integer roleId);
    List<User> getUserByUserTitleId(Integer userTitleId);
    List<User> getUserByUserGender(String userGender);
    List<User> getAllUser();
    List<User> getUserByDepartmentID(int departmentID);
    List<User> getUserByRole(Integer roleId);
    List<User> getAllUserWithRole();
    List<Role> getAllRole();
}
