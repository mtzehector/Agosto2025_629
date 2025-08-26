package mx.att.digital.customermanagement.adapter.in.web;

import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import mx.att.digital.customermanagement.application.port.input.CustomerInputPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/customerManagement/v5")
public class CustomerApiController {

    private final CustomerInputPort customerInputPort;

    public CustomerApiController(CustomerInputPort customerInputPort) {
        this.customerInputPort = customerInputPort;
    }

    @PostMapping("/customer")
    public Mono<ResponseEntity<Customer>> createCustomer(@Valid @RequestBody Customer customer) {
        return customerInputPort.createCustomer(customer)
                .map(createdCustomer -> 
                    ResponseEntity.status(HttpStatus.CREATED).body(createdCustomer)
                );
    }

    @GetMapping("/customer/{id}")
    public Mono<ResponseEntity<Customer>> retrieveCustomer(@PathVariable String id) {
        return customerInputPort.retrieveCustomer(id)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}