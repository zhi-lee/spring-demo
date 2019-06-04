package com.example.mana.service.user.repository;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.mana.service.user.entity.User;
import com.example.mana.mapper.user.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl extends ServiceImpl<UserMapper,User> implements UserRepository {


}
