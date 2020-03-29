package B15_GUI_With_JFrame;

import javax.swing.*;
import java.awt.*;

public class Tuna extends JFrame {
    private JLabel item1;

    public Tuna(){
        super("The title bar");
        setLayout(new FlowLayout()); // new Flowlayout() it gives a default layout

        item1 = new JLabel("This is the Sentence");
        item1.setToolTipText("This is setToolTipText is going to show when you hover");
        add(item1);

    }



}
