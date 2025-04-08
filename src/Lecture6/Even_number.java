package Lecture6;

import java.util.Scanner;

public class Even_number {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter array: ");
        for (int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] num){
        int count = 0;
        for( int number : num){
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
/*
 static boolean even(int num){

        return false;
    }
*/
