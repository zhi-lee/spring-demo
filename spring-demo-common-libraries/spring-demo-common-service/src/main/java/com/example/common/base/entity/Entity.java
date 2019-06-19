package com.example.common.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import org.joda.time.DateTime;

@Data
public class Entity {
    protected Boolean enable;
    protected DateTime createTime;
    @TableField(update = "current_timestamp()")
    protected DateTime updateTime;
    @TableLogic
    protected Integer deleted;
    protected Long creator;
}
