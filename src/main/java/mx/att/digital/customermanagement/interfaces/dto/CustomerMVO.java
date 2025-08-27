package mx.att.digital.customermanagement.interfaces.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mx.att.digital.customermanagement.interfaces.dto.CharacteristicMVO;
import mx.att.digital.customermanagement.interfaces.dto.ContactMediumMVO;
import mx.att.digital.customermanagement.interfaces.dto.CreditProfileMVO;
import mx.att.digital.customermanagement.interfaces.dto.EntityRefMVO;
import mx.att.digital.customermanagement.interfaces.dto.PartyRoleMVO;
import mx.att.digital.customermanagement.interfaces.dto.RelatedPartyOrPartyRoleMVO;
import mx.att.digital.customermanagement.interfaces.dto.TimePeriod;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CustomerMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class CustomerMVO extends PartyRoleMVO implements Serializable {

  private static final long serialVersionUID = 1L;

  public CustomerMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomerMVO(String atType, String name, EntityRefMVO engagedParty) {
    super(atType, name, engagedParty);
  }


  public CustomerMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public CustomerMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public CustomerMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public CustomerMVO href(String href) {
    super.href(href);
    return this;
  }

  public CustomerMVO id(String id) {
    super.id(id);
    return this;
  }

  public CustomerMVO name(String name) {
    super.name(name);
    return this;
  }

  public CustomerMVO description(String description) {
    super.description(description);
    return this;
  }

  public CustomerMVO role(String role) {
    super.role(role);
    return this;
  }

  public CustomerMVO engagedParty(EntityRefMVO engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public CustomerMVO partyRoleSpecification(EntityRefMVO partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public CustomerMVO characteristic(List<CharacteristicMVO> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public CustomerMVO addCharacteristicItem(CharacteristicMVO characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public CustomerMVO account(List<@Valid EntityRefMVO> account) {
    super.account(account);
    return this;
  }

  public CustomerMVO addAccountItem(EntityRefMVO accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public CustomerMVO agreement(List<@Valid EntityRefMVO> agreement) {
    super.agreement(agreement);
    return this;
  }

  public CustomerMVO addAgreementItem(EntityRefMVO agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public CustomerMVO contactMedium(List<ContactMediumMVO> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public CustomerMVO addContactMediumItem(ContactMediumMVO contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public CustomerMVO paymentMethod(List<@Valid EntityRefMVO> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public CustomerMVO addPaymentMethodItem(EntityRefMVO paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public CustomerMVO creditProfile(List<CreditProfileMVO> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public CustomerMVO addCreditProfileItem(CreditProfileMVO creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public CustomerMVO relatedParty(List<RelatedPartyOrPartyRoleMVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public CustomerMVO addRelatedPartyItem(RelatedPartyOrPartyRoleMVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public CustomerMVO status(String status) {
    super.status(status);
    return this;
  }

  public CustomerMVO statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public CustomerMVO validFor(TimePeriod validFor) {
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
    sb.append("class CustomerMVO {\n");
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

