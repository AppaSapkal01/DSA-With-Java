package Arrays;

public class SwapInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        swapInArray(arr, 0, 3);

        for(int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    public static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
