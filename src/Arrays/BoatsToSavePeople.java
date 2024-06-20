package Arrays;
import java.util.*;
public class BoatsToSavePeople {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 1};

        System.out.println(rescueBoats(arr, 3));
    }

    public static int rescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);

        int res = 0;
        int i = 0;
        int j = arr.length - 1;

        while(i <= j) {
            res++;
            if(arr[i] + arr[j] <= limit) {
                i++;
            }

            j--;
        }

        return res;
    }
}
