package com.example.mana.service.auth.repository;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.mana.service.auth.entity.Authority;
import com.example.mana.mapper.auth.AuthorityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class AuthorityRepositoryImpl extends ServiceImpl<AuthorityMapper, Authority> implements AuthorityRepository {
    @Autowired
    AuthorityMapper authorityDao;

    @Override
    public Collection<Authority> selectByUserPrimaryKey(String uId) {
        return null;
    }
}
