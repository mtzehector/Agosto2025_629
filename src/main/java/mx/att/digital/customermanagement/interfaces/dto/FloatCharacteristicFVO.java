package mx.att.digital.customermanagement.interfaces.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mx.att.digital.customermanagement.interfaces.dto.CharacteristicFVO;
import mx.att.digital.customermanagement.interfaces.dto.CharacteristicRelationshipFVO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FloatCharacteristicFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class FloatCharacteristicFVO extends CharacteristicFVO implements Serializable {

  private static final long serialVersionUID = 1L;

  private Float value;

  public FloatCharacteristicFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FloatCharacteristicFVO(Float value, String atType) {
    super(atType);
    this.value = value;
  }

  public FloatCharacteristicFVO value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the characteristic
   * @return value
   */
  @NotNull 
  @Schema(name = "value", description = "Value of the characteristic", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }


  public FloatCharacteristicFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public FloatCharacteristicFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public FloatCharacteristicFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public FloatCharacteristicFVO name(String name) {
    super.name(name);
    return this;
  }

  public FloatCharacteristicFVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public FloatCharacteristicFVO characteristicRelationship(List<CharacteristicRelationshipFVO> characteristicRelationship) {
    super.characteristicRelationship(characteristicRelationship);
    return this;
  }

  public FloatCharacteristicFVO addCharacteristicRelationshipItem(CharacteristicRelationshipFVO characteristicRelationshipItem) {
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
    FloatCharacteristicFVO floatCharacteristicFVO = (FloatCharacteristicFVO) o;
    return Objects.equals(this.value, floatCharacteristicFVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloatCharacteristicFVO {\n");
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

