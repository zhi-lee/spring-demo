package com.example.mana.service.auth.service;

import com.example.mana.service.auth.entity.Authority;
import com.example.mana.service.auth.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    AuthorityRepository authorityInf;
    @Override
    public Collection<Authority> findByUserPrimaryKey(String uId) {
        if (null == uId || "".equals(uId))
            throw new NullPointerException();
        return authorityInf.selectByUserPrimaryKey(uId);
    }
}
