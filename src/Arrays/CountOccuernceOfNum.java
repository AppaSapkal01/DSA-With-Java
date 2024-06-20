package Arrays;

import java.util.Scanner;

public class CountOccuernceOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 8, 33, 5, 9, 6, 3, 9, 6, 5};
        int num = sc.nextInt();
        int ans = findOccurrence(arr, num);
        if(ans == 0) {
            System.out.println("Element not present");
        } else {
            System.out.println("element occurres " + ans + " times");
        }
    }

    public static int findOccurrence(int[] arr, int target) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                count++;
            }
        }
        return count;
    }

}
