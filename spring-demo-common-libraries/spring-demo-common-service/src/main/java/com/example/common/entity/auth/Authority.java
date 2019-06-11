package com.example.common.entity.auth;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("authority")
public class Authority implements Serializable {
    protected int id;
    protected String authname;
    protected String authcode;
    protected String descritpion;
    protected boolean enable;
    protected int createTime;
    protected boolean deleteed;
    protected int creator;
}
