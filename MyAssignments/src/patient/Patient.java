package patient;

public class Patient {
    
    private Long id;
    private String name;
    private String ssn;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return this.ssn;
    }
    
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
