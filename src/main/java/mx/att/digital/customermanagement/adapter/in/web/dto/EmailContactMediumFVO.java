package mx.att.digital.customermanagement.adapter.in.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.io.Serializable;
import java.util.Objects;

/**
 * EmailContactMediumFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class EmailContactMediumFVO extends ContactMediumFVO implements Serializable {

  private static final long serialVersionUID = 1L;

  private String emailAddress;

  public EmailContactMediumFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EmailContactMediumFVO(String atType) {
    super(atType);
  }

  public EmailContactMediumFVO emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Full email address in standard format
   * @return emailAddress
   */
  
  @Schema(name = "emailAddress", description = "Full email address in standard format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public EmailContactMediumFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public EmailContactMediumFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public EmailContactMediumFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public EmailContactMediumFVO preferred(Boolean preferred) {
    super.preferred(preferred);
    return this;
  }

  public EmailContactMediumFVO contactType(String contactType) {
    super.contactType(contactType);
    return this;
  }

  public EmailContactMediumFVO validFor(TimePeriod validFor) {
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
    EmailContactMediumFVO emailContactMediumFVO = (EmailContactMediumFVO) o;
    return Objects.equals(this.emailAddress, emailContactMediumFVO.emailAddress) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailContactMediumFVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
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

