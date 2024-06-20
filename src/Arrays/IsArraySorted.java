package Arrays;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 4, 5, 6, 7};
        int[] arr2 = {9, 8, 7, 6, 5, 9, 2};

        boolean ans = isSortedASC(arr);
        System.out.println(ans);

        boolean ans2 = isSortedDSC(arr2);
        System.out.println(ans2);
    }

    

    public static boolean isSortedASC(int[] arr) {
        boolean res = true;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1] ) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static boolean isSortedDSC(int[] arr) {
        boolean res = true;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1] ) {
                res = false;
                break;
            }
        }
        return res;
    }


}
