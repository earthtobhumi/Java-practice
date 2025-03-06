package Lecture4;

public class ShadowingExample {
    int x = 10; // Instance variable

    public void show() {
        int x = 20; // Local variable shadows instance variable
        System.out.println("Local x: " + x); // Prints 20
        System.out.println("Instance x: " + this.x); // Prints 10 (using 'this' to access instance variable)
    }
    public static void main(String[] args) {
        ShadowingExample obj = new ShadowingExample();
        obj.show();
    }
}

