package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr31 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-31.php
    // check if the sum of all the 10's in the array is exactly 30.
    boolean solve(int[] arr) {
        final int GRANDSUM = 30;
        final int SEARCHVALUE = 10;  
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == SEARCHVALUE)
                sum += SEARCHVALUE;
        }
        return sum == GRANDSUM;
    }
    public static void main(String[] args) {
        int[] arr = {10, 77, 10, 54, -11, 10};
        Arr31 sol = new Arr31();
        System.out.println( sol.solve(arr));
    }      
}
