package mx.att.digital.customermanagement.application.port.in;

import mx.att.digital.customermanagement.domain.model.Customer;
import reactor.core.publisher.Mono;
import java.util.List;

public interface CustomerUseCase {
    Mono<Customer> createCustomer(Customer customer);
    Mono<Customer> getCustomerById(String id);
    Mono<List<Customer>> getAllCustomers();
}