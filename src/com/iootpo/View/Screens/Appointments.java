package com.iootpo.View.Screens;


import com.iootpo.Controllers.AppointmentController;
import com.iootpo.Model.Dentist;

import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Appointments extends JFrame {

    public Appointments() {
        setTitle("Turnos registrados.");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);

        AppointmentController appointmentController = new AppointmentController();

        appointmentController.populateDentistCombo(dentistsCombo);

        JTable table = new JTable();

        dentistsCombo.addActionListener(e -> {
            appointmentController.populateTable((Dentist) dentistsCombo.getSelectedItem(), table);
        });

        table.setModel(new DefaultTableModel(
                new Object[][] {
                        {"9:00", null, null, null, null, null},
                        {"9:30", null, null, null, null, null},
                        {"10:00", null, null, null, null, null},
                        {"11:00", null, null, null, null, null},
                        {"11:30", null, null, null, null, null},
                        {"12:00", null, null, null, null, null},
                        {"14:00", null, null, null, null, null},
                        {"14:30", null, null, null, null, null},
                        {"15:00", null, null, null, null, null},
                        {"15:30", null, null, null, null, null},
                        {"16:00", null, null, null, null, null},
                        {"16:30", null, null, null, null, null},
                        {"17:00", null, null, null, null, null},
                },
                new String[] {
                        "", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes"
                }
        ));

        JLabel dentistLabel = new JLabel("Seleccione odontólogo");
        layout.setHorizontalGroup(
                layout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(dentistLabel)
                                                .addContainerGap(401, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(dentistsCombo, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(40))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(table, GroupLayout.PREFERRED_SIZE, 407, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(40, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(dentistLabel)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(dentistsCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(table, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
    }

    private final JComboBox<Dentist> dentistsCombo = new JComboBox<>();
}
