package com.example.business.user.user;

import com.example.common.base.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/{id}")
    @ResponseBody
    User get(@PathVariable(value = "id",required = true)Long id){
       return userService.getEntity(id);
    }
}
