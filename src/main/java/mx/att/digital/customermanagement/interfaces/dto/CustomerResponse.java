package mx.att.digital.customermanagement.interfaces.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.List;

public class CustomerResponse {
    
    @JsonProperty("id")
    private String id;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("status")
    private String status;
    
    @JsonProperty("engagedParty")
    private EngagedParty engagedParty;
    
    @JsonProperty("account")
    private List<Account> account;
    
    @JsonProperty("paymentMethod")
    private List<PaymentMethod> paymentMethod;
    
    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty;
    
    @JsonProperty("characteristic")
    private List<Characteristic> characteristic;
    
    @JsonProperty("contactMedium")
    private List<ContactMedium> contactMedium;
    
    @JsonProperty("creditProfile")
    private List<CreditProfile> creditProfile;
    
    @JsonProperty("agreement")
    private List<Agreement> agreement;
    
    @JsonProperty("createDate")
    private LocalDateTime createDate;
    
    @JsonProperty("lastUpdate")
    private LocalDateTime lastUpdate;
    
    // Getters y setters
}

// Clases adicionales para la estructura TMF629
class EngagedParty {
    private String id;
    private String name;
    // Getters y setters
}