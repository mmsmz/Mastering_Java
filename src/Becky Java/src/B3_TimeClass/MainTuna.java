package B3_TimeClass;

public class MainTuna
{
    public static void main(String[] args) {
        Tuna tunaObject = new Tuna();
        System.out.println(tunaObject.toMilitary());
        System.out.println(tunaObject.toString());

        tunaObject.setTime(13,26,12);
        System.out.println(tunaObject.toMilitary());
        System.out.println(tunaObject.toString());


    }


}
