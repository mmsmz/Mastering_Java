package B5_MultipleConstructors;

public class MainTuna
{
    public static void main(String[] args) {
        Tuna tunaObject = new Tuna();
        Tuna tunaObject1 = new Tuna(10);
        Tuna tunaObject2 = new Tuna(10,20);
        Tuna tunaObject3 = new Tuna(10,20,30);

        System.out.printf("%s\n", tunaObject.toMilitary());
        System.out.printf("%s\n", tunaObject1.toMilitary());
        System.out.printf("%s\n", tunaObject2.toMilitary());
        System.out.printf("%s\n", tunaObject3.toMilitary());

    }


}
