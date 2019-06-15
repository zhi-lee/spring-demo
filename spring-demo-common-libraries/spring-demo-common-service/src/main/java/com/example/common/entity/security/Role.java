package com.example.common.entity.security;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.joda.time.DateTime;

@Data
@TableName("role")
public class Role {
    protected int id;
    private String name;
    private int supRole;
    private String roleCode;
    private String description;
    private boolean enable;
    private DateTime createTime;
    @TableLogic
    private int deleted;
    private int creator;
}
