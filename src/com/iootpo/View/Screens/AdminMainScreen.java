package com.iootpo.View.Screens;

import javax.swing.*;
import javax.swing.GroupLayout;

public class AdminMainScreen extends JFrame {
    private static JFrame frame;

    private AdminMainScreen() {
        JButton managePatientsButton = new JButton();
        JButton manageDentistsButton = new JButton();
        JButton queryAppointmentsButton = new JButton();

        setTitle("Administrar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);

        managePatientsButton.setText("Administrar pacientes");
        managePatientsButton.addActionListener(e -> {
            PatientAdminActions.getWindow().setVisible(true);
            frame.setVisible(false);
        });
        manageDentistsButton.setText("Administrar odontólogos");
        manageDentistsButton.addActionListener(e -> {
            DentistAdminActions.getWindow().setVisible(true);
            frame.setVisible(false);
        });
        queryAppointmentsButton.setText("Consultar turnos registrados");
        queryAppointmentsButton.addActionListener(e -> new Appointments().setVisible(true));

        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(273, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(manageDentistsButton, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                        .addComponent(managePatientsButton, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                        .addComponent(queryAppointmentsButton, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                    .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(managePatientsButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(manageDentistsButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(queryAppointmentsButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(86, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }

    public static JFrame getWindow() {
        if (frame == null) {
            frame = new AdminMainScreen();
        }
        return frame;
    }

}
