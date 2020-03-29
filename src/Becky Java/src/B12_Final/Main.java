package B12_Final;

public class Main {

    public static void main(String[] args) {
        Tuna tunaOjb = new Tuna(10);

        for (int i = 0; i < 5; i++) {
            tunaOjb.add();
            System.out.printf("%s", tunaOjb);
           // tunaOjb.NUMBER =14; // NUMBER not visible
        }

    }

}
