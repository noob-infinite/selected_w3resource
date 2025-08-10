package w3_resources.part5_arr2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Arr54 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-54.php
    // Check if array contains a subarray with sum zero
    boolean solve(int[] arr) {
        int sum;
        for (int i = 0; i < arr.length-1; i++) {
            sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0)
                    return true;
            }
        }
        return false;
    }
    boolean by_set(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        int prefixSum = 0;
        for (int num : arr) {
            prefixSum += num;
            if (prefixSum == 0 || seen.contains(prefixSum)) {
                return true;
            }
            seen.add(prefixSum);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, -2, 3, 4, 5, 6 };
        Arr54 sol = new Arr54();
        System.out.println(sol.solve(arr1));
        // System.out.println(Arrays.toString(arr1));
        int[] arr2 = { 1, 2, 3, 4, 5, 6 };
        System.out.println(sol.solve(arr2));
        // System.out.println(Arrays.toString(arr2));
    }
}
