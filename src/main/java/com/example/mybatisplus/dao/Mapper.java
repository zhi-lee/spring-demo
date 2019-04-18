package com.example.common.base.dao;


import com.example.common.base.entity.Entity;

public interface Mapper {
    Object get(long id);

    int countByExample(Entity query);
}
