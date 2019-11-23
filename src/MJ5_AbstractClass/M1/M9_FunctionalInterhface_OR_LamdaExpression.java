package MJ5_AbstractClass.M1;

// types of interfaces
 // 1. Normal Interface -> having more than one method then its normal.
 // 2. Single Abstract Method (SAM) Interface -> has only one method.
 // 3. Marker Interface -> no methods here example Serializable Interface why?
// *** the above works till Java 1.7

// From Java 1.8
// we do have all the above types interface but
// SAM is specifically called as Functional Interface (which has only one method)
                                // if we know what is Function interface then we will know - Lamda Expression
                                                // Lamda Expression is coming from Scala Programming language
// Types of Interface in Java 8
 // 1. Normal Interface
 // 2. Functional Interface
 // 3. Marker Interface

// Annotation is not compulsory
@FunctionalInterface  // use annotation to stop using more methods in M1 because its Functional Interface
interface M1{// this is Functional Interface
    void show();
}

public class M9_FunctionalInterhface_OR_LamdaExpression {
    public static void main(String[] args) {
//                    M1 obj = new M1() {
//                            public void show() {
//                                System.out.println("I am the best");
//                            }
//                             };
//                    obj.show();

                    // since we are going to use lamda expression we can reduce many lines of code from above
                M1 obj = ()-> System.out.println("I am the best");
                        // *** this only work with functional interface and this works only in Java 8
                obj.show();
    }
}
