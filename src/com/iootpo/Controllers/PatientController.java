package com.iootpo.Controllers;

import com.iootpo.DAO.PatientDAO;
import com.iootpo.Model.Patient;

import javax.swing.*;
import java.util.List;

public class PatientController {
    PatientDAO patientDao = new PatientDAO();

    public void delete(Patient selectedPatient) {
        patientDao.delete(selectedPatient);
    }

    public void populateCombo(JComboBox<Patient> patientToDeleteCombo) {
        List<Patient> patients = patientDao.getAll();

        patientToDeleteCombo.addItem(new Patient());
        patients.forEach(patientToDeleteCombo::addItem);
    }

    public void create(Patient user) {
        patientDao.create(user);
    }

    public void update(Patient user) {
        patientDao.update(user);
    }
}
