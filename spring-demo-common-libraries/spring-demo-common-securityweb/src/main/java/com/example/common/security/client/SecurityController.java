package com.example.common.security.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SecurityController {
    @RequestMapping(value = "/ulogin",method = RequestMethod.GET)
    ModelAndView loginPage(HttpServletRequest req, HttpServletResponse resp) {
        return new ModelAndView("login");
    }
}
