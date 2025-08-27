package mx.att.digital.customermanagement.application.service;

import mx.att.digital.customermanagement.application.port.in.CustomerUseCase;
import mx.att.digital.customermanagement.application.port.out.CustomerRepositoryPort;
import mx.att.digital.customermanagement.domain.model.Customer;
import mx.att.digital.customermanagement.application.exception.CustomerNotFoundException;
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
        return Mono.fromSupplier(() -> {
            // Asignar fechas si no están establecidas
            if (customer.getCreatedDate() == null) {
                customer.setCreatedDate(java.time.LocalDateTime.now());
            }
            if (customer.getLastModifiedDate() == null) {
                customer.setLastModifiedDate(java.time.LocalDateTime.now());
            }
            return customerRepositoryPort.save(customer);
        });
    }
    
    @Override
    public Mono<Customer> getCustomerById(String id) {
        return Mono.fromSupplier(() -> 
            customerRepositoryPort.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException("Customer not found with id: " + id))
        );
    }
    
    @Override
    public Mono<List<Customer>> getAllCustomers() {
        return Mono.fromSupplier(() -> customerRepositoryPort.findAll());
    }
    
    @Override
    public Mono<Void> deleteCustomer(String id) {
        return Mono.fromRunnable(() -> {
            if (!customerRepositoryPort.existsById(id)) {
                throw new CustomerNotFoundException("Customer not found with id: " + id);
            }
            customerRepositoryPort.deleteById(id);
        });
    }
    
    @Override
    public Mono<Customer> updateCustomer(String id, Customer customer) {
        return Mono.fromSupplier(() -> {
            if (!customerRepositoryPort.existsById(id)) {
                throw new CustomerNotFoundException("Customer not found with id: " + id);
            }
            customer.setId(id);
            customer.setLastModifiedDate(java.time.LocalDateTime.now());
            return customerRepositoryPort.save(customer);
        });
    }
}