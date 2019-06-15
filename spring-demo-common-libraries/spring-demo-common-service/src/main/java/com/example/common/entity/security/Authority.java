package com.example.common.entity.security;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serializable;

@Data
@TableName("authority")
public class Authority implements Serializable {
    protected int id;
    protected String name;
    protected String code;
    protected int type;
    protected String descritpion;
    protected boolean enable;
    protected DateTime createTime;
    @TableLogic
    protected int deleted;
    protected int creator;
}
