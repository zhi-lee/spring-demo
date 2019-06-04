package com.example.mana.service.auth.repository;

import com.example.mana.service.auth.entity.Authority;

import java.util.Collection;

public interface AuthorityRepository {
    Collection <Authority>selectByUserPrimaryKey(String uId);
}
