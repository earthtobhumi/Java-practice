package Lecture4;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        multiple(2,3,"Bhumi", "Bhumi", "Bhumi", "Bhumi");
        fun(2,3,10,47,68,99,101);
        fun("Bhumi","Divyansh");
    }

    static void multiple(int a, int b, String ...v) {
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
