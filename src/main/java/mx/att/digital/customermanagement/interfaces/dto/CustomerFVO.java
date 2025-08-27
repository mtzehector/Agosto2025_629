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
import mx.att.digital.customermanagement.interfaces.dto.CharacteristicFVO;
import mx.att.digital.customermanagement.interfaces.dto.ContactMediumFVO;
import mx.att.digital.customermanagement.interfaces.dto.CreditProfile;
import mx.att.digital.customermanagement.interfaces.dto.EntityRefFVO;
import mx.att.digital.customermanagement.interfaces.dto.PartyRoleFVO;
import mx.att.digital.customermanagement.interfaces.dto.RelatedPartyOrPartyRoleFVO;
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

