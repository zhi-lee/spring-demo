package com.example.common.web.client.auth;

import com.example.common.service.auth.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorityController {
    @Autowired
    AuthorityService authorityInf;
}
