package mx.att.digital.customermanagement.interfaces.dto;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * CustomerFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class CustomerFVO extends PartyRoleFVO implements Serializable {

  private static final long serialVersionUID = 1L;

  public CustomerFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomerFVO(String atType, String name, EntityRefFVO engagedParty) {
    super(atType, name, engagedParty);
  }


  public CustomerFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public CustomerFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public CustomerFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public CustomerFVO href(String href) {
    super.href(href);
    return this;
  }

  public CustomerFVO id(String id) {
    super.id(id);
    return this;
  }

  public CustomerFVO name(String name) {
    super.name(name);
    return this;
  }

  public CustomerFVO description(String description) {
    super.description(description);
    return this;
  }

  public CustomerFVO role(String role) {
    super.role(role);
    return this;
  }

  public CustomerFVO engagedParty(EntityRefFVO engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public CustomerFVO partyRoleSpecification(EntityRefFVO partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public CustomerFVO characteristic(List<CharacteristicFVO> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public CustomerFVO addCharacteristicItem(CharacteristicFVO characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public CustomerFVO account(List<@Valid EntityRefFVO> account) {
    super.account(account);
    return this;
  }

  public CustomerFVO addAccountItem(EntityRefFVO accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public CustomerFVO agreement(List<@Valid EntityRefFVO> agreement) {
    super.agreement(agreement);
    return this;
  }

  public CustomerFVO addAgreementItem(EntityRefFVO agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public CustomerFVO contactMedium(List<ContactMediumFVO> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public CustomerFVO addContactMediumItem(ContactMediumFVO contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public CustomerFVO paymentMethod(List<@Valid EntityRefFVO> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public CustomerFVO addPaymentMethodItem(EntityRefFVO paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public CustomerFVO creditProfile(List<CreditProfile> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public CustomerFVO addCreditProfileItem(CreditProfile creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public CustomerFVO relatedParty(List<RelatedPartyOrPartyRoleFVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public CustomerFVO addRelatedPartyItem(RelatedPartyOrPartyRoleFVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public CustomerFVO status(String status) {
    super.status(status);
    return this;
  }

  public CustomerFVO statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public CustomerFVO validFor(TimePeriod validFor) {
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
    sb.append("class CustomerFVO {\n");
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

