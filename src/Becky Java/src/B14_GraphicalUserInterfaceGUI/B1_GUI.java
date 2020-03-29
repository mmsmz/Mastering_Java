package B14_GraphicalUserInterfaceGUI;

import javax.swing.JOptionPane;

public class B1_GUI {
    public static void main(String[] args) {

        String fn = JOptionPane.showInputDialog("Enter the First Number: ");
        String sn = JOptionPane.showInputDialog("Enter the Second Number: ");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int result = num1 + num2;

        JOptionPane.showMessageDialog(null,"The Answer: " + result,"sad",JOptionPane.INFORMATION_MESSAGE);

    }
}
