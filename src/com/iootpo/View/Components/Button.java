package com.iootpo.View.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class Button extends JButton {
    public Button(String text, ActionListener action) {
        setText(text);
        addActionListener(action);
    }
}
