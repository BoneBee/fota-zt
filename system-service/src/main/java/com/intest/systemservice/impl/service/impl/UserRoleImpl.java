package com.intest.systemservice.impl.service.impl;

import com.intest.dao.entity.UserRoleBto;
import com.intest.dao.entity.UserRoleBtoExample;
import com.intest.dao.mapper.UserRoleBtoMapper;
import com.intest.systemservice.impl.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleImpl implements UserRoleService {

    @Autowired
    UserRoleBtoMapper userRoleBtoMapper;

    @Override
    public UserRoleBto getUserRoleById(String userRoleId) {
        return userRoleBtoMapper.selectByPrimaryKey(userRoleId);
    }

    @Override
    public UserRoleBto getUserRoleByUserId(String userId) {
        UserRoleBtoExample example = new UserRoleBtoExample();
        UserRoleBtoExample.Criteria criteria = example.createCriteria();
        criteria.andFkUserIdEqualTo(userId);
        List<UserRoleBto> userRoleBtos = userRoleBtoMapper.selectByExample(example);
        if (userRoleBtos == null || userRoleBtos.size() == 0) {
            return null;
        }
        return userRoleBtos.get(0);
    }

    @Override
    public int addUserRole(UserRoleBto userRoleBto) {
        return userRoleBtoMapper.insert(userRoleBto);
    }

    @Override
    public int updateUserRole(UserRoleBto userRoleBto) {
        return userRoleBtoMapper.updateByPrimaryKey(userRoleBto);
    }

    @Override
    public int deleteUserRole(String userRoleId) {
        return userRoleBtoMapper.deleteByPrimaryKey(userRoleId);
    }
}
