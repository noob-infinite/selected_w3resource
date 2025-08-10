package w3_resources.part5_arr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arr25 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-25.php
    // 25. Common elements in three sorted arrays
    int [] solve(int[] a, int[] b, int[] c) {
        List<Integer> lis = new ArrayList<>();
        boolean inB = false, inC = false;
        int value_a;
        for (int i = 0; i < a.length; i++) {
            value_a = a[i];
            inB = false;
            for (int j = 0; j < b.length && !inB; j++) {
                if (value_a == b[j]) {
                    inB = true;
                }
            }
            inC = false;
            for (int k = 0; k < c.length && !inC; k++) {
                if (value_a == c[k]) {
                    inC = true;
                }
            }
            if (inB && inC)
                lis.add(value_a);
        }
        // System.out.println(lis);
        int[] ans = new int[lis.size()];
        for (int i = 0; i < ans.length; i++)
            ans[i] = lis.get(i);
        return ans;
    }
    int[] abc_are_sorted(int[] a, int[] b, int[] c) {
        List<Integer> lis = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                lis.add(a[i]);
                i++; j++; k++;
            }
            else if (a[i] < b[j]) {
                i++;
            }
            else if (b[j] < c[k]) {
                j++;
            }
            else {
                k++;
            }
        }

        // Convert to int[]
        int[] ans = new int[lis.size()];
        for (int idx = 0; idx < lis.size(); idx++)
            ans[idx] = lis.get(idx);
        return ans;
    }    
    int[] use_set(int[] a, int[] b, int[] c) {
        // Put all elements of a into a set
        Set<Integer> setA = new HashSet<>();
        for (int x : a) setA.add(x);

        // Find elements common to a and b
        Set<Integer> setAB = new HashSet<>();
        for (int x : b) {
            if (setA.contains(x)) {
                setAB.add(x);
            }
        }

        // Find elements common to a, b, and c
        List<Integer> lis = new ArrayList<>();
        for (int x : c) {
            if (setAB.contains(x)) {
                lis.add(x);
            }
        }

        // Convert to int[]
        int[] ans = new int[lis.size()];
        for (int i = 0; i < lis.size(); i++) {
            ans[i] = lis.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr1[] = {2, 4, 8};
        int arr2[] = {2, 3, 4, 8, 10, 16};
        int arr3[] = {4, 8, 14, 40};
        Arr25 sol = new Arr25();
        int[] ans = sol.solve(arr1, arr2, arr3);
        System.out.println( Arrays.toString(ans) );
    }
}
