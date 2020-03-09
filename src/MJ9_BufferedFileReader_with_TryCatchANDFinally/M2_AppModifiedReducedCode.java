package MJ9_BufferedFileReader_with_TryCatchANDFinally;

import java.io.*;

public class M2_AppModifiedReducedCode {
    public static void main(String[] args) {
                    // in Java 6 this feature will not work !!!!!----------
        // from Java 7 onwards a new sytax was introduced and thats called "try with resources"
        // where we dont need the finally block
        // and we dont need to close the resources which are involved example .close(); ite closes automatically
        // we can get rid of finally block because normaly we use finally blck to close() the resources
         // we dont need to close() the resources from java 7 onwards

        File file = new File("myfile.txt"); // instantiating file using File class

        try (FileReader fileReader = new FileReader(file);
               BufferedReader bufferedReader = new BufferedReader(fileReader);) {

            String line = bufferedReader.readLine();
            while(line!= null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (IOException e) {
            System.out.println("Problem reading the file " + file.getName());
        }



    }
}
