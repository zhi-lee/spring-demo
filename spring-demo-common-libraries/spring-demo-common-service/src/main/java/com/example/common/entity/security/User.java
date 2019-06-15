package com.example.common.entity.security;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serializable;

@Data
@TableName("user")
public class User implements Serializable {
    protected int id;
    protected String name;
    protected String realname;
    protected String password;
    protected DateTime createTime;
    protected String salt;
    protected int age;
    protected int sex;
    protected String phone;
    protected DateTime lastLoginTime;
    protected boolean enable;
    protected boolean expire;
    protected boolean locked;
    @TableLogic
    protected int deleted;
}
