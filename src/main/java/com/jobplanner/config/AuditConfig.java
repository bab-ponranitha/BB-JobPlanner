package com.jobplanner.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.jobPlanner.repository")
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class AuditConfig {
	@Bean
    public AuditorAware<String> auditorAware() {
        return new AuditAwareImpl();
    }
}
