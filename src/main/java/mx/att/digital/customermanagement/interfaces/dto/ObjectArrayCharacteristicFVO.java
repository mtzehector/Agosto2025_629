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
 * ObjectArrayCharacteristicFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class ObjectArrayCharacteristicFVO extends CharacteristicFVO implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<Object> value = new ArrayList<>();

  public ObjectArrayCharacteristicFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ObjectArrayCharacteristicFVO(List<Object> value, String atType) {
    super(atType);
    this.value = value;
  }

  public ObjectArrayCharacteristicFVO value(List<Object> value) {
    this.value = value;
    return this;
  }

  public ObjectArrayCharacteristicFVO addValueItem(Object valueItem) {
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
  @NotNull 
  @Schema(name = "value", description = "Collection of characteristic values", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public List<Object> getValue() {
    return value;
  }

  public void setValue(List<Object> value) {
    this.value = value;
  }


  public ObjectArrayCharacteristicFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ObjectArrayCharacteristicFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ObjectArrayCharacteristicFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ObjectArrayCharacteristicFVO name(String name) {
    super.name(name);
    return this;
  }

  public ObjectArrayCharacteristicFVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public ObjectArrayCharacteristicFVO characteristicRelationship(List<CharacteristicRelationshipFVO> characteristicRelationship) {
    super.characteristicRelationship(characteristicRelationship);
    return this;
  }

  public ObjectArrayCharacteristicFVO addCharacteristicRelationshipItem(CharacteristicRelationshipFVO characteristicRelationshipItem) {
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
    ObjectArrayCharacteristicFVO objectArrayCharacteristicFVO = (ObjectArrayCharacteristicFVO) o;
    return Objects.equals(this.value, objectArrayCharacteristicFVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectArrayCharacteristicFVO {\n");
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

