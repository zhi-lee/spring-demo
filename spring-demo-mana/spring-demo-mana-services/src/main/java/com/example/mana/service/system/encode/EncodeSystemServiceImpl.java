package com.example.mana.service.system.encode;

import com.example.mana.repository.system.encode.EncodeSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncodeSystemServiceImpl implements EncodeSystemService {
    @Autowired
    EncodeSystemRepository encodeSystemRepo;
}
