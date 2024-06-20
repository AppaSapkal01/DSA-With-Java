package Strings;

public class MaximumOddBinary {
    public static void main(String[] args) {
        String str = "010001";

        System.out.println(maxOddBinary(str));
    }

    public static String maxOddBinary(String input) {
        char[] arr = input.toCharArray();
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                arr[i] = '0';
                count1++;
            }
        }



        if(count1 > 0) {
            for(int i = 0; i < count1 - 1; i++) {
                arr[i] = '1';
            }
        }

        arr[arr.length - 1] = '1';

        return new String(arr);
    }
}
