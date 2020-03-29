package B24_JCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUI extends JFrame {
    private JTextField textF;
    private JCheckBox boldBox;
    private JCheckBox italicBox;

    public GUI() {
        super("The Title Name ");
        setLayout(new FlowLayout()); // flowLayout gives us the default layout

        textF = new JTextField("This is a sentence", 20);
        textF.setFont(new Font("serif", Font.PLAIN, 14));
        add(textF);

        boldBox = new JCheckBox("bold");
        italicBox = new JCheckBox("italic");
        add(boldBox);
        add(italicBox);

        HandlerClass handler = new HandlerClass();
        boldBox.addItemListener(handler);
        italicBox.addItemListener(handler);
    }

    private class HandlerClass implements ItemListener { //implements means we are going to use all the methods from ItemListner
        public void itemStateChanged(ItemEvent event) {
            Font font = null;

            if (boldBox.isSelected() && italicBox.isSelected()) {
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            } else if (boldBox.isSelected()) {
                font = new Font("Serif", Font.BOLD, 14);
            } else if (italicBox.isSelected()) {
                font = new Font("Serif", Font.ITALIC, 14);
            } else {
                font = new Font("Serif", Font.PLAIN, 14);
            }

            textF.setFont(font); // setting it up on the screen
        }
    }
}