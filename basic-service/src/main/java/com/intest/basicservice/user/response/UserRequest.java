package com.intest.basicservice.user.response;



import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserRequest {

    @Size(max = 20, min = 6, message = "用户名长度超过限制")
    private String userName;

    @Size(max = 16, min = 8, message = "密码长度超过限制")
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
