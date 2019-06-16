package com.example.common.mappers.security;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.common.entity.security.Authority;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;

public interface AuthorityMapper extends BaseMapper<Authority> {
    Collection<Authority> selectByUname(@Param("uName")String uName);
}
