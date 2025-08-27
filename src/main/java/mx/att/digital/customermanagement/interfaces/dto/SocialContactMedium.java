package mx.att.digital.customermanagement.interfaces.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import mx.att.digital.customermanagement.interfaces.dto.ContactMedium;
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
 * SocialContactMedium
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class SocialContactMedium extends ContactMedium implements Serializable {

  private static final long serialVersionUID = 1L;

  private String socialNetworkId;

  public SocialContactMedium() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SocialContactMedium(String atType) {
    super(atType);
  }

  public SocialContactMedium socialNetworkId(String socialNetworkId) {
    this.socialNetworkId = socialNetworkId;
    return this;
  }

  /**
   * Identifier as a member of a social network
   * @return socialNetworkId
   */
  
  @Schema(name = "socialNetworkId", description = "Identifier as a member of a social network", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("socialNetworkId")
  public String getSocialNetworkId() {
    return socialNetworkId;
  }

  public void setSocialNetworkId(String socialNetworkId) {
    this.socialNetworkId = socialNetworkId;
  }


  public SocialContactMedium atType(String atType) {
    super.atType(atType);
    return this;
  }

  public SocialContactMedium atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public SocialContactMedium atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public SocialContactMedium id(String id) {
    super.id(id);
    return this;
  }

  public SocialContactMedium preferred(Boolean preferred) {
    super.preferred(preferred);
    return this;
  }

  public SocialContactMedium contactType(String contactType) {
    super.contactType(contactType);
    return this;
  }

  public SocialContactMedium validFor(TimePeriod validFor) {
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
    SocialContactMedium socialContactMedium = (SocialContactMedium) o;
    return Objects.equals(this.socialNetworkId, socialContactMedium.socialNetworkId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socialNetworkId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialContactMedium {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    socialNetworkId: ").append(toIndentedString(socialNetworkId)).append("\n");
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

