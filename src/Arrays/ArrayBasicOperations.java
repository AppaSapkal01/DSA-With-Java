package Arrays;

import java.util.Scanner;

public class ArrayBasicOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter the size of an array : ");
//        int size = sc.nextInt();

//        int[] arr = new int[size];

//        for(int i = 0; i < 3; i++) {
//            System.out.print("Enter the element at index " + i + " : ");
//            arr[i] = sc.nextInt();
//        }

//        printArray(arr);
//        insert(arr, 2, 99);
//
//        printArray(arr);
//        delete(arr, 2);
//        printArray(arr);

        int[][]  my2DArray = new int[3][2];

        for (int i = 0; i < my2DArray.length; i++) {
            for (int j = 0; j < my2DArray[i].length; j++) {
                System.out.print("Enter the element at index " + j + " : ");
                my2DArray[i][j] = sc.nextInt();
            }
        }

        print2DArray(my2DArray);
        insert2DArray(my2DArray, 0, 1, 10);
        print2DArray(my2DArray);
        delete2DArray(my2DArray, 0, 1);
        print2DArray(my2DArray);
    }

    // for this insertion at least one place should be empty in array
    public static void insert(int[] arr, int pos, int elem) {
        int size = arr.length;

        if(pos < 0 || pos > size - 1) {
            System.out.println("Wrong position");
            return;
        }

        // shifting towards the end
        for (int i = size - 2; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = elem;
    }

    public static void update(int[] arr, int pos, int element) {
        int size = arr.length;
        if(pos < 0 || pos > size - 1) {
            System.out.println("Wrong position");
            return;
        }
        arr[pos] = element;
    }


    public static void delete(int[] arr, int pos) {
        for(int i = pos; i <= arr.length-2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }


    public static void printArray(int[] arr) {
        for(int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void print2DArray(int[][] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.println("for " + i + " index");
            printArray(arr[i]);
        }
    }

    public static void insert2DArray(int[][] arr, int pos1, int pos2, int element){
        insert(arr[pos1], pos2, element);
    }

    public static void delete2DArray(int[][] arr, int pos1, int pos2){
        delete(arr[pos1], pos2);
    }

    public static void update2DArray(int[][] arr, int pos1, int pos2, int element) {
        int size1 = arr.length;
        if(pos1 < 0 || pos1 > size1 - 1) {
            System.out.println("Wrong position");
            return;
        }
        int size2 = arr[pos1].length;
        if(pos2 < 0 || pos2 > size2 - 1) {
            System.out.println("Wrong position");
            return;
        }

        arr[pos1][pos2] = element;
    }
}
