package com.example.base.entity;

import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serializable;

@Data
public class Entity implements Serializable {
    //主键
    Long id;
    //更新时间
    DateTime updateTime;
    //创建时间
    DateTime createTime;
    //是否删除
    Integer delete;
    //创建者
    String creator;
    //防止long精度丢失
    String idForStr;
}
