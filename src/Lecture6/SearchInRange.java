package Lecture6;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(linearSearch(arr, target, 1, 4));
        in.close();
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0 || start < 0 || end >= arr.length) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}

//  Mistake : for (int index = start; index <= end; index++) {
//            int element = arr[index];
//            if (element == target) {
//                return index;
//            }

