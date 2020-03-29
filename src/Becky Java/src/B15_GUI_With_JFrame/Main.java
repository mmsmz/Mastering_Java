package B15_GUI_With_JFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            Tuna tunaObject = new Tuna();
            tunaObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when we click the X button program exits

            tunaObject.setSize(275,180);
            tunaObject.setVisible(true);

    }
}
