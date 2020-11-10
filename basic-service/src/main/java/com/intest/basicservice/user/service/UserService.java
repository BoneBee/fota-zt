package com.intest.basicservice.user.service;


import com.intest.basicservice.table.common.ResponseBean;
import com.intest.basicservice.user.request.AddUserRequest;
import com.intest.basicservice.user.request.DeleteUserRequest;
import com.intest.basicservice.user.request.UpdatePassworldRequest;
import com.intest.basicservice.user.request.UpdateUserRequest;
import com.intest.basicservice.user.response.UserPage;
import com.intest.basicservice.user.vo.LoginVO;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.dao.entity.UserBto;
import com.intest.dao.entity.table.MenuExtend;
import com.intest.partsservice.part.response.DateResponse;

import java.util.List;

public interface UserService {

    LoginVO checkLogin(String Ip, String browser, String userName, String password);

    LoginVO getUserLoginInfo(String userId);

    int inRegister(AddUserRequest request, UserBto user);

    int updateUser(UpdateUserRequest request);

    int deleteUser(List<DeleteUserRequest> request);

    int resetPassworld(String userId);

    int updatePassworld(UpdatePassworldRequest request);

    PagerDataBaseVO getUserInfo(UserPage model);

    List<MenuExtend> getUserPermission(String userId);

    int updateUserState(String userId, int state);

    DateResponse selectLoginName(String loginName, String id);

    DateResponse selectPhone(String phone, String id);

    DateResponse selectMail(String mail, String id);

}
