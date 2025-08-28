package mx.att.digital.customermanagement.adapter.in.web;

import jakarta.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
@Controller
@RequestMapping("${openapi.customerManagement.base-path:/tmf-api/customer/v5}")
public class HubApiController implements HubApi {

    private final HubApiDelegate delegate;

    public HubApiController(@Autowired(required = false) HubApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new HubApiDelegate() {});
    }

    @Override
    public HubApiDelegate getDelegate() {
        return delegate;
    }

}
