package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr42 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-42.php
    // Separate 0s and 1s in an array of 0s and 1s
    void solve(int[] arr) {
        int left = 0, right = arr.length - 1;
        int tmp;
        while (left < right) {
            if (arr[left] == 1) {
                tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
                right--;
            } else {
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    void grok(int[] arr) {
        if (arr == null || arr.length == 1)    return;

        int left = 0;
        int right = arr.length - 1;

        // Use two pointers to partition 0s (left) and 1s (right)
        while (left < right) {
            // Find the first 1 from the left
            while (left < right && arr[left] == 0) {
                left++;
            }
            // Find the first 0 from the right
            while (left < right && arr[right] == 1) {
                right--;
            }
            // Swap arr[left] and arr[right]
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        Arr42 sol = new Arr42();
        sol.solve(arr);
    }
}
