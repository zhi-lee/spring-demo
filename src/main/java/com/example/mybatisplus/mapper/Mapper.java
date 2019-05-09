package com.example.mybatisplus.mapper;

/**
 * <p>抽象mapper</p>
 *
 * @param <T>
 */
public interface Mapper<T> {
    /**
     * <p>根据主键获取实体数据</p>
     *
     * @param id
     * @return
     */
    T getByPrimaryKey(long id);

    /**
     * <p>根据条件获取实体对象</p>
     * @param query
     * @return
     */
    T getByExample(T query);

    /**
     * <p>根据相关条件查询相关内容</p>
     * @param query
     * @return
     */
    int countByExample(T query);
}
