package com.aptech.movietickets.utils;

import javax.swing.JTextField;

public class EventsUtil {
    
    public static void validateKeyPressed(java.awt.event.KeyEvent evt,JTextField value) {
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            value.setEditable(false);
        } else {
            value.setEditable(true);
        }
    }
}
