package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class form3 {
    public JPanel MainPanel;
    private JButton regresarButton;
    private JLabel imageLabel;

    public form3() {
        MainPanel = new JPanel(new BorderLayout());
        imageLabel = new JLabel();
        ImageIcon icon = new ImageIcon("src/Imagenes/icon.jpeg");
        imageLabel.setIcon(icon);
        MainPanel.add(imageLabel, BorderLayout.CENTER);
        regresarButton = new JButton("Regresar");
        MainPanel.add(regresarButton, BorderLayout.SOUTH);

        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setContentPane(new form2().MainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 300);
                frame.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(regresarButton)).dispose();
            }
        });
    }
}