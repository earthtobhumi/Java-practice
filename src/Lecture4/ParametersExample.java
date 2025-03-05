package Lecture4;

import java.util.Scanner;
public class ParametersExample {
    public static void main(String[] args) {
        int ans = sum(20,30);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
