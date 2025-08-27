package mx.att.digital.customermanagement.adapter.in.web;

import mx.att.digital.customermanagement.interfaces.dto.Customer;
import mx.att.digital.customermanagement.interfaces.dto.EntityRef;
import mx.att.digital.customermanagement.interfaces.dto.TimePeriod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;

@Service
public class CustomerMockDelegate implements CustomerApiDelegate {

  @Override
  public Mono<ResponseEntity<Customer>> retrieveCustomer(String id, String fields, ServerWebExchange exchange) {
    // PartyRef: requiere @type e id; opcional name, href, @referredType
	  EntityRef engaged = new EntityRef()
			    .atType("PartyRef") // para que en el JSON salga "@type": "PartyRef"
			    .id("500")
			    .name("Happyness, Motivation & Empowerment")
			    .href("https://host:port/tmf-api/partyManagement/v5/organization/500");


    // TimePeriod de ejemplo
    TimePeriod period = new TimePeriod()
        .startDateTime(OffsetDateTime.parse("2018-06-12T00:00:00Z"))
        .endDateTime(OffsetDateTime.parse("2019-01-01T00:00:00Z"));

    Customer body = new Customer()
        .atType("Customer")
        .id(id)
        .name("Mock-Testing Customer " + id)
        .engagedParty(engaged)
        .validFor(period);

    return Mono.just(ResponseEntity.ok(body));
  }
}
