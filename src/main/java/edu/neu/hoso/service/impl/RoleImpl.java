package edu.neu.hoso.service.impl;

import edu.neu.hoso.model.Role;
import edu.neu.hoso.model.RoleMapper;
import edu.neu.hoso.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleImpl implements RoleService {
    @Resource
    RoleMapper roleMapper;
    @Override
    public Role findRoleByID(int roleID) {
        return roleMapper.selectByPrimaryKey(roleID);
    }
}
