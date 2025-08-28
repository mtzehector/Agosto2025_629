package mx.att.digital.customermanagement.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;

/**
 * Valid values for the lifecycle state of the individual
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public enum IndividualStateType {
  
  INITIALIZED("initialized"),
  
  VALIDATED("validated"),
  
  DECEASED("deceased");

  private String value;

  IndividualStateType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static IndividualStateType fromValue(String value) {
    for (IndividualStateType b : IndividualStateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

