package Maths;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ans = countDigit(num);
        System.out.println(ans);
    }

    public static int countDigit(int num) {
        if (num == 0) {
            return 1;
        }
        int count = 0;

        while(num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
