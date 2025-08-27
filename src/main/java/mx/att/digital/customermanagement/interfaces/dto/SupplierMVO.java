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
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * When business partner is the Supplier 
 */

@Schema(name = "Supplier_MVO", description = "When business partner is the Supplier ")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.10.0")
public class SupplierMVO extends PartyRoleMVO implements Serializable, PartyOrPartyRoleMVO {

  private static final long serialVersionUID = 1L;

  public SupplierMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SupplierMVO(String atType, String name, EntityRefMVO engagedParty) {
    super(atType, name, engagedParty);
  }


  public SupplierMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public SupplierMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public SupplierMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public SupplierMVO href(String href) {
    super.href(href);
    return this;
  }

  public SupplierMVO id(String id) {
    super.id(id);
    return this;
  }

  public SupplierMVO name(String name) {
    super.name(name);
    return this;
  }

  public SupplierMVO description(String description) {
    super.description(description);
    return this;
  }

  public SupplierMVO role(String role) {
    super.role(role);
    return this;
  }

  public SupplierMVO engagedParty(EntityRefMVO engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public SupplierMVO partyRoleSpecification(EntityRefMVO partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public SupplierMVO characteristic(List<CharacteristicMVO> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public SupplierMVO addCharacteristicItem(CharacteristicMVO characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public SupplierMVO account(List<@Valid EntityRefMVO> account) {
    super.account(account);
    return this;
  }

  public SupplierMVO addAccountItem(EntityRefMVO accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public SupplierMVO agreement(List<@Valid EntityRefMVO> agreement) {
    super.agreement(agreement);
    return this;
  }

  public SupplierMVO addAgreementItem(EntityRefMVO agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public SupplierMVO contactMedium(List<ContactMediumMVO> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public SupplierMVO addContactMediumItem(ContactMediumMVO contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public SupplierMVO paymentMethod(List<@Valid EntityRefMVO> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public SupplierMVO addPaymentMethodItem(EntityRefMVO paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public SupplierMVO creditProfile(List<CreditProfileMVO> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public SupplierMVO addCreditProfileItem(CreditProfileMVO creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public SupplierMVO relatedParty(List<RelatedPartyOrPartyRoleMVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public SupplierMVO addRelatedPartyItem(RelatedPartyOrPartyRoleMVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public SupplierMVO status(String status) {
    super.status(status);
    return this;
  }

  public SupplierMVO statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public SupplierMVO validFor(TimePeriod validFor) {
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
    sb.append("class SupplierMVO {\n");
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

