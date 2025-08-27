package mx.att.digital.customermanagement.interfaces.dto;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import mx.att.digital.customermanagement.domain.model.EntityRef;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Customer
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class Customer extends PartyRole implements Serializable {

  private static final long serialVersionUID = 1L;

  public Customer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Customer(String atType) {
    super(atType);
  }


  public Customer atType(String atType) {
    super.atType(atType);
    return this;
  }

  public Customer atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public Customer atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public Customer href(String href) {
    super.href(href);
    return this;
  }

  public Customer id(String id) {
    super.id(id);
    return this;
  }

  public Customer name(String name) {
    super.name(name);
    return this;
  }

  public Customer description(String description) {
    super.description(description);
    return this;
  }

  public Customer role(String role) {
    super.role(role);
    return this;
  }

  public Customer engagedParty(EntityRef engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public Customer partyRoleSpecification(EntityRef partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public Customer characteristic(List<Characteristic> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public Customer addCharacteristicItem(Characteristic characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public Customer account(List<@Valid EntityRef> account) {
    super.account(account);
    return this;
  }

  public Customer addAccountItem(EntityRef accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public Customer agreement(List<@Valid EntityRef> agreement) {
    super.agreement(agreement);
    return this;
  }

  public Customer addAgreementItem(EntityRef agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public Customer contactMedium(List<ContactMedium> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public Customer addContactMediumItem(ContactMedium contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public Customer paymentMethod(List<@Valid EntityRef> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public Customer addPaymentMethodItem(EntityRef paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public Customer creditProfile(List<CreditProfile> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public Customer addCreditProfileItem(CreditProfile creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public Customer relatedParty(List<RelatedPartyOrPartyRole> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public Customer addRelatedPartyItem(RelatedPartyOrPartyRole relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public Customer status(String status) {
    super.status(status);
    return this;
  }

  public Customer statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public Customer validFor(TimePeriod validFor) {
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
    sb.append("class Customer {\n");
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

