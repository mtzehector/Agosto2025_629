package mx.att.digital.customermanagement.adapter.out.mock;

import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

class MockCustomerRepositoryTest {

    private MockCustomerRepository mockCustomerRepository;

    @BeforeEach
    void setUp() {
        mockCustomerRepository = new MockCustomerRepository();
    }

    @Test
    void findAll_ShouldReturnAllCustomers() {
        Flux<Customer> result = mockCustomerRepository.findAll();

        StepVerifier.create(result)
            .expectNextCount(2)
            .verifyComplete();
    }

    @Test
    void findById_ExistingId_ShouldReturnCustomer() {
        Mono<Customer> result = mockCustomerRepository.findById("10001");

        StepVerifier.create(result)
            .assertNext(customer -> {
                assertEquals("10001", customer.getId());
                assertEquals("ACME Corporation", customer.getName());
            })
            .verifyComplete();
    }

    @Test
    void findById_NonExistingId_ShouldReturnEmpty() {
        Mono<Customer> result = mockCustomerRepository.findById("99999");

        StepVerifier.create(result)
            .verifyComplete();
    }

    @Test
    void save_NewCustomer_ShouldAddCustomer() {
        Customer newCustomer = new Customer();
        newCustomer.setName("New Company");
        newCustomer.setStatus("pending");

        Mono<Customer> result = mockCustomerRepository.save(newCustomer);

        StepVerifier.create(result)
            .assertNext(customer -> {
                assertNotNull(customer.getId());
                assertEquals("New Company", customer.getName());
            })
            .verifyComplete();
    }

    @Test
    void existsById_ExistingId_ShouldReturnTrue() {
        Mono<Boolean> result = mockCustomerRepository.existsById("10001");

        StepVerifier.create(result)
            .assertNext(exists -> assertTrue(exists))
            .verifyComplete();
    }

    @Test
    void deleteById_ExistingId_ShouldRemoveCustomer() {
        Mono<Void> result = mockCustomerRepository.deleteById("10001");

        StepVerifier.create(result)
            .verifyComplete();

        StepVerifier.create(mockCustomerRepository.findById("10001"))
            .verifyComplete();
    }
}