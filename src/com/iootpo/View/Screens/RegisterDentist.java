package com.iootpo.View.Screens;

import com.iootpo.Controllers.DentistController;
import com.iootpo.Model.Dentist;

import javax.persistence.EntityExistsException;
import javax.persistence.RollbackException;
import javax.swing.*;

public class RegisterDentist extends DentistData {

    public RegisterDentist() {
        super();
        setTitle("Registrar odontólogo");
        okButton.setText("Registrar");
    }

    @Override
    void onSubmit() {
        if(invalidInputs()) return;

        DentistController dentistController = new DentistController();

        Dentist newDentist = createDentist();
        try {
            dentistController.create(newDentist);
        } catch (RollbackException exception) {
            Throwable cause = exception.getCause();
            System.out.println(cause.getClass());
            if (cause.getClass() == EntityExistsException.class) {
                JOptionPane.showMessageDialog(null, "Ya existe el odontólogo con matrícula: " + newDentist.getRegistration());
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error al crear al odontólogo.");
            }
            return;
        }
        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "¡Odontólogo registrado!");
    }
}
