package com.iootpo.Model;

import javax.persistence.Entity;

@Entity
public class Dentist extends User{
    int registration;

    public int getRegistration() {
        return registration;
    }
}
