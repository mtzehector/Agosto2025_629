package mx.att.digital.customermanagement.config;

import mx.att.digital.customermanagement.application.port.input.CustomerInputPort;
import mx.att.digital.customermanagement.application.port.output.CustomerOutputPort;
import mx.att.digital.customermanagement.application.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CustomerInputPort customerInputPort(CustomerOutputPort outputPort) {
        return new CustomerServiceImpl(outputPort);
    }
    
    // ✅ Spring detectará automáticamente MockCustomerOutputPort gracias a @Component
    // ✅ Y solo lo usará cuando el perfil "test" esté activo
}