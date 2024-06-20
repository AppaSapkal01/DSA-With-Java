package Strings;

public class RemoveSpcialChars {
    public static void main(String[] args) {
        String str = "@j$slk*(&Hello56";

        String ans = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(ans);
    }
}
