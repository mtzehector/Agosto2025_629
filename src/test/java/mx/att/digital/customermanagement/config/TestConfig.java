package mx.att.digital.customermanagement.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.EnableWebFlux;

@TestConfiguration
@EnableWebFlux
public class TestConfig {
    
    @Bean
    public String testBean() {
        return "test-configuration";
    }
}