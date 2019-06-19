package com.example.common.service.security.user;

import com.example.common.entity.security.User;

public interface UserService {
    User obtainByUname(String uName);

    void raiseUser(User u);
}
