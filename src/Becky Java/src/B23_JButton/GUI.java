package B23_JButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JButton reg;
    private JButton custom;

    public GUI() {
        super("The Title Name ");
        setLayout(new FlowLayout());

        reg = new JButton("reg Button");
        add(reg);

        Icon b = new ImageIcon(getClass().getResource("B.png"));
        Icon x = new ImageIcon(getClass().getResource("X.png"));
        custom = new JButton("Custom", b);
        custom.setRolloverIcon(x);
        add(custom); // adding buttons to the screen

        HandlerClass handler = new HandlerClass();
        reg.addActionListener(handler);
        custom.addActionListener(handler);
    }

    private class HandlerClass implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        }

    }
}
