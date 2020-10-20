package com.intest.carservice.carTypeTool;

import com.intest.dao.entity.UserBto;
import com.intest.dao.mapper.UserBtoMapper;

public class carTools {

    public static String replaceCharacter(String OldChar) {
        String NewChar = "";
        String charter = OldChar.split(" ")[0];

        switch (charter) {
            case "carTypeId":
                NewChar = OldChar.replace(charter, "Cartype_Id");
                break;
        }
        return NewChar;
    }

    public static String getUserRealName(UserBtoMapper userMapper, String UserId){

        UserBto usbto=new UserBto();
        usbto = userMapper.selectByPrimaryKey(UserId);
        String UserName="";
        if(usbto!=null&&!usbto.getRealName().equals("")){
            UserName=usbto.getRealName();
        }
        return UserName;
    }
}
