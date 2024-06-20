package Arrays;
import static Arrays.SwapInArray.swapInArray;


public class MoveAllEvenNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        moveAllEvenAtStartAndOddAtEnd(arr);

        for(int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    public static void moveAllEvenAtStartAndOddAtEnd(int[] arr) {
        int left = 0, right = arr.length - 1;

        while(left < right) {
            if(arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                swapInArray(arr, left, right);
            } else if(arr[left] % 2 == 0) {
                left++;
            } else {
                right--;
            }
        }
    }
}
