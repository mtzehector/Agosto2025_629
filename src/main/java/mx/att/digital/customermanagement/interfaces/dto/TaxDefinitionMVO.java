package mx.att.digital.customermanagement.interfaces.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import mx.att.digital.customermanagement.interfaces.dto.TimePeriod;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TaxDefinitionMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class TaxDefinitionMVO implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String name;

  private TimePeriod validFor;

  private String jurisdictionName;

  private String jurisdictionLevel;

  private String taxType;

  public TaxDefinitionMVO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the tax.
   * @return id
   */
  
  @Schema(name = "id", description = "Unique identifier of the tax.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TaxDefinitionMVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Tax name.
   * @return name
   */
  
  @Schema(name = "name", description = "Tax name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaxDefinitionMVO validFor(TimePeriod validFor) {
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

  public TaxDefinitionMVO jurisdictionName(String jurisdictionName) {
    this.jurisdictionName = jurisdictionName;
    return this;
  }

  /**
   * Name of the jurisdiction that levies the tax
   * @return jurisdictionName
   */
  
  @Schema(name = "jurisdictionName", example = "USA", description = "Name of the jurisdiction that levies the tax", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jurisdictionName")
  public String getJurisdictionName() {
    return jurisdictionName;
  }

  public void setJurisdictionName(String jurisdictionName) {
    this.jurisdictionName = jurisdictionName;
  }

  public TaxDefinitionMVO jurisdictionLevel(String jurisdictionLevel) {
    this.jurisdictionLevel = jurisdictionLevel;
    return this;
  }

  /**
   * Level of the jurisdiction that levies the tax
   * @return jurisdictionLevel
   */
  
  @Schema(name = "jurisdictionLevel", example = "Country", description = "Level of the jurisdiction that levies the tax", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jurisdictionLevel")
  public String getJurisdictionLevel() {
    return jurisdictionLevel;
  }

  public void setJurisdictionLevel(String jurisdictionLevel) {
    this.jurisdictionLevel = jurisdictionLevel;
  }

  public TaxDefinitionMVO taxType(String taxType) {
    this.taxType = taxType;
    return this;
  }

  /**
   * Type of the tax.
   * @return taxType
   */
  
  @Schema(name = "taxType", example = "VAT", description = "Type of the tax.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxType")
  public String getTaxType() {
    return taxType;
  }

  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDefinitionMVO taxDefinitionMVO = (TaxDefinitionMVO) o;
    return Objects.equals(this.id, taxDefinitionMVO.id) &&
        Objects.equals(this.name, taxDefinitionMVO.name) &&
        Objects.equals(this.validFor, taxDefinitionMVO.validFor) &&
        Objects.equals(this.jurisdictionName, taxDefinitionMVO.jurisdictionName) &&
        Objects.equals(this.jurisdictionLevel, taxDefinitionMVO.jurisdictionLevel) &&
        Objects.equals(this.taxType, taxDefinitionMVO.taxType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, validFor, jurisdictionName, jurisdictionLevel, taxType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDefinitionMVO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    jurisdictionName: ").append(toIndentedString(jurisdictionName)).append("\n");
    sb.append("    jurisdictionLevel: ").append(toIndentedString(jurisdictionLevel)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
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

