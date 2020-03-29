package B7_Composition;

public class Main {

    public static void main(String[] args) {
        Potpie potObj = new Potpie(4,5,6);
        Tuna tunaObj = new Tuna("Arafath", potObj);

        System.out.println(tunaObj);
    }
}
