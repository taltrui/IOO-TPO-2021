package com.iootpo.View.Screens;


import javax.swing.*;

public class MainWindow extends JFrame {
    private static JFrame frame;
    public MainWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton b = new JButton("click");//create button
        b.addActionListener(e -> System.out.println("it werks"));
        b.setBounds(130, 100, 100, 40);

        add(b);//adding button on frame
        setSize(800, 600);
        setLayout(null);
    }

    public static JFrame getWindow() {
        if (frame == null) {
            frame = new MainWindow();
        }
        return frame;
    }
}

