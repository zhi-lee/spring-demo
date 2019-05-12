package com.example.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class PortalIndexController {
    @RequestMapping("")
    String index(){
        return "index";
    }
}
