package com.example.common.client.role;

import com.example.common.service.security.role.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RoleController {
    @Autowired
    RoleService roleInf;
}