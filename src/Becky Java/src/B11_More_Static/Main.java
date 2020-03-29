package B11_More_Static;

public class Main {

    public static void main(String[] args) {
        Tuna member1 = new Tuna("Megain", "Rin");
        Tuna member2 = new Tuna("Zinu", "Lopo");
        Tuna member3 = new Tuna("Tailor", "Swiggy");

//        System.out.println();
//        System.out.println(member2.getFirstname());
//        System.out.println(member2.getLastname());
//        System.out.println(member2.getMembers());

        System.out.println(Tuna.getMembers()); // because we used static keyword

    }
}
