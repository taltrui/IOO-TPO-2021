package com.iootpo.View.Screens;

import com.iootpo.DAO.DentistDAO;

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
        if(!validInputs()) return;

        DentistDAO dentistDao = new DentistDAO();

        try {
            dentistDao.create(createDentist());
        } catch (RollbackException exception) {
            Throwable cause = exception.getCause();
            System.out.println(cause.getClass());
            if (cause.getClass() == EntityExistsException.class) {
                JOptionPane.showMessageDialog(null, "Ya existe el odontólogo.");
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error al crear al odontólogo.");
            }
            return;
        }
        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Odontólogo registrado!");
    }
}
