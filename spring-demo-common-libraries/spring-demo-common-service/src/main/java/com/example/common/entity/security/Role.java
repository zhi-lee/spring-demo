package com.example.common.entity.security;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.common.base.entity.Entity;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("role")
public class Role extends Entity implements Serializable {
    protected Long id;
    private String name;
    private Integer supRole;
    private String roleCode;
    private String description;
}
