package com.alibaba.staragent.boot.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * HelloService
 *
 * @author joy  on 2018/1/25
 */
@Service
public class HelloService {

    private final Logger logger = LoggerFactory.getLogger(HelloService.class);

    public String hello(String name) {
        return "Hello " + name;
    }
}
