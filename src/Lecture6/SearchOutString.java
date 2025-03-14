package Lecture6;

import java.util.Arrays;
import java.util.Scanner;

public class SearchOutString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = in.nextLine();
        System.out.println("Enter the required character: ");
        char target = in.next().charAt(0);

        System.out.println(Arrays.toString(name.toCharArray()));

        boolean found = search(name, target);
        System.out.println("Character found: " + found);
    }

    static boolean search(String str,char target){
        if (str.isEmpty()){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch == target) return true;
        }
        return false;
    }
}
