package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr64 {
    // https://www.w3resource.com/java-exercises/array/index.php
    // Find longest bitonic subarray in an array 
    int[] solve(int[] arr) {
        return null;
    }
    int[] longestBitonic(int[] arr) {
        int n = arr.length;
        if (n < 3) return new int[]{-1, -1}; // need at least 3 elements

        int[] inc = new int[n];
        int[] dec = new int[n];

        // Increasing lengths
        inc[0] = 1;
        for (int i = 1; i < n; i++) {
            inc[i] = (arr[i] > arr[i - 1]) ? inc[i - 1] + 1 : 1;
        }

        // Decreasing lengths
        dec[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = (arr[i] > arr[i + 1]) ? dec[i + 1] + 1 : 1;
        }

        // Find max bitonic length
        int maxLen = 0, start = -1, end = -1;
        for (int i = 0; i < n; i++) {
            if (inc[i] > 1 && dec[i] > 1) { // valid peak
                int len = inc[i] + dec[i] - 1;
                if (len > maxLen) {
                    maxLen = len;
                    start = i - inc[i] + 1;
                    end = i + dec[i] - 1;
                }
            }
        }

        return new int[]{start, end};
    }
    public static void main(String[] args) {
        int[] arr = { 4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5 };
        Arr64 sol = new Arr64();
        int[] ans = sol.longestBitonic(arr);
        System.out.println(Arrays.toString(ans));
    }
}
