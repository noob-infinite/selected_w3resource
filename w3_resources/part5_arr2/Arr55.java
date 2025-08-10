package w3_resources.part5_arr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr55 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-55.php
    // Print all sub-arrays with sum zero in an array
    // Print any sub-arrays with sum zero in an array
    List<int[]> allSubset(int[] arr) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    // Copy the subarray from i to j
                    result.add(Arrays.copyOfRange(arr, i, j + 1));
                }
            }
        }
        return result;
    }
    int[] solve(int[] arr) {
        int[] ans = new int[0];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    ans = new int[j-1+1];
                    // Copy the subarray from i to j
                    ans = Arrays.copyOfRange(arr, i, j + 1);
                    System.out.println("ans= " + Arrays.toString(ans));
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, -2, 3, 4, 5, 6 };
        int[] ans;
        Arr55 sol = new Arr55();
        ans = sol.solve(arr1);
        System.out.println(Arrays.toString(ans));
        int[] arr2 = { 1, 2, 3, 4, 5, 6 };
        ans = sol.solve(arr2);
        System.out.println(Arrays.toString(ans));        
    }
}
