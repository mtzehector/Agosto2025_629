package mx.att.digital.customermanagement.adapter.in.web;

import mx.att.digital.customermanagement.interfaces.dto.Customer;
import mx.att.digital.customermanagement.interfaces.dto.CustomerFVO;
import mx.att.digital.customermanagement.interfaces.dto.CustomerMVO;
import mx.att.digital.customermanagement.interfaces.dto.Error;
import mx.att.digital.customermanagement.interfaces.dto.JsonPatch;
import mx.att.digital.customermanagement.interfaces.dto.PartyRoleFVO;
import mx.att.digital.customermanagement.interfaces.dto.PartyRoleMVO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
@Controller
@RequestMapping("${openapi.customerManagement.base-path:/tmf-api/customer/v5}")
public class CustomerApiController implements CustomerApi {

    private final CustomerApiDelegate delegate;

    public CustomerApiController(@Autowired(required = false) CustomerApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CustomerApiDelegate() {});
    }

    @Override
    public CustomerApiDelegate getDelegate() {
        return delegate;
    }

}
