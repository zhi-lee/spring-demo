package com.example.common.service.security.auth;

import com.example.common.entity.security.Authority;
import com.example.common.repository.security.auth.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    AuthorityRepository authorityRepo;

    @Override
    public Collection<Authority> obtainByUname(String uName) {
        return authorityRepo.selectByUname(uName);
    }
}
