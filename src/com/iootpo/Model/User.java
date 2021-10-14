package com.iootpo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {
    @Id
    String dni;
    String userName;
    String firstName;
    String lastName;
    String address;
    String password;

    public User(String userName, String dni, String firstName, String lastName, String address, String password) {
        this.userName = userName;
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.password = password;
    }

    public User() {
    }

    public String getDni() {
        return dni;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
