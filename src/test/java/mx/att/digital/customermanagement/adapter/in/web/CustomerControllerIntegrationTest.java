package mx.att.digital.customermanagement.adapter.in.web;

import mx.att.digital.customermanagement.adapter.out.persistence.InMemoryCustomerRepository;
import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest(CustomerController.class)
@Import(InMemoryCustomerRepository.class)
class CustomerControllerIntegrationTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testCreateCustomer() {
        String customerJson = """
        {
            "id": "test-1",
            "name": "Test Customer",
            "email": "test@example.com"
        }
        """;

        webTestClient.post()
                .uri("/api/customers")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(customerJson)
                .exchange()
                .expectStatus().isCreated()
                .expectBody()
                .jsonPath("$.id").isEqualTo("test-1")
                .jsonPath("$.name").isEqualTo("Test Customer");
    }
}