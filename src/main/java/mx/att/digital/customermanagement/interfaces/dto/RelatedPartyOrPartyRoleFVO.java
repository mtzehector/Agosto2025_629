package mx.att.digital.customermanagement.interfaces.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import mx.att.digital.customermanagement.interfaces.dto.PartyOrPartyRoleFVO;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RelatedPartyOrPartyRoleFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class RelatedPartyOrPartyRoleFVO implements Serializable {

  private static final long serialVersionUID = 1L;

  private String atType;

  private String atBaseType;

  private String atSchemaLocation;

  private String role;

  private PartyOrPartyRoleFVO partyOrPartyRole;

  public RelatedPartyOrPartyRoleFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RelatedPartyOrPartyRoleFVO(String atType, String role) {
    this.atType = atType;
    this.role = role;
  }

  public RelatedPartyOrPartyRoleFVO atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
   */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public RelatedPartyOrPartyRoleFVO atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
   */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public RelatedPartyOrPartyRoleFVO atSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
   */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public RelatedPartyOrPartyRoleFVO role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role played by the related party or party role in the context of the specific entity it is linked to. Such as 'initiator', 'customer',  'salesAgent', 'user'
   * @return role
   */
  @NotNull 
  @Schema(name = "role", description = "Role played by the related party or party role in the context of the specific entity it is linked to. Such as 'initiator', 'customer',  'salesAgent', 'user'", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedPartyOrPartyRoleFVO partyOrPartyRole(PartyOrPartyRoleFVO partyOrPartyRole) {
    this.partyOrPartyRole = partyOrPartyRole;
    return this;
  }

  /**
   * Get partyOrPartyRole
   * @return partyOrPartyRole
   */
  @Valid 
  @Schema(name = "partyOrPartyRole", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partyOrPartyRole")
  public PartyOrPartyRoleFVO getPartyOrPartyRole() {
    return partyOrPartyRole;
  }

  public void setPartyOrPartyRole(PartyOrPartyRoleFVO partyOrPartyRole) {
    this.partyOrPartyRole = partyOrPartyRole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedPartyOrPartyRoleFVO relatedPartyOrPartyRoleFVO = (RelatedPartyOrPartyRoleFVO) o;
    return Objects.equals(this.atType, relatedPartyOrPartyRoleFVO.atType) &&
        Objects.equals(this.atBaseType, relatedPartyOrPartyRoleFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, relatedPartyOrPartyRoleFVO.atSchemaLocation) &&
        Objects.equals(this.role, relatedPartyOrPartyRoleFVO.role) &&
        Objects.equals(this.partyOrPartyRole, relatedPartyOrPartyRoleFVO.partyOrPartyRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, role, partyOrPartyRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedPartyOrPartyRoleFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    partyOrPartyRole: ").append(toIndentedString(partyOrPartyRole)).append("\n");
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

