package mx.att.digital.customermanagement.interfaces.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mx.att.digital.customermanagement.interfaces.dto.CharacteristicFVO;
import mx.att.digital.customermanagement.interfaces.dto.ContactMediumFVO;
import mx.att.digital.customermanagement.interfaces.dto.ExternalIdentifierFVO;
import mx.att.digital.customermanagement.interfaces.dto.OrganizationChildRelationshipFVO;
import mx.att.digital.customermanagement.interfaces.dto.OrganizationIdentificationFVO;
import mx.att.digital.customermanagement.interfaces.dto.OrganizationParentRelationshipFVO;
import mx.att.digital.customermanagement.interfaces.dto.OrganizationStateType;
import mx.att.digital.customermanagement.interfaces.dto.OtherNameOrganization;
import mx.att.digital.customermanagement.interfaces.dto.PartyCreditProfile;
import mx.att.digital.customermanagement.interfaces.dto.PartyFVO;
import mx.att.digital.customermanagement.interfaces.dto.RelatedPartyOrPartyRoleFVO;
import mx.att.digital.customermanagement.interfaces.dto.TaxExemptionCertificateFVO;
import mx.att.digital.customermanagement.interfaces.dto.TimePeriod;
import java.time.OffsetDateTime;
import mx.att.digital.customermanagement.domain.model.EntityRefFVO;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrganizationFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class OrganizationFVO extends PartyFVO implements Serializable, PartyOrPartyRoleFVO {

  private static final long serialVersionUID = 1L;

  private Boolean isLegalEntity;

  private Boolean isHeadOffice;

  private String organizationType;

  private TimePeriod existsDuring;

  private String name;

  private String nameType;

  private OrganizationStateType status;

  @Valid
  private List<OtherNameOrganization> otherName = new ArrayList<>();

  @Valid
  private List<OrganizationIdentificationFVO> organizationIdentification = new ArrayList<>();

  @Valid
  private List<OrganizationChildRelationshipFVO> organizationChildRelationship = new ArrayList<>();

  private OrganizationParentRelationshipFVO organizationParentRelationship;

  private String tradingName;

  public OrganizationFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrganizationFVO(String atType) {
    super(atType);
  }

  public OrganizationFVO isLegalEntity(Boolean isLegalEntity) {
    this.isLegalEntity = isLegalEntity;
    return this;
  }

  /**
   * If value is true, the organization is a legal entity known by a national referential.
   * @return isLegalEntity
   */
  
  @Schema(name = "isLegalEntity", description = "If value is true, the organization is a legal entity known by a national referential.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isLegalEntity")
  public Boolean getIsLegalEntity() {
    return isLegalEntity;
  }

  public void setIsLegalEntity(Boolean isLegalEntity) {
    this.isLegalEntity = isLegalEntity;
  }

  public OrganizationFVO isHeadOffice(Boolean isHeadOffice) {
    this.isHeadOffice = isHeadOffice;
    return this;
  }

  /**
   * If value is true, the organization is the head office
   * @return isHeadOffice
   */
  
  @Schema(name = "isHeadOffice", description = "If value is true, the organization is the head office", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isHeadOffice")
  public Boolean getIsHeadOffice() {
    return isHeadOffice;
  }

  public void setIsHeadOffice(Boolean isHeadOffice) {
    this.isHeadOffice = isHeadOffice;
  }

  public OrganizationFVO organizationType(String organizationType) {
    this.organizationType = organizationType;
    return this;
  }

  /**
   * Type of Organization (company, department...)
   * @return organizationType
   */
  
  @Schema(name = "organizationType", description = "Type of Organization (company, department...)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organizationType")
  public String getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType(String organizationType) {
    this.organizationType = organizationType;
  }

  public OrganizationFVO existsDuring(TimePeriod existsDuring) {
    this.existsDuring = existsDuring;
    return this;
  }

  /**
   * Get existsDuring
   * @return existsDuring
   */
  @Valid 
  @Schema(name = "existsDuring", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("existsDuring")
  public TimePeriod getExistsDuring() {
    return existsDuring;
  }

  public void setExistsDuring(TimePeriod existsDuring) {
    this.existsDuring = existsDuring;
  }

  public OrganizationFVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Organization name (department name for example)
   * @return name
   */
  
  @Schema(name = "name", description = "Organization name (department name for example)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganizationFVO nameType(String nameType) {
    this.nameType = nameType;
    return this;
  }

  /**
   * Type of the name : Co, Inc, Ltd, etc.
   * @return nameType
   */
  
  @Schema(name = "nameType", description = "Type of the name : Co, Inc, Ltd, etc.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nameType")
  public String getNameType() {
    return nameType;
  }

  public void setNameType(String nameType) {
    this.nameType = nameType;
  }

  public OrganizationFVO status(OrganizationStateType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public OrganizationStateType getStatus() {
    return status;
  }

  public void setStatus(OrganizationStateType status) {
    this.status = status;
  }

  public OrganizationFVO otherName(List<OtherNameOrganization> otherName) {
    this.otherName = otherName;
    return this;
  }

  public OrganizationFVO addOtherNameItem(OtherNameOrganization otherNameItem) {
    if (this.otherName == null) {
      this.otherName = new ArrayList<>();
    }
    this.otherName.add(otherNameItem);
    return this;
  }

  /**
   * List of additional names by which the organization is known
   * @return otherName
   */
  @Valid 
  @Schema(name = "otherName", description = "List of additional names by which the organization is known", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("otherName")
  public List<OtherNameOrganization> getOtherName() {
    return otherName;
  }

  public void setOtherName(List<OtherNameOrganization> otherName) {
    this.otherName = otherName;
  }

  public OrganizationFVO organizationIdentification(List<OrganizationIdentificationFVO> organizationIdentification) {
    this.organizationIdentification = organizationIdentification;
    return this;
  }

  public OrganizationFVO addOrganizationIdentificationItem(OrganizationIdentificationFVO organizationIdentificationItem) {
    if (this.organizationIdentification == null) {
      this.organizationIdentification = new ArrayList<>();
    }
    this.organizationIdentification.add(organizationIdentificationItem);
    return this;
  }

  /**
   * List of official identifiers given to the organization, for example company number in the registry of companies
   * @return organizationIdentification
   */
  @Valid 
  @Schema(name = "organizationIdentification", description = "List of official identifiers given to the organization, for example company number in the registry of companies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organizationIdentification")
  public List<OrganizationIdentificationFVO> getOrganizationIdentification() {
    return organizationIdentification;
  }

  public void setOrganizationIdentification(List<OrganizationIdentificationFVO> organizationIdentification) {
    this.organizationIdentification = organizationIdentification;
  }

  public OrganizationFVO organizationChildRelationship(List<OrganizationChildRelationshipFVO> organizationChildRelationship) {
    this.organizationChildRelationship = organizationChildRelationship;
    return this;
  }

  public OrganizationFVO addOrganizationChildRelationshipItem(OrganizationChildRelationshipFVO organizationChildRelationshipItem) {
    if (this.organizationChildRelationship == null) {
      this.organizationChildRelationship = new ArrayList<>();
    }
    this.organizationChildRelationship.add(organizationChildRelationshipItem);
    return this;
  }

  /**
   * List of organizations that are contained within this organization. For example if this organization is the Legal Department, the child organizations might include Claims, Courts, Contracts
   * @return organizationChildRelationship
   */
  @Valid 
  @Schema(name = "organizationChildRelationship", description = "List of organizations that are contained within this organization. For example if this organization is the Legal Department, the child organizations might include Claims, Courts, Contracts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organizationChildRelationship")
  public List<OrganizationChildRelationshipFVO> getOrganizationChildRelationship() {
    return organizationChildRelationship;
  }

  public void setOrganizationChildRelationship(List<OrganizationChildRelationshipFVO> organizationChildRelationship) {
    this.organizationChildRelationship = organizationChildRelationship;
  }

  public OrganizationFVO organizationParentRelationship(OrganizationParentRelationshipFVO organizationParentRelationship) {
    this.organizationParentRelationship = organizationParentRelationship;
    return this;
  }

  /**
   * Get organizationParentRelationship
   * @return organizationParentRelationship
   */
  @Valid 
  @Schema(name = "organizationParentRelationship", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organizationParentRelationship")
  public OrganizationParentRelationshipFVO getOrganizationParentRelationship() {
    return organizationParentRelationship;
  }

  public void setOrganizationParentRelationship(OrganizationParentRelationshipFVO organizationParentRelationship) {
    this.organizationParentRelationship = organizationParentRelationship;
  }

  public OrganizationFVO tradingName(String tradingName) {
    this.tradingName = tradingName;
    return this;
  }

  /**
   * Name that the organization (unit) trades under
   * @return tradingName
   */
  
  @Schema(name = "tradingName", description = "Name that the organization (unit) trades under", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tradingName")
  public String getTradingName() {
    return tradingName;
  }

  public void setTradingName(String tradingName) {
    this.tradingName = tradingName;
  }


  public OrganizationFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public OrganizationFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public OrganizationFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public OrganizationFVO href(String href) {
    super.href(href);
    return this;
  }

  public OrganizationFVO id(String id) {
    super.id(id);
    return this;
  }

  public OrganizationFVO externalReference(List<ExternalIdentifierFVO> externalReference) {
    super.externalReference(externalReference);
    return this;
  }

  public OrganizationFVO addExternalReferenceItem(ExternalIdentifierFVO externalReferenceItem) {
    super.addExternalReferenceItem(externalReferenceItem);
    return this;
  }

  public OrganizationFVO partyCharacteristic(List<CharacteristicFVO> partyCharacteristic) {
    super.partyCharacteristic(partyCharacteristic);
    return this;
  }

  public OrganizationFVO addPartyCharacteristicItem(CharacteristicFVO partyCharacteristicItem) {
    super.addPartyCharacteristicItem(partyCharacteristicItem);
    return this;
  }

  public OrganizationFVO taxExemptionCertificate(List<TaxExemptionCertificateFVO> taxExemptionCertificate) {
    super.taxExemptionCertificate(taxExemptionCertificate);
    return this;
  }

  public OrganizationFVO addTaxExemptionCertificateItem(TaxExemptionCertificateFVO taxExemptionCertificateItem) {
    super.addTaxExemptionCertificateItem(taxExemptionCertificateItem);
    return this;
  }

  public OrganizationFVO creditRating(List<PartyCreditProfile> creditRating) {
    super.creditRating(creditRating);
    return this;
  }

  public OrganizationFVO addCreditRatingItem(PartyCreditProfile creditRatingItem) {
    super.addCreditRatingItem(creditRatingItem);
    return this;
  }

  public OrganizationFVO relatedParty(List<RelatedPartyOrPartyRoleFVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public OrganizationFVO addRelatedPartyItem(RelatedPartyOrPartyRoleFVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public OrganizationFVO contactMedium(List<ContactMediumFVO> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public OrganizationFVO addContactMediumItem(ContactMediumFVO contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
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
    OrganizationFVO organizationFVO = (OrganizationFVO) o;
    return Objects.equals(this.isLegalEntity, organizationFVO.isLegalEntity) &&
        Objects.equals(this.isHeadOffice, organizationFVO.isHeadOffice) &&
        Objects.equals(this.organizationType, organizationFVO.organizationType) &&
        Objects.equals(this.existsDuring, organizationFVO.existsDuring) &&
        Objects.equals(this.name, organizationFVO.name) &&
        Objects.equals(this.nameType, organizationFVO.nameType) &&
        Objects.equals(this.status, organizationFVO.status) &&
        Objects.equals(this.otherName, organizationFVO.otherName) &&
        Objects.equals(this.organizationIdentification, organizationFVO.organizationIdentification) &&
        Objects.equals(this.organizationChildRelationship, organizationFVO.organizationChildRelationship) &&
        Objects.equals(this.organizationParentRelationship, organizationFVO.organizationParentRelationship) &&
        Objects.equals(this.tradingName, organizationFVO.tradingName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLegalEntity, isHeadOffice, organizationType, existsDuring, name, nameType, status, otherName, organizationIdentification, organizationChildRelationship, organizationParentRelationship, tradingName, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationFVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isLegalEntity: ").append(toIndentedString(isLegalEntity)).append("\n");
    sb.append("    isHeadOffice: ").append(toIndentedString(isHeadOffice)).append("\n");
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    existsDuring: ").append(toIndentedString(existsDuring)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameType: ").append(toIndentedString(nameType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    otherName: ").append(toIndentedString(otherName)).append("\n");
    sb.append("    organizationIdentification: ").append(toIndentedString(organizationIdentification)).append("\n");
    sb.append("    organizationChildRelationship: ").append(toIndentedString(organizationChildRelationship)).append("\n");
    sb.append("    organizationParentRelationship: ").append(toIndentedString(organizationParentRelationship)).append("\n");
    sb.append("    tradingName: ").append(toIndentedString(tradingName)).append("\n");
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

