package com.intest.basicservice.menu.service.impl;

import com.intest.basicservice.menu.service.MenuService;
import com.intest.basicservice.user.vo.MenuVO;
import com.intest.dao.entity.MenuBto;
import com.intest.dao.entity.MenuBtoExample;
import com.intest.dao.mapper.MenuBtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghui
 * @create 2020-08-22 11:32
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuBtoMapper menuBtoMapper;

    public List<MenuVO> getMenuByUserId(String userId) {
        MenuBtoExample menuBtoExample = new MenuBtoExample();
        MenuBtoExample.Criteria criteria = menuBtoExample.createCriteria();
        criteria.andIsdeleteEqualTo((short)1);
        menuBtoExample.setOrderByClause("OrderNo asc");
        List<MenuBto> menuBtoList = menuBtoMapper.selectByExample(menuBtoExample);
        List<MenuVO> rootList = new ArrayList<>();

        for(MenuBto meunBto : menuBtoList) {
            if (meunBto.getFkMenuId() == null) {
                MenuVO menusItem = new MenuVO();
                menusItem.setId(meunBto.getMenuId());
                menusItem.setIsPage(meunBto.getIspage() == 0 ? false : true);
                menusItem.setIsShow(meunBto.getIsshow().intValue() == 1 ? true : false);
                menusItem.setLink(meunBto.getMenulink());
                menusItem.setPId(meunBto.getFkMenuId());
                menusItem.setPermissionId("");
                menusItem.setText(meunBto.getMenudisplayname());
                menusItem.setIconSkin(meunBto.getIcon());
                rootList.add(menusItem);
            }
        }

        for(MenuVO meunVO : rootList) {
            for (MenuBto subMeunBto : menuBtoList) {
                if (subMeunBto.getFkMenuId()!=null && subMeunBto.getFkMenuId().equals(meunVO.getId())) {
                    MenuVO menusItem = new MenuVO();
                    menusItem.setId(subMeunBto.getMenuId());
                    menusItem.setIsPage(subMeunBto.getIspage() == 0 ? false : true);
                    menusItem.setIsShow(subMeunBto.getIsshow().intValue() == 1 ? true : false);
                    menusItem.setLink(subMeunBto.getMenulink());
                    menusItem.setPId(subMeunBto.getFkMenuId());
                    menusItem.setPermissionId("");
                    menusItem.setText(subMeunBto.getMenudisplayname());
                    menusItem.setIconSkin(subMeunBto.getIcon());
                    meunVO.getChildren().add(menusItem);
                }
            }
        }

        return rootList;
    }
}
