package com.example.mana.repository.system.directory;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mana.entity.system.Directory;
import com.example.mana.mappers.system.DirectoryMapper;
import org.springframework.stereotype.Repository;

@Repository
public class DirectoryRepositoryImpl extends ServiceImpl<DirectoryMapper, Directory> implements DirectoryRepository {
}
