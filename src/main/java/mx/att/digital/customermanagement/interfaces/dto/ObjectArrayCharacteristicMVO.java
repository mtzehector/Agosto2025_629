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
 * ObjectArrayCharacteristicMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class ObjectArrayCharacteristicMVO extends CharacteristicMVO implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<Object> value = new ArrayList<>();

  public ObjectArrayCharacteristicMVO value(List<Object> value) {
    this.value = value;
    return this;
  }

  public ObjectArrayCharacteristicMVO addValueItem(Object valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Collection of characteristic values
   * @return value
   */
  
  @Schema(name = "value", description = "Collection of characteristic values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public List<Object> getValue() {
    return value;
  }

  public void setValue(List<Object> value) {
    this.value = value;
  }


  public ObjectArrayCharacteristicMVO name(String name) {
    super.name(name);
    return this;
  }

  public ObjectArrayCharacteristicMVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public ObjectArrayCharacteristicMVO characteristicRelationship(List<CharacteristicRelationshipMVO> characteristicRelationship) {
    super.characteristicRelationship(characteristicRelationship);
    return this;
  }

  public ObjectArrayCharacteristicMVO addCharacteristicRelationshipItem(CharacteristicRelationshipMVO characteristicRelationshipItem) {
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
    ObjectArrayCharacteristicMVO objectArrayCharacteristicMVO = (ObjectArrayCharacteristicMVO) o;
    return Objects.equals(this.value, objectArrayCharacteristicMVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectArrayCharacteristicMVO {\n");
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

