package Lecture5;

import java.util.Arrays;
public class Function {
    public static void main(String[] args) {
        int[] nums = {3,44,555,777};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 11;
    }
}
