package com.iootpo.Model;

import javax.persistence.Entity;

@Entity
public class Admin extends User{

    boolean isAdmin = true;

    public boolean isAdmin() {
        return isAdmin;
    }

}
