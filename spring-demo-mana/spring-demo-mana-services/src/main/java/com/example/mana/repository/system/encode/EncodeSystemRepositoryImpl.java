package com.example.mana.repository.system.encode;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mana.entity.system.EncodeSystem;
import com.example.mana.mappers.system.EncodeSystemMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EncodeSystemRepositoryImpl extends ServiceImpl<EncodeSystemMapper, EncodeSystem> implements EncodeSystemRepository {
}
