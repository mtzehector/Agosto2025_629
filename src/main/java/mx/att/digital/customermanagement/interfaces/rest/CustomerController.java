package mx.att.digital.customermanagement.interfaces.rest;

import mx.att.digital.customermanagement.application.port.in.CustomerUseCase;
import mx.att.digital.customermanagement.domain.model.Customer;
import mx.att.digital.customermanagement.interfaces.dto.CustomerRequest;
import mx.att.digital.customermanagement.interfaces.dto.CustomerResponse;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/tmf-api/customer/v1")
public class CustomerController {
    
    private final CustomerUseCase customerUseCase;
    private final ResourceLoader resourceLoader;
    
    public CustomerController(CustomerUseCase customerUseCase, ResourceLoader resourceLoader) {
        this.customerUseCase = customerUseCase;
        this.resourceLoader = resourceLoader;
    }
    
    @PostMapping("/customer")
    public Mono<ResponseEntity<CustomerResponse>> createCustomer(@RequestBody CustomerRequest request) {
        Customer customer = new Customer(
            null, // ID será generado
            request.getName(),
            request.getEmail(),
            request.getStatus()
        );
        
        return customerUseCase.createCustomer(customer)
                .map(savedCustomer -> {
                    CustomerResponse response = new CustomerResponse();
                    response.setId(savedCustomer.getId());
                    response.setName(savedCustomer.getName());
                    response.setEmail(savedCustomer.getEmail());
                    response.setStatus(savedCustomer.getStatus());
                    response.setCreateDate(savedCustomer.getCreatedDate());
                    response.setLastUpdate(savedCustomer.getLastModifiedDate());
                    return ResponseEntity.ok(response);
                });
    }
    
    @GetMapping("/customer/{id}")
    public Mono<ResponseEntity<CustomerResponse>> getCustomer(@PathVariable String id) {
        return customerUseCase.getCustomerById(id)
                .map(customer -> {
                    CustomerResponse response = new CustomerResponse();
                    response.setId(customer.getId());
                    response.setName(customer.getName());
                    response.setEmail(customer.getEmail());
                    response.setStatus(customer.getStatus());
                    response.setCreateDate(customer.getCreatedDate());
                    response.setLastUpdate(customer.getLastModifiedDate());
                    return ResponseEntity.ok(response);
                })
                .onErrorResume(e -> Mono.just(ResponseEntity.notFound().build()));
    }
    
    @GetMapping("/customer")
    public Mono<ResponseEntity<List<CustomerResponse>>> getAllCustomers() {
        return customerUseCase.getAllCustomers()
                .map(customers -> {
                    List<CustomerResponse> responses = customers.stream()
                            .map(customer -> {
                                CustomerResponse response = new CustomerResponse();
                                response.setId(customer.getId());
                                response.setName(customer.getName());
                                response.setEmail(customer.getEmail());
                                response.setStatus(customer.getStatus());
                                response.setCreateDate(customer.getCreatedDate());
                                response.setLastUpdate(customer.getLastModifiedDate());
                                return response;
                            })
                            .toList();
                    return ResponseEntity.ok(responses);
                });
    }
    
    @GetMapping("/mocks/customer/{filename}")
    public Mono<ResponseEntity<String>> getMockCustomer(@PathVariable String filename) {
        return Mono.fromCallable(() -> {
            Resource resource = resourceLoader.getResource("classpath:mocks/customer/" + filename);
            String content = new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
            return ResponseEntity.ok()
                    .header("Content-Type", "application/json")
                    .body(content);
        });
    }
}