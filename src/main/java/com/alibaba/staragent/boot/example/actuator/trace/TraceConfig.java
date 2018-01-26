package com.alibaba.staragent.boot.example.actuator.trace;

import org.springframework.boot.actuate.trace.InMemoryTraceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * trace配置
 *
 * @author joy  on 2018/1/26
 */
@Configuration
public class TraceConfig {

    @Bean
    public InMemoryTraceRepository traceRepository() {
        InMemoryTraceRepository traceRepository = new InMemoryTraceRepository();

        traceRepository.setCapacity(10000);

        return traceRepository;
    }
}
