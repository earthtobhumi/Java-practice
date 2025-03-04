package Lecture3;

import java.util.Scanner;
public class CleanerSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Dionysus's fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}
