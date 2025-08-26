package mx.att.digital.customermanagement.adapter.in.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * StringArrayCharacteristic
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class StringArrayCharacteristic extends Characteristic implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<String> value = new ArrayList<>();

  public StringArrayCharacteristic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StringArrayCharacteristic(String atType) {
    super(atType);
  }

  public StringArrayCharacteristic value(List<String> value) {
    this.value = value;
    return this;
  }

  public StringArrayCharacteristic addValueItem(String valueItem) {
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


  public StringArrayCharacteristic atType(String atType) {
    super.atType(atType);
    return this;
  }

  public StringArrayCharacteristic atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public StringArrayCharacteristic atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public StringArrayCharacteristic id(String id) {
    super.id(id);
    return this;
  }

  public StringArrayCharacteristic name(String name) {
    super.name(name);
    return this;
  }

  public StringArrayCharacteristic valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public StringArrayCharacteristic characteristicRelationship(List<CharacteristicRelationship> characteristicRelationship) {
    super.characteristicRelationship(characteristicRelationship);
    return this;
  }

  public StringArrayCharacteristic addCharacteristicRelationshipItem(CharacteristicRelationship characteristicRelationshipItem) {
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
    StringArrayCharacteristic stringArrayCharacteristic = (StringArrayCharacteristic) o;
    return Objects.equals(this.value, stringArrayCharacteristic.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringArrayCharacteristic {\n");
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

