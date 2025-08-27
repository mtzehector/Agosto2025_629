package mx.att.digital.customermanagement.interfaces.dto;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import mx.att.digital.customermanagement.domain.model.EntityRef;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Producer
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class Producer extends PartyRole implements Serializable, PartyOrPartyRole {

  private static final long serialVersionUID = 1L;

  public Producer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Producer(String atType) {
    super(atType);
  }


  public Producer atType(String atType) {
    super.atType(atType);
    return this;
  }

  public Producer atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public Producer atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public Producer href(String href) {
    super.href(href);
    return this;
  }

  public Producer id(String id) {
    super.id(id);
    return this;
  }

  public Producer name(String name) {
    super.name(name);
    return this;
  }

  public Producer description(String description) {
    super.description(description);
    return this;
  }

  public Producer role(String role) {
    super.role(role);
    return this;
  }

  public Producer engagedParty(EntityRef engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public Producer partyRoleSpecification(EntityRef partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public Producer characteristic(List<Characteristic> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public Producer addCharacteristicItem(Characteristic characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public Producer account(List<@Valid EntityRef> account) {
    super.account(account);
    return this;
  }

  public Producer addAccountItem(EntityRef accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public Producer agreement(List<@Valid EntityRef> agreement) {
    super.agreement(agreement);
    return this;
  }

  public Producer addAgreementItem(EntityRef agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public Producer contactMedium(List<ContactMedium> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public Producer addContactMediumItem(ContactMedium contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public Producer paymentMethod(List<@Valid EntityRef> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public Producer addPaymentMethodItem(EntityRef paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public Producer creditProfile(List<CreditProfile> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public Producer addCreditProfileItem(CreditProfile creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public Producer relatedParty(List<RelatedPartyOrPartyRole> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public Producer addRelatedPartyItem(RelatedPartyOrPartyRole relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public Producer status(String status) {
    super.status(status);
    return this;
  }

  public Producer statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public Producer validFor(TimePeriod validFor) {
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
    sb.append("class Producer {\n");
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

