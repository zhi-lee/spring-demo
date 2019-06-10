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
    protected int create_time;
    protected String salt;
    protected int age;
    protected int sex;
    protected String phone;
    protected int last_login_time;
    protected boolean enable;
    protected boolean expire;
    protected boolean locked;
    protected boolean deleteed;
}
