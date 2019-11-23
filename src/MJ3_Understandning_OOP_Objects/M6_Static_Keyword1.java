package MJ3_Understandning_OOP_Objects;

class Emp1 {
    int eid;
    int salary;
    static String ceo;
    // this static block will be executed when we load a class
    // *** class will load only once but object will load everytime we create an object
    static { // if you want initialize static variable we can use static blocks as shown here
        ceo = "Larry!";
        System.out.println("In static");
    }
    // ** class load first and object secongs
    // ** static variable is same for all the objects and none static variable is differenet for all the objects

    // constuctor will be executed when we create an object
    public Emp1(){ // if you want to initialize none static variable then use constructors
        eid = 1;
        salary = 3000;
        ceo = "Larry s";
        System.out.println("in constructor");
    }
    static { // if you want initialize static variable we can use static blocks as shown here
        ceo = "Larry!";
        System.out.println("In static 2 ");
    }
    public void show(){
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}

public class M6_Static_Keyword1 {
    public static void main(String[] args) {
        Emp1 navin = new Emp1();

        Emp1 arafath = new Emp1();

        navin.show();
        arafath.show();
    }
}
