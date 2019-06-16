package com.example.common.repository.security.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.entity.security.User;
import com.example.common.mappers.security.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl extends ServiceImpl<UserMapper, User> implements UserRepository{
    @Override
    public User selectUser(User user) {
        return baseMapper.selectOne(new  QueryWrapper<User>(user));
    }
}
