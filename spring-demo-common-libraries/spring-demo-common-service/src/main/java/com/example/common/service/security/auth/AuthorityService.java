package com.example.common.service.security.auth;

import com.example.common.entity.security.Authority;

import java.util.Collection;

public interface AuthorityService {
    Collection<Authority> obtainByUname(String uName);
}
