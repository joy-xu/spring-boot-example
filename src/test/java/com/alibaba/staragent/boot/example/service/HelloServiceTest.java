package com.alibaba.staragent.boot.example.service;

import com.alibaba.staragent.boot.example.SpringBootExampleApplicationTests;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class HelloServiceTest extends SpringBootExampleApplicationTests {

    @Autowired
    private HelloService helloService;

    @Test
    public void hello() throws Exception {
        String helloWorld = helloService.hello("World");

        assertEquals(helloWorld, "Hello World");
    }

}