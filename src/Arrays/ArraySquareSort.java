package Arrays;
import static Arrays.ReverseArray.reverseArray;

// NOTE: the given array is already sorted
public class ArraySquareSort {
    public static void main(String[] args) {
        int[] arr = { -10, -5, -2, 1, 4, 9};

        int[] ans = sortSquaresOfElem(arr);

        for(int elem : ans) {
            System.out.print(elem + " ");
        }
    }

    public static int[] sortSquaresOfElem(int[] arr) {
        int[] ans = new int[arr.length];
        int k = 0;
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            if(Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        reverseArray(ans, 0, ans.length - 1);
        return ans;
    }
}
