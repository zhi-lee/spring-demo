package com.example.base.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * <p>分页实体对象</p>
 */
@Data
@AllArgsConstructor
public class PageEntity {
    //当前页号
    int currentPageNum;
    //总条数
    int totalNum;
    //页大小
    int pageSize;
    //页数据
    List  data;

    public PageEntity(int totalNum, List data) {
        this(0, totalNum, 10, data);
    }
}
