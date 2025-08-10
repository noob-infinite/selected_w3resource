package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr45 { 
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-45.php
    // Rotate an array clockwise by one position
    void solve(int[] arr) {
        int head = arr[arr.length-1];
        for (int i = arr.length - 2; i >= 0; i--)
            arr[i+1] = arr[i];
        arr[0] = head;
    }   
    public static void main(String[] args) {
        int arr[] = new int[]{10, 20, 30, 40, 50, 60};
        Arr45 sol = new Arr45();
        sol.solve(arr);
        System.out.println(Arrays.toString(arr));
    } 
}
