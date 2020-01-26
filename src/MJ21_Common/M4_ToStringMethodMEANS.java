package MJ21_Common;

public class M4_ToStringMethodMEANS {
    public static void main(String[] args) {
        Student s1 = new Student(11, "Mohamed");
//        System.out.println(s1.rollno);
//        System.out.println(s1.sname);
        // now what if i want to print an object called s1 System.out.println(s1);
        System.out.println(s1.toString()); // by default tostring even if you dont use it

    }
}
class Student{
    int rollno;
    String sname;

    public Student(int rollno, String sname) {
        this.rollno = rollno;
        this.sname = sname;
    }

    @Override
    public String toString() {
        return  "rollno=" + rollno +
                ", sname='" + sname ;
    }


}