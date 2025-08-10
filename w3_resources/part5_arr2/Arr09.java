package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr09 {
    // insert an element (specific position) into an array.
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-9.php
    public void solve(int[] arr, int idx, int val) {
        for (int i = arr.length - 2; i >= idx; i--) {
            arr[i+1] = arr[i];
        }
        arr[idx] = val;
    }
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Arr09 sol = new Arr09();
        sol.solve(arr, 2,5);
        System.out.println( Arrays.toString(arr) );     
    }
}
