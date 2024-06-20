package Strings;

public class MinLengthString {
    public static void main(String[] args) {
        String str = "aabccabba";
        System.out.println(minLength(str));
    }

    public static int minLength(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                char ch = s.charAt(left);
                while (left <= right && s.charAt(left) == ch) {
                    left++;
                }
                while (left <= right && s.charAt(right) == ch) {
                    right--;
                }
            } else {
                break;
            }
        }

        return right - left + 1;
    }
}
