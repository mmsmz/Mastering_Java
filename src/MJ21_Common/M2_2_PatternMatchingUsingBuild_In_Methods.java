package MJ21_Common;

public class M2_2_PatternMatchingUsingBuild_In_Methods {
    public static void main(String[] args) {
        String text = "arafathanver";
        String pattern = "than";
        int count = 0;
        boolean result = false;

        int tlen = text.length();
        int plen= pattern.length();

        char c,p ;
        for (int i = 0; i <tlen-plen ; i++) {
            c = text.charAt(i);
            p = pattern.charAt(0);
            if(c==p){
                for (int j = i, k=0; j <i+plen; j++, k++) {
                    c = text.charAt(j);
                    p = pattern.charAt(k);
                    if(c==p) {
                        count++;
                    }
                }
            }
        }

        if (count == plen) {
            System.out.println("Pattern Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
