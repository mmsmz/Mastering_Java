package MJ21_Common;

public class M7_2_StringConvertor {

    public static String convert(String str){
        // since we want to change the string value we need use string as mutable
        // therefore we need to use StringBuffer.
        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i <sb.length() ; i++) {
            // we need to use the range of ascii values
            // digits - from 48 to 57
                    // means 48 ==0, 49==1 and 57==9.
            if(sb.charAt(i)<48 || sb.charAt(i)>57){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // how to filter only number and remove string
        // example
        // 978bv68a667
        // 97868667     - final output should as this

        String str = "9978bv68a6+-67";
        str = convert(str);
        System.out.println(str);
    }

}
