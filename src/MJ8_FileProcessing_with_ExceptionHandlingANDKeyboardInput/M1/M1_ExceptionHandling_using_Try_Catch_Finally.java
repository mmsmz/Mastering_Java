package MJ8_FileProcessing_with_ExceptionHandlingANDKeyboardInput.M1;

public class M1_ExceptionHandling_using_Try_Catch_Finally {
    public static void main(String[] args) {
        // unchecked exception
      /*  int i = 9/0; // this exception will show only in runtime : java.lang.ArithmeticException
        System.out.println("Hello"); // here its not printing "Hello" */

      // handle the exception

        try {
            int i = 7;
            int j = 0;
            int k = i/j;
            System.out.println("output is : " + k);
        //    System.out.println("Hello ");
        }catch (ArithmeticException e){
            System.out.println("Error ");
          //   System.out.println("Hello "); dont need to do code redundancy
        }
        finally {
            System.out.println("Hello"); // even if you get the exception or not, this will be print "Hello"
        }

 //--------------------------------------------------------------------------------------------------
        // having multiple catch exception in two ways
        // first way :
            // why mmultiple
        try {
            int a[] = new int[6];
            a[6] = 8; // out of array index bound// it has only array index of 5
            int i = 7;
            int j = 0;
            int k = i/j;
            int abc[] = null; // this is null point exception
            abc[4] = 8;
        }catch (ArithmeticException e){
            System.out.println("Error ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Array Index Bound ");
        }
        catch (Exception e){ // use this Exception as the last catch to print..
            System.out.println("Something Wrong"); // this Exception will handle everything..
        }

 //--------------------------------------------------------------------------------------------------
        // second way
        try {
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){ // from Java 1.7
            System.out.println("Error ");
        }


    }
}
