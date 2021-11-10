package patient;

import java.util.jar.Attributes.Name;

public class Test {
    
    public static void main(String[] args) {
        
        Patient p = new Patient();

        p.setId(123456l);
        p.setName("Barack Obama");
        p.setSsn("987654321");

        System.out.println("Patient's id: " + p.getId());
        System.out.println("Patient's name: " + p.getName());
        System.out.println("Patient's SSN: " + p.getSsn());
    }
}
