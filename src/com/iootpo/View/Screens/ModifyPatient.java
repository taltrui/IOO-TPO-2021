package com.iootpo.View.Screens;

import com.iootpo.DAO.UserDAO;
import com.iootpo.Model.User;

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
        lastnameField.setText(selectedUser.getLastName());
        dniField.setText(selectedUser.getDni());
        addressField.setText(selectedUser.getAddress());
        userField.setText(selectedUser.getUserName());
        passwordField.setText(selectedUser.getPassword());
    }

    @Override
    void onSubmit() {
        super.onSubmit();
    }
}
