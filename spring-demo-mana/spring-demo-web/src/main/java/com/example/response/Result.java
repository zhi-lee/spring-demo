package com.example.response;


public class Result<T> {
    //响应码
    int code;
    //响应消息
    String message;
    //响应数据
    T data;
}
