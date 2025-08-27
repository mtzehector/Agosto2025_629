package mx.att.digital.customermanagement.interfaces.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mx.att.digital.customermanagement.interfaces.dto.Characteristic;
import mx.att.digital.customermanagement.interfaces.dto.CharacteristicRelationship;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ObjectArrayCharacteristic
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class ObjectArrayCharacteristic extends Characteristic implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<Object> value = new ArrayList<>();

  public ObjectArrayCharacteristic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ObjectArrayCharacteristic(String atType) {
    super(atType);
  }

  public ObjectArrayCharacteristic value(List<Object> value) {
    this.value = value;
    return this;
  }

  public ObjectArrayCharacteristic addValueItem(Object valueItem) {
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


  public ObjectArrayCharacteristic atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ObjectArrayCharacteristic atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ObjectArrayCharacteristic atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ObjectArrayCharacteristic id(String id) {
    super.id(id);
    return this;
  }

  public ObjectArrayCharacteristic name(String name) {
    super.name(name);
    return this;
  }

  public ObjectArrayCharacteristic valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public ObjectArrayCharacteristic characteristicRelationship(List<CharacteristicRelationship> characteristicRelationship) {
    super.characteristicRelationship(characteristicRelationship);
    return this;
  }

  public ObjectArrayCharacteristic addCharacteristicRelationshipItem(CharacteristicRelationship characteristicRelationshipItem) {
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
    ObjectArrayCharacteristic objectArrayCharacteristic = (ObjectArrayCharacteristic) o;
    return Objects.equals(this.value, objectArrayCharacteristic.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectArrayCharacteristic {\n");
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

