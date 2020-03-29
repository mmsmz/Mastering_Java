package B31_FileClass;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File x = new File("D:\\test1\\greg.txt");

        if (x.exists())
            System.out.println(x.getName() + "exits!!");
        else
            System.out.println("this doesnt exit!!");


    }
}
