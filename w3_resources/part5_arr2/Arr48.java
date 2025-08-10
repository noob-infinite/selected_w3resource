package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr48 { 
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-48.php
    // Arrange array with negative integers before positives
    void stable_solution_by_grok(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        // First pass: Copy non-positive numbers (≤ 0) in original order
        for (int num : arr) {
            if (num <= 0) {
                temp[index++] = num;
            }
        }

        // Second pass: Copy positive numbers (> 0) in original order
        for (int num : arr) {
            if (num > 0) {
                temp[index++] = num;
            }
        }

        // Copy back to original array
        System.arraycopy(temp, 0, arr, 0, arr.length);

        // Print the arranged array
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        int arr[] = new int[]{-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
        Arr48 sol = new Arr48();
        sol.stable_solution_by_grok(arr);
        System.out.println(Arrays.toString(arr));
    } 
}
