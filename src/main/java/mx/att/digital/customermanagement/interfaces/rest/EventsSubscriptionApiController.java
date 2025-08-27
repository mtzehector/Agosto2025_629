package mx.att.digital.customermanagement.interfaces.rest;

import jakarta.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
@Controller
@RequestMapping("${openapi.customerManagement.base-path:/tmf-api/customer/v5}")
public class EventsSubscriptionApiController implements EventsSubscriptionApi {

    private final EventsSubscriptionApiDelegate delegate;

    public EventsSubscriptionApiController(@Autowired(required = false) EventsSubscriptionApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new EventsSubscriptionApiDelegate() {});
    }

    @Override
    public EventsSubscriptionApiDelegate getDelegate() {
        return delegate;
    }

}
