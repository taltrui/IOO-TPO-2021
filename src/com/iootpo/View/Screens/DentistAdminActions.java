package com.iootpo.View.Screens;

import javax.swing.*;

public class DentistAdminActions extends AdminActions {
    private static JFrame frame;

    void createOptions() {
        registerButton.setText("Registrar odontólogo");
        registerButton.addActionListener(e -> new RegisterDentist().setVisible(true));
        modifyButton.setText("Modificar odontólogo");
        modifyButton.addActionListener(e -> new ModifyDentist().setVisible(true));
        deleteButton.setVisible(false);
    }

    public DentistAdminActions() {
        super();
        setTitle("Administrar odontólogos");
        createOptions();
    }

    public static JFrame getWindow() {
        if (frame == null) {
            frame = new DentistAdminActions();
        }
        return frame;
    }
}
