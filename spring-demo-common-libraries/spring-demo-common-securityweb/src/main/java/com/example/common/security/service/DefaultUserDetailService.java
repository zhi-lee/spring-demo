package com.example.common.security.service;

import com.example.common.entity.security.User;
import com.example.common.exception.NullParameterException;
import com.example.common.service.security.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailService")
public class DefaultUserDetailService implements UserDetailsService {
    @Autowired
    UserService userInf;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (null==username||"".equals(username))
            throw new NullParameterException();
        User u=userInf.obtainByUname(username);
        if (null==u)
            throw new UsernameNotFoundException("[E51001] user not find");
        UserDetailsWrapper userWrapper=(UserDetailsWrapper)u;
        return userWrapper.buildAuth();
    }
}
