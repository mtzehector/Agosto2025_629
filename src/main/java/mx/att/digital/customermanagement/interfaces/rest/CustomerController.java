package mx.att.digital.customermanagement.interfaces.rest;

import mx.att.digital.customermanagement.application.port.in.CustomerUseCase;
import mx.att.digital.customermanagement.domain.model.Customer;
import mx.att.digital.customermanagement.interfaces.dto.CustomerRequest;
import mx.att.digital.customermanagement.interfaces.dto.CustomerResponse;
import mx.att.digital.customermanagement.interfaces.mapper.CustomerMapper;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
@RequestMapping("/api/tmf-api/customer/v1")
public class CustomerController {
    
    private final CustomerUseCase customerUseCase;
    private final CustomerMapper customerMapper;
    private final ResourceLoader resourceLoader;
    
    public CustomerController(CustomerUseCase customerUseCase, 
                            CustomerMapper customerMapper,
                            ResourceLoader resourceLoader) {
        this.customerUseCase = customerUseCase;
        this.customerMapper = customerMapper;
        this.resourceLoader = resourceLoader;
    }
    
    @PostMapping("/customer")
    public Mono<ResponseEntity<CustomerResponse>> createCustomer(@RequestBody CustomerRequest request) {
        Customer customer = customerMapper.toDomain(request);
        return customerUseCase.createCustomer(customer)
                .map(savedCustomer -> {
                    CustomerResponse response = customerMapper.toResponse(savedCustomer);
                    return ResponseEntity.ok(response);
                });
    }
    
    @GetMapping("/customer/{id}")
    public Mono<ResponseEntity<CustomerResponse>> getCustomer(@PathVariable String id) {
        return customerUseCase.getCustomerById(id)
                .map(customer -> {
                    CustomerResponse response = customerMapper.toResponse(customer);
                    return ResponseEntity.ok(response);
                })
                .onErrorResume(e -> {
                    return Mono.just(ResponseEntity.notFound().build());
                });
    }
    
    @GetMapping("/customer")
    public Mono<ResponseEntity<List<CustomerResponse>>> getAllCustomers() {
        return customerUseCase.getAllCustomers()
                .map(customers -> {
                    List<CustomerResponse> responses = customers.stream()
                            .map(customerMapper::toResponse)
                            .toList();
                    return ResponseEntity.ok(responses);
                });
    }
    
    @DeleteMapping("/customer/{id}")
    public Mono<ResponseEntity<Void>> deleteCustomer(@PathVariable String id) {
        return customerUseCase.deleteCustomer(id)
                .then(Mono.just(ResponseEntity.ok().build()))
                .onErrorResume(e -> Mono.just(ResponseEntity.notFound().build()));
    }
    
    @GetMapping("/mocks/customer/{filename}")
    public Mono<ResponseEntity<String>> getMockCustomer(@PathVariable String filename) {
        return Mono.fromCallable(() -> {
            try {
                Resource resource = resourceLoader.getResource("classpath:mocks/customer/" + filename);
                if (resource.exists() && resource.isReadable()) {
                    String content = new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
                    return ResponseEntity.ok()
                            .header("Content-Type", "application/json")
                            .body(content);
                } else {
                    return ResponseEntity.notFound().build();
                }
            } catch (IOException e) {
                throw new RuntimeException("Error reading mock file: " + filename, e);
            }
        });
    }
}