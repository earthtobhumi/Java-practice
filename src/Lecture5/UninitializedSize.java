package Lecture5;

import java.util.Scanner;
public class UninitializedSize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of integers you want to input:");
        int n = in.nextInt();

        // Create an array of size n
        int[] array = new int[n];

        System.out.print("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        System.out.print("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
        }

        in.close();
    }
}
