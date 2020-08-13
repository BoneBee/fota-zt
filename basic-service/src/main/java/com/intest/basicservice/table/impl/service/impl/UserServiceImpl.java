package com.intest.basicservice.table.impl.service.impl;

import com.intest.basicservice.table.impl.service.UserService;
import com.intest.dao.entity.UploadFileExample;
import com.intest.dao.entity.UserBto;
import com.intest.dao.entity.UserBtoExample;
import com.intest.dao.mapper.UserBtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserBtoMapper userBtoMapper;

    @Override
    public UserBto getUserByname(String loginName) {
        UserBtoExample example = new UserBtoExample();
        UserBtoExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(loginName);
        List<UserBto> userBtos = userBtoMapper.selectByExample(example);
        if (userBtos != null || userBtos.size() != 0) {
            return userBtos.get(0);
        } else {
            return null;
        }
    }

    @Override
    public int addUser(UserBto userBto) {
        return userBtoMapper.insert(userBto);
    }

    @Override
    public int updateUser(UserBto userBto) {
        return userBtoMapper.updateByPrimaryKey(userBto);
    }

    @Override
    public boolean deleteUser(String name) {
        return false;
    }
}
