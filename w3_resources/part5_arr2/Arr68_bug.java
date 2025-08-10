package w3_resources.part5_arr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr68_bug {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-68.php
    // create all possible permutations of a given array of distinct integers.
    List<int[]> solve(int[] arr) {
        return null;
    }
    void recurse_caller(int[] arr) {
        List<int[]> lis = new ArrayList<>();
        int[] place_holder = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[0] = i;
            // recurse(arr, i, arr, 0, lis);
        }
        for (int[] ele : lis) {
            System.out.println(Arrays.toString(ele));
        }
    }
    // void recurse(int[] arr, int index, int[] current, int depth, List<int[]> lis) {
    //     if (depth == arr.length) {
    //         lis.add(current);
    //         return;
    //     }
    //     for (int i = 0; i <)
    // }
    public static void main(String[] args) {
        
    }
}
