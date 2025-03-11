package Lecture5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInput {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        // Input
        for(int i =0; i < 5; i++){
            list.add(in.nextInt());
        }

        // Print
        for(int i =0; i < 5; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }

}
