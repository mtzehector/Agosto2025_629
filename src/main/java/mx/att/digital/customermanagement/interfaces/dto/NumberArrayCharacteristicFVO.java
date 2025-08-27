package mx.att.digital.customermanagement.interfaces.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import mx.att.digital.customermanagement.interfaces.dto.CharacteristicFVO;
import mx.att.digital.customermanagement.interfaces.dto.CharacteristicRelationshipFVO;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NumberArrayCharacteristicFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class NumberArrayCharacteristicFVO extends CharacteristicFVO implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<BigDecimal> value = new ArrayList<>();

  public NumberArrayCharacteristicFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NumberArrayCharacteristicFVO(List<BigDecimal> value, String atType) {
    super(atType);
    this.value = value;
  }

  public NumberArrayCharacteristicFVO value(List<BigDecimal> value) {
    this.value = value;
    return this;
  }

  public NumberArrayCharacteristicFVO addValueItem(BigDecimal valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * A characteristic which value is an array of Number(s).
   * @return value
   */
  @NotNull @Valid 
  @Schema(name = "value", description = "A characteristic which value is an array of Number(s).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public List<BigDecimal> getValue() {
    return value;
  }

  public void setValue(List<BigDecimal> value) {
    this.value = value;
  }


  public NumberArrayCharacteristicFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public NumberArrayCharacteristicFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public NumberArrayCharacteristicFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public NumberArrayCharacteristicFVO name(String name) {
    super.name(name);
    return this;
  }

  public NumberArrayCharacteristicFVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public NumberArrayCharacteristicFVO characteristicRelationship(List<CharacteristicRelationshipFVO> characteristicRelationship) {
    super.characteristicRelationship(characteristicRelationship);
    return this;
  }

  public NumberArrayCharacteristicFVO addCharacteristicRelationshipItem(CharacteristicRelationshipFVO characteristicRelationshipItem) {
    super.addCharacteristicRelationshipItem(characteristicRelationshipItem);
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
    NumberArrayCharacteristicFVO numberArrayCharacteristicFVO = (NumberArrayCharacteristicFVO) o;
    return Objects.equals(this.value, numberArrayCharacteristicFVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberArrayCharacteristicFVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

