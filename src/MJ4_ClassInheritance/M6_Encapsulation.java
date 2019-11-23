package MJ4_ClassInheritance;

class Student{
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class M6_Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
//        s1.rollNo = 2; // since we have used private variable we can access any variables directly
//        s1.name= "Arafath"; /*** here we are trying to access directly which is not correct method..
                            // therefore to access the values we will have to access through methods,
                            // so use Getters and Setters.

        s1.setRollNo(5);
        s1.setName("Arafath");
        System.out.println(s1.getName());

        // The concept of Encapsulation is binding data with methods.
        // Why we use it? to hide data.
        // Use getters and setters to access those variables.


    }
}
