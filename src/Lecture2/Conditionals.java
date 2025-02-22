package Lecture2;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        /*
            Syntax of if statements:
             if (boolean expression T or F) {
                //body
             }

            Syntax of if-else statements:
             if (boolean expression T or F) {
                //body
             } else {
                // do this
             }

             Syntax of else if statements:
             if (condition 1) {
                //body
             } else if (condition 2) {
                // do this
             } else {
                // do this if both condition false
             }

         */

        int salary;
        System.out.println("Enter your salary: ");
        Scanner input = new Scanner(System.in);
        salary = input.nextInt();
        if (salary > 10_00_000) {
            salary = salary + 2_00_000;
        } else if (salary > 5_00_000){
            salary += 1_00_000;
        } else {
            salary += 50_000;
        }

        System.out.println("Incremented Salary: " + salary);
    }
}
