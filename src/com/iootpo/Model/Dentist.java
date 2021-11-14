package com.iootpo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dentist extends User {
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

    @Override
    public String toString() {

        if (firstName == null) {
            return "";
        }
        return String.format("%s %s - %s", firstName, lastName, registration);

    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
