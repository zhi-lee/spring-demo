package com.example.common.entity.security;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.common.base.entity.Entity;
import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serializable;

@Data
@TableName("authority")
public class Authority extends Entity implements Serializable {
    protected Long id;
    protected String name;
    protected String code;
    protected Integer type;
    protected String descritpion;
    protected String icon;

}
