package mx.att.digital.customermanagement.interfaces.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import mx.att.digital.customermanagement.interfaces.dto.AttachmentRefOrValueFVO;
import mx.att.digital.customermanagement.interfaces.dto.TimePeriod;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrganizationIdentificationFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class OrganizationIdentificationFVO implements Serializable {

  private static final long serialVersionUID = 1L;

  private String atType;

  private String atBaseType;

  private String atSchemaLocation;

  private String identificationId;

  private String issuingAuthority;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime issuingDate;

  private String identificationType;

  private TimePeriod validFor;

  private AttachmentRefOrValueFVO attachment;

  public OrganizationIdentificationFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrganizationIdentificationFVO(String atType) {
    this.atType = atType;
  }

  public OrganizationIdentificationFVO atType(String atType) {
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

  public OrganizationIdentificationFVO atBaseType(String atBaseType) {
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

  public OrganizationIdentificationFVO atSchemaLocation(String atSchemaLocation) {
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

  public OrganizationIdentificationFVO identificationId(String identificationId) {
    this.identificationId = identificationId;
    return this;
  }

  /**
   * Identifier
   * @return identificationId
   */
  
  @Schema(name = "identificationId", description = "Identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identificationId")
  public String getIdentificationId() {
    return identificationId;
  }

  public void setIdentificationId(String identificationId) {
    this.identificationId = identificationId;
  }

  public OrganizationIdentificationFVO issuingAuthority(String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
    return this;
  }

  /**
   * Authority which has issued the identifier (chamber of commerce...)
   * @return issuingAuthority
   */
  
  @Schema(name = "issuingAuthority", description = "Authority which has issued the identifier (chamber of commerce...)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuingAuthority")
  public String getIssuingAuthority() {
    return issuingAuthority;
  }

  public void setIssuingAuthority(String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
  }

  public OrganizationIdentificationFVO issuingDate(OffsetDateTime issuingDate) {
    this.issuingDate = issuingDate;
    return this;
  }

  /**
   * Date at which the identifier was issued
   * @return issuingDate
   */
  @Valid 
  @Schema(name = "issuingDate", description = "Date at which the identifier was issued", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuingDate")
  public OffsetDateTime getIssuingDate() {
    return issuingDate;
  }

  public void setIssuingDate(OffsetDateTime issuingDate) {
    this.issuingDate = issuingDate;
  }

  public OrganizationIdentificationFVO identificationType(String identificationType) {
    this.identificationType = identificationType;
    return this;
  }

  /**
   * Type of identification information used to identify the company in a country or internationally
   * @return identificationType
   */
  
  @Schema(name = "identificationType", description = "Type of identification information used to identify the company in a country or internationally", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identificationType")
  public String getIdentificationType() {
    return identificationType;
  }

  public void setIdentificationType(String identificationType) {
    this.identificationType = identificationType;
  }

  public OrganizationIdentificationFVO validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   */
  @Valid 
  @Schema(name = "validFor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validFor")
  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public OrganizationIdentificationFVO attachment(AttachmentRefOrValueFVO attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Get attachment
   * @return attachment
   */
  @Valid 
  @Schema(name = "attachment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachment")
  public AttachmentRefOrValueFVO getAttachment() {
    return attachment;
  }

  public void setAttachment(AttachmentRefOrValueFVO attachment) {
    this.attachment = attachment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationIdentificationFVO organizationIdentificationFVO = (OrganizationIdentificationFVO) o;
    return Objects.equals(this.atType, organizationIdentificationFVO.atType) &&
        Objects.equals(this.atBaseType, organizationIdentificationFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, organizationIdentificationFVO.atSchemaLocation) &&
        Objects.equals(this.identificationId, organizationIdentificationFVO.identificationId) &&
        Objects.equals(this.issuingAuthority, organizationIdentificationFVO.issuingAuthority) &&
        Objects.equals(this.issuingDate, organizationIdentificationFVO.issuingDate) &&
        Objects.equals(this.identificationType, organizationIdentificationFVO.identificationType) &&
        Objects.equals(this.validFor, organizationIdentificationFVO.validFor) &&
        Objects.equals(this.attachment, organizationIdentificationFVO.attachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, identificationId, issuingAuthority, issuingDate, identificationType, validFor, attachment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationIdentificationFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    identificationId: ").append(toIndentedString(identificationId)).append("\n");
    sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
    sb.append("    issuingDate: ").append(toIndentedString(issuingDate)).append("\n");
    sb.append("    identificationType: ").append(toIndentedString(identificationType)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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

