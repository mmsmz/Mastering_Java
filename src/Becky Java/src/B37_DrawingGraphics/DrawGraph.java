package B37_DrawingGraphics;


import javax.swing.*;
import java.awt.*;

public class DrawGraph extends JPanel {

    public  void paintComponent(Graphics g){
        super.paintComponents(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.fillRect(25, 25, 100, 30);

        g.setColor(new Color(168, 88, 215));
        g.fillRect(25,65,100,30);

        g.setColor(Color.RED);
        g.drawString("this is some text", 25,120);
    }

}
