package com.example.common.base.manager;

import com.example.common.base.dao.Mapper;
import com.example.common.base.entity.Entity;

public abstract class BaseService<M extends Mapper,T extends Entity> {
    M mapper;
    /**
     * 根据主键查询
     * @param id
     * @return
     */
    public T getEntity(Long id){
        return (T) mapper.get(id);
    }

    /**
     * 根据查询条件数据条数
     * @param t
     * @return
     */
    public Integer countByEntity(T t){
        return mapper.countByExample(t);
    }


}
