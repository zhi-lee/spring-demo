package com.example.mana.service.user.service;

import com.example.mana.service.auth.entity.Authority;
import com.example.mana.service.user.entity.User;

import java.util.Collection;

/**
 *
 */
public interface UserService {
    /**
     *
     * @param uName
     * @return
     */
    User findByUsername(String uName);


}
