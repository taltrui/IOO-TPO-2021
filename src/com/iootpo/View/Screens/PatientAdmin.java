package com.iootpo.View.Screens;

import javax.swing.*;
import javax.swing.GroupLayout;

public class PatientAdmin extends JFrame {
    private static JFrame frame;

    private PatientAdmin() {
        registerPatientButton = new JButton();
        modifyPatientButton = new JButton();
        deletePatientButton = new JButton();
        backButton = new JButton();
        deletePatientDialog = new DeletePatient();

        setTitle("Administrar pacientes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);

        registerPatientButton.setText("Registrar paciente");

        modifyPatientButton.setText("Modificar paciente");

        deletePatientButton.setText("Eliminar paciente");
        deletePatientButton.addActionListener(e -> {
            deletePatientDialog.setVisible(true);
        });

        backButton.setText("Volver");
        backButton.addActionListener(e -> {
            AdminMainScreen.getWindow().setVisible(true);
            frame.setVisible(false);
        });

        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(266, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(deletePatientButton, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                        .addComponent(modifyPatientButton, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                        .addComponent(registerPatientButton, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
                    .addGap(252, 252, 252))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(backButton)
                    .addContainerGap(614, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(backButton)
                    .addGap(21, 21, 21)
                    .addComponent(registerPatientButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(modifyPatientButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(deletePatientButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }

    public static JFrame getWindow() {
        if (frame == null) {
            frame = new PatientAdmin();
        }
        return frame;
    }

    private JButton registerPatientButton;
    private JButton modifyPatientButton;
    private JButton deletePatientButton;
    private JButton backButton;
    private DeletePatient deletePatientDialog;
}
