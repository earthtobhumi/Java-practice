package Lecture4;

public class Scope {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a);//if we put num over here we can't access it because, it's in different method
    }

    static void random() {
        int num = 67;
        System.out.println(num);
    }
}
