package com.iootpo.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    JFrame frame;
    public MainWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton b = new Button("click", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("it werks");
            }
        });//create button

        b.setBounds(130, 100, 100, 40);

        add(b);//adding button on frame
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }
};

