package mx.att.digital.customermanagement.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.io.Serializable;
import java.util.Objects;

/**
 * OtherNameOrganizationMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class OtherNameOrganizationMVO implements Serializable {

  private static final long serialVersionUID = 1L;

  private String tradingName;

  private String nameType;

  private String name;

  private TimePeriod validFor;

  public OtherNameOrganizationMVO tradingName(String tradingName) {
    this.tradingName = tradingName;
    return this;
  }

  /**
   * The name that the organization trades under
   * @return tradingName
   */
  
  @Schema(name = "tradingName", description = "The name that the organization trades under", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tradingName")
  public String getTradingName() {
    return tradingName;
  }

  public void setTradingName(String tradingName) {
    this.tradingName = tradingName;
  }

  public OtherNameOrganizationMVO nameType(String nameType) {
    this.nameType = nameType;
    return this;
  }

  /**
   * Co. , Inc. , Ltd. , Pty Ltd. , Plc; , Gmbh
   * @return nameType
   */
  
  @Schema(name = "nameType", description = "Co. , Inc. , Ltd. , Pty Ltd. , Plc; , Gmbh", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nameType")
  public String getNameType() {
    return nameType;
  }

  public void setNameType(String nameType) {
    this.nameType = nameType;
  }

  public OtherNameOrganizationMVO name(String name) {
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

  public OtherNameOrganizationMVO validFor(TimePeriod validFor) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherNameOrganizationMVO otherNameOrganizationMVO = (OtherNameOrganizationMVO) o;
    return Objects.equals(this.tradingName, otherNameOrganizationMVO.tradingName) &&
        Objects.equals(this.nameType, otherNameOrganizationMVO.nameType) &&
        Objects.equals(this.name, otherNameOrganizationMVO.name) &&
        Objects.equals(this.validFor, otherNameOrganizationMVO.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradingName, nameType, name, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherNameOrganizationMVO {\n");
    sb.append("    tradingName: ").append(toIndentedString(tradingName)).append("\n");
    sb.append("    nameType: ").append(toIndentedString(nameType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

