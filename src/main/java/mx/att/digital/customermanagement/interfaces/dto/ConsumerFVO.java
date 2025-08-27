package mx.att.digital.customermanagement.interfaces.dto;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import mx.att.digital.customermanagement.domain.model.EntityRefFVO;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * ConsumerFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class ConsumerFVO extends PartyRoleFVO implements Serializable, PartyOrPartyRoleFVO {

  private static final long serialVersionUID = 1L;

  public ConsumerFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConsumerFVO(String atType, String name, EntityRefFVO engagedParty) {
    super(atType, name, engagedParty);
  }


  public ConsumerFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ConsumerFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ConsumerFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ConsumerFVO href(String href) {
    super.href(href);
    return this;
  }

  public ConsumerFVO id(String id) {
    super.id(id);
    return this;
  }

  public ConsumerFVO name(String name) {
    super.name(name);
    return this;
  }

  public ConsumerFVO description(String description) {
    super.description(description);
    return this;
  }

  public ConsumerFVO role(String role) {
    super.role(role);
    return this;
  }

  public ConsumerFVO engagedParty(EntityRefFVO engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public ConsumerFVO partyRoleSpecification(EntityRefFVO partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public ConsumerFVO characteristic(List<CharacteristicFVO> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public ConsumerFVO addCharacteristicItem(CharacteristicFVO characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public ConsumerFVO account(List<@Valid EntityRefFVO> account) {
    super.account(account);
    return this;
  }

  public ConsumerFVO addAccountItem(EntityRefFVO accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public ConsumerFVO agreement(List<@Valid EntityRefFVO> agreement) {
    super.agreement(agreement);
    return this;
  }

  public ConsumerFVO addAgreementItem(EntityRefFVO agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public ConsumerFVO contactMedium(List<ContactMediumFVO> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public ConsumerFVO addContactMediumItem(ContactMediumFVO contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public ConsumerFVO paymentMethod(List<@Valid EntityRefFVO> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public ConsumerFVO addPaymentMethodItem(EntityRefFVO paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public ConsumerFVO creditProfile(List<CreditProfile> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public ConsumerFVO addCreditProfileItem(CreditProfile creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public ConsumerFVO relatedParty(List<RelatedPartyOrPartyRoleFVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public ConsumerFVO addRelatedPartyItem(RelatedPartyOrPartyRoleFVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public ConsumerFVO status(String status) {
    super.status(status);
    return this;
  }

  public ConsumerFVO statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public ConsumerFVO validFor(TimePeriod validFor) {
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
    sb.append("class ConsumerFVO {\n");
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

