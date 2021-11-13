package com.iootpo.View.Screens;

import com.iootpo.DAO.UserDAO;
import com.iootpo.Model.User;

import javax.swing.*;
import java.util.List;

public class ModifyPatient extends PatientData {

    public ModifyPatient() {
        super();
        setTitle("Modificar paciente");
        okButton.setText("Modificar");
        userCombo.setVisible(true);

        UserDAO userDAO = new UserDAO();

        List<User> users = userDAO.getAll();

        userCombo.addItem(new User());
        users.forEach(user -> userCombo.addItem(user));

        userCombo.addActionListener(e -> {
            populateData((User)userCombo.getSelectedItem());
        });
    }

    void populateData(User selectedUser) {
        nameField.setText(selectedUser.getFirstName());
        nameField.setEditable(false);
        lastnameField.setText(selectedUser.getLastName());
        lastnameField.setEditable(false);
        dniField.setText(selectedUser.getDni());
        dniField.setEditable(false);
        addressField.setText(selectedUser.getAddress());
        userField.setText(selectedUser.getUserName());
        userField.setEditable(false);
        passwordField.setText(selectedUser.getPassword());
    }

    @Override
    void onSubmit() {
        if(!validInputs()) return;

        UserDAO userDAO = new UserDAO();

        userDAO.update(createUser());

        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Usuario modificado!");

    }
}
