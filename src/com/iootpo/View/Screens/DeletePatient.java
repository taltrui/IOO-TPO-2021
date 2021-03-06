package com.iootpo.View.Screens;

import com.iootpo.Controllers.PatientController;
import com.iootpo.Model.Patient;

import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

public class DeletePatient extends JFrame {
    Patient selectedPatient;
    PatientController patientController = new PatientController();

    void onSubmit() {
        if (selectedPatient.getUserName() == null) {
            return;
        }

        try {
            patientController.delete(selectedPatient);
            JOptionPane.showMessageDialog(null, "Usuario eliminado!");
            this.setVisible(false);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Hubo un error al eliminar al paciente");
        }

    }

    public DeletePatient() {
        patientToDeleteCombo = new JComboBox<>();
        JLabel comboLabel = new JLabel();
        JButton cancelButton = new JButton();
        JButton okButton = new JButton();

        setTitle("Eliminar paciente");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);

        patientController.populateCombo(patientToDeleteCombo);

        patientToDeleteCombo.addActionListener(e -> selectedPatient = ((Patient) patientToDeleteCombo.getSelectedItem()));
        comboLabel.setText("Seleccione el paciente a eliminar:");

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(e -> setVisible(false));

        okButton.setText("Eliminar");
        okButton.addActionListener(e -> onSubmit());

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
                                                .addComponent(comboLabel, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
                                                .addGap(65))
                                        .addComponent(patientToDeleteCombo, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(comboLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patientToDeleteCombo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelButton)
                                        .addComponent(okButton))
                                .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
    }

    private final JComboBox<Patient> patientToDeleteCombo;

}
