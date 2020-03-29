package B27_JList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class GUI extends JFrame {

        private JList list;
        private static String colornames[]= {"black", "blue", "red", " white"};
        private static Color color[] = {Color.BLACK, Color.BLUE,Color.RED, Color.WHITE};


        public GUI(){
            super("Title Name");
            setLayout(new FlowLayout());

            list = new JList(colornames);
            list.setVisibleRowCount(4);
            list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            add(new JScrollPane(list));

            list.addListSelectionListener(
                    new ListSelectionListener() {
                        @Override
                        public void valueChanged(ListSelectionEvent e) {
                            getContentPane().setBackground(color[list.getSelectedIndex()]);                        }
                    }
            );

        }
}