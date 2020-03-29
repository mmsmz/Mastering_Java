package B2_Simple_Average_program;

public class B2_CompoundinterestProgram {
    public static void main(String[] args) {
            double amount; // ?
            double principal = 10_000; // subscribing
            double rate = .01; // gaining one percent a day

            for (int day = 1; day<=20; day++){
                amount = principal*Math.pow((1+rate),day);
                System.out.println(day + "  " + amount);
            }

    }
}
