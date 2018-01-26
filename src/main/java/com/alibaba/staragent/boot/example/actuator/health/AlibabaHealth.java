package com.alibaba.staragent.boot.example.actuator.health;

import java.time.Instant;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Health健康指示器
 *
 * @author joy  on 2018/1/26
 */
@Component
public class AlibabaHealth implements HealthIndicator {

    @Override
    public Health health() {
        RestTemplate restTemplate = new RestTemplate();

        try {
            restTemplate.getForObject("https://www.taobao.com", String.class);
            return Health.up().build();
        } catch (Exception e) {
            return Health.down()
                .withDetail("reason", e.getMessage())
                .withDetail("time", Instant.now())
                .build();
        }

    }
}
