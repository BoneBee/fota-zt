package com.intest.basicservice.user.request;



import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserRequest {

    @Size(max = 20, min = 5, message = "用户名长度必须为5到20位")
    private String userName;

    @Size(max = 18, min = 6, message = "密码长度必须为6到18位")
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
