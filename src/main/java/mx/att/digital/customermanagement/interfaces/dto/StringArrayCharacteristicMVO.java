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

import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import mx.att.digital.customermanagement.interfaces.dto.CharacteristicMVO;
import mx.att.digital.customermanagement.interfaces.dto.CharacteristicRelationshipMVO;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StringArrayCharacteristicMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class StringArrayCharacteristicMVO extends CharacteristicMVO implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<String> value = new ArrayList<>();

  public StringArrayCharacteristicMVO value(List<String> value) {
    this.value = value;
    return this;
  }

  public StringArrayCharacteristicMVO addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Collection of string characteristics
   * @return value
   */
  
  @Schema(name = "value", description = "Collection of string characteristics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public List<String> getValue() {
    return value;
  }

  public void setValue(List<String> value) {
    this.value = value;
  }


  public StringArrayCharacteristicMVO name(String name) {
    super.name(name);
    return this;
  }

  public StringArrayCharacteristicMVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public StringArrayCharacteristicMVO characteristicRelationship(List<CharacteristicRelationshipMVO> characteristicRelationship) {
    super.characteristicRelationship(characteristicRelationship);
    return this;
  }

  public StringArrayCharacteristicMVO addCharacteristicRelationshipItem(CharacteristicRelationshipMVO characteristicRelationshipItem) {
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
    StringArrayCharacteristicMVO stringArrayCharacteristicMVO = (StringArrayCharacteristicMVO) o;
    return Objects.equals(this.value, stringArrayCharacteristicMVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringArrayCharacteristicMVO {\n");
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

