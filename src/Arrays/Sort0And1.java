package Arrays;
import static Arrays.SwapInArray.swapInArray;
public class Sort0And1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 0};
        sort0And1(arr);
        for(int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    public static void sort0And1(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while(i < j) {
            if(arr[i] == 1 && arr[j] == 0) {
                swapInArray(arr, i, j);
            } else if(arr[i] == 0) {
                i++;
            } else {
                j--;
            }
        }
    }

}
