package B32_CreatingFiles;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        final Formatter x;
        try{
            x = new Formatter("fred.txt");
            System.out.println("You created a file");
        }
        catch (Exception e){
            System.out.println("you have go an error");
        }
    }
}
