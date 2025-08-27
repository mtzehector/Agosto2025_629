package mx.att.digital.customermanagement.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Objects;

/**
 * OrganizationIdentificationMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class OrganizationIdentificationMVO implements Serializable {

  private static final long serialVersionUID = 1L;

  private String identificationId;

  private String issuingAuthority;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime issuingDate;

  private String identificationType;

  private TimePeriod validFor;

  private AttachmentRefOrValueMVO attachment;

  public OrganizationIdentificationMVO identificationId(String identificationId) {
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

  public OrganizationIdentificationMVO issuingAuthority(String issuingAuthority) {
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

  public OrganizationIdentificationMVO issuingDate(LocalDateTime issuingDate) {
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
  public LocalDateTime getIssuingDate() {
    return issuingDate;
  }

  public void setIssuingDate(LocalDateTime issuingDate) {
    this.issuingDate = issuingDate;
  }

  public OrganizationIdentificationMVO identificationType(String identificationType) {
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

  public OrganizationIdentificationMVO validFor(TimePeriod validFor) {
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

  public OrganizationIdentificationMVO attachment(AttachmentRefOrValueMVO attachment) {
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
  public AttachmentRefOrValueMVO getAttachment() {
    return attachment;
  }

  public void setAttachment(AttachmentRefOrValueMVO attachment) {
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
    OrganizationIdentificationMVO organizationIdentificationMVO = (OrganizationIdentificationMVO) o;
    return Objects.equals(this.identificationId, organizationIdentificationMVO.identificationId) &&
        Objects.equals(this.issuingAuthority, organizationIdentificationMVO.issuingAuthority) &&
        Objects.equals(this.issuingDate, organizationIdentificationMVO.issuingDate) &&
        Objects.equals(this.identificationType, organizationIdentificationMVO.identificationType) &&
        Objects.equals(this.validFor, organizationIdentificationMVO.validFor) &&
        Objects.equals(this.attachment, organizationIdentificationMVO.attachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificationId, issuingAuthority, issuingDate, identificationType, validFor, attachment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationIdentificationMVO {\n");
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

