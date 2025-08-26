package mx.att.digital.customermanagement.adapter.in.web.delegate;

import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import mx.att.digital.customermanagement.adapter.in.web.dto.CustomerFVO;
import mx.att.digital.customermanagement.adapter.in.web.dto.CustomerMVO;
import mx.att.digital.customermanagement.domain.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component("customerApiDelegate")
public class CustomerApiDelegateImpl implements CustomerApiDelegate {

    private final CustomerService customerService;

    public CustomerApiDelegateImpl(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public Mono<ResponseEntity<Customer>> createCustomer(Mono<CustomerFVO> customerFVO, String fields, ServerWebExchange exchange) {
        return customerService.create(customerFVO, fields)
            .map(createdCustomer -> new ResponseEntity<>(createdCustomer, HttpStatus.CREATED));
    }

    @Override
    public Mono<ResponseEntity<Void>> deleteCustomer(String id, ServerWebExchange exchange) {
        return customerService.delete(id)
            .then(Mono.just(new ResponseEntity<>(HttpStatus.NO_CONTENT)));
    }

    @Override
    public Mono<ResponseEntity<Flux<Customer>>> listCustomer(String fields, Integer offset, Integer limit, ServerWebExchange exchange) {
        Flux<Customer> customers = customerService.list(fields, offset, limit);
        return Mono.just(ResponseEntity.ok(customers));
    }

    @Override
    public Mono<ResponseEntity<Customer>> patchCustomer(String id, Mono<CustomerMVO> customerMVO, String fields, ServerWebExchange exchange) {
        return customerService.patch(id, customerMVO, fields)
            .map(updatedCustomer -> new ResponseEntity<>(updatedCustomer, HttpStatus.OK));
    }

    @Override
    public Mono<ResponseEntity<Customer>> retrieveCustomer(String id, String fields, ServerWebExchange exchange) {
        return customerService.retrieve(id, fields)
            .map(customer -> new ResponseEntity<>(customer, HttpStatus.OK));
    }
}