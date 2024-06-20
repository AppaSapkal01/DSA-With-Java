package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello";
        String ans = reverseString(original);

        System.out.println(ans);
    }

    public static String reverseString(String s) {
        char[] ans = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;


        while(i < j) {
            char temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;

            i++;
            j--;
        }
        return new String(ans);
    }
}
