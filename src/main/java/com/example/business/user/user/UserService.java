package com.example.business.user.user;

import com.example.common.base.manager.BaseService;
import com.example.mapper.user.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<UserMapper,User> implements UserServiceInf{

}
