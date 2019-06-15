package com.example.common.repository.security.role;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.entity.security.Role;
import com.example.common.mappers.security.RoleMapper;
import org.springframework.stereotype.Repository;

@Repository
public class RoleRepositoryImpl extends ServiceImpl<RoleMapper, Role> implements RoleRepository {
}
