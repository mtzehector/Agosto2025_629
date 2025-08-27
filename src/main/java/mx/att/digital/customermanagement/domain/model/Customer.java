package mx.att.digital.customermanagement.domain.model;

import java.time.LocalDateTime;

public class Customer {
    private String id;
    private String name;
    private String email; // Añadir este campo
    private String status;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
    
    // Constructor
    public Customer(String id, String name, String email, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.status = status;
        this.createdDate = LocalDateTime.now();
        this.lastModifiedDate = LocalDateTime.now();
    }
    
    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() { return email; } // Añadir getter
    public void setEmail(String email) { this.email = email; } // Añadir setter
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    public LocalDateTime getCreatedDate() { return createdDate; }
    public LocalDateTime getLastModifiedDate() { return lastModifiedDate; }
    public void setLastModifiedDate(LocalDateTime lastModifiedDate) { 
        this.lastModifiedDate = lastModifiedDate; 
    }
}