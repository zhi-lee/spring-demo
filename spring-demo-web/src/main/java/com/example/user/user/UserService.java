package com.example.user.user;

import com.example.base.manager.BaseService;
import com.example.user.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<UserMapper,User> implements UserServiceInf{

}
