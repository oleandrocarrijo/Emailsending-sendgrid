package com.devsuperior.integrations.config;

import com.devsuperior.integrations.services.EmailService;
import com.devsuperior.integrations.services.MockEmailService;
import com.devsuperior.integrations.services.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
