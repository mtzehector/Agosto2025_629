package mx.att.digital.customermanagement.adapter.out.mock;

import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class MockCustomerRepository {

    private final Map<String, Customer> customers = new HashMap<>();

    public MockCustomerRepository() {
        // Datos iniciales de prueba
        initializeTestData();
    }

    private void initializeTestData() {
        Customer customer1 = new Customer();
        customer1.setId("10001");
        customer1.setHref("/tmf-api/customer/v5/customer/10001");
        customer1.setName("ACME Corporation");
        customer1.setStatus("active");

        Customer customer2 = new Customer();
        customer2.setId("10002");
        customer2.setHref("/tmf-api/customer/v5/customer/10002");
        customer2.setName("Marvel Inc.");
        customer2.setStatus("inactive");

        customers.put("10001", customer1);
        customers.put("10002", customer2);
    }

    public Flux<Customer> findAll() {
        return Flux.fromIterable(customers.values());
    }

    public Mono<Customer> findById(String id) {
        return Mono.justOrEmpty(customers.get(id));
    }

    public Mono<Customer> save(Customer customer) {
        if (customer.getId() == null) {
            String newId = UUID.randomUUID().toString();
            customer.setId(newId);
        }
        customer.setHref("/tmf-api/customer/v5/customer/" + customer.getId());
        customers.put(customer.getId(), customer);
        return Mono.just(customer);
    }

    public Mono<Boolean> existsById(String id) {
        return Mono.just(customers.containsKey(id));
    }

    public Mono<Void> deleteById(String id) {
        customers.remove(id);
        return Mono.empty();
    }
}