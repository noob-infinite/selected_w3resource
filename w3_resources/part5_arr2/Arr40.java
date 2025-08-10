package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr40 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-40.php
    // 40. Find pair with sum closest to zero
    int[] solve(int [] arr) {
        int n = arr.length;
        int minSum = Integer.MAX_VALUE;
        int idx1 = 0, idx2 = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (Math.abs(sum) < Math.abs(minSum)) {
                    minSum = sum;
                    idx1 = i;
                    idx2 = j;
                }
            }
        }
        
        return new int[]{idx1, idx2};
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, -4, 7, 8, -6};
        Arr40 sol = new Arr40();
        int[] result = sol.solve(arr);
        System.out.println( Arrays.toString(result) );
    }
}
