package Lecture6;

import java.util.Scanner;
import java.util.ArrayList;

public class SearchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> Strings = new ArrayList<>(5);

        System.out.println("Enter List: ");
        for(int i = 0; i < 5; i++) {
            Strings.add(in.next());
        }

        System.out.println("Required List: " + Strings);

        char target = in.next().charAt(0);
        boolean ans = Search(Strings,target);

        System.out.println("Is the character found? " + ans);
        in.close();
    }

    static boolean Search(ArrayList<String> strList, char target) {
        for (String str : strList) {
            for (char c : str.toCharArray()) {
                if (c == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
