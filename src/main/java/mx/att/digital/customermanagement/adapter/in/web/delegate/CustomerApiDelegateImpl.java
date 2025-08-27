package mx.att.digital.customermanagement.adapter.in.web.delegate;

import mx.att.digital.customermanagement.adapter.in.web.CustomerApiDelegate;
import mx.att.digital.customermanagement.interfaces.dto.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CustomerApiDelegateImpl implements CustomerApiDelegate {

    private final List<Customer> mockCustomers = new ArrayList<>();

    public CustomerApiDelegateImpl() {
        initializeMockData();
    }

    private void initializeMockData() {
        mockCustomers.add(createMockCustomer("1", "John Doe", "Active"));
        mockCustomers.add(createMockCustomer("2", "Jane Smith", "Active"));
        mockCustomers.add(createMockCustomer("3", "ACME Corporation", "Active"));
    }

    // VERSIÓN SEGURA - Usando implementación por defecto temporalmente
    @Override
    public Mono<ResponseEntity<Customer>> createCustomer(Mono<Customer> customer, ServerWebExchange exchange) {
        return CustomerApiDelegate.super.createCustomer(customer, exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> deleteCustomer(String id, ServerWebExchange exchange) {
        return Mono.fromCallable(() -> {
            boolean removed = mockCustomers.removeIf(c -> c.getId() != null && c.getId().equals(id));
            return removed ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
        });
    }

    @Override
    public Mono<ResponseEntity<Flux<Customer>>> listCustomer(String fields, Integer offset, Integer limit, ServerWebExchange exchange) {
        List<Customer> result = new ArrayList<>(mockCustomers);
        
        if (offset != null && offset > 0) {
            result = result.subList(Math.min(offset, result.size()), result.size());
        }
        
        if (limit != null && limit > 0) {
            result = result.subList(0, Math.min(limit, result.size()));
        }
        
        return Mono.just(ResponseEntity.ok(Flux.fromIterable(result)));
    }

    // VERSIÓN SEGURA - Usando implementación por defecto temporalmente
    @Override
    public Mono<ResponseEntity<Customer>> patchCustomer(String id, Mono<Customer> customer, ServerWebExchange exchange) {
        return CustomerApiDelegate.super.patchCustomer(id, customer, exchange);
    }

    @Override
    public Mono<ResponseEntity<Customer>> retrieveCustomer(String id, String fields, ServerWebExchange exchange) {
        return Mono.fromCallable(() -> {
            return mockCustomers.stream()
                .filter(c -> c.getId() != null && c.getId().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
        });
    }

    private Customer createMockCustomer(String id, String name, String status) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(name);
        customer.setStatus(status);
        return customer;
    }
}