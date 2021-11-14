package com.iootpo.View.Screens;

import com.iootpo.Controllers.UserController;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    private static JFrame frame;

    private void logUser(String user, char[] password) {
        if(user.isBlank() || password.length == 0) return;
        UserController userController = new UserController();

        userController.logUser(user, password);
    }

    private Login() {
        userLabel = new JLabel();
        passwordLabel = new JLabel();
        userField = new JTextField();
        passwordField = new JPasswordField();
        showPasswordCheck = new JCheckBox();
        loginButton = new JButton();
        userFieldCaption = new JLabel();
        passwordFieldCaption = new JLabel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 300);

        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);

        userLabel.setText("Usuario");

        passwordLabel.setText("Contraseña");

        showPasswordCheck.setText("Mostrar contraseña");
        showPasswordCheck.addItemListener(l -> {
                if (l.getStateChange() == 1) {
                    passwordField.setEchoChar((char) 0);
                } else {
                    passwordField.setEchoChar('•');
                }
            });
        loginButton.setText("Iniciar sesión");
        loginButton.addActionListener(e -> {
            String user = userField.getText();
            char[] password = passwordField.getPassword();

            userFieldCaption.setVisible(user.isBlank());
            passwordFieldCaption.setVisible(password.length == 0);

            logUser(user, password);
        });

        userFieldCaption.setText("Campo requerido");
        userFieldCaption.setForeground(new Color(255, 0, 51));
        userFieldCaption.setVisible(false);

        passwordFieldCaption.setText("Campo requerido");
        passwordFieldCaption.setForeground(new Color(255, 0, 51));
        passwordFieldCaption.setVisible(false);

        layout.setHorizontalGroup(
                layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(187, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(loginButton)
                                        .addComponent(userFieldCaption)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(userLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(userField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(passwordLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(showPasswordCheck))
                                        .addComponent(passwordFieldCaption))
                                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(34, Short.MAX_VALUE)
                                .addComponent(userLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userFieldCaption)
                                .addGap(15, 15, 15)
                                .addComponent(passwordLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(showPasswordCheck))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordFieldCaption)
                                .addGap(18, 18, 18)
                                .addComponent(loginButton)
                                .addGap(31, 31, 31))
        );
    }

    public static JFrame getWindow() {
        if (frame == null) {
            frame = new Login();
        }
        return frame;
    }

    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userField;
    private JPasswordField passwordField;
    private JCheckBox showPasswordCheck;
    private JButton loginButton;
    private JLabel userFieldCaption;
    private JLabel passwordFieldCaption;
}
