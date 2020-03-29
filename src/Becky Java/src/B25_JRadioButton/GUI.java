package B25_JRadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUI extends JFrame {
    private JTextField textField;
    private Font plainFont;
    private Font boldFont;
    private Font italicFont;
    private Font bolditalicFont;

    private JRadioButton plainBtn;
    private JRadioButton boldBtn;
    private JRadioButton italicBtn;
    private JRadioButton bolditalicBtn;
    private ButtonGroup group;

    public GUI() {
        super("The Titlie Name");
        setLayout(new FlowLayout());
        //my code
        //Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        textField = new JTextField("Arafath is good smart guy", 25);
        add(textField);

        plainBtn = new JRadioButton("plain", true);
        boldBtn = new JRadioButton("bold", false);
        italicBtn = new JRadioButton("italic", false);
        bolditalicBtn = new JRadioButton("bold and italic", false);
        add(plainBtn);
        add(boldBtn);
        add(italicBtn);
        add(bolditalicBtn);

        group = new ButtonGroup();
        group.add(plainBtn);
        group.add(boldBtn);
        group.add(italicBtn);
        group.add(bolditalicBtn);

        plainFont = new Font("Serif", Font.PLAIN, 14);
        boldFont= new Font("Serif", Font.BOLD, 14);
        italicFont= new Font("Serif", Font.ITALIC, 14);
        bolditalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        textField.setFont(plainFont);

        // waits for an event to happen, pass in the font object to the constructor
        plainBtn.addItemListener(new HandlerClass(plainFont));
        boldBtn.addItemListener(new HandlerClass(boldFont));
        italicBtn.addItemListener(new HandlerClass(italicFont));
        bolditalicBtn.addItemListener(new HandlerClass(bolditalicFont));

    }


    private class HandlerClass implements ItemListener{
        private Font font;

        // get the font object get the variable font
        public HandlerClass(Font f){
            font = f;
        }

        // setting the font to the font object that was passed in
        public void itemStateChanged(ItemEvent event){
            textField.setFont(font);
        }
    }


}