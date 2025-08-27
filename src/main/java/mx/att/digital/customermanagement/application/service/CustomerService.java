package mx.att.digital.customermanagement.application.service;

import mx.att.digital.customermanagement.application.port.in.CustomerUseCase;
import mx.att.digital.customermanagement.application.port.out.CustomerRepositoryPort;
import mx.att.digital.customermanagement.domain.model.Customer;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class CustomerService implements CustomerUseCase {
    
    private final CustomerRepositoryPort customerRepositoryPort;
    
    public CustomerService(CustomerRepositoryPort customerRepositoryPort) {
        this.customerRepositoryPort = customerRepositoryPort;
    }
    
    @Override
    public Mono<Customer> createCustomer(Customer customer) {
        return Mono.fromCallable(() -> customerRepositoryPort.save(customer));
    }
    
    @Override
    public Mono<Customer> getCustomerById(String id) {
        return Mono.fromCallable(() -> customerRepositoryPort.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id)));
    }
    
    @Override
    public Mono<List<Customer>> getAllCustomers() {
        return Mono.fromCallable(customerRepositoryPort::findAll);
    }
    
    @Override
    public Mono<Void> deleteCustomer(String id) {
        return Mono.fromRunnable(() -> {
            if (customerRepositoryPort.existsById(id)) {
                customerRepositoryPort.deleteById(id);
            } else {
                throw new RuntimeException("Customer not found with id: " + id);
            }
        });
    }
}