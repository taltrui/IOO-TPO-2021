package com.iootpo.View.Screens;

import javax.swing.*;

public class PatientMainScreen extends JFrame {
    private static JFrame frame;

    private PatientMainScreen() {
        createAppointmentButton = new JButton();

        setTitle("Bienvenido/a!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);

        createAppointmentButton.setText("Registrar nuevo turno");
        createAppointmentButton.addActionListener(e -> {
            DentistAdminActions.getWindow().setVisible(true);
            frame.setVisible(false);
        });

        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(273, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(createAppointmentButton, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                    .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(createAppointmentButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(86, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }

    public static JFrame getWindow() {
        if (frame == null) {
            frame = new PatientMainScreen();
        }
        return frame;
    }

    private JButton createAppointmentButton;
}
