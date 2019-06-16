package com.example.common.entity.security;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serializable;

@Data
@TableName("user")
public class User implements Serializable {
    protected Integer id;
    protected String name;
    protected String realname;
    protected String password;
    protected DateTime createTime;
    protected String salt;
    protected Integer age;
    protected Integer sex;
    protected String phone;
    protected DateTime lastLoginTime;
    protected boolean enable;
    protected boolean expire;
    protected boolean locked;
    protected DateTime updateTime;
    @TableLogic
    protected Integer deleted;
}
