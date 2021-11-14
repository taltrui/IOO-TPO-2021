package com.iootpo.View.Screens;

import javax.swing.*;

public class PatientAdminActions extends AdminActions {
    private static JFrame frame;
    void createOptions() {
        registerButton.setText("Registrar paciente");
        registerButton.addActionListener(e -> new RegisterPatient().setVisible(true));
        modifyButton.setText("Modificar paciente");
        modifyButton.addActionListener(e -> new ModifyPatient().setVisible(true));
        deleteButton.setText("Eliminar paciente");
        deleteButton.addActionListener(e -> new DeletePatient().setVisible(true));
    }

    public PatientAdminActions() {
        super();
        setTitle("Administrar pacientes");
        createOptions();
    }

    public static JFrame getWindow() {
        if (frame == null) {
            frame = new PatientAdminActions();
        }
        return frame;
    }

}
