package MJ3_Understandning_OOP_Objects;

class Emp {
    int eid;
    int salary;
    static String ceo;
    // Since Ceo is same for all the objects,
    // therefore we don't need to use the object anymore we can directly use class name.variable
    // Is you don't want a variable to be object specific, then you can make it a static

    static {
        ceo = "Larry";
    }

    public Emp(){
        eid = 1;
        salary = 3000;
        ceo = "Larry"; //
    }

    public void show(){
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}

public class M6_Static_Keyword {
    public static void main(String[] args) {
        Emp navin = new Emp();
        navin.eid = 8;
        navin.salary = 4000;
        //navin.ceo = "Mahesh";
        Emp.ceo = "Mahesh";
        Emp arafath = new Emp();
        arafath.eid = 9;
        arafath.salary = 5000;
        //arafath.ceo = "Mahesh";
        Emp.ceo = "Mahesh";
        //arafath.ceo = "Rama Krishanan";
        Emp.ceo = "RAM";

        // *** to access a static variable we dont need to create an object

        // since both the employee has the same ceo.. we need to change variable to static
        navin.show();
        arafath.show();
    }
}
