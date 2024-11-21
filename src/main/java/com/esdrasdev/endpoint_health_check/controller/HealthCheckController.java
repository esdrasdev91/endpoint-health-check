package com.esdrasdev.endpoint_health_check.controller;

import com.esdrasdev.endpoint_health_check.service.CustomHealthIndicator;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HealthCheckController {

    private final CustomHealthIndicator customHealthIndicator;

    @GetMapping("/custom-health")
    public Health customHealth() {
        return customHealthIndicator.health();
    }

}
