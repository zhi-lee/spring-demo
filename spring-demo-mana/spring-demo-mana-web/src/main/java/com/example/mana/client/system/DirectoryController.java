package com.example.mana.client.system;

import com.example.mana.entity.system.Directory;
import com.example.mana.service.system.directory.DirectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
public class DirectoryController {
    @Autowired
    public DirectoryService directoryInf;

    @RequestMapping(value = "/directories", method = RequestMethod.GET)
    @ResponseBody
    Collection<Directory> acqByDirCode(Directory dir) {
        return directoryInf.obtainWithCondition(dir);
    }
}
