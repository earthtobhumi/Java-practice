package Lecture4;

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
//say its 3-digit number then sum of cube of each digit is the same as the number
//for example 153 then 1 + 125 + 27 = 153

        for (int i = 100; i < 1000; i++) {
           if (isArmstrong(i)) {
               System.out.println(i + " ");
           }
        }
    }

        static boolean isArmstrong(int n) {
            int original = (n);
            int sum = 0;

            while (n > 0) {
                int rem = n % 10;
                n = n / 10;
                sum = sum + rem*rem*rem;
            }
            return sum == original;
        }

    }
