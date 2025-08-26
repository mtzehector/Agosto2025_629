package mx.att.digital.customermanagement.adapter.out.mock;

import mx.att.digital.customermanagement.application.port.output.CustomerOutputPort;
import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Profile("test") // Solo se activa en perfil de test
public class MockCustomerOutputPort implements CustomerOutputPort {

    private final ConcurrentHashMap<String, Customer> database = new ConcurrentHashMap<>();

    @Override
    public Mono<Customer> save(Customer customer) {
        if (customer.getId() == null) {
            customer.setId(java.util.UUID.randomUUID().toString());
        }
        database.put(customer.getId(), customer);
        return Mono.just(customer);
    }

    @Override
    public Mono<Customer> findById(String id) {
        Customer customer = database.get(id);
        if (customer == null) {
            return Mono.empty();
        }
        return Mono.just(customer);
    }

    @Override
    public Mono<Customer> update(String id, Customer customer) {
        if (!database.containsKey(id)) {
            return Mono.empty();
        }
        customer.setId(id);
        database.put(id, customer);
        return Mono.just(customer);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        database.remove(id);
        return Mono.empty();
    }

    @Override
    public Mono<Boolean> existsById(String id) {
        return Mono.just(database.containsKey(id));
    }
}