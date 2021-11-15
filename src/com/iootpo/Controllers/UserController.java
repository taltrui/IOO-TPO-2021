package com.iootpo.Controllers;

import com.iootpo.DAO.AdminDAO;
import com.iootpo.DAO.PatientDAO;
import com.iootpo.Model.Admin;
import com.iootpo.Model.Patient;
import com.iootpo.Model.User;
import com.iootpo.View.Screens.AdminMainScreen;
import com.iootpo.View.Screens.Login;
import com.iootpo.View.Screens.PatientMainScreen;

import javax.persistence.NoResultException;
import javax.swing.*;

public class UserController {

    private Patient currentPatient;
    private static UserController controller;

    public static UserController getController() {
        if (controller == null) {
            controller = new UserController();
        }
        return controller;
    }
    public void logUser(String user, char[] password) {

        try {
            AdminDAO adminDAO = new AdminDAO();
            Admin admin = adminDAO.get(user);

            if (admin != null && admin.getPassword().equals(new String(password))) {
                AdminMainScreen.getWindow().setVisible(true);
                Login.getWindow().setVisible(false);
                return;
            }
        } catch (NoResultException exception) {
        }


        try {
            PatientDAO patientDAO = new PatientDAO();

            Patient patient = patientDAO.get(user);

            if (patient != null && patient.getPassword().equals(new String(password))) {
                PatientMainScreen.getWindow().setVisible(true);
                Login.getWindow().setVisible(false);
                currentPatient = patient;
                return;
            }
        } catch (NoResultException exception) {
        }

        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");


    }

    public Patient getCurrentPatient() {
        return currentPatient;
    }
}
