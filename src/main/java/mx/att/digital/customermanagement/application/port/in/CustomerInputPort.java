package mx.att.digital.customermanagement.application.port.in;

import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import reactor.core.publisher.Mono;

public interface CustomerInputPort {
    Mono<Customer> createCustomer(Customer customer);
    Mono<Customer> retrieveCustomer(String id);
}