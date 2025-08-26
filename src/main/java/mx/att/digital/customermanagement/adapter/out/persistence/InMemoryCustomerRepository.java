package mx.att.digital.customermanagement.adapter.out.persistence;

import mx.att.digital.customermanagement.application.port.output.CustomerOutputPort;
import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import reactor.core.publisher.Mono;
import org.springframework.stereotype.Repository;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryCustomerRepository implements CustomerOutputPort {
    
    private final ConcurrentHashMap<String, Customer> database = new ConcurrentHashMap<>();
    
    @Override
    public Mono<Customer> save(Customer customer) {
        database.put(customer.getId(), customer);
        return Mono.just(customer);
    }
    
    @Override
    public Mono<Customer> findById(String id) {
        Customer customer = database.get(id);
        return customer != null ? Mono.just(customer) : Mono.empty();
    }
    
    @Override
    public Mono<Customer> update(String id, Customer customer) {
        if (database.containsKey(id)) {
            database.put(id, customer);
            return Mono.just(customer);
        }
        return Mono.empty();
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