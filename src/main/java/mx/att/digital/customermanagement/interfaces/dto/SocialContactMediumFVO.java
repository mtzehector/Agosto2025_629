package mx.att.digital.customermanagement.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

import java.io.Serializable;
import java.util.Objects;

/**
 * SocialContactMediumFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class SocialContactMediumFVO extends ContactMediumFVO implements Serializable {

  private static final long serialVersionUID = 1L;

  private String socialNetworkId;

  public SocialContactMediumFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SocialContactMediumFVO(String atType) {
    super(atType);
  }

  public SocialContactMediumFVO socialNetworkId(String socialNetworkId) {
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


  public SocialContactMediumFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public SocialContactMediumFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public SocialContactMediumFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public SocialContactMediumFVO preferred(Boolean preferred) {
    super.preferred(preferred);
    return this;
  }

  public SocialContactMediumFVO contactType(String contactType) {
    super.contactType(contactType);
    return this;
  }

  public SocialContactMediumFVO validFor(TimePeriod validFor) {
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
    SocialContactMediumFVO socialContactMediumFVO = (SocialContactMediumFVO) o;
    return Objects.equals(this.socialNetworkId, socialContactMediumFVO.socialNetworkId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socialNetworkId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialContactMediumFVO {\n");
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

