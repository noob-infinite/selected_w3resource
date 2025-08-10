package w3_resources.part5_arr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr16 {
    // remove duplicate elements from an array.
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-16.php
    public int[] solve(int[] arr) { 
        List<Integer> lis = new ArrayList<>();

        return null;
    }
    private int[] q12_way_2(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            max = Math.max(max, arr[i]);

        List<Integer> lis = new ArrayList<>();
        int[] table = new int[max + 1];
        int[] seen = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            table[arr[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (table[arr[i]] > 0) { 
                if (seen[arr[i]] == 0) {
                    lis.add(arr[i]);
                    seen[arr[i]] = 1;
                }
            }
        }
        int[] ans = new int[lis.size()];
        for (int i = 0; i < ans.length; i++)
            ans[i] = lis.get(i);
        return ans;        
    }
    public static void main(String[] args) {
        int[] arr = {10, 22, 10, 20, 11, 22};
        Arr16 sol = new Arr16();
        int[] ans = sol.q12_way_2(arr);
        System.out.println( Arrays.toString(ans) );     
    }
}
