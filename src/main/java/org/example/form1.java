package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel MainPanel;
    private JTextField usuarioT;
    private JTextField contraseñaT;
    private JButton aceptarButton;
    private JLabel Error;

    public form1() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioT.getText();
                String contraseña = contraseñaT.getText();
                if (usuario.equals("Santy") && contraseña.equals("12345")){
                    JFrame frame = new JFrame();
                    frame.setContentPane(new form2().MainPanel);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(300,300);
                    frame.setVisible(true);
                    ((JFrame)SwingUtilities.getWindowAncestor(aceptarButton)).dispose();

                }else{
                    usuarioT.setText("");
                    contraseñaT.setText("");
                    Error.setText("ERROR INGRESE NUEVAMENTE");
                }
            }
        });
    }
}
