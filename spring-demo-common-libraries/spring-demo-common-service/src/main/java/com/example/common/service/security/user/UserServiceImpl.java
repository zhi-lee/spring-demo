package com.example.common.service.security.user;

import com.example.common.entity.security.User;
import com.example.common.exception.NullParameterException;
import com.example.common.repository.security.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepo;

    @Override
    public User obtainByUname(String uName) {
        if (uName == null || "".equals(uName))
            return null;
        User user = new User();
        user.setName(uName);
        return userRepo.selectUser(user);
    }
}
