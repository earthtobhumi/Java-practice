package Lecture2;

import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
    /*
        Syntax of for loops:

        for(initialisation ; condition; increment/decrement) {
        //body
        }
     */
        // Q: Print numbers from 1 to 5
        for (int num = 1; num <= 5; num += 1) {
            System.out.println(num);
        }

        // Q: Print numbers from 1 to n
        System.out.print("Enter n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Number: " +i);
        }

        // while loop
        /*
            Syntax:
            while (condition) {
            //body
            }
         */

        // Q: Print numbers from 1 to 5
        int a = 1;
        while(a<=5){
            System.out.println(a);
            a +=1;
        }

        // do while loop
        /*
            Syntax:
            do {
            //body
            } while (condition);
         */

        // Q: Print numbers from 1 to 5

        int number = 6;
        do {
            System.out.println(number);
            number +=1;
        } while (number<=10);
    }
}
