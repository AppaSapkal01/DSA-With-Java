package Arrays;

import java.util.Scanner;

public class LastOccurnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 8, 33, 5, 9, 6, 3, 9, 6, 5};
        int num = sc.nextInt();
        int ans = lastOccurrence(arr, num);
        if(ans == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Last occurrence of " + num + " is at pos: " + ans);
        }
    }

    public static int lastOccurrence(int[] arr, int target) {
        int ans = -1;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
            }
        }
        return ans;
    }

}
