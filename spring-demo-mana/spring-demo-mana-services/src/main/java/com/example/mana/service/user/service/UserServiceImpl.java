package com.example.mana.service.user.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.mana.service.auth.entity.Authority;
import com.example.mana.service.user.entity.User;
import com.example.mana.service.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userInf;

    @Override
    public User findByUsername(String uName) {
        if (null == uName || "".equals(uName))
            throw new NullPointerException();
        EntityWrapper<User> wrapper = new EntityWrapper<>();
        wrapper.where("USERNAME = {0}", uName);
        return userInf.selectOne(wrapper);
    }



}
