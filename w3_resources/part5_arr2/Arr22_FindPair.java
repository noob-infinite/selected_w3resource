package w3_resources.part5_arr2;

import java.util.ArrayList;

public class Arr22_FindPair {
    // [https://www.w3resource.com/java-exercises/array/java-array-exercise-22.php
    //  find all pairs of elements in an array whose sum is equal to a specified number.
    public void solve(int[] arr, int k) {

    }
    public String brute_force(int[] arr, int k) {
        ArrayList<int[]> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    ans.add(new int[]{i,j});
                    System.out.println("(" + i + "," + j +")");
                }
            }
        }
        System.out.println( ans );
        return ans.toString();
    }
    public static void main(String[] args) {
        Arr22_FindPair sol = new Arr22_FindPair();
        String ans = sol.brute_force(new int[]{2, 7, 4, -5, 11, 5, 20}, 15);
        System.out.println(ans);
    }
}
