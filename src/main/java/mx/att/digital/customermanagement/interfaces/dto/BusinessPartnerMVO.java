package mx.att.digital.customermanagement.interfaces.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import mx.att.digital.customermanagement.domain.model.EntityRefMVO;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * When business partner is the BusinessPartner 
 */

@Schema(name = "BusinessPartner_MVO", description = "When business partner is the BusinessPartner ")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class BusinessPartnerMVO extends PartyRoleMVO implements Serializable, PartyOrPartyRoleMVO {

  private static final long serialVersionUID = 1L;

  public BusinessPartnerMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BusinessPartnerMVO(String atType, String name, EntityRefMVO engagedParty) {
    super(atType, name, engagedParty);
  }


  public BusinessPartnerMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public BusinessPartnerMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public BusinessPartnerMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public BusinessPartnerMVO href(String href) {
    super.href(href);
    return this;
  }

  public BusinessPartnerMVO id(String id) {
    super.id(id);
    return this;
  }

  public BusinessPartnerMVO name(String name) {
    super.name(name);
    return this;
  }

  public BusinessPartnerMVO description(String description) {
    super.description(description);
    return this;
  }

  public BusinessPartnerMVO role(String role) {
    super.role(role);
    return this;
  }

  public BusinessPartnerMVO engagedParty(EntityRefMVO engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public BusinessPartnerMVO partyRoleSpecification(EntityRefMVO partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public BusinessPartnerMVO characteristic(List<CharacteristicMVO> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public BusinessPartnerMVO addCharacteristicItem(CharacteristicMVO characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public BusinessPartnerMVO account(List<@Valid EntityRefMVO> account) {
    super.account(account);
    return this;
  }

  public BusinessPartnerMVO addAccountItem(EntityRefMVO accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public BusinessPartnerMVO agreement(List<@Valid EntityRefMVO> agreement) {
    super.agreement(agreement);
    return this;
  }

  public BusinessPartnerMVO addAgreementItem(EntityRefMVO agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public BusinessPartnerMVO contactMedium(List<ContactMediumMVO> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public BusinessPartnerMVO addContactMediumItem(ContactMediumMVO contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public BusinessPartnerMVO paymentMethod(List<@Valid EntityRefMVO> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public BusinessPartnerMVO addPaymentMethodItem(EntityRefMVO paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public BusinessPartnerMVO creditProfile(List<CreditProfileMVO> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public BusinessPartnerMVO addCreditProfileItem(CreditProfileMVO creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public BusinessPartnerMVO relatedParty(List<RelatedPartyOrPartyRoleMVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public BusinessPartnerMVO addRelatedPartyItem(RelatedPartyOrPartyRoleMVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public BusinessPartnerMVO status(String status) {
    super.status(status);
    return this;
  }

  public BusinessPartnerMVO statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public BusinessPartnerMVO validFor(TimePeriod validFor) {
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
    sb.append("class BusinessPartnerMVO {\n");
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

