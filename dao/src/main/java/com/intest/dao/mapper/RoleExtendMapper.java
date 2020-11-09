package com.intest.dao.mapper;

import com.intest.dao.entity.RoleBto;
import com.intest.dao.entity.RoleBtoExample;
import com.intest.dao.entity.system.RoleListDateExtend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleExtendMapper {
    List<RoleListDateExtend> getRoleListDate();
}