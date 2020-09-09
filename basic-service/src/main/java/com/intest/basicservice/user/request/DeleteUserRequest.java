package com.intest.basicservice.user.request;

import java.util.List;

public class DeleteUserRequest {
    private String id;

    public DeleteUserRequest() {
    }

    public DeleteUserRequest(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
