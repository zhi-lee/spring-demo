package com.example.common.entity.role;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("role")
public class Role {
    protected int id;
    private String rolename;
    private int suprole;
    private String rolecode;
    private String description;
    private boolean enable;
    private int createTime;
    private boolean deleteed;
    private int creator;
}
