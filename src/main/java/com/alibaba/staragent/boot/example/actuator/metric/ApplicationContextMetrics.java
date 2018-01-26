package com.alibaba.staragent.boot.example.actuator.metric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.PublicMetrics;
import org.springframework.boot.actuate.metrics.Metric;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * 自定义应用上下文Metric, 结合Actuator查看
 *
 * @author joy  on 2018/1/26
 */
@Component
public class ApplicationContextMetrics implements PublicMetrics {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public Collection<Metric<?>> metrics() {
        List<Metric<?>> metrics = new ArrayList<>(16);

        metrics.add(new Metric<>("spring.context.start-date", applicationContext.getStartupDate()));
        metrics.add(new Metric<Number>("spring.controllers",
            applicationContext.getBeanNamesForAnnotation(Controller.class).length));

        return metrics;
    }
}
