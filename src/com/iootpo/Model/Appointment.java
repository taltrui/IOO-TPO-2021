package com.iootpo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Appointment {
    @Id
    String id;
    String patientId;
    String dentistId;
    Date date;

    public Appointment(String patientId, String dentistId, Date date) {
        this.patientId = patientId;
        this.dentistId = dentistId;
        this.date = date;
        this.id = Math.random()+"";
    }

    public Appointment(Date date) {
        this.date = date;
    }

    public Appointment() {

    }

    public String getPatient() {
        return patientId;
    }

    public String getDentist() {
        return dentistId;
    }

    public Date getDate() {
        return date;
    }
}
