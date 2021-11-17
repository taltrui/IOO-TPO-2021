package com.iootpo.View.Screens;

import com.iootpo.Controllers.AppointmentController;
import com.iootpo.Model.Dentist;
import javax.swing.GroupLayout.Alignment;
import javax.swing.*;
import javax.swing.LayoutStyle.ComponentPlacement;

public class RegisterAppointment extends JFrame {
    Dentist selectedDentist;
    String selectedDay;
    String selectedHour;

    AppointmentController appointmentController = new AppointmentController();

    void onSubmit() {
        if (selectedDentist.getRegistration() == null) {
            return;
        }

        try {
            appointmentController.create(selectedDentist, selectedDay, selectedHour);
            JOptionPane.showMessageDialog(null, "Turno creado el día: " + selectedDay + " a las " + selectedHour + " con el Odontólogo " + selectedDentist.getFirstName() + " " + selectedDentist.getLastName());
            this.setVisible(false);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Hubo un error al crear el turno.");
        }

    }

    public RegisterAppointment() {
        dentistCombo = new JComboBox<>();
        dayCombo = new JComboBox<>();
        hourCombo = new JComboBox<>();

        JLabel dentistComboLabel = new JLabel();
        JLabel dayComboLabel = new JLabel();
        JLabel hourComboLabel = new JLabel();

        JButton cancelButton = new JButton();
        JButton okButton = new JButton();

        setTitle("Nuevo turno");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);

        appointmentController.populateDentistCombo(dentistCombo);

        dentistCombo.addActionListener(e -> {
            selectedDentist = ((Dentist) dentistCombo.getSelectedItem());
            appointmentController.populateDayCombo(dayCombo, selectedDentist);
        });

        dayCombo.setVisible(true);
        dayCombo.addActionListener(e -> {
            selectedDay = (String) dayCombo.getSelectedItem();
            appointmentController.populateHourCombo(hourCombo, selectedDentist, selectedDay);
        });

        hourCombo.setVisible(true);
        hourCombo.addActionListener(e -> selectedHour = (String) hourCombo.getSelectedItem());

        dentistComboLabel.setText("Seleccione el odontólogo:");
        dayComboLabel.setText("Seleccione el día:");
        hourComboLabel.setText("Seleccione el horario:");

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(e -> setVisible(false));

        okButton.setText("Registrar");
        okButton.addActionListener(e -> onSubmit());

        layout.setHorizontalGroup(
                layout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(47, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(hourCombo, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hourComboLabel)
                                        .addComponent(dayCombo, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dayComboLabel)
                                        .addComponent(dentistCombo, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dentistComboLabel)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(153)
                                                .addComponent(cancelButton)
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addComponent(okButton)))
                                .addGap(36))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(dentistComboLabel)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(dentistCombo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(dayComboLabel)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(dayCombo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(hourComboLabel)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(hourCombo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
    }

    private final JComboBox<Dentist> dentistCombo;
    private final JComboBox<String> dayCombo;
    private final JComboBox<String> hourCombo;

}
