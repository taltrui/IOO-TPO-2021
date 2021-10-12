package com.iootpo.View.Screens;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

public class DentistData extends JFrame {

    void onSubmit() {
    }

    public DentistData() {
        nameLabel = new JLabel();
        nameField = new JTextField();
        nameFieldCaption = new JLabel();
        lastnameFieldCaption = new JLabel();
        lastnameField = new JTextField();
        lastnameLabel = new JLabel();
        registrarionFieldCaption = new JLabel();
        registerField = new JTextField();
        registrationLabel = new JLabel();
        okButton = new JButton();
        cancelButton = new JButton();
        dentistCombo = new JComboBox();

        setTitle("Datos de odontólogo");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);

        nameLabel.setText("Nombre");

        nameFieldCaption.setText("Campo requerido");
        nameFieldCaption.setForeground(new Color(255, 0, 51));

        lastnameFieldCaption.setText("Campo requerido");
        lastnameFieldCaption.setForeground(new Color(255, 0, 51));

        lastnameLabel.setText("Apellido");

        registrarionFieldCaption.setText("Campo requerido");
        registrarionFieldCaption.setForeground(new Color(255, 0, 51));

        registrationLabel.setText("Matricula");

        okButton.setText("OK");
        okButton.addActionListener(e -> onSubmit());

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(e -> setVisible(false));

        dentistCombo.setVisible(false);

        layout.setHorizontalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup()
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 305, Short.MAX_VALUE)
                                                .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup()
                                                        .addComponent(dentistCombo, GroupLayout.PREFERRED_SIZE, 485, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(nameFieldCaption)
                                                                .addGap(72, 72, 72)
                                                                .addComponent(lastnameFieldCaption)
                                                                .addGap(77, 77, 77)
                                                                .addComponent(registrarionFieldCaption))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup()
                                                                        .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(nameLabel))
                                                                .addGap(15, 15, 15)
                                                                .addGroup(layout.createParallelGroup()
                                                                        .addComponent(lastnameField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lastnameLabel))
                                                                .addGap(20, 20, 20)
                                                                .addGroup(layout.createParallelGroup()
                                                                        .addComponent(registrationLabel)
                                                                        .addComponent(registerField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 26, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(dentistCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameLabel)
                                        .addComponent(lastnameLabel)
                                        .addComponent(registrationLabel))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastnameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(registerField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(nameFieldCaption)
                                        .addComponent(lastnameFieldCaption)
                                        .addComponent(registrarionFieldCaption))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelButton)
                                        .addComponent(okButton))
                                .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
    }

    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel nameFieldCaption;
    private JLabel lastnameFieldCaption;
    private JTextField lastnameField;
    private JLabel lastnameLabel;
    private JLabel registrarionFieldCaption;
    private JTextField registerField;
    private JLabel registrationLabel;
    JButton okButton;
    private JButton cancelButton;
    JComboBox dentistCombo;
}
