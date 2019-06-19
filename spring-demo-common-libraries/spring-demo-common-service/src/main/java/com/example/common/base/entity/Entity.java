package com.example.common.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import org.joda.time.DateTime;

public class Entity {
    protected boolean enable;
    protected DateTime createTime;
    @TableField(update = "current_timestamp()")
    protected DateTime updateTime;
    @TableLogic
    protected Integer deleted;
    protected Long creator;
}
