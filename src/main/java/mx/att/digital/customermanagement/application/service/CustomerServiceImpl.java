package mx.att.digital.customermanagement.application.service;

import mx.att.digital.customermanagement.application.port.input.CustomerInputPort;
import mx.att.digital.customermanagement.application.port.output.CustomerOutputPort;
import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerInputPort {

    private final CustomerOutputPort customerOutputPort;

    public CustomerServiceImpl(CustomerOutputPort customerOutputPort) {
        this.customerOutputPort = customerOutputPort;
    }

    @Override
    public Mono<Customer> createCustomer(Customer customer) {
        return customerOutputPort.save(customer);
    }

    @Override
    public Mono<Customer> retrieveCustomer(String id) {
        return customerOutputPort.findById(id);
    }
}