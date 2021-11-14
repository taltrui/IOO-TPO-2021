package com.iootpo.Model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class User {
    String firstName;
    String lastName;
    String password;

    public User() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {  return ""; }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
