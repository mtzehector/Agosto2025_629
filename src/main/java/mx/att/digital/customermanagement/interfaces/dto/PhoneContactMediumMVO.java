package mx.att.digital.customermanagement.interfaces.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import mx.att.digital.customermanagement.interfaces.dto.ContactMediumMVO;
import mx.att.digital.customermanagement.interfaces.dto.TimePeriod;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PhoneContactMediumMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class PhoneContactMediumMVO extends ContactMediumMVO implements Serializable {

  private static final long serialVersionUID = 1L;

  private String phoneNumber;

  public PhoneContactMediumMVO phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The phone number of the contact
   * @return phoneNumber
   */
  
  @Schema(name = "phoneNumber", description = "The phone number of the contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public PhoneContactMediumMVO preferred(Boolean preferred) {
    super.preferred(preferred);
    return this;
  }

  public PhoneContactMediumMVO contactType(String contactType) {
    super.contactType(contactType);
    return this;
  }

  public PhoneContactMediumMVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneContactMediumMVO phoneContactMediumMVO = (PhoneContactMediumMVO) o;
    return Objects.equals(this.phoneNumber, phoneContactMediumMVO.phoneNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneContactMediumMVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

