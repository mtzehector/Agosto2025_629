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
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import mx.att.digital.customermanagement.interfaces.dto.Characteristic;
import mx.att.digital.customermanagement.interfaces.dto.ContactMedium;
import mx.att.digital.customermanagement.interfaces.dto.CreditProfile;
import mx.att.digital.customermanagement.interfaces.dto.EntityRef;
import mx.att.digital.customermanagement.interfaces.dto.PartyRole;
import mx.att.digital.customermanagement.interfaces.dto.RelatedPartyOrPartyRole;
import mx.att.digital.customermanagement.interfaces.dto.TimePeriod;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Consumer
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class Consumer extends PartyRole implements Serializable, PartyOrPartyRole {

  private static final long serialVersionUID = 1L;

  public Consumer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Consumer(String atType) {
    super(atType);
  }


  public Consumer atType(String atType) {
    super.atType(atType);
    return this;
  }

  public Consumer atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public Consumer atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public Consumer href(String href) {
    super.href(href);
    return this;
  }

  public Consumer id(String id) {
    super.id(id);
    return this;
  }

  public Consumer name(String name) {
    super.name(name);
    return this;
  }

  public Consumer description(String description) {
    super.description(description);
    return this;
  }

  public Consumer role(String role) {
    super.role(role);
    return this;
  }

  public Consumer engagedParty(EntityRef engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public Consumer partyRoleSpecification(EntityRef partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public Consumer characteristic(List<Characteristic> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public Consumer addCharacteristicItem(Characteristic characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public Consumer account(List<@Valid EntityRef> account) {
    super.account(account);
    return this;
  }

  public Consumer addAccountItem(EntityRef accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public Consumer agreement(List<@Valid EntityRef> agreement) {
    super.agreement(agreement);
    return this;
  }

  public Consumer addAgreementItem(EntityRef agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public Consumer contactMedium(List<ContactMedium> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public Consumer addContactMediumItem(ContactMedium contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public Consumer paymentMethod(List<@Valid EntityRef> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public Consumer addPaymentMethodItem(EntityRef paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public Consumer creditProfile(List<CreditProfile> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public Consumer addCreditProfileItem(CreditProfile creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public Consumer relatedParty(List<RelatedPartyOrPartyRole> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public Consumer addRelatedPartyItem(RelatedPartyOrPartyRole relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public Consumer status(String status) {
    super.status(status);
    return this;
  }

  public Consumer statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public Consumer validFor(TimePeriod validFor) {
    super.validFor(validFor);
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
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consumer {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

