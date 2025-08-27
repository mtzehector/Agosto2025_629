package mx.att.digital.customermanagement.domain.model;

public class EntityRef {
    private String id;
    private String name;
    private String href;
    
    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getHref() { return href; }
    public void setHref(String href) { this.href = href; }
}