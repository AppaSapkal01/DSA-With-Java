package Arrays;
import static Arrays.ReverseArray.reverseArray;
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

//        rightRotateOne(arr); // 5 1 2 3 4
//        leftRotateOne(arr); // 2 3 4 5 1
//        leftRotateKtimes(arr, 2);
        rightRotateKtimes(arr, 2);
        for(int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    public static void leftRotateOne(int[] arr) {
        int temp = arr[0];

        for(int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }

        arr[arr.length - 1] = temp;

    }

    public static void leftRotateKtimes(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        // brute force approach
//        for (int i = 0; i < k; i++) {
//            leftRotateOne(arr);
//        }

        // efficient approach
        reverseArray(arr, 0, n-k-2);
        reverseArray(arr, n-k-1, n-1);
        reverseArray(arr, 0, n-1);
    }


    public static void rightRotateOne(int[] arr) {
        int size = arr.length;
        int temp = arr[size - 1];

        for(int i = size - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;

    }

    public static void rightRotateKtimes(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        // brute force
//        for(int i = 0; i < k; i++) {
//            rightRotateOne(arr);
//        }

        // efficient approach
        reverseArray(arr, 0, n - k - 1);
        reverseArray(arr, n - k, n - 1);
        reverseArray(arr, 0, n - 1);
    }


}
