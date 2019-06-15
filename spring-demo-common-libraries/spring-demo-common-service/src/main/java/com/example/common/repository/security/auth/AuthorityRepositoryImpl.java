package com.example.common.repository.security.auth;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.entity.security.Authority;
import com.example.common.mappers.security.AuthorityMapper;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorityRepositoryImpl extends ServiceImpl<AuthorityMapper, Authority> implements AuthorityRepository {
}
