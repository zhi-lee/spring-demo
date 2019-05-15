package com.example;

import org.junit.jupiter.api.Test;

import java.util.UUID;


public class TestCase01 {
    @Test
    public void testUUID(){
        System.out.println(UUID.randomUUID().toString());
    }
}
