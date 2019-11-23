package MJ10_CollectionFramework;

public class M1_WrapperDemo {
    public static void main(String[] args) {

        int i = 5; // int "i" is a "Primitive datatype"

        // when we use a class name for that "i" it will be a object

        Integer ii = new Integer(5); // "Wrapper Class"
        // this "ii"  is a reference variable
        //  above we are storing this 5 inside an object and not in the primitive variable

        // Float  f = new Float(5.5f);

        Integer iii = new Integer(i); // if i take the int "i" and pass it inside this object then this concept is called
                                        // "Boxing" or "Wrapping"

        // in order to return the "iii"
        int result = iii.intValue(); // "Unboxing" or "UnWrapping"
        System.out.println(result);

        // ****** Integer iii = new Integer(i); check this
        // instead of using "new Integer(i)"

        // we can directly say ..
        Integer value = i; // this will take the primitive value and assign i to // this is called AuoBoxing / AtuoWrapping

        // iii.intValue(); instead of intValue, if you want to get the value of this

        int k = value; // AutoUnboxing - AutoUnWrapping
        System.out.println(k);

        // when to use this *********************************
        // depends on certain application wise


        String str = "123";  // now if i want to get the interger value can do the following
        // int n = str; error answer is no !!

        int n = Integer.parseInt(str); // using parseInt which is a static method so we can access direct inorder to convert

    }
}
