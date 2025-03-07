package Lecture4;


public class Overloading {
    public static void main(String[] args) {
        fun(1);
        fun("Bhumi");
        System.out.println(fun(47,53));
    }

    static void fun(int i) {
        System.out.println("first one");
        System.out.println(i);
    }

    static void fun(String name) {
        System.out.println("second one");
        System.out.println(name);
    }

    static int fun(int a, int b) {
        return a + b;
    }
}
