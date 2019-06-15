package com.example.common.client.auth;

import com.example.common.service.security.auth.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorityController {
    @Autowired
    AuthorityService authorityInf;
}
