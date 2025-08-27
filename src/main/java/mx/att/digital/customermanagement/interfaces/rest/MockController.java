package mx.att.digital.customermanagement.interfaces.rest;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/api/mocks")
public class MockController {
    
    private final ResourceLoader resourceLoader;
    
    public MockController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
    
    @GetMapping("/customer/{filename}")
    public ResponseEntity<String> getMockCustomer(@PathVariable String filename) throws IOException {
        Resource resource = resourceLoader.getResource("classpath:mocks/customer/" + filename);
        String content = new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
        return ResponseEntity.ok().header("Content-Type", "application/json").body(content);
    }
}