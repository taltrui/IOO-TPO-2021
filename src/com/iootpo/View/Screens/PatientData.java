package com.iootpo.View.Screens;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

public class PatientData extends JFrame {

    void onSubmit() {
    }

    public PatientData() {
        nameLabel = new JLabel();
        nameField = new JTextField();
        nameFieldCaption = new JLabel();
        dniFieldCaption = new JLabel();
        dniField = new JTextField();
        dniLabel = new JLabel();
        lastnameFieldCaption = new JLabel();
        lastnameField = new JTextField();
        lastnameLabel = new JLabel();
        addressFieldCaption = new JLabel();
        addressField = new JTextField();
        addressLabel = new JLabel();
        userFieldCaption = new JLabel();
        userField = new JTextField();
        userLabel = new JLabel();
        passwordFieldCaption = new JLabel();
        passwordField = new JTextField();
        passwordLabel = new JLabel();
        okButton = new JButton();
        cancelButton = new JButton();
        userCombo = new JComboBox();

        setTitle("Datos de paciente");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);

        nameLabel.setText("Nombre");

        nameFieldCaption.setText("Campo requerido");
        nameFieldCaption.setForeground(new Color(255, 0, 51));
        nameFieldCaption.setVisible(false);

        dniFieldCaption.setText("Campo requerido");
        dniFieldCaption.setForeground(new Color(255, 0, 51));
        dniFieldCaption.setVisible(false);

        dniLabel.setText("DNI");

        lastnameFieldCaption.setText("Campo requerido");
        lastnameFieldCaption.setForeground(new Color(255, 0, 51));
        lastnameFieldCaption.setVisible(false);

        lastnameLabel.setText("Apellido");

        addressFieldCaption.setText("Campo requerido");
        addressFieldCaption.setForeground(new Color(255, 0, 51));
        addressFieldCaption.setVisible(false);

        addressLabel.setText("Domicilio");

        userFieldCaption.setText("Campo requerido");
        userFieldCaption.setForeground(new Color(255, 0, 51));
        userFieldCaption.setVisible(false);

        userLabel.setText("Usuario");

        passwordFieldCaption.setText("Campo requerido");
        passwordFieldCaption.setForeground(new Color(255, 0, 51));
        passwordFieldCaption.setVisible(false);

        passwordLabel.setText("Contraseña");

        okButton.setText("OK");
        okButton.addActionListener(e -> onSubmit());

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(e -> setVisible(false));

        userCombo.setVisible(false);
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
                                                        .addComponent(userCombo, GroupLayout.PREFERRED_SIZE, 485, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(15, 15, 15)
                                                                .addComponent(lastnameField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(20, 20, 20)
                                                                .addComponent(addressField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(nameFieldCaption)
                                                                .addGap(72, 72, 72)
                                                                .addComponent(lastnameFieldCaption)
                                                                .addGap(77, 77, 77)
                                                                .addComponent(passwordFieldCaption))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(dniLabel)
                                                                .addGap(145, 145, 145)
                                                                .addComponent(userLabel)
                                                                .addGap(130, 130, 130)
                                                                .addComponent(passwordLabel))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(dniField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(15, 15, 15)
                                                                .addComponent(userField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(20, 20, 20)
                                                                .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(dniFieldCaption)
                                                                .addGap(72, 72, 72)
                                                                .addComponent(userFieldCaption)
                                                                .addGap(77, 77, 77)
                                                                .addComponent(passwordFieldCaption))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(35, 35, 35)
                                                                .addComponent(nameLabel)
                                                                .addGap(121, 121, 121)
                                                                .addComponent(lastnameLabel)
                                                                .addGap(126, 126, 126)
                                                                .addComponent(addressLabel)))
                                                .addGap(0, 26, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(userCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(nameLabel)
                                        .addComponent(lastnameLabel)
                                        .addComponent(addressLabel))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastnameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addressField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(nameFieldCaption)
                                        .addComponent(lastnameFieldCaption)
                                        .addComponent(passwordFieldCaption))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(dniLabel)
                                        .addComponent(userLabel)
                                        .addComponent(passwordLabel))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(dniField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(dniFieldCaption)
                                        .addComponent(userFieldCaption)
                                        .addComponent(passwordFieldCaption))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
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
    private JLabel dniFieldCaption;
    private JTextField dniField;
    private JLabel dniLabel;
    private JLabel lastnameFieldCaption;
    private JTextField lastnameField;
    private JLabel lastnameLabel;
    private JLabel addressFieldCaption;
    private JTextField addressField;
    private JLabel addressLabel;
    private JLabel userFieldCaption;
    private JTextField userField;
    private JLabel userLabel;
    private JLabel passwordFieldCaption;
    private JTextField passwordField;
    private JLabel passwordLabel;
    JButton okButton;
    private JButton cancelButton;
    JComboBox userCombo;

}
