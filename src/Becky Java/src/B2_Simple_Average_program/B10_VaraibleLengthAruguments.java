package B2_Simple_Average_program;

public class B10_VaraibleLengthAruguments {
    public static void main(String[] args) {
        System.out.println("average " + average(43,56,76,8)); // output is 45

    }
    // if you don't know how many arguments its going to take place three (dots) ...
    public static int average(int... numbers){
        int total =0;
        for (int x: numbers){
            total += x;
        }
        return total / numbers.length;
    }
}
