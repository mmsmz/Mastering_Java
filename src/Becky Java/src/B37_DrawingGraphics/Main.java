package B37_DrawingGraphics;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame jf = new JFrame("Title");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawGraph lyt= new DrawGraph();
        jf.add(lyt);
        jf.setSize(400,250);
        jf.setVisible(true);


    }
}
