package mx.att.digital.customermanagement.adapter.in.web.delegate;

import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import mx.att.digital.customermanagement.adapter.in.web.dto.CustomerFVO;
import mx.att.digital.customermanagement.adapter.in.web.dto.CustomerMVO;
import mx.att.digital.customermanagement.domain.service.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@SuppressWarnings("unchecked")
class CustomerApiDelegateImplTest {


	@Mock
    private CustomerService customerService;

    @Mock
    private ServerWebExchange exchange;

    @InjectMocks
    private CustomerApiDelegateImpl customerApiDelegate;

    private Customer testCustomer;
    private CustomerFVO testCustomerFVO;
    private CustomerMVO testCustomerMVO;

    @BeforeEach
    void setUp() {
        testCustomer = new Customer()
            .id("10001")
            .href("/tmf-api/customer/v5/customer/10001")
            .name("ACME Corporation")
            .status("active");

        testCustomerFVO = new CustomerFVO();
        testCustomerFVO.setName("ACME Corporation");
        testCustomerFVO.setStatus("active");

        testCustomerMVO = new CustomerMVO();
        testCustomerMVO.setName("ACME Corporation Updated");
        testCustomerMVO.setStatus("suspended");
    }

    @Test
    void createCustomer_ShouldReturnCreated() {
        // Arrange
        when(customerService.create(any(Mono.class), eq("fields")))
            .thenReturn(Mono.just(testCustomer));

        // Act & Assert
        StepVerifier.create(customerApiDelegate.createCustomer(Mono.just(testCustomerFVO), "fields", exchange))
            .assertNext(response -> {
                assertEquals(HttpStatus.CREATED, response.getStatusCode());
                assertNotNull(response.getBody());
                assertEquals("10001", response.getBody().getId());
            })
            .verifyComplete();

        verify(customerService, times(1)).create(any(Mono.class), eq("fields"));
    }

    @Test
    void deleteCustomer_ShouldReturnNoContent() {
        // Arrange
        when(customerService.delete("10001")).thenReturn(Mono.empty());

        // Act & Assert
        StepVerifier.create(customerApiDelegate.deleteCustomer("10001", exchange))
            .assertNext(response -> {
                assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
            })
            .verifyComplete();

        verify(customerService, times(1)).delete("10001");
    }

    @Test
    void listCustomer_ShouldReturnCustomers() {
        // Arrange
        Customer customer2 = new Customer()
            .id("10002")
            .href("/tmf-api/customer/v5/customer/10002")
            .name("Marvel Inc.")
            .status("inactive");

        when(customerService.list(null, null, null))
            .thenReturn(Flux.just(testCustomer, customer2));

        // Act & Assert
        StepVerifier.create(customerApiDelegate.listCustomer(null, null, null, exchange))
            .assertNext(response -> {
                assertEquals(HttpStatus.OK, response.getStatusCode());
                assertNotNull(response.getBody());
                
                // Verificar el Flux de customers
                StepVerifier.create(response.getBody())
                    .expectNext(testCustomer)
                    .expectNext(customer2)
                    .verifyComplete();
            })
            .verifyComplete();

        verify(customerService, times(1)).list(null, null, null);
    }

    @Test
    void patchCustomer_ShouldReturnUpdatedCustomer() {
        // Arrange
        Customer updatedCustomer = new Customer()
            .id("10001")
            .href("/tmf-api/customer/v5/customer/10001")
            .name("ACME Corporation Updated")
            .status("suspended");

        when(customerService.patch(eq("10001"), any(Mono.class), eq("fields")))
            .thenReturn(Mono.just(updatedCustomer));

        // Act & Assert
        StepVerifier.create(customerApiDelegate.patchCustomer("10001", Mono.just(testCustomerMVO), "fields", exchange))
            .assertNext(response -> {
                assertEquals(HttpStatus.OK, response.getStatusCode());
                assertNotNull(response.getBody());
                assertEquals("suspended", response.getBody().getStatus());
            })
            .verifyComplete();

        verify(customerService, times(1)).patch(eq("10001"), any(Mono.class), eq("fields"));
    }

    @Test
    void retrieveCustomer_ShouldReturnCustomer() {
        // Arrange
        when(customerService.retrieve("10001", "fields"))
            .thenReturn(Mono.just(testCustomer));

        // Act & Assert
        StepVerifier.create(customerApiDelegate.retrieveCustomer("10001", "fields", exchange))
            .assertNext(response -> {
                assertEquals(HttpStatus.OK, response.getStatusCode());
                assertNotNull(response.getBody());
                assertEquals("ACME Corporation", response.getBody().getName());
            })
            .verifyComplete();

        verify(customerService, times(1)).retrieve("10001", "fields");
    }
}