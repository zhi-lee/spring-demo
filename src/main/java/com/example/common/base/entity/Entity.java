package com.example.common.base.entity;

import org.joda.time.DateTime;

import java.util.Objects;

public class Entity {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(DateTime updateTime) {
        this.updateTime = updateTime;
    }

    public DateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(DateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getIdForStr() {
        return Objects.isNull(id)?"0":id.toString();
    }

    public void setIdForStr(String idForStr) {
        this.idForStr = idForStr;
    }
}
