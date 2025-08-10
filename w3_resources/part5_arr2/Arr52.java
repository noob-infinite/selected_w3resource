package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr52 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-52.php
    // Separate even and odd numbers in an array
    void solve(int[] arr){ 
        int left = 0, right = arr.length - 1;
        int tmp;
        while (left < right) {
            if (arr[left] % 2 == 1) {
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
        int[] arr = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        Arr52 sol = new Arr52();
        sol.solve(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
