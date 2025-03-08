package Lecture5;

public class ArrayBasic {
    public static void main(String[] args){
        // syntax
        // datatype[] variable_name = new datatype[size];
        // or
        // datatype[] variable_name = { };
        // stor 4 roll numbers:
        int[] rno = new int[4];
        // directly
        int[] rno2 = {23,12,47,108};

        int[] ros; // declaration of array. ros is getting defined in stack
        ros = new int[4]; // initialisation :here object is being created in the memory(heap)
        // rn this is {0,0,0,0}
        System.out.println(ros[2]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}
