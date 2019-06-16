package com.example.common.entity.security;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serializable;

@Data
@TableName("role")
public class Role implements Serializable {
    protected int id;
    private String name;
    private Integer supRole;
    private String roleCode;
    private String description;
    private boolean enable;
    private DateTime createTime;
    protected DateTime updateTime;
    @TableLogic
    private Integer deleted;
    private Integer creator;
}
