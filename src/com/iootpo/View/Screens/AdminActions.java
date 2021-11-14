package com.iootpo.View.Screens;

import javax.swing.*;
import javax.swing.GroupLayout;

public class AdminActions extends JFrame {
    public AdminActions() {
        registerButton = new JButton();
        modifyButton = new JButton();
        deleteButton = new JButton();
        backButton = new JButton();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        GroupLayout layout = new GroupLayout(this.getContentPane());
        setLayout(layout);

        backButton.setText("Volver");
        backButton.addActionListener(e -> {
            AdminMainScreen.getWindow().setVisible(true);
            this.setVisible(false);
        });

        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(266, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                        .addComponent(modifyButton, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                        .addComponent(registerButton, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
                    .addGap(252, 252, 252))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(backButton)
                    .addContainerGap(614, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(backButton)
                    .addGap(21, 21, 21)
                    .addComponent(registerButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(modifyButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }

    public JButton registerButton;
    public JButton modifyButton;
    public JButton deleteButton;
    public JButton backButton;
}
