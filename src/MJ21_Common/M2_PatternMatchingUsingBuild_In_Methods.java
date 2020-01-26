package MJ21_Common;

public class M2_PatternMatchingUsingBuild_In_Methods {
    public static void main(String[] args) {

        String text = "arafathanver";
        String pattern = "than"; // checking whether than is there in the text or not.

        boolean result = text.contains(pattern);
        if(result){
            System.out.println("Pattern Found!!");
        }
        else {
            System.out.println("Not Found!!");
        }
    }

}
