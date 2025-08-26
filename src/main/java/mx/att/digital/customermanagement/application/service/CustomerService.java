package mx.att.digital.customermanagement.application.service;

import mx.att.digital.customermanagement.application.port.input.CustomerInputPort;
import mx.att.digital.customermanagement.adapter.in.web.dto.Customer;
import mx.att.digital.customermanagement.adapter.in.web.dto.CustomerFVO;
import mx.att.digital.customermanagement.adapter.in.web.dto.CustomerMVO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService extends CustomerInputPort {
  Mono<Customer> create(Mono<CustomerFVO> customerFVO, String fields);
  Mono<Void> delete(String id);
  Flux<Customer> list(String fields, Integer offset, Integer limit);
  Mono<Customer> patch(String id, Mono<CustomerMVO> customerMVO, String fields);
  Mono<Customer> retrieve(String id, String fields);
}
