package com.example.common.repository.auth;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.entity.auth.Authority;
import com.example.common.mappers.auth.AuthorityMapper;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorityRepositoryImpl extends ServiceImpl<AuthorityMapper, Authority> implements AuthorityRepository {
}
