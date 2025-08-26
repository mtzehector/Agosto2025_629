package mx.att.digital.customermanagement.adapter.in.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import mx.att.digital.customermanagement.config.TestConfig;
import mx.att.digital.customermanagement.adapter.in.web.delegate.CustomerApiDelegate;
import mx.att.digital.customermanagement.util.JsonTestUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import static org.assertj.core.api.Assertions.assertThat; // AÑADIR ESTE IMPORT

@WebFluxTest(controllers = CustomerApiController.class)
@Import(TestConfig.class)
class CustomerApiMockTest {

    @Autowired
    private WebTestClient webTestClient;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private CustomerApiDelegate customerApiDelegate;

    @Test
    void createCustomer_ShouldReturnMockResponse() {
        // Arrange
        Customer mockCustomer = new Customer()
            .id("10003")
            .href("/tmf-api/customer/v5/customer/10003")
            .name("Fintech")
            .status("pending");

        when(customerApiDelegate.createCustomer(any(), any(), any()))
            .thenReturn(Mono.just(org.springframework.http.ResponseEntity.status(CREATED).body(mockCustomer)));

        String requestJson = """
        {
            "name": "Fintech",
            "status": "pending"
        }
        """;

        // Act & Assert
        webTestClient.post()
            .uri("/customer/v5/customer")
            .contentType(MediaType.APPLICATION_JSON)
            .bodyValue(requestJson)
            .exchange()
            .expectStatus().isCreated()
            .expectBody()
            .jsonPath("$.id").isEqualTo("10003")
            .jsonPath("$.name").isEqualTo("Fintech")
            .jsonPath("$.status").isEqualTo("pending");
    }

    @Test
    void retrieveCustomer_ShouldReturnMockResponse() {
        // Arrange
        Customer mockCustomer = new Customer()
            .id("10001")
            .href("/tmf-api/customer/v5/customer/10001")
            .name("ACME Corporation")
            .status("active");

        when(customerApiDelegate.retrieveCustomer(anyString(), anyString(), any()))
            .thenReturn(Mono.just(org.springframework.http.ResponseEntity.ok(mockCustomer)));

        // Act & Assert
        webTestClient.get()
            .uri("/customer/v5/customer/10001")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody()
            .jsonPath("$.id").isEqualTo("10001")
            .jsonPath("$.name").isEqualTo("ACME Corporation")
            .jsonPath("$.status").isEqualTo("active");
    }

    @Test
    public void createCustomer_WithMockJsonFile_ShouldMatchExpected() throws Exception {
        // Cargar el JSON esperado como objeto - usar Customer en lugar de CustomerResponse
        Customer expectedResponse = JsonTestUtils.loadJsonFromFile(
            "mocks/customer/createCustomerResponse.json", 
            Customer.class // CAMBIAR A Customer.class
        );

        // Realizar la llamada API y comparar
        webTestClient.post()
            .uri("/customer/v5/customer")
            .contentType(MediaType.APPLICATION_JSON)
            .bodyValue("{\"name\": \"Fintech\", \"status\": \"pending\"}")
            .exchange()
            .expectStatus().isCreated()
            .expectBody(Customer.class) // CAMBIAR A Customer.class
            .value(actualResponse -> {
                assertThat(actualResponse).isEqualTo(expectedResponse);
            });
    }

    @Test
    public void retrieveCustomer_WithMockJsonFile_ShouldMatchExpected() throws Exception {
        // Cargar el JSON esperado como string
        String expectedJson = JsonTestUtils.loadJsonFromFile(
            "mocks/customer/retrieveCustomerResponse.json"
        );

        // Realizar la llamada API y comparar
        webTestClient.get()
            .uri("/customer/v5/customer/10001")
            .exchange()
            .expectStatus().isOk()
            .expectBody()
            .json(expectedJson);
    }
}