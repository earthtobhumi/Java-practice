package Lecture4;

import java.util.Arrays;

public class ModifyingString {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,3,4,7,11};
        change (arr) ;
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums) {
        nums[0] = 99;//if you make a change to the object via this ref variable, same object will be changes
    }
}
