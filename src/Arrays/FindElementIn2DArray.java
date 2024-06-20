package Arrays;

public class FindElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr2d = {
                {2,4,1,5,1},
                {7,8,19,2,9},
                {35,9,7,0,1},
                {2,4,97,5,75},
        };

//        linearSearch2d(arr2d, 99, false);
//        linearSearch2d(arr2d, 99, true);
        linearSearchMultiple2D(arr2d, 1);
    }

    public static void linearSearch2d(int[][] arr, int target, boolean findLast) {
        int outerIndex = -1;
        int innerIndex = -1;

        for(int i = 0; i < arr.length; i++) {
            boolean found = false;
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    outerIndex = i;
                    innerIndex = j;

                    if(findLast == false) {
                        found = true;
                        break;
                    }
                }
            }
            if(found == true) {
                break;
            }
        }
        if (outerIndex == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element found at pos: " + outerIndex + ", " + innerIndex);
        }
    }

    public static void linearSearchMultiple2D(int[][] arr, int target) {
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            size = size + arr[i].length;
        }

        int[][] ans = new int[size][2];
        int k = 0;

        for(int i = 0; i < arr.length; i++) {
            boolean found = false;
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    ans[k][0] = i;
                    ans[k][1] = j;
                    k++;
                }
            }
            if(found == true) {
                break;
            }
        }
        if (k == 0) {
            System.out.println("Element is not present in the array");
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println("Found element at pos: " + ans[i][0] + ", " + ans[i][1]);
            }
        }
    }

}
