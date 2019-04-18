package com.example.common.response;

import com.example.mybatisplus.entity.Entity;

public class Result<T extends Entity> {
    //响应码
    int code;
    //响应消息
    String message;
    //响应数据
    T data;
}
