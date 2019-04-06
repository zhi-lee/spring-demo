package com.example.common.base.entity;

public class PageEntityQuery extends Entity {
    //当前页号
    int currentPageNum;
    //页大小
    int pageSize;

    public int getCurrentPageNum() {
        return currentPageNum;
    }

    public void setCurrentPageNum(int currentPageNum) {
        this.currentPageNum = currentPageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
