package MJ4_ClassInheritance;

class AA{
    public void show(){
        System.out.println("method from AA");
    }
}
class BB {
    public void show(){
        System.out.println("method from BB");
    }
}

// class CC extends A,B { // ********** class cannot access multiple classes
// }

class CC {
    public void show(){
        System.out.println("method from CC");
    }
}

public class M2_Doesnt_Support_MultipleLevel_Inheritance {
    public static void main(String[] args) {
        CC obj  = new CC();
        obj.show();
// *** Ambiguity -
// means if class AA and class BB has same show() method and when you create an object which method will it call
// to solve this problem only java doesnt support Multiple inheritance
    }
}
