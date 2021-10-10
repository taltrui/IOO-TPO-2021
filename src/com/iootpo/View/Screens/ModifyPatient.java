/*
 * Created by JFormDesigner on Sun Oct 10 19:05:13 ART 2021
 */

package com.iootpo.View.Screens;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class ModifyPatient extends JDialog {
    public ModifyPatient(Window owner) {
        super(owner);
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        textField2 = new JTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        textField3 = new JTextField();
        label6 = new JLabel();
        label7 = new JLabel();
        textField4 = new JTextField();
        label8 = new JLabel();
        label9 = new JLabel();
        textField5 = new JTextField();
        label10 = new JLabel();
        label11 = new JLabel();
        textField6 = new JTextField();
        label12 = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setTitle("Modificar paciente");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
            EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax . swing
            . border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,
            java . awt. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
            { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )
            throw new RuntimeException( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- label1 ----
                label1.setText("Nombre");

                //---- label2 ----
                label2.setText("Campo requerido");
                label2.setForeground(new Color(255, 0, 51));

                //---- label3 ----
                label3.setText("Campo requerido");
                label3.setForeground(new Color(255, 0, 51));

                //---- label4 ----
                label4.setText("DNI");

                //---- label5 ----
                label5.setText("Campo requerido");
                label5.setForeground(new Color(255, 0, 51));

                //---- label6 ----
                label6.setText("Apellido");

                //---- label7 ----
                label7.setText("Campo requerido");
                label7.setForeground(new Color(255, 0, 51));

                //---- label8 ----
                label8.setText("Domicilio");

                //---- label9 ----
                label9.setText("Campo requerido");
                label9.setForeground(new Color(255, 0, 51));

                //---- label10 ----
                label10.setText("Usuario");

                //---- label11 ----
                label11.setText("Campo requerido");
                label11.setForeground(new Color(255, 0, 51));

                //---- label12 ----
                label12.setText("Contrase\u00f1a");

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createParallelGroup()
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(contentPanelLayout.createParallelGroup()
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(label1)
                                        .addGap(124, 124, 124)
                                        .addComponent(label6)
                                        .addGap(124, 124, 124)
                                        .addComponent(label8))
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(label2)
                                        .addGap(75, 75, 75)
                                        .addComponent(label5)
                                        .addGap(75, 75, 75)
                                        .addComponent(label7))
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(label4)
                                        .addGap(148, 148, 148)
                                        .addComponent(label10)
                                        .addGap(128, 128, 128)
                                        .addComponent(label12))
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textField6, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(label3)
                                        .addGap(75, 75, 75)
                                        .addComponent(label9)
                                        .addGap(75, 75, 75)
                                        .addComponent(label11)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 499, Short.MAX_VALUE)
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createParallelGroup()
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(contentPanelLayout.createParallelGroup()
                                    .addComponent(label1)
                                    .addComponent(label6)
                                    .addComponent(label8))
                                .addGap(6, 6, 6)
                                .addGroup(contentPanelLayout.createParallelGroup()
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(contentPanelLayout.createParallelGroup()
                                    .addComponent(label2)
                                    .addComponent(label5)
                                    .addComponent(label7))
                                .addGap(18, 18, 18)
                                .addGroup(contentPanelLayout.createParallelGroup()
                                    .addComponent(label4)
                                    .addComponent(label10)
                                    .addComponent(label12))
                                .addGap(6, 6, 6)
                                .addGroup(contentPanelLayout.createParallelGroup()
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(contentPanelLayout.createParallelGroup()
                                    .addComponent(label3)
                                    .addComponent(label9)
                                    .addComponent(label11))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 192, Short.MAX_VALUE)
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField2;
    private JLabel label4;
    private JLabel label5;
    private JTextField textField3;
    private JLabel label6;
    private JLabel label7;
    private JTextField textField4;
    private JLabel label8;
    private JLabel label9;
    private JTextField textField5;
    private JLabel label10;
    private JLabel label11;
    private JTextField textField6;
    private JLabel label12;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
