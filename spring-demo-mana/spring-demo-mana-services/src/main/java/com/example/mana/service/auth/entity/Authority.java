package com.example.mana.service.auth.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Authority implements Serializable {
    protected int id;
    protected String authname;
    protected String authcode;
    protected String descritpion;
    protected boolean enable;
    protected int create_time;
    protected boolean deleteed;
    protected int creator;
}