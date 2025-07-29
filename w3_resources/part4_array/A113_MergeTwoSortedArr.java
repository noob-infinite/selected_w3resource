package w3_resources.part4_array;

import java.util.Arrays;

public class A113_MergeTwoSortedArr {
    int [] merge(int [] a, int [] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;    k++;
            } else {
                c[k] = b[j];
                j++;    k++;
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        return c;
    }
    public static void main(String[] args) {
        A113_MergeTwoSortedArr sol = new A113_MergeTwoSortedArr();
        int[] a = {1,2,3,4};
        int[] b = {2,5,7,8};
        System.out.println(Arrays.toString(sol.merge(a, b)));
    }
}
