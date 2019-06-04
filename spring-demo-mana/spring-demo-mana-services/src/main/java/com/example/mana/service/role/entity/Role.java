package com.example.mana.service.role.entity;

import lombok.Data;

@Data
public class Role {
    protected int id;
    private String rolename;
    private int suprole;
    private String rolecode;
    private String description;
    private boolean enable;
    private int create_time;
    private boolean deleteed;
    private int creator;
}
