package com.example.common.repository.security.user;


import com.example.common.entity.security.User;

public interface UserRepository {
    User selectUser(User user);
}
