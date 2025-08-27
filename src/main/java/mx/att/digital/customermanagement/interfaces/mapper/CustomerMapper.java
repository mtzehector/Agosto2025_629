package mx.att.digital.customermanagement.interfaces.mapper;

import mx.att.digital.customermanagement.domain.model.Customer;
import mx.att.digital.customermanagement.interfaces.dto.CustomerCreate;
import mx.att.digital.customermanagement.interfaces.dto.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer domainToDto(mx.att.digital.customermanagement.domain.model.Customer domain);
    mx.att.digital.customermanagement.domain.model.Customer dtoToDomain(CustomerCreate dto);
}