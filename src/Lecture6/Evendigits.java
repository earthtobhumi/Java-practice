package Lecture6;

public class Evendigits {
    public static void main(String[] args){
        int[] arr = {2, 4 ,7, 9, 10, 12, 11};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] num){
        int count = 0;
        for( int number : num){
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
/*
 static boolean even(int num){

        return false;
    }
*/
