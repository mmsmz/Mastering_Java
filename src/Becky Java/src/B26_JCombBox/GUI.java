package B26_JCombBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUI extends JFrame {

    private JComboBox box;
    private JLabel picture;

    private static String[] filename = {"B.png", "X.png"};
    private Icon pics[] = {new ImageIcon(getClass().getResource(filename[0])),
                           new ImageIcon(getClass().getResource(filename[1]))};

    public GUI(){
        super("The title Name");
        setLayout(new FlowLayout());

        box = new JComboBox(filename);

        box.addItemListener(   // creating an anonymous inner class
                new ItemListener() {
                    public void itemStateChanged(ItemEvent event) {
                        if(event.getStateChange() == ItemEvent.SELECTED){
                            picture.setIcon(pics[box.getSelectedIndex()]);
                        }
                    }
                }
        );

        add(box);
        picture= new JLabel(pics[0]);
        add(picture);

    }

}