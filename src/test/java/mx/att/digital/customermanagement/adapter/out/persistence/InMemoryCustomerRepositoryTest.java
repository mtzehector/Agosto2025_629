package mx.att.digital.customermanagement.adapter.out.persistence;

import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryCustomerRepositoryTest {

    private InMemoryCustomerRepository repository;
    private Customer testCustomer;

    @BeforeEach
    void setUp() {
        repository = new InMemoryCustomerRepository();
        testCustomer = new Customer();
        testCustomer.setId("test-id");
        testCustomer.setName("John Doe");
        testCustomer.setEmail("john.doe@example.com");
    }

    @Test
    void testSaveCustomer() {
        Mono<Customer> result = repository.save(testCustomer);
        
        StepVerifier.create(result)
                .expectNext(testCustomer)
                .verifyComplete();
    }

    @Test
    void testFindById_Exists() {
        repository.save(testCustomer).block();
        
        Mono<Customer> result = repository.findById("test-id");
        
        StepVerifier.create(result)
                .expectNext(testCustomer)
                .verifyComplete();
    }

    @Test
    void testFindById_NotExists() {
        Mono<Customer> result = repository.findById("non-existent-id");
        
        StepVerifier.create(result)
                .verifyComplete();
    }

    @Test
    void testUpdateCustomer_Exists() {
        repository.save(testCustomer).block();
        
        Customer updatedCustomer = new Customer();
        updatedCustomer.setId("test-id");
        updatedCustomer.setName("Jane Doe");
        updatedCustomer.setEmail("jane.doe@example.com");
        
        Mono<Customer> result = repository.update("test-id", updatedCustomer);
        
        StepVerifier.create(result)
                .expectNext(updatedCustomer)
                .verifyComplete();
    }

    @Test
    void testUpdateCustomer_NotExists() {
        Customer updatedCustomer = new Customer();
        updatedCustomer.setId("non-existent-id");
        
        Mono<Customer> result = repository.update("non-existent-id", updatedCustomer);
        
        StepVerifier.create(result)
                .verifyComplete();
    }

    @Test
    void testDeleteById() {
        repository.save(testCustomer).block();
        
        Mono<Void> result = repository.deleteById("test-id");
        
        StepVerifier.create(result)
                .verifyComplete();
        
        // Verify it was actually deleted
        StepVerifier.create(repository.existsById("test-id"))
                .expectNext(false)
                .verifyComplete();
    }

    @Test
    void testExistsById_Exists() {
        repository.save(testCustomer).block();
        
        Mono<Boolean> result = repository.existsById("test-id");
        
        StepVerifier.create(result)
                .expectNext(true)
                .verifyComplete();
    }

    @Test
    void testExistsById_NotExists() {
        Mono<Boolean> result = repository.existsById("non-existent-id");
        
        StepVerifier.create(result)
                .expectNext(false)
                .verifyComplete();
    }
}