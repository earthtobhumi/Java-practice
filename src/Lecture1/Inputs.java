package Lecture1;

import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some input: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);
        int a = 234_000_000;
        System.out.println(a);
        String name = input.nextLine();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
