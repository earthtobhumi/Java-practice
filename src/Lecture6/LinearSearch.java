package Lecture6;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Please enter 1D array: ");
        for (int i=0;i < num.length;i++){
            num[i] = in.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(num));

        System.out.println("Please enter number to find: ");
        int target = in.nextInt();
        int ans = linearSearch(num, target);
        System.out.println("Index: " + ans);
        int ans2 = linearSearch2(num, target);
        System.out.println("Number: " + ans2);
        boolean ans3 = linearSearch3(num, target);
        System.out.println("Boolean: " + ans3);

    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0) return -1;

        // run a for loop
        for (int index = 0; index < arr.length; index++){
            // check every element at every index if it is equal to target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        // this will execute when none of the above return statements worked
        // hence target not found
        return -1;
    }

    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0) return -1;

        for (int element : arr)
            if (element == target) {
                return element;
            }

        return -1;
    }

    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0) return false;

        for (int element : arr)
            if (element == target) {
                return true;
            }

        return false;
    }
}



