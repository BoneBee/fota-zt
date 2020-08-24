package com.intest.basicservice.menu.service;

import com.intest.basicservice.user.vo.MenuVO;

import java.util.List;

/**
 * @author zhanghui
 * @create 2020-08-22 11:32
 */
public interface MenuService {

    List<MenuVO> getMenuByUserId(String userId);
}
