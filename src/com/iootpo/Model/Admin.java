package com.iootpo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin extends User {

    @Id
    String userName;

    boolean isAdmin = true;

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Admin() {

    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public String getUserName() {
        return userName;
    }

}
