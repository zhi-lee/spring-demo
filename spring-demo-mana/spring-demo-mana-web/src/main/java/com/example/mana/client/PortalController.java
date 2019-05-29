package com.example.mana.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@Controller
public class PortalController {
    @RequestMapping(value = { "/"})
    public ModelAndView portal(ServletRequest req, ServletResponse resp) {
        return new ModelAndView("index");
    }
}
