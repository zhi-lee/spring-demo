package com.example.mybatisplus.dao;


import com.example.mybatisplus.entity.Entity;

public interface Mapper {
    Object get(long id);

    int countByExample(Entity query);
}
