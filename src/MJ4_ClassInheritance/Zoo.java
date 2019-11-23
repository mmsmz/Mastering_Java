package MJ4_ClassInheritance;

public class Zoo {
    public static void main(String[] args) {

        Chicken chick1 = new Chicken("limmy","Male",1,1.1f);
        chick1.fly();
        Sparrow sp = new Sparrow("Spar","male",2,1.3f);
        sp.fly();

    }
}
