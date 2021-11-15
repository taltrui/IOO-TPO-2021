package com.iootpo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Appointment {
    @Id
    String id;
    String patientId;
    String dentistId;
    String day;
    String hour;

    public Appointment(String patientId, String dentistId, String day, String hour) {
        this.patientId = patientId;
        this.dentistId = dentistId;
        this.day = day;
        this.hour = hour;
        this.id = Math.random() + "";
    }

    public Appointment() {

    }

    public String getPatient() {
        return patientId;
    }

    public String getDentist() {
        return dentistId;
    }

    public String getDay() {
        return day;
    }

    public String getHour() {
        return hour;
    }
}
