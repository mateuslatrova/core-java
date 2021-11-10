package com.emc.test;
import com.emc.entities.*;

public class Test {

    public static void main(String[] args) {
        
        Organizer organizer = new Organizer();
        organizer.setId(123l);
        organizer.setName("Apple Inc");
        System.out.println(organizer);
        System.out.println(organizer.getName());

        Event event = new Event(456l,"Iphone 100 Launch", "Grand Launch");
        System.out.println(event.getDescription());
    }
    
}
