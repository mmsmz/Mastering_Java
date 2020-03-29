package B28_MultipleSelectionList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    private JList leftList;
    private JList rightList;
    private JButton moveButton;

    private static String food[] = {"bacon", "wings", "ham", "beef", "morebacon"};

    public GUI() {
        super("The Title Name");
        setLayout(new FlowLayout());

        leftList = new JList(food);
        leftList.setVisibleRowCount(3);
        leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftList));

        moveButton = new JButton("Move -->");
        moveButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        rightList.setListData(leftList.getSelectedValues());

                    }
                }
        );

        add(moveButton);
        rightList = new JList();
        rightList.setVisibleRowCount(3);
        rightList.setFixedCellWidth(100);
        rightList.setFixedCellHeight(15);
        rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightList));
    }


}