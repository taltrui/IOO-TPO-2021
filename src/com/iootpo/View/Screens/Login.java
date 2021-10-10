package com.iootpo.View.Screens;

import com.iootpo.View.Components.Button;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    private static JFrame frame;
    private Login() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);

        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        JLabel userLabel=new JLabel("Usuario");
        JLabel passwordLabel=new JLabel("Contraseña");
        JTextField userTextField=new JTextField();
        JPasswordField passwordField=new JPasswordField();
        JButton loginButton=new Button("Iniciar sesión", e -> {
            MainWindow.getWindow().setVisible(true);
            frame.setVisible(false);
        });
        JCheckBox showPassword=new JCheckBox("Show Password");

        userTextField.setMaximumSize(new Dimension(250, 40));
        passwordField.setMaximumSize(new Dimension(250, 40));

        layout.setHorizontalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createParallelGroup()
                                .addComponent(userLabel)
                                .addComponent(userTextField))
                        .addGroup(layout.createParallelGroup()
                                .addComponent(passwordLabel)
                                .addComponent(passwordField))

        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(userLabel)
                                .addComponent(userTextField))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(passwordLabel)
                                .addComponent(passwordField))
        );
    }

    public static JFrame getWindow() {
        if (frame == null) {
            frame = new Login();
        }
        return frame;
    }
}
