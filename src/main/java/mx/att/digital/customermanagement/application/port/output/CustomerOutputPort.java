package mx.att.digital.customermanagement.application.port.output;

import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import reactor.core.publisher.Mono;

public interface CustomerOutputPort {
    Mono<Customer> save(Customer customer);
    Mono<Customer> findById(String id);
    Mono<Customer> update(String id, Customer customer);
    Mono<Void> deleteById(String id);
    Mono<Boolean> existsById(String id);
}