package MJ3_Understandning_OOP_Objects;


class cals{

//    public int add(int a, int b){
//        return a+b;
//    }

    public int add(int ... n){ // this is called Variable Length Arguments
                    // {5,6,5,9,6,6,5,8}
        int sum = 0;
        for (int i: n){
            sum = sum+i;
        }
        return sum;
    }
}
public class M8_Variable_ArgumentsDemo {
    public static void main(String[] args) {
        cals obj = new cals();

        //System.out.println(obj.add(5,6));

        // what if you want to pass many values in the parameters into add method
        // sending values as a array of parameters

        System.out.println(obj.add(5,6,5,9,6,6,5,8));

    }
}
