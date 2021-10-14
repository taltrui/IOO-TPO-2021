package com.iootpo.View.Screens;

import com.iootpo.DAO.UserDAO;

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

        userDAO.create(createUser());

        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Usuario registrado!");
    }
}
