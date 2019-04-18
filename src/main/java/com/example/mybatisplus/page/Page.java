package com.example.common.page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Page<T> {
    private Map<String, Object> ret = null;
    //当前页号
    int currentPageNum;
    //总条数
    int totalNum;
    //页大小
    int pageSize;
    //页数据
    List<T> data;

    public Page() {
    }

    public Page(int currentPageNum, int totalNum, List<T> data) {
        this.currentPageNum = currentPageNum;
        this.totalNum = totalNum;
        this.data = data;
    }

    public int getCurrentPageNum() {
        return currentPageNum;
    }

    public void setCurrentPageNum(int currentPageNum) {
        this.currentPageNum = currentPageNum;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    Map<String, Object> getPage() {
        if (Objects.isNull(ret)) {
            ret = new HashMap<>(data.size());
        }
        ret.put(PageEnum.CURRENTPAGE.getKey(),currentPageNum);
        ret.put(PageEnum.TOTAL.getKey(),totalNum);
        ret.put(PageEnum.DATA.getKey(),data);
        return ret;
    }

    static enum PageEnum {
        CURRENTPAGE("currentPage"), TOTAL("recordCount"), PAGESIZE("recordSize"),DATA("row");
        String key;

        PageEnum(String key) {
            this.key = key;
        }

        public String getKey() {
            return key;
        }
    }
}
