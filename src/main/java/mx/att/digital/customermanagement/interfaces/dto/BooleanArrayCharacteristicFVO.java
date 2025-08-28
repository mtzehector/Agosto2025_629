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
 * BooleanArrayCharacteristicFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class BooleanArrayCharacteristicFVO extends CharacteristicFVO implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<Boolean> value = new ArrayList<>();

  public BooleanArrayCharacteristicFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BooleanArrayCharacteristicFVO(List<Boolean> value, String atType) {
    super(atType);
    this.value = value;
  }

  public BooleanArrayCharacteristicFVO value(List<Boolean> value) {
    this.value = value;
    return this;
  }

  public BooleanArrayCharacteristicFVO addValueItem(Boolean valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * A characteristic which value is an array of Boolean(s).
   * @return value
   */
  @NotNull 
  @Schema(name = "value", description = "A characteristic which value is an array of Boolean(s).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public List<Boolean> getValue() {
    return value;
  }

  public void setValue(List<Boolean> value) {
    this.value = value;
  }


  public BooleanArrayCharacteristicFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public BooleanArrayCharacteristicFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public BooleanArrayCharacteristicFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public BooleanArrayCharacteristicFVO name(String name) {
    super.name(name);
    return this;
  }

  public BooleanArrayCharacteristicFVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public BooleanArrayCharacteristicFVO characteristicRelationship(List<CharacteristicRelationshipFVO> characteristicRelationship) {
    super.characteristicRelationship(characteristicRelationship);
    return this;
  }

  public BooleanArrayCharacteristicFVO addCharacteristicRelationshipItem(CharacteristicRelationshipFVO characteristicRelationshipItem) {
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
    BooleanArrayCharacteristicFVO booleanArrayCharacteristicFVO = (BooleanArrayCharacteristicFVO) o;
    return Objects.equals(this.value, booleanArrayCharacteristicFVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BooleanArrayCharacteristicFVO {\n");
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

