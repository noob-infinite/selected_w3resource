package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr49 {
    void solve(int[] arr) {
        // https://www.w3resource.com/java-exercises/array/java-array-exercise-49.php
        // Arrange array with positive integers before negatives
        int left = 0, right = arr.length - 1;
        int tmp;
        while (left < right) {
            if (arr[left] < 0) {
                tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
                right--;
            } else {
                left++;
            }
        }        
    }
    public static void main(String[] args) {
        int[] arr = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
        Arr49 sol = new Arr49();
        sol.solve(arr);
        System.out.println(Arrays.toString(arr));
    }
}
