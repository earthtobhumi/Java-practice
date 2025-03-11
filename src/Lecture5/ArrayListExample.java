package Lecture5;

import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> List = new ArrayList<>(9);

        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);
        List.add(60);
        List.add(70);
        List.add(80);
        List.add(90);
        List.add(100);
        List.add(110);


        System.out.println(List);
        System.out.println(List.contains(110));
        System.out.println(List.get(10));
        List.set(0, 100);
        System.out.println(List);
        List.remove(1);
        System.out.println(List);

    }
}
