package MJ4_ClassInheritance;

class AAA{

    public void show() {
        System.out.println("In AAA");
    }
}
class BBB extends AAA{
    @Override // child class method overrides the parent class method... example the show()
    public void show() {
        //super.show(); this will call the super class method as well
        System.out.println("In BBB");
    }
}

public class M3_MethodOverriding {
    public static void main(String[] args) {
        BBB b1 = new BBB();
        b1.show();

        //** child class method over rides the parent class method
        // example if class BBB doesnt have any method it call the super class AAA method and prints out

    }
}
