package mx.att.digital.customermanagement;

import mx.att.digital.customermanagement.config.TestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestConfig.class)
class OpenApiGeneratorApplicationTests {

    @Test
    void contextLoads() {
    	// Test básico para verificar que el contexto de Spring se carga
    }

}