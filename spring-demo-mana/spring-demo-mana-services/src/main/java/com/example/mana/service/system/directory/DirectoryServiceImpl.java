package com.example.mana.service.system.directory;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mana.entity.system.Directory;
import com.example.mana.repository.system.directory.DirectoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DirectoryServiceImpl implements DirectoryService {

    @Autowired
    DirectoryRepository encodeSystemRepo;

    @Override
    public Collection<Directory> obtainWithCondition(Directory dir) {
        return encodeSystemRepo.list(new QueryWrapper<>(dir));
    }

}
