package B16_EventHandling_and_ActionListner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tuna extends JFrame { // JFrame to create a Window
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    public Tuna() {
        super("The Title");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1);
        item2 = new JTextField("enter text here");
        add(item2);
        item3 = new JTextField("uneditable", 20);
        item3.setEditable(false);
        add(item3);

        passwordField = new JPasswordField("mypass");
        add(passwordField);

        // ActionListener
        TheHandler handler = new TheHandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    private class TheHandler implements ActionListener {
            //this actionPerformed will be call automatically when ActionListener is been implemented
        public void actionPerformed(ActionEvent event) {

            String string = " ";

            if (event.getSource()==item1) {
                string = String.format("field 1: %s",event.getActionCommand());
            }
            else if (event.getSource()==item2) {
                string = String.format("field 2: %s",event.getActionCommand());
            }
            else if (event.getSource()==item3) {
                string = String.format("field 3: %s",event.getActionCommand());
            }
            else if (event.getSource()==passwordField) {
                string = String.format("password field is : %s",event.getActionCommand());
            }
            //now you need to output it in the printline

            JOptionPane.showMessageDialog(null, string);
        }
    }


}


