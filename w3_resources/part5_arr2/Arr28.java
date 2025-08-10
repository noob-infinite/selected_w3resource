package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr28 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-28.php
    // to get the difference between the largest and smallest values in an array of integers.
    // The array must have a length of at least 1.
    int solve(int[] arr) {
        int max = arr[0];
        if (arr.length == 1) return max;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)  
                min = arr[i];
        }
        return max - min;
    }
    // alternative brute force of max_diff
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 4, 9};
        Arr28 sol = new Arr28();
        System.out.println( sol.solve(arr));
        // System.out.println( Arrays.toString(sol.solve(arr)));
    }    
}
