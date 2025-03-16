package Lecture6;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax2D {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[2][2];
        System.out.println("Enter array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(max(arr));
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE; // Initialize max with the smallest possible integer
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

        }
        return max;
    }
}
