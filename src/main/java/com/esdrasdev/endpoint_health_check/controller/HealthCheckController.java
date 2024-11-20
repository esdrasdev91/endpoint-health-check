package com.esdrasdev.endpoint_health_check.controller;

import com.esdrasdev.endpoint_health_check.service.CustomHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    private final CustomHealthIndicator customHealthIndicator;

    public HealthCheckController(CustomHealthIndicator customHealthIndicator) {
        this.customHealthIndicator = customHealthIndicator;
    }

    @GetMapping("/custom-health")
    public Health customHealth() {
        return customHealthIndicator.health();
    }

}
