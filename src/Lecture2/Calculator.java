package Lecture2;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take input from user till user does not press X or x
        int ans = 0;
        while(true){
            //Take operator as the input
            System.out.println("Enter operator: ");
            char op = in.next().trim().charAt(0);

            if (op == 'X' || op == 'x') {
                System.out.println("Exiting...");
                break; // Exit the loop if 'X' or 'x' is entered
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ) {
                System.out.println("Enter numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } if (op == '-') {
                    ans = num1 - num2;
                } if (op == '*') {
                    ans = num1 * num2;
                } if (op == '/') {
                   if(num2 != 0) ans = num1 / num2;
                } if (op == '%') {
                    ans = num1 % num2;
                } else {
                    System.out.println("Invalid Operation!!");
                }
            }
            System.out.println(ans);
        }
    }
}
