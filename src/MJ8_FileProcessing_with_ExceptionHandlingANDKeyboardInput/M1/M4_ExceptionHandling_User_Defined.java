package MJ8_FileProcessing_with_ExceptionHandlingANDKeyboardInput.M1;

public class M4_ExceptionHandling_User_Defined {
    public static void main(String[] args) {
        int i, j;
        i = 8;
        j = 9;

        try {
            int k = i / j;

            if(k==0){
                throw new ArafathException("this is not possible");
            }

            System.out.println(k);
        }
        catch (ArafathException e ) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
