package mx.att.digital.customermanagement.adapter.in.web;

import jakarta.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
@Controller
@RequestMapping("${openapi.customerManagement.base-path:/tmf-api/customer/v5}")
public class ListenerApiController implements ListenerApi {

    private final ListenerApiDelegate delegate;

    public ListenerApiController(@Autowired(required = false) ListenerApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ListenerApiDelegate() {});
    }

    @Override
    public ListenerApiDelegate getDelegate() {
        return delegate;
    }

}
