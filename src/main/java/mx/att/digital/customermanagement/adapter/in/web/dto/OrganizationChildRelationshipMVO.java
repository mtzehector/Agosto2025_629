package mx.att.digital.customermanagement.adapter.in.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.io.Serializable;
import java.util.Objects;

/**
 * OrganizationChildRelationshipMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class OrganizationChildRelationshipMVO implements Serializable {

  private static final long serialVersionUID = 1L;

  private String relationshipType;

  private OrganizationRefMVO organization;

  public OrganizationChildRelationshipMVO relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Type of the relationship. Could be juridical, hierarchical, geographical, functional for example.
   * @return relationshipType
   */
  
  @Schema(name = "relationshipType", description = "Type of the relationship. Could be juridical, hierarchical, geographical, functional for example.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relationshipType")
  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public OrganizationChildRelationshipMVO organization(OrganizationRefMVO organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
   */
  @Valid 
  @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organization")
  public OrganizationRefMVO getOrganization() {
    return organization;
  }

  public void setOrganization(OrganizationRefMVO organization) {
    this.organization = organization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationChildRelationshipMVO organizationChildRelationshipMVO = (OrganizationChildRelationshipMVO) o;
    return Objects.equals(this.relationshipType, organizationChildRelationshipMVO.relationshipType) &&
        Objects.equals(this.organization, organizationChildRelationshipMVO.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationshipType, organization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationChildRelationshipMVO {\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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

