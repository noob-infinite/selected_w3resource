package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr30 { 
    // https://www.w3resource.com/java-exercises/array/index.php
    // check if an array of integers is without 0 and -1.
    boolean solve(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] == -1)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 4, 9};
        Arr30 sol = new Arr30();
        System.out.println( sol.solve(arr));
    }    
}
