package Arrays;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element in array at " + i + " index : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a number which needs to searched in array : ");
        int num = sc.nextInt();
//        findElem(arr, num, false );
//        findElem(arr, num, true);
        findMultipleElem(arr, num);
    }

    public static void findElem(int[] arr, int target, boolean findLast) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                ans = i;
                if(findLast == false) {
                    break;
                }
            }
        }

        if(ans == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is found at " + ans + " index ");
        }
    }

    public static void findMultipleElem(int[] arr, int target) {
        int[] ans = new int[arr.length];
        int k = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                ans[k] = i;
                k++;
            }
        }
        if (k == 0) {
            System.out.println("Element is not present in array");
        } else {
            for(int i = 0; i < k; i++) {
                System.out.println("Element is found at " + ans[i] + " index ");
            }
        }
    }
}
