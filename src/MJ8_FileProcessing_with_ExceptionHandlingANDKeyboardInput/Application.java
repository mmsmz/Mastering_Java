package MJ8_FileProcessing_with_ExceptionHandlingANDKeyboardInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

//        for (int i = 0; i <=3 ; i++) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter some Text: ");
//            String enteredText = input.nextLine();
//            System.out.println(enteredText);
//        }
        try {
            File file = new File("myfile.txt");
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        MyFileUtils myUtils = new MyFileUtils();
        try {
            myUtils.substract10FromLargerNumber(15);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
