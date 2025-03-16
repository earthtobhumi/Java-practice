package Lecture6;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Minimum: " + min(arr));
        System.out.println("Maximum: " + max(arr));
    }

    static int min(int[] arr){
        int MinVal = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < MinVal){
                MinVal = arr[i];
            }
        }
        return MinVal;
    }

    static int max(int[] arr){
        int MaxVal = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > MaxVal){
                MaxVal = arr[i];
            }
        }
        return MaxVal;
    }
}
