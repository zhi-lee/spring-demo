package com.example.common.entity.user;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("user")
public class User implements Serializable {
    protected int id;
    protected String username;
    protected String realname;
    protected String password;
    protected int createTime;
    protected String salt;
    protected int age;
    protected int sex;
    protected String phone;
    protected int lastLoginTime;
    protected boolean enable;
    protected boolean expire;
    protected boolean locked;
    protected boolean deleteed;
}
