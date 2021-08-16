package com.iootpo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {
    @Id @GeneratedValue
    private long id;

    String userName;
    int dni;
    String firstName;
    String lastName;
    String address;
    Date creationDate;
    String password;
    Boolean isAdmin;

    public User(String userName, int dni, String firstName, String lastName, String address, Date creationDate, String password, Boolean isAdmin) {
        this.userName = userName;
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.creationDate = creationDate;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
