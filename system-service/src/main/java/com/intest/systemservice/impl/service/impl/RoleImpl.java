package com.intest.systemservice.impl.service.impl;

import com.intest.dao.entity.RoleBto;
import com.intest.dao.entity.RoleBtoExample;
import com.intest.dao.mapper.RoleBtoMapper;
import com.intest.systemservice.impl.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleImpl implements RoleService {
    @Autowired
    RoleBtoMapper mapper;

    @Override
    public RoleBto getRoleById(String roleId) {
        return mapper.selectByPrimaryKey(roleId);
    }

    @Override
    public RoleBto getRoleByName(String roleName) {
        RoleBtoExample roleBtoExample = new RoleBtoExample();
        RoleBtoExample.Criteria criteria = roleBtoExample.createCriteria();
        criteria.andRoleNameEqualTo(roleName);
        List<RoleBto> roleBtos = mapper.selectByExample(roleBtoExample);
        System.out.println(roleBtos.size());
        if (roleBtos != null && roleBtos.size() != 0) {
            return roleBtos.get(0);
        }else{
            return null;
        }
    }

    @Override
    public int addRole(RoleBto roleBto) {
        return mapper.insert(roleBto);
    }

    @Override
    public int updateRole(RoleBto roleBto) {
        return mapper.updateByPrimaryKey(roleBto);
    }

    @Override
    public int deleteRole(String roleId) {
        return mapper.deleteByPrimaryKey(roleId);
    }
}
