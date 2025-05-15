package Lecture6;

public class EvenDigits {
    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberofDigits = digits(num);

        return numberofDigits % 2 == 0 ;
    }

    static int digits(int num) {
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }

    //another approach to calculate number of Digits
    static int digits2(int num) {
        return (int)(Math.log10(num)) + 1;
    }

}
