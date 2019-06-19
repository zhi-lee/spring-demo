package com.example.common.entity.security;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.common.base.entity.Entity;
import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serializable;

@Data
@TableName("user")
public class User extends Entity implements Serializable {
    protected Long id;
    protected String name;
    protected String realname;
    protected String password;
    protected String salt;
    protected Integer age;
    protected Integer sex;
    protected String phone;
    protected Boolean expire;
    protected Boolean locked;
}
