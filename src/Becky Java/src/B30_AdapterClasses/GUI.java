package B30_AdapterClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI extends JFrame {

    private String details;
    private JLabel statusBar;

    public GUI(){
        super("This is the Title ");

        statusBar = new JLabel("this is default");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClass());

    }

    private class MouseClass extends MouseAdapter{
        public void mouseClicked(MouseEvent event){
            details = String.format("You clicked %d ", event.getClickCount());

            if(event.isMetaDown()){
                details += "with right mouse button";
            }
            else if(event.isAltDown()){
                details += "either center mouse button";
            }
            else {
                details += "with left mouse button";
            }

            statusBar.setText(details);

        }
    }

}