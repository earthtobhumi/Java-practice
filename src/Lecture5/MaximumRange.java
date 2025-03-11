package Lecture5;

public class MaximumRange {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(maxRange(arr, 1, 3));
    }

    //imagine that arr is not empty
    static int maxRange(int[] arr, int start, int end) {

        if (end > start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
