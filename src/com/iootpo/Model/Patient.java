package com.iootpo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient extends User {
    @Id
    String userName;
    String address;
    String dni;

    public Patient(String userName, String dni, String firstName, String lastName, String address, String password) {
        this.userName = userName;
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.password = password;
    }

    public Patient() {
    }

    public String getDni() {
        return dni;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public String toString() {
        if (firstName == null) {
            return "";
        }
        return String.format("%s %s - %s", firstName, lastName, dni);
    }
}
