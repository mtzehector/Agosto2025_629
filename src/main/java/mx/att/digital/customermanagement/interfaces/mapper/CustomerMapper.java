package mx.att.digital.customermanagement.interfaces.mapper;

import mx.att.digital.customermanagement.domain.model.Customer;
import mx.att.digital.customermanagement.interfaces.dto.CustomerRequest;
import mx.att.digital.customermanagement.interfaces.dto.CustomerResponse;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    
    public Customer toDomain(CustomerRequest request) {
        Customer customer = new Customer();
        customer.setName(request.getName());
        customer.setEmail(request.getEmail());
        customer.setStatus(request.getStatus());
        return customer;
    }
    
    public CustomerResponse toResponse(Customer customer) {
        CustomerResponse response = new CustomerResponse();
        response.setId(customer.getId());
        response.setName(customer.getName());
        response.setEmail(customer.getEmail());
        response.setStatus(customer.getStatus());
        response.setCreateDate(customer.getCreatedDate());
        response.setLastUpdate(customer.getLastModifiedDate());
        return response;
    }
}