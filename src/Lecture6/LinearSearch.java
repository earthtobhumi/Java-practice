package Lecture6;

public class LinearSearch {
    public static void main(String[] args){
        int[] num = {23, 45,67,54,78,89,91};
        int target = 89;
        int ans = linearSearch(num, target);
        System.out.println(ans);
        int ans2 = linearSearch2(num, target);
        System.out.println(ans2);
        boolean ans3 = linearSearch3(num, target);
        System.out.println(ans3);

    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0) return -1;

        // run a for loop
        for (int index = 0; index < arr.length; index++){
            // check every element at every index if it is equal to target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        // this will execute when none of the above return staements worked
        // hence target not found
        return -1;
    }

    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0) return -1;

        // run a for loop
        // check every element at every index if it is equal to target
        for (int element : arr)
            if (element == target) {
                return element;
            }

        // this will execute when none of the above return staements worked
        // hence target not found
        return -1;
    }

    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0) return false;

        // run a for loop
        // check every element at every index if it is equal to target
        for (int element : arr)
            if (element == target) {
                return true;
            }

        // this will execute when none of the above return staements worked
        // hence target not found
        return false;
    }
}



