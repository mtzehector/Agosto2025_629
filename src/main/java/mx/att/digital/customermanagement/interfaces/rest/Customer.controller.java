package mx.att.digital.customermanagement.interfaces.rest;

import mx.att.digital.customermanagement.application.port.in.CustomerUseCase;
import mx.att.digital.customermanagement.interfaces.dto.CustomerResponse;
import mx.att.digital.customermanagement.interfaces.dto.CustomerRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/tmf-api/customer/v1")
public class CustomerController {
    
    private final CustomerUseCase customerUseCase;
    
    public CustomerController(CustomerUseCase customerUseCase) {
        this.customerUseCase = customerUseCase;
    }
    
    @PostMapping("/customer")
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerRequest request) {
        // Mapeo y lógica de creación
        return ResponseEntity.ok(new CustomerResponse());
    }
    
    @GetMapping("/customer/{id}")
    public ResponseEntity<CustomerResponse> getCustomer(@PathVariable String id) {
        // Lógica para obtener cliente
        return ResponseEntity.ok(new CustomerResponse());
    }
    
    @GetMapping("/customer")
    public ResponseEntity<List<CustomerResponse>> getAllCustomers() {
        // Lógica para obtener todos los clientes
        return ResponseEntity.ok(List.of());
    }
}