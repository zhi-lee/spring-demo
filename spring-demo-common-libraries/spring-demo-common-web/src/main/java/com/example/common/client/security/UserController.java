package com.example.common.client.security;

import com.example.common.entity.security.User;
import com.example.common.service.security.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller("/user")
public class UserController {
    @Autowired
    UserService userInf;

    @RequestMapping(value = "/incre", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    void increUser(@RequestBody User user) { userInf.raiseUser(user); }
}
