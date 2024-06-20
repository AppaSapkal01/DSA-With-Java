package Arrays;

public class FindEquilibriumElem {
    public static void main(String[] args) {
        int[] arr = {1,7, 5, 2, 6};

        System.out.println(findEqui(arr));
    }

    public static int findEqui(int[] arr) {
        int totalSum = 0;

        int leftSum = 0;

        for(int elem : arr) {
            totalSum += elem;
        }

        for(int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];

            if(leftSum == totalSum) {
                return arr[i];
            }

            leftSum += arr[i];
        }
        return -1;
    }
}
