package com.example.mana.web.response;

import com.example.base.entity.Entity;

public class Result<T extends Entity> {
    //响应码
    int code;
    //响应消息
    String message;
    //响应数据
    T data;
}
