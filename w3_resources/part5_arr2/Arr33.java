package w3_resources.part5_arr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr33 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-33.php
    // Remove duplicates and return new length
    boolean solve(int[] arr) {
        return false;
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
            if (table[arr[i]] >  0) { 
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
    int[] sort_arr(int[] arr) {
        int[] unique = new int[arr.length];
        int u_idx = 0;
        unique[0] = arr[u_idx];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > unique[u_idx]) {
                unique[++u_idx] = arr[i];
            }
        }
        int[] ans = new int[u_idx+1];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = unique[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {20, 20, 30, 40, 50, 50, 50}; 
        Arr33 sol = new Arr33();
        nums = sol.sort_arr(nums);
        System.out.println( Arrays.toString(nums) );
        int[] arr = {77, 22, 65, 44, 33, 77};
        arr = sol.q12_way_2(arr);
        System.out.println( Arrays.toString(arr) );
    }      
}
