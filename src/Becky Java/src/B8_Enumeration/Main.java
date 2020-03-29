package B8_Enumeration;

public class Main {

    public static void main(String[] args) {
        //Tuna tunaObj = new Tuna();
        for (Tuna people : Tuna.values()) {
            //System.out.println(people); output : bukcy  kelsy julia
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        }
    }
}
