package mx.att.digital.customermanagement.interfaces.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * When business partner is the Supplier 
 */

@Schema(name = "Supplier_FVO", description = "When business partner is the Supplier ")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class SupplierFVO extends PartyRoleFVO implements Serializable, PartyOrPartyRoleFVO {

  private static final long serialVersionUID = 1L;

  public SupplierFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SupplierFVO(String atType, String name, EntityRefFVO engagedParty) {
    super(atType, name, engagedParty);
  }


  public SupplierFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public SupplierFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public SupplierFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public SupplierFVO href(String href) {
    super.href(href);
    return this;
  }

  public SupplierFVO id(String id) {
    super.id(id);
    return this;
  }

  public SupplierFVO name(String name) {
    super.name(name);
    return this;
  }

  public SupplierFVO description(String description) {
    super.description(description);
    return this;
  }

  public SupplierFVO role(String role) {
    super.role(role);
    return this;
  }

  public SupplierFVO engagedParty(EntityRefFVO engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public SupplierFVO partyRoleSpecification(EntityRefFVO partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public SupplierFVO characteristic(List<CharacteristicFVO> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public SupplierFVO addCharacteristicItem(CharacteristicFVO characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public SupplierFVO account(List<@Valid EntityRefFVO> account) {
    super.account(account);
    return this;
  }

  public SupplierFVO addAccountItem(EntityRefFVO accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public SupplierFVO agreement(List<@Valid EntityRefFVO> agreement) {
    super.agreement(agreement);
    return this;
  }

  public SupplierFVO addAgreementItem(EntityRefFVO agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public SupplierFVO contactMedium(List<ContactMediumFVO> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public SupplierFVO addContactMediumItem(ContactMediumFVO contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public SupplierFVO paymentMethod(List<@Valid EntityRefFVO> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public SupplierFVO addPaymentMethodItem(EntityRefFVO paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public SupplierFVO creditProfile(List<CreditProfile> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public SupplierFVO addCreditProfileItem(CreditProfile creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public SupplierFVO relatedParty(List<RelatedPartyOrPartyRoleFVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public SupplierFVO addRelatedPartyItem(RelatedPartyOrPartyRoleFVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public SupplierFVO status(String status) {
    super.status(status);
    return this;
  }

  public SupplierFVO statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public SupplierFVO validFor(TimePeriod validFor) {
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
    sb.append("class SupplierFVO {\n");
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

