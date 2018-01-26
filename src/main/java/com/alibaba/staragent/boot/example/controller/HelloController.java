package com.alibaba.staragent.boot.example.controller;

import java.time.Instant;
import java.util.Date;

import com.alibaba.staragent.boot.example.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author joy
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;


    @Autowired
    private CounterService counterService;

    @Autowired
    private GaugeService gaugeService;

    @GetMapping("/world")
    public String hello() {

        //test actuator counterService
        counterService.increment("metric.counter.test");

        //test actuator gaugeService
        gaugeService.submit("metric.gauge.test", Instant.now().getNano());

        return helloService.hello("World");
    }
}
