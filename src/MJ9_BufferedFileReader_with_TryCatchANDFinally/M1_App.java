package MJ9_BufferedFileReader_with_TryCatchANDFinally;

import java.io.*;

public class M1_App {
    public static void main(String[] args) {

        File file = new File("myfile.txt"); // instantiating file using File class
        BufferedReader bufferedReader = null;
        FileReader fileReader = null; // instead of using scanner Class we can also use FileReader !!!

        try {
            fileReader = new FileReader(file); // instead od using Scanner class we can use FileReader
            bufferedReader = new BufferedReader(fileReader); // it can read the line by line

            String line = bufferedReader.readLine();

            while(line!= null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (IOException e) {
            System.out.println("Problem reading the file " + file.getName());
        } finally {
            try {
                if(bufferedReader!=null){
                    bufferedReader.close(); // we have to close the bufferedReader
                }
                if(fileReader!=null){
                    fileReader.close();  // we have to close the fileReader
                }
            } catch (IOException e) {
                System.out.println("unable to colse the file "  + file.getName());
            } catch (NullPointerException ex){
                System.out.println("File was probably never opened!!" + ex);
            }
        }



    }
}
