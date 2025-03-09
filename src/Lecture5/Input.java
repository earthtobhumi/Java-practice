package Lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 63;
        arr[2] = 53;
        arr[3] = 43;
        arr[4] = 33;
        System.out.println(arr[0]);

        //input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int j : arr) {
            System.out.println(j + " ");
        }
    }
}
