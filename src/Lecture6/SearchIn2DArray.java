package Lecture6;

import java.util.Scanner;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[2][2];
        System.out.println("Enter array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Enter target: ");
        int target = in.nextInt();
        System.out.println(search(arr, target));
        //System.out.println(searchElement(arr, target));
    }

    static int search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == target) return target;
            }
        }
        return -1;
    }

// Approach: Correct    static int[] searchElement(int[][] arr, int target) {
//        // Check if the array is empty
//        if (arr.length == 0) return new int[]{-1, -1};
//
//        for (int i = 0; i < arr.length; i++) {
//            // Check if the current row is empty
//            if (arr[i].length == 0) continue;
//
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == target) return new int[]{i, j};
//            }
//        }
//        return new int[]{-1, -1};
//    }

//  Approach: Mistaken (Inner loop should be j < arr[i].length)
//  static int[] search_element(int[][] arr, int target){
//        if (arr.length == 0) return new int[]{-1,-1};
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i].length == 0) continue;
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[i][j] == target) return new int[]{i,j};
//            }
//        }
//        return new int[]{-1,-1};
//    }
}
