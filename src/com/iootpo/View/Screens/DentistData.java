package com.iootpo.View.Screens;

import com.iootpo.Model.Dentist;
import com.iootpo.View.Components.Field;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

public class DentistData extends JFrame {

    void onSubmit() {
    }

    boolean invalidInputs() {
        final boolean[] valid = {true};

        fields.forEach(field -> {
            field.caption.setVisible(field.input.getText().isBlank());
            if (valid[0]) {
                valid[0] = !field.input.getText().isBlank();
            }
        });

        return !valid[0];
    }

    Dentist createDentist() {

        return new Dentist(nameField.getText(), lastnameField.getText(), registrationField.getText());
    }

    public DentistData() {
        JLabel nameLabel = new JLabel();
        nameField = new JTextField();
        JLabel nameFieldCaption = new JLabel();
        JLabel lastnameFieldCaption = new JLabel();
        lastnameField = new JTextField();
        JLabel lastnameLabel = new JLabel();
        JLabel registrationFieldCaption = new JLabel();
        registrationField = new JTextField();
        JLabel registrationLabel = new JLabel();
        okButton = new JButton();
        JButton cancelButton = new JButton();
        dentistCombo = new JComboBox<>();

        fields = Arrays.stream(new Field[]{new Field(nameField, nameFieldCaption),
                new Field(lastnameField, lastnameFieldCaption), new Field(registrationField, registrationFieldCaption)
                }).toList();

        setTitle("Datos de odontólogo");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);

        nameLabel.setText("Nombre");

        nameFieldCaption.setText("Campo requerido");
        nameFieldCaption.setForeground(new Color(255, 0, 51));
        nameFieldCaption.setVisible(false);

        lastnameFieldCaption.setText("Campo requerido");
        lastnameFieldCaption.setForeground(new Color(255, 0, 51));
        lastnameFieldCaption.setVisible(false);

        lastnameLabel.setText("Apellido");

        registrationFieldCaption.setText("Campo requerido");
        registrationFieldCaption.setForeground(new Color(255, 0, 51));
        registrationFieldCaption.setVisible(false);

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
                                                                .addComponent(registrationFieldCaption))
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
                                                                        .addComponent(registrationField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))))
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
                                        .addComponent(registrationField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(nameFieldCaption)
                                        .addComponent(lastnameFieldCaption)
                                        .addComponent(registrationFieldCaption))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelButton)
                                        .addComponent(okButton))
                                .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
    }

    public JTextField nameField;
    public JTextField lastnameField;
    public JTextField registrationField;
    JButton okButton;
    JComboBox<Dentist> dentistCombo;
    List<Field> fields;
}
