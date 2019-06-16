package com.example.mana.service.system.directory;

import com.example.mana.entity.system.Directory;

import java.util.Collection;

public interface DirectoryService {
    Collection<Directory> obtainWithCondition(Directory dir);
}
