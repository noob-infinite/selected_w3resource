package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr63 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-63.php
    // Replace each element with product of other elements
    void solve(int[] A, int[] B) {
    }
    void kinda_straight(int[] A, int[] B) { 
        // bug
        int n = A.length;
        long totalProduct = 1; // use long to prevent overflow
        int zeroCount = 0;

        // Compute product of all non-zero elements and count zeros
        for (int num : A) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalProduct *= num;
            }
        }

        // Build output array
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                B[i] = 0;
            } else if (zeroCount == 1) {
                B[i] = (A[i] == 0) ? (int) totalProduct : 0;
            } else {
                B[i] = (int) (totalProduct / A[i]);
            }
        }
    }        
    void prefixProduct(int[] A, int[] B) { 
        // bug
        int n = A.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // Build prefix products
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * A[i - 1];
        }

        // Build suffix products
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * A[i + 1];
        }

        // Final product for each index
        for (int i = 0; i < n; i++) {
            B[i] = prefix[i] * suffix[i];
        }
    }    
    public static void main(String[] args) {
        Arr63 sol = new Arr63();
        int[] A = { 1, 2, 3, 4, 5, 6, 7};
        int[] B = {0, 1, 2, 3, 4, 5, 6, 7};
        sol.kinda_straight(A, B);
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }    
}
