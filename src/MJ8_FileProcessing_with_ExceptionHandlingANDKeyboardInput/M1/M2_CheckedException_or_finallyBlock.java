package MJ8_FileProcessing_with_ExceptionHandlingANDKeyboardInput.M1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M2_CheckedException_or_finallyBlock {
    public static void main(String[] args) throws Exception{ // use this : throws Exception // for first way
        // check Exception
/*        System.out.println("Enter a number");
// ---------------------------------------------------------------- first way.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(n);*/

        // *** if you don't you exception here you will get an compile time error !!
        // two types of Exception
        // checked ->> When the compiler know about the Exception that is called Checked Exception
        // uncheck ->> When the compiler don't know about the Exception that is called Checked Exception

// ---------------------------------------------------------------- second way.
        System.out.println("Enter a number");

        BufferedReader br = null;
        // BufferedReader is a resource which means after using the resource we will have to close it,
        //  or else it will use unnecessary memory

        br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
      //      br.close(); // we will have to close the resources AND USE IT IN the finally block
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            br.close(); // it will throw an exception
            // its always recommended to close your resources in the finally block
        }
        System.out.println(n);

    }
}
