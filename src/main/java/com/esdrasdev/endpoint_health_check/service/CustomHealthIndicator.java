package com.esdrasdev.endpoint_health_check.service;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean isHealthy = checkSomething();

        if (isHealthy) {
            return Health.up().withDetail("Custom Check", "the application is running started on port 8080 !!").build();
        } else {
            return Health.down().withDetail("Custom Check", "the application has an error, check console !!").build();
        }
    }

    private boolean checkSomething() {
        return true;
    }

}
