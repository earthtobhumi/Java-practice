package Lecture2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0; //previous index
        int i = 1; //current index
        int count = 2; //since we already have 2 numbers th count starts from 2

        while(count <= n){
            int temp = i;
            i = i + p;
            p = temp;
            count++;
        }

        System.out.println(i);
    }
}
