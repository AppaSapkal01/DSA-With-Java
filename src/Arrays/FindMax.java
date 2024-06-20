package Arrays;
import static Arrays.ArrayInput.inputArray;
public class FindMax {
    public static void main(String[] args) {
        int[] arr = inputArray(5);

        int ans = findMaxElem(arr);
        System.out.println("Maximum elem is " + ans);
    }

    public static int findMaxElem(int[] arr) {
        int MAX = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > MAX) {
                MAX = arr[i];
            }
        }
        return MAX;
    }
}
