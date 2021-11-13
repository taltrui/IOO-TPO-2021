package com.iootpo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dentist extends User{
    @Id
    String registration;

    public Dentist() {

    }

    public Dentist(String name, String lastName, String registration) {
        this.firstName = name;
        this.lastName = lastName;
        this.registration = registration;
    }

    public String getRegistration() {
        return registration;
    }
}
