package com.alibaba.staragent.boot.example;

import com.alibaba.staragent.boot.example.service.HelloService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootExampleApplication.class)
public class SpringBootExampleApplicationTests {

	@Test
	public void contextLoads() {
	}
}
