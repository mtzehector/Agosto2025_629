package mx.att.digital.customermanagement.infrastructure.persistence;

import mx.att.digital.customermanagement.application.port.out.CustomerRepositoryPort;
import mx.att.digital.customermanagement.domain.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryCustomerRepository implements CustomerRepositoryPort {
    
    private final Map<String, Customer> customers = new ConcurrentHashMap<>();
    
    @Override
    public Customer save(Customer customer) {
        if (customer.getId() == null) {
            String newId = "CUST-" + UUID.randomUUID().toString().substring(0, 8);
            customer.setId(newId);
        }
        customers.put(customer.getId(), customer);
        return customer;
    }
    
    @Override
    public Optional<Customer> findById(String id) {
        return Optional.ofNullable(customers.get(id));
    }
    
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
    
    @Override
    public void deleteById(String id) {
        customers.remove(id);
    }
    
    @Override
    public boolean existsById(String id) {
        return customers.containsKey(id);
    }
}