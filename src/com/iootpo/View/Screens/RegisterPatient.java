package com.iootpo.View.Screens;

import com.iootpo.Controllers.PatientController;
import com.iootpo.Model.Patient;

import javax.persistence.EntityExistsException;
import javax.persistence.RollbackException;
import javax.swing.*;

public class RegisterPatient extends PatientData {

    public RegisterPatient() {
        super();
        setTitle("Registrar paciente");
        okButton.setText("Registrar");
    }

    @Override
    void onSubmit() {
        if(!validInputs()) return;

        PatientController patientController = new PatientController();

        Patient newPatient = createUser();

        try {
            patientController.create(newPatient);
        } catch (RollbackException exception) {
            Throwable cause = exception.getCause();
            if (cause.getClass() == EntityExistsException.class) {
                JOptionPane.showMessageDialog(null, "Ya existe el usuario: " + newPatient.getUserName());
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error al crear el usuario usuario.");
            }
            return;
        }

        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "¡Usuario registrado!");
    }
}
