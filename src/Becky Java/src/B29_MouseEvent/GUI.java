package B29_MouseEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class GUI extends JFrame {

    private JPanel mousePanel;
    private JLabel statusbar;

    public GUI() {
        super("The TITLE NAME");

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);

        statusbar = new JLabel("default");
        add(statusbar, BorderLayout.SOUTH);

        HandlerClass handler = new HandlerClass();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
    }

    private class HandlerClass implements MouseListener, MouseMotionListener {
        public void mouseClicked(MouseEvent event) {
            statusbar.setText(String.format("Clicked at %d, %d", event.getX(), event.getY()));
        }

        public void mousePressed(MouseEvent event) {
            statusbar.setText("You have pressed the Button");
        }

        public void mouseReleased(MouseEvent event) {
            statusbar.setText("You have released the Button");
        }

        public void mouseEntered(MouseEvent event) {
            statusbar.setText("You have entered into the area");
            mousePanel.setBackground(Color.RED);
        }

        public void mouseExited(MouseEvent event) {
            statusbar.setText("the mouse has left the windows. ");
            mousePanel.setBackground(Color.WHITE);
        }

        // these are the mouse motion events
        public void mouseDragged(MouseEvent event) {
            statusbar.setText("You are dragging the mouse");
        }

        public void mouseMoved(MouseEvent event) {
            statusbar.setText("You moved the mouse");
        }

    }
}