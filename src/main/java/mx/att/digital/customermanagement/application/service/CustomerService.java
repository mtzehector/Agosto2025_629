package mx.att.digital.customermanagement.application.service;

import mx.att.digital.customermanagement.application.port.in.CustomerUseCase;
import mx.att.digital.customermanagement.application.port.out.CustomerRepositoryPort;
import mx.att.digital.customermanagement.domain.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerUseCase {
    
    private final CustomerRepositoryPort customerRepositoryPort;
    
    public CustomerService(CustomerRepositoryPort customerRepositoryPort) {
        this.customerRepositoryPort = customerRepositoryPort;
    }
    
    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepositoryPort.save(customer);
    }
    
    @Override
    public Customer getCustomerById(String id) {
        return customerRepositoryPort.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
    
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepositoryPort.findAll();
    }
}