package Strings;

public class LargestOddNumber {
    public static void main(String[] args) {
        String str = "4206";

        System.out.println(largestOddNum(str));
    }

    public static String largestOddNum(String s) {
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) % 2 != 0) return s.substring(0, i + 1);

        }
        return "";
    }
}
