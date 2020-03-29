package B2_Simple_Average_program;

public class B8_ArrayMethods {
    public static void main(String[] args) {
        int buckyp[] = {3,4,5,6,7};
        change(buckyp); // java knows that this array to 'pass in" so no need to put as buckp[]

        for (int y: buckyp){
            System.out.println(y);
        }
    }

    public static void change(int x[]){
        for (int counter=0; counter<x.length;counter++)
        {
            x[counter] +=5;
        }
    }
}
