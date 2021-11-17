package com.iootpo.View.Screens;

import com.iootpo.Controllers.DentistController;
import com.iootpo.Model.Dentist;

import javax.swing.*;
import java.util.Objects;

public class ModifyDentist extends DentistData {
    DentistController dentistController = new DentistController();

    public ModifyDentist() {
        super();
        setTitle("Modificar paciente");
        okButton.setText("Modificar");
        dentistCombo.setVisible(true);

        dentistController.populateCombo(dentistCombo);

        dentistCombo.addActionListener(e -> populateData((Dentist) Objects.requireNonNull(dentistCombo.getSelectedItem())));
    }

    void populateData(Dentist selectedDentist) {
        nameField.setText(selectedDentist.getFirstName());

        lastnameField.setText(selectedDentist.getLastName());

        registrationField.setText(selectedDentist.getRegistration());
        registrationField.setEditable(false);
    }

    @Override
    void onSubmit() {

        if(invalidInputs()) return;

        try {
            dentistController.update(createDentist());
            JOptionPane.showMessageDialog(null, "Odontólogo modificado!");
            this.setVisible(false);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Hubo un error al modificar al odontólogo");
        }
    }
}
