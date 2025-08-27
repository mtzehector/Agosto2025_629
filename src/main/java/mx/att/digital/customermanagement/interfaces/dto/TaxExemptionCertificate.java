package mx.att.digital.customermanagement.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TaxExemptionCertificate
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class TaxExemptionCertificate implements Serializable {

  private static final long serialVersionUID = 1L;

  private String atType;

  private String atBaseType;

  private String atSchemaLocation;

  private String id;

  @Valid
  private List<TaxDefinition> taxDefinition = new ArrayList<>();

  private TimePeriod validFor;

  private String certificateNumber;

  private String issuingJurisdiction;

  private String reason;

  private AttachmentRefOrValue attachment;

  public TaxExemptionCertificate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaxExemptionCertificate(String atType) {
    this.atType = atType;
  }

  public TaxExemptionCertificate atType(String atType) {
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

  public TaxExemptionCertificate atBaseType(String atBaseType) {
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

  public TaxExemptionCertificate atSchemaLocation(String atSchemaLocation) {
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

  public TaxExemptionCertificate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the tax exemption within list of the exemptions
   * @return id
   */
  
  @Schema(name = "id", description = "Identifier of the tax exemption within list of the exemptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TaxExemptionCertificate taxDefinition(List<TaxDefinition> taxDefinition) {
    this.taxDefinition = taxDefinition;
    return this;
  }

  public TaxExemptionCertificate addTaxDefinitionItem(TaxDefinition taxDefinitionItem) {
    if (this.taxDefinition == null) {
      this.taxDefinition = new ArrayList<>();
    }
    this.taxDefinition.add(taxDefinitionItem);
    return this;
  }

  /**
   * A list of taxes that are covered by the exemption, e.g. City Tax, State Tax. The definition would include the exemption (e.g. for a rate exemption 0% would be a full exemption, 5% could be a partial exemption if the actual rate was 10%).
   * @return taxDefinition
   */
  @Valid 
  @Schema(name = "taxDefinition", description = "A list of taxes that are covered by the exemption, e.g. City Tax, State Tax. The definition would include the exemption (e.g. for a rate exemption 0% would be a full exemption, 5% could be a partial exemption if the actual rate was 10%).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxDefinition")
  public List<TaxDefinition> getTaxDefinition() {
    return taxDefinition;
  }

  public void setTaxDefinition(List<TaxDefinition> taxDefinition) {
    this.taxDefinition = taxDefinition;
  }

  public TaxExemptionCertificate validFor(TimePeriod validFor) {
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

  public TaxExemptionCertificate certificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
    return this;
  }

  /**
   * Identifier of a document that shows proof of exemption from taxes for the taxing jurisdiction
   * @return certificateNumber
   */
  
  @Schema(name = "certificateNumber", description = "Identifier of a document that shows proof of exemption from taxes for the taxing jurisdiction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificateNumber")
  public String getCertificateNumber() {
    return certificateNumber;
  }

  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
  }

  public TaxExemptionCertificate issuingJurisdiction(String issuingJurisdiction) {
    this.issuingJurisdiction = issuingJurisdiction;
    return this;
  }

  /**
   * Name of the jurisdiction that issued the exemption
   * @return issuingJurisdiction
   */
  
  @Schema(name = "issuingJurisdiction", example = "USA", description = "Name of the jurisdiction that issued the exemption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuingJurisdiction")
  public String getIssuingJurisdiction() {
    return issuingJurisdiction;
  }

  public void setIssuingJurisdiction(String issuingJurisdiction) {
    this.issuingJurisdiction = issuingJurisdiction;
  }

  public TaxExemptionCertificate reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the tax exemption
   * @return reason
   */
  
  @Schema(name = "reason", description = "Reason for the tax exemption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public TaxExemptionCertificate attachment(AttachmentRefOrValue attachment) {
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
  public AttachmentRefOrValue getAttachment() {
    return attachment;
  }

  public void setAttachment(AttachmentRefOrValue attachment) {
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
    TaxExemptionCertificate taxExemptionCertificate = (TaxExemptionCertificate) o;
    return Objects.equals(this.atType, taxExemptionCertificate.atType) &&
        Objects.equals(this.atBaseType, taxExemptionCertificate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, taxExemptionCertificate.atSchemaLocation) &&
        Objects.equals(this.id, taxExemptionCertificate.id) &&
        Objects.equals(this.taxDefinition, taxExemptionCertificate.taxDefinition) &&
        Objects.equals(this.validFor, taxExemptionCertificate.validFor) &&
        Objects.equals(this.certificateNumber, taxExemptionCertificate.certificateNumber) &&
        Objects.equals(this.issuingJurisdiction, taxExemptionCertificate.issuingJurisdiction) &&
        Objects.equals(this.reason, taxExemptionCertificate.reason) &&
        Objects.equals(this.attachment, taxExemptionCertificate.attachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, id, taxDefinition, validFor, certificateNumber, issuingJurisdiction, reason, attachment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxExemptionCertificate {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taxDefinition: ").append(toIndentedString(taxDefinition)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
    sb.append("    issuingJurisdiction: ").append(toIndentedString(issuingJurisdiction)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

