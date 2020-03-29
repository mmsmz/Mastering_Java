package B1_methods_and_constructor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your girl name here : ");
        String name = input.nextLine();

          Tuna tname = new Tuna("Simba");
          Tuna tname2 = new Tuna("Simba 2 ");
          tname.setName(name);

        tname.saying();
        tname2.saying();




    }
}
