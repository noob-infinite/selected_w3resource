package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr07 {
    // remove a specific element by index from an array. 
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-7.php
    public void solve(int[] arr, int idx) {
        for (int i = idx+1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Arr07 sol = new Arr07();
        sol.solve(arr, 1);
        System.out.println( Arrays.toString(arr) );     
    }
}
