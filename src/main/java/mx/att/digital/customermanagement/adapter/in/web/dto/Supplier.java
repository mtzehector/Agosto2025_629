package mx.att.digital.customermanagement.adapter.in.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * When business partner is the Supplier 
 */

@Schema(name = "Supplier", description = "When business partner is the Supplier ")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class Supplier extends PartyRole implements Serializable, PartyOrPartyRole {

  private static final long serialVersionUID = 1L;

  public Supplier() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Supplier(String atType) {
    super(atType);
  }


  public Supplier atType(String atType) {
    super.atType(atType);
    return this;
  }

  public Supplier atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public Supplier atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public Supplier href(String href) {
    super.href(href);
    return this;
  }

  public Supplier id(String id) {
    super.id(id);
    return this;
  }

  public Supplier name(String name) {
    super.name(name);
    return this;
  }

  public Supplier description(String description) {
    super.description(description);
    return this;
  }

  public Supplier role(String role) {
    super.role(role);
    return this;
  }

  public Supplier engagedParty(EntityRef engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public Supplier partyRoleSpecification(EntityRef partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public Supplier characteristic(List<Characteristic> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public Supplier addCharacteristicItem(Characteristic characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public Supplier account(List<@Valid EntityRef> account) {
    super.account(account);
    return this;
  }

  public Supplier addAccountItem(EntityRef accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public Supplier agreement(List<@Valid EntityRef> agreement) {
    super.agreement(agreement);
    return this;
  }

  public Supplier addAgreementItem(EntityRef agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public Supplier contactMedium(List<ContactMedium> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public Supplier addContactMediumItem(ContactMedium contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public Supplier paymentMethod(List<@Valid EntityRef> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public Supplier addPaymentMethodItem(EntityRef paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public Supplier creditProfile(List<CreditProfile> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public Supplier addCreditProfileItem(CreditProfile creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public Supplier relatedParty(List<RelatedPartyOrPartyRole> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public Supplier addRelatedPartyItem(RelatedPartyOrPartyRole relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public Supplier status(String status) {
    super.status(status);
    return this;
  }

  public Supplier statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public Supplier validFor(TimePeriod validFor) {
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
    sb.append("class Supplier {\n");
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

