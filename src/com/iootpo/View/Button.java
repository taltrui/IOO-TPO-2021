package com.iootpo.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class Button extends JButton {

    public Button(String text, ActionListener action) {
        setText(text);
        addActionListener(action);
        setBackground(Color.BLACK);
        setBorderPainted(false);
        setForeground(Color.WHITE);
        setFocusPainted(false);
        setOpaque(true);
    }
}
