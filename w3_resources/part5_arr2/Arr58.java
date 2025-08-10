package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr58 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-58.php
    // Merge two sorted arrays maintaining order
    void solve(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        k = 0;
        for (i = 0; i < a.length; i++) 
            a[i] = c[k++];
        for (j = 0; j < b.length; j++)
            b[j] = c[k++];
    }
    public static void main(String[] args) {
        Arr58 sol = new Arr58();
        int[] A = { 1, 5, 6, 7, 8, 10 };
        int[] B = { 2, 4, 9 };
        sol.solve(A, B);
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }
}
