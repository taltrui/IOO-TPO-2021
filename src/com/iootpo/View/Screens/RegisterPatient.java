package com.iootpo.View.Screens;

import com.iootpo.DAO.UserDAO;

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

        UserDAO userDAO = new UserDAO();

        try {
            userDAO.create(createUser());
        } catch (RollbackException exception) {
            Throwable cause = exception.getCause();
            System.out.println(cause.getClass());
            if (cause.getClass() == EntityExistsException.class) {
                JOptionPane.showMessageDialog(null, "Ya existe el usuario.");
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error al crear el usuario usuario.");
            }
            return;
        }

        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Usuario registrado!");
    }
}
