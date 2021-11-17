package com.iootpo.View.Screens;

import com.iootpo.Controllers.PatientController;
import com.iootpo.Model.Patient;

import javax.swing.*;
import java.util.Objects;

public class ModifyPatient extends PatientData {
    PatientController patientController = new PatientController();

    public ModifyPatient() {
        super();
        setTitle("Modificar paciente");
        okButton.setText("Modificar");
        userCombo.setVisible(true);

        patientController.populateCombo(userCombo);

        userCombo.addActionListener(e -> populateData((Patient) Objects.requireNonNull(userCombo.getSelectedItem())));
    }

    void populateData(Patient selectedPatient) {
        nameField.setText(selectedPatient.getFirstName());
        nameField.setEditable(false);
        lastnameField.setText(selectedPatient.getLastName());
        lastnameField.setEditable(false);
        dniField.setText(selectedPatient.getDni());
        dniField.setEditable(false);
        addressField.setText(selectedPatient.getAddress());
        userField.setText(selectedPatient.getUserName());
        userField.setEditable(false);
        passwordField.setText(selectedPatient.getPassword());
    }

    @Override
    void onSubmit() {
        if(invalidInputs()) return;

        try {
            patientController.update(createUser());
            JOptionPane.showMessageDialog(null, "Paciente modificado!");
            this.setVisible(false);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Hubo un error al modificar al paciente");
        }
    }
}
