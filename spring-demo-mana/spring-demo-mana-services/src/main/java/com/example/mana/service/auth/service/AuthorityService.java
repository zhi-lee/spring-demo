package com.example.mana.service.auth.service;

import com.example.mana.service.auth.entity.Authority;

import java.util.Collection;

public interface AuthorityService {
    public Collection<Authority> findByUserPrimaryKey(String uId);

}
