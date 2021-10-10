/*
 * Created by JFormDesigner on Sun Oct 10 17:44:36 ART 2021
 */

package com.iootpo.View.Screens;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

/**
 * @author unknown
 */
public class Login1 extends JFrame {
    public Login1() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        userLabel = new JLabel();
        passwordLabel = new JLabel();
        userField = new JTextField();
        passwordField1 = new JPasswordField();
        showPasswordCheck = new JCheckBox();
        loginButton = new JButton();
        userFieldCaption = new JLabel();
        passwordFieldCaption = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //---- userLabel ----
        userLabel.setText("Usuario");

        //---- passwordLabel ----
        passwordLabel.setText("Contrase\u00f1a");

        //---- showPasswordCheck ----
        showPasswordCheck.setText("Mostrar contrase\u00f1a");

        //---- loginButton ----
        loginButton.setText("Iniciar sesi\u00f3n");

        //---- userFieldCaption ----
        userFieldCaption.setText("Campo requerido");
        userFieldCaption.setForeground(new Color(255, 0, 51));

        //---- passwordFieldCaption ----
        passwordFieldCaption.setText("Campo requerido");
        passwordFieldCaption.setForeground(new Color(255, 0, 51));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(187, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(loginButton)
                        .addComponent(userFieldCaption)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(userLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(showPasswordCheck))
                        .addComponent(passwordFieldCaption))
                    .addGap(149, 149, 149))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(34, Short.MAX_VALUE)
                    .addComponent(userLabel)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(userField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(userFieldCaption)
                    .addGap(15, 15, 15)
                    .addComponent(passwordLabel)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(showPasswordCheck))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(passwordFieldCaption)
                    .addGap(18, 18, 18)
                    .addComponent(loginButton)
                    .addGap(31, 31, 31))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userField;
    private JPasswordField passwordField1;
    private JCheckBox showPasswordCheck;
    private JButton loginButton;
    private JLabel userFieldCaption;
    private JLabel passwordFieldCaption;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
