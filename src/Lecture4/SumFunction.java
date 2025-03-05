package Lecture4;

import java.util.Scanner;
public class SumFunction {
    public static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.print(ans);
    }

    static int sum2() {
        //Q: take input of 2 numbers and print their sum
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sumI = num1 + num2;
        return sumI;
    }
    static void sum() {
        //Q: take input of 2 numbers and print their sum
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
    /*
        return_type name() {
         // body
         return statement;
         */
}
