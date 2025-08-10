package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr18 {
    // 18. Find second smallest array element
    public int solve(int[] arr) {
        int min = arr[0];
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                ans = min;
                min = arr[i];
            } else if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2035, 1899, 1456, 2013, 2458};
        Arr18 sol = new Arr18();
        System.out.println( sol.solve(arr) );  
        // System.out.println( Arrays.toString(arr) );     
    }    
}
