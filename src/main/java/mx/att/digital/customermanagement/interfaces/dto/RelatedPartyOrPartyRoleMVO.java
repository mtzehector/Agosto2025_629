package mx.att.digital.customermanagement.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * RelatedPartyOrPartyRoleMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class RelatedPartyOrPartyRoleMVO implements Serializable {

  private static final long serialVersionUID = 1L;

  private String role;

  private PartyOrPartyRoleMVO partyOrPartyRole;

  public RelatedPartyOrPartyRoleMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RelatedPartyOrPartyRoleMVO(String role) {
    this.role = role;
  }

  public RelatedPartyOrPartyRoleMVO role(String role) {
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

  public RelatedPartyOrPartyRoleMVO partyOrPartyRole(PartyOrPartyRoleMVO partyOrPartyRole) {
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
  public PartyOrPartyRoleMVO getPartyOrPartyRole() {
    return partyOrPartyRole;
  }

  public void setPartyOrPartyRole(PartyOrPartyRoleMVO partyOrPartyRole) {
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
    RelatedPartyOrPartyRoleMVO relatedPartyOrPartyRoleMVO = (RelatedPartyOrPartyRoleMVO) o;
    return Objects.equals(this.role, relatedPartyOrPartyRoleMVO.role) &&
        Objects.equals(this.partyOrPartyRole, relatedPartyOrPartyRoleMVO.partyOrPartyRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, partyOrPartyRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedPartyOrPartyRoleMVO {\n");
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

