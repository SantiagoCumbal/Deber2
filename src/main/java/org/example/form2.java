package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 {
    public JPanel MainPanel;
    private JButton ingresarAHobbysButton;

    public form2() {
        ingresarAHobbysButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setContentPane(new form3().MainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300,300);
                frame.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(ingresarAHobbysButton)).dispose();
            }
        });
    }
}
