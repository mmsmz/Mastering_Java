package MJ8_FileProcessing_with_ExceptionHandlingANDKeyboardInput.M1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M3_Try_With_Resources {
    public static void main(String[] args) throws Exception{
            //*** try() this syntax is called as try with resource

        int n = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            n = Integer.parseInt(br.readLine());
        } // without using  catch block or finally block it works !!!
        //finally { // From Java 1.7 onwards finally block is not needed.. now the object will close automatically
                // if you use   try(BufferedReader br = null)
//            br.close();
//            System.out.println("closed");
        //}
        System.out.println(n );
    }
}