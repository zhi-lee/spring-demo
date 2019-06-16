package com.example.common.repository.security.auth;

import com.example.common.entity.security.Authority;

import java.util.Collection;

public interface AuthorityRepository {
    Collection<Authority> selectByUname(String uName);
}
