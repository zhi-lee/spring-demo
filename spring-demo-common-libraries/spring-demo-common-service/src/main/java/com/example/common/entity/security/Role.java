package com.example.common.entity.security;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.common.base.entity.Entity;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("role")
public class Role extends Entity implements Serializable {
    protected Long id;
    protected String name;
    protected Integer supRole;
    protected String roleCode;
    protected String description;
}
