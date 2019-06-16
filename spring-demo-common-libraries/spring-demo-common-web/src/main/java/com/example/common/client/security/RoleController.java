package com.example.common.client.security;

import com.example.common.service.security.role.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RoleController {
    @Autowired
    RoleService roleInf;
}
