package Arrays;
import static Arrays.SwapInArray.swapInArray;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        reverseArray(arr, 0, n-1);

        for(int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    public static void reverseArray(int[] arr, int i, int j) {
        while(i <= j) {
            swapInArray(arr, i, j);
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
            i++;
            j--;
        }
    }

}
