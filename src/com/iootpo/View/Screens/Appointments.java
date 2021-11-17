package com.iootpo.View.Screens;


import com.iootpo.Controllers.AppointmentController;
import com.iootpo.Model.Dentist;

import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Appointments extends JFrame {

    public Appointments() {
        setTitle("Turnos registrados.");

        AppointmentController appointmentController = new AppointmentController();

        appointmentController.populateDentistCombo(dentistsCombo);

        dentistsCombo.addActionListener(e -> appointmentController.populateTable((Dentist) Objects.requireNonNull(dentistsCombo.getSelectedItem()), table));


        setBounds(150, 150, 756, 433);
        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{730, 0};
        gbl_contentPane.rowHeights = new int[]{31, 35, 314, 0};
        gbl_contentPane.columnWeights = new double[]{0.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);

        JLabel dentistLabel = new JLabel("Seleccione odontólogo");
        GridBagConstraints gbc_dentistLabel = new GridBagConstraints();
        gbc_dentistLabel.fill = GridBagConstraints.BOTH;
        gbc_dentistLabel.insets = new Insets(0, 0, 5, 0);
        gbc_dentistLabel.gridx = 0;
        gbc_dentistLabel.gridy = 0;
        contentPane.add(dentistLabel, gbc_dentistLabel);

        GridBagConstraints gbc_dentistsCombo = new GridBagConstraints();
        gbc_dentistsCombo.fill = GridBagConstraints.BOTH;
        gbc_dentistsCombo.insets = new Insets(0, 0, 5, 0);
        gbc_dentistsCombo.gridx = 0;
        gbc_dentistsCombo.gridy = 1;
        contentPane.add(dentistsCombo, gbc_dentistsCombo);

        JScrollPane scrollPane = new JScrollPane();
        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
        gbc_scrollPane.fill = GridBagConstraints.BOTH;
        gbc_scrollPane.gridx = 0;
        gbc_scrollPane.gridy = 2;
        contentPane.add(scrollPane, gbc_scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);
        table.setRowSelectionAllowed(false);
        table.setModel(new DefaultTableModel(
                new Object[][]{
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
                new String[]{
                        "", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes"
                }
        ));
        pack();
        setLocationRelativeTo(getOwner());
    }

    private JTable table;
    private final JComboBox<Dentist> dentistsCombo = new JComboBox<>();
}
