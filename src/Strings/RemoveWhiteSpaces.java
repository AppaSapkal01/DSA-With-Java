package Strings;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "Hello how are you ?";

        String ans = str.replaceAll(" ", "");

        System.out.println(ans);
    }
}
