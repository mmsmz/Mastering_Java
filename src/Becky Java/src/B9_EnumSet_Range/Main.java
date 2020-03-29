package B9_EnumSet_Range;

import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {

        for (Tuna people : Tuna.values()) {
            //System.out.println(people); output : bukcy  kelsy julia
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        }

        System.out.println("\n And now for the range of contants !!! \n");

        for (Tuna people : EnumSet.range(Tuna.kelsey, Tuna.candy)) {
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        }
    }
}
