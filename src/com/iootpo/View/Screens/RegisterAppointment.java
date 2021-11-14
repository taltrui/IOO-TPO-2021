package com.iootpo.View.Screens;

import com.iootpo.Controllers.AppointmentController;
import com.iootpo.Controllers.PatientController;
import com.iootpo.Model.Dentist;
import com.iootpo.Model.Patient;

import javax.swing.*;

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
            JOptionPane.showMessageDialog(null, "Turno creado el día: " + selectedDay + " a las " + selectedHour + "con el Odontólogo " + selectedDentist.getFirstName() + " " + selectedDentist.getLastName());
            this.setVisible(false);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Hubo un error al crear el turno.");
        }

    }

    public RegisterAppointment() {
        dentistCombo = new JComboBox();
        dayCombo = new JComboBox();
        hourCombo = new JComboBox();

        dentistComboLabel = new JLabel();
        dayComboLabel = new JLabel();
        hourComboLabel = new JLabel();

        cancelButton = new JButton();
        okButton = new JButton();

        setTitle("Nuevo turno");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);

        appointmentController.populateDentistCombo(dentistCombo);

        dentistCombo.addActionListener(e -> {
            selectedDentist = ((Dentist) dentistCombo.getSelectedItem());
            appointmentController.populateDayCombo(dayCombo);
        });

        dayCombo.setVisible(true);
        dayCombo.addActionListener(e -> {
            selectedDay = (String) dayCombo.getSelectedItem();
            appointmentController.populateHourCombo(hourCombo);
        });

        hourCombo.setVisible(true);
        hourCombo.addActionListener(e -> {
            selectedHour = (String) hourCombo.getSelectedItem();
        });

        dentistComboLabel.setText("Seleccione el odontólogo:");
        dayComboLabel.setText("Seleccione el día:");
        hourComboLabel.setText("Seleccione el horario:");

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(e -> {
            setVisible(false);
        });

        okButton.setText("Registrar");
        okButton.addActionListener(e -> {
            onSubmit();
        });

        layout.setHorizontalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup()
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                .addGap(10))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(dentistComboLabel, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
                                                .addGap(65))
                                        .addComponent(dentistCombo, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(dayComboLabel, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
                                                .addGap(65))
                                        .addComponent(dayCombo, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(hourComboLabel, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
                                                .addGap(65))
                                        .addComponent(hourCombo, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(dentistComboLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dentistCombo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addComponent(dayComboLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dayCombo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addComponent(hourComboLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hourCombo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelButton)
                                        .addComponent(okButton))
                                .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
    }

    private JComboBox dentistCombo;
    private JComboBox dayCombo;
    private JComboBox hourCombo;
    private JLabel dentistComboLabel;
    private JLabel dayComboLabel;
    private JLabel hourComboLabel;
    private JButton cancelButton;
    private JButton okButton;

}
