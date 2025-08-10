package w3_resources.part5_arr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr12 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-12.php
    // Find duplicates in integer array
    public int[] solve(int[] arr) {
        return null;
    }
    private int[] way_1(int[] arr) { // no more than two occurences
        List<Integer> lis = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    lis.add(arr[i]);
                }
            }
        }
        int[] ans = new int[lis.size()];
        for (int i = 0; i < ans.length; i++)
            ans[i] = lis.get(i);
        return ans;        
    }
    private int[] way_2(int[] arr) {
        int[] table = new int[10];
        for (int i = 0; i < arr.length; i++) {
            table[arr[i]]++;
        }
        // System.out.println("Freq= " + Arrays.toString(table));
        List<Integer> lis = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (table[i] > 1) {
                lis.add(i);
            }
        }
        // int[] ans = lis.toArray(new int[lis.size()]);
        int[] ans = new int[lis.size()];
        for (int i = 0; i < ans.length; i++)
            ans[i] = lis.get(i);
        return ans;
    }
    private int[] way_3(int[] arr) { // if set O(n)
        List<Integer> seen = new ArrayList<>();
        List<Integer> lis = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) { 
            if (seen.contains(arr[i])) {
                if (!lis.contains(arr[i])) {
                    lis.add(arr[i]);
                } 
            } else {
                seen.add(arr[i]);
            }         
        }
        int[] ans = new int[lis.size()];
        for (int i = 0; i < ans.length; i++)
            ans[i] = lis.get(i);
        return ans;  
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
        Arr12 sol = new Arr12();
        System.out.println( Arrays.toString(sol.way_1(arr)) );
        System.out.println( Arrays.toString(sol.way_2(arr)) ); 
        System.out.println( Arrays.toString(sol.way_3(arr)) );     
    }
}
