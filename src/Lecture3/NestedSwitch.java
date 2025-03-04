package Lecture3;

import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Bhumi Shah");
                break;
            case 2:
                System.out.println("Divyansh Pandey");
                break;
            case 3:
                switch (Department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Electronics");
                        break;
                    default:
                        System.out.println("Please enter correct department");
                }
            default:
                System.out.println("Please enter correct empID");
        }
    }
}
