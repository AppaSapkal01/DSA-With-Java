package Arrays;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 3, 2};

        int ans = findUnique(arr);
        System.out.println(ans);
    }

    public static int findUnique(int[] arr) {
        int ans = -1;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }

        return ans;
    }

}
