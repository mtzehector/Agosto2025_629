package mx.att.digital.customermanagement.domain.service;

import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import mx.att.digital.customermanagement.adapter.in.web.dto.CustomerFVO;
import mx.att.digital.customermanagement.adapter.in.web.dto.CustomerMVO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public Mono<Customer> create(Mono<CustomerFVO> customerFVO, String fields) {
        return customerFVO.map(fvo -> {
            // Mapear de FVO a Customer del dominio
            return new Customer()
                .id(UUID.randomUUID().toString())
                .href("/tmf-api/customer/v5/customer/" + UUID.randomUUID().toString())
                .name(fvo.getName())
                .status(fvo.getStatus() != null ? fvo.getStatus() : "pending");
        });
    }

    @Override
    public Mono<Void> delete(String id) {
        // Lógica de eliminación - retornar Mono<Void> vacío
        return Mono.empty();
    }

    @Override
    public Flux<Customer> list(String fields, Integer offset, Integer limit) {
        // Implementación temporal con datos de ejemplo
        Customer customer1 = new Customer()
            .id("10001")
            .href("/tmf-api/customer/v5/customer/10001")
            .name("ACME Corporation")
            .status("active");

        Customer customer2 = new Customer()
            .id("10002")
            .href("/tmf-api/customer/v5/customer/10002")
            .name("Marvel Inc.")
            .status("inactive");

        return Flux.just(customer1, customer2);
    }

    @Override
    public Mono<Customer> patch(String id, Mono<CustomerMVO> customerMVO, String fields) {
        return customerMVO.map(mvo -> {
            // Aplicar el patch manteniendo el ID original
            return new Customer()
                .id(id)
                .href("/tmf-api/customer/v5/customer/" + id)
                .name(mvo.getName())
                .status(mvo.getStatus());
        });
    }

    @Override
    public Mono<Customer> retrieve(String id, String fields) {
        // Implementación temporal - buscar por ID
        Customer customer = new Customer()
            .id(id)
            .href("/tmf-api/customer/v5/customer/" + id)
            .name("ACME Corporation")
            .status("active");

        return Mono.just(customer);
    }
}