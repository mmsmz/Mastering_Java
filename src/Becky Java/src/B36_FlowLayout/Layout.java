package B36_FlowLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout extends JFrame {

    private JButton lb;
    private JButton cb;
    private JButton rb;
    private FlowLayout layout;
    private Container container;

    public Layout(){
        super("The Title");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        // left
        lb = new JButton("left");
        add(lb);
        lb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.LEFT);
                        layout.layoutContainer(container);
                    }
                }
        );

        // center
        lb = new JButton("center");
        add(lb);
        lb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.CENTER);
                        layout.layoutContainer(container);
                    }
                }
        );

        // right
        lb = new JButton("right");
        add(lb);
        lb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        layout.setAlignment(FlowLayout.RIGHT);
                        layout.layoutContainer(container);
                    }
                }
        );


    }

}
