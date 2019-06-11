package com.example.common.repository.user;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.entity.user.User;
import com.example.common.mappers.user.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl extends ServiceImpl<UserMapper, User> implements UserRepository{

}
