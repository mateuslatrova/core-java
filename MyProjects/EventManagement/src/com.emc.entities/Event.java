package com.emc.entities;

import java.sql.Time;

public class Event extends EMBase {
    
    private String description;
    private String startTime;
    private String endTime;
    private Boolean started;

    public Event(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
