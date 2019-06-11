package com.example.common.repository.role;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.entity.role.Role;
import com.example.common.mappers.role.RoleMapper;
import org.springframework.stereotype.Repository;

@Repository
public class RoleRepositoryImpl extends ServiceImpl<RoleMapper, Role> implements RoleRepository {
}
