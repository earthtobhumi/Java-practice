package Lecture2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){

        System.out.print("Enter 3 numbers: ");
        Scanner in = new Scanner(System.in);
         int a = in.nextInt();
         int b = in.nextInt();
         int c = in.nextInt();

         // Q: Find the largest of the 3 numbers
        // Method 1
        int max = a; //Initialially assuming a largest
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        } // Checking the possible conditions

        System.out.println("Largest number: "+max);

        // Method 2
        int maximum = a; //Initialially assuming a largest
        if (a > b) {
            maximum = a;
        } else {
            maximum = b;
        }
        if (c > maximum) {
            maximum = c;
        }
        // Checking the possible conditions

        System.out.println("Largest number: "+maximum);

        //Method 3
        int maximum1 = Math.max(c, Math.max(a,b));
        System.out.println(maximum1);
    }
}
