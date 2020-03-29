package B17_Intro_Polymorphism;

public class Main {
    public static void main(String[] args) {
        // IT it = new IT();
       //  Employee it = new IT();

        // when this code does is that to loop through objects
        // we can use one reference variable form that object of super class and assign it to objects of the sub classes and then loop through Polymorpmic Array
        Employee nr_id[] = new Employee[2];
        nr_id[0] = new IT();
        nr_id[1] = new HR();

        // one reason why Polymorphism is to use Polymorphism Arrays that would be something like this.
        for (int x=0; x<nr_id.length; x++){
            nr_id[x].yourID();
        }

    }
}
