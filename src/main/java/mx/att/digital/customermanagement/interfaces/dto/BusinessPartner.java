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
 * When business partner is the BusinessPartner 
 */

@Schema(name = "BusinessPartner", description = "When business partner is the BusinessPartner ")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class BusinessPartner extends PartyRole implements Serializable, PartyOrPartyRole {

  private static final long serialVersionUID = 1L;

  public BusinessPartner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BusinessPartner(String atType) {
    super(atType);
  }


  public BusinessPartner atType(String atType) {
    super.atType(atType);
    return this;
  }

  public BusinessPartner atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public BusinessPartner atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public BusinessPartner href(String href) {
    super.href(href);
    return this;
  }

  public BusinessPartner id(String id) {
    super.id(id);
    return this;
  }

  public BusinessPartner name(String name) {
    super.name(name);
    return this;
  }

  public BusinessPartner description(String description) {
    super.description(description);
    return this;
  }

  public BusinessPartner role(String role) {
    super.role(role);
    return this;
  }

  public BusinessPartner engagedParty(EntityRef engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public BusinessPartner partyRoleSpecification(EntityRef partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public BusinessPartner characteristic(List<Characteristic> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public BusinessPartner addCharacteristicItem(Characteristic characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public BusinessPartner account(List<@Valid EntityRef> account) {
    super.account(account);
    return this;
  }

  public BusinessPartner addAccountItem(EntityRef accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public BusinessPartner agreement(List<@Valid EntityRef> agreement) {
    super.agreement(agreement);
    return this;
  }

  public BusinessPartner addAgreementItem(EntityRef agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public BusinessPartner contactMedium(List<ContactMedium> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public BusinessPartner addContactMediumItem(ContactMedium contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public BusinessPartner paymentMethod(List<@Valid EntityRef> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public BusinessPartner addPaymentMethodItem(EntityRef paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public BusinessPartner creditProfile(List<CreditProfile> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public BusinessPartner addCreditProfileItem(CreditProfile creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public BusinessPartner relatedParty(List<RelatedPartyOrPartyRole> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public BusinessPartner addRelatedPartyItem(RelatedPartyOrPartyRole relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public BusinessPartner status(String status) {
    super.status(status);
    return this;
  }

  public BusinessPartner statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public BusinessPartner validFor(TimePeriod validFor) {
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
    sb.append("class BusinessPartner {\n");
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

