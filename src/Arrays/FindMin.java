package Arrays;
import java.util.Scanner;

import static Arrays.ArrayInput.inputArray;
public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = inputArray(size);
        System.out.println("Minimum element in the array is " + findMinElem(arr));
    }

    public static int findMinElem(int[] arr) {
        int MIN = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < MIN) {
                MIN = arr[i];
            }
        }
        return MIN;
    }
}
