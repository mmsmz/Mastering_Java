package MJ1_Basic_Java;

public class M8_ControlFlow_Using_IF_ELSE_Statement {
    public static void main(String[] args) {
        boolean hungry = true;
/*
        if(hungry){ // by default the "hungry" will be "true" because we have initialized "hungry = true"
            System.out.println("Yes"); // output : yes
        }
        else{
            System.out.println("NO");
        }*/
//----------------------------------------------------------------------------------------------------------1
        if (!hungry) { // ! is Not Operator
            System.out.println("Yes");
        } else {
            System.out.println("NO"); // output : No
        }
//----------------------------------------------------------------------------------------------------------2
 /*       int favouriteTemp = 75;
        int currentTemp = 60;
        String opinnion;

        if (currentTemp < favouriteTemp - 30) {
            opinnion = "Its Perrty dam Cold!!!";
        } else if (currentTemp < favouriteTemp - 20) {
            opinnion = "Its kinda Cold!!";
        } else if (currentTemp > favouriteTemp + 10){
            opinnion = "Its hot here!!";
        }
        else {
            opinnion = "Its args beautiful Day!!!";
        }

        System.out.println(opinnion);*/ // output : Its args beautiful Day!!!
// ----------------------------------------------------------------------------------------------------------3
        // switch

        int month = 2;
        String monthString;

        switch (month){
            case 1: monthString = "Jan";
            break;
            case 2: monthString = "Feb";
            break;
            case 3: monthString = "Mar";
                break;
                default: monthString = "No valid";
        }
        System.out.println(monthString); // output : Feb

    }
}
