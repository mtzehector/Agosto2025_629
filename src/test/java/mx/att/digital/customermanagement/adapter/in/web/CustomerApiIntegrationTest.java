package mx.att.digital.customermanagement.adapter.in.web;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import mx.att.digital.customermanagement.config.TestConfig;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestConfig.class)
@ActiveProfiles("test")
class CustomerApiIntegrationTest {

	@Test
    void contextLoads() {
        // Test básico para verificar que la aplicación se inicia
        // Este test valida que el contexto de Spring se carga correctamente
    }
}