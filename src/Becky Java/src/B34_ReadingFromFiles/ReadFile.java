package B34_ReadingFromFiles;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    private Scanner x;

    public void openFile() {
        try {
            x = new Scanner(new File("chinees.txt"));
        } catch (Exception e) {
            System.out.println("file cannot be found!!");
        }
    }

    public void readFile(){
        while(x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();

            System.out.printf("%s %s %s \n", a,b,c);
        }
    }

    public void closeFile(){
        x.close();
    }

}
