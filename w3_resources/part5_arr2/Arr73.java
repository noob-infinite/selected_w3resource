package w3_resources.part5_arr2;

import java.util.Arrays;

class Arr73 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-73.php
    // Sort array where only two elements are out of place
    void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int tmp = arr[i+1];
            int j = i + 1;
            while (tmp < arr[j-1] && j >= 1) {    
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
    void findTheTwoIndex(int[] arr) {
        int n = arr.length;
        int first = -1, second = -1;

        // Step 1: find the first out-of-order position
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                first = i;
                break;
            }
        }

        // Step 2: find the second out-of-order position
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                second = i;
                break;
            }
        }

        // Step 3: swap
        if (first != -1 && second != -1) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }     
    void findTheTwoIndex2(int[] arr) {
        int n = arr.length;
        int first = 0, second = n - 1;

        // Find first index where order breaks
        while (first < n - 1 && arr[first] <= arr[first + 1]) first++;

        // Find last index where order breaks
        while (second > 0 && arr[second] >= arr[second - 1]) second--;

        // Swap without extra checks (since exactly two elements are wrong)
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;

        System.out.println(Arrays.toString(arr));
    }   
    void findTheTwoIndex3(int[] arr) {
        int n = arr.length;
        int first = -1, second = -1;

        // Single pass: track first and last violations
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (first == -1) first = i; // first violation
                second = i + 1;             // keep updating until last violation
            }
        }

        // Swap
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;

        System.out.println(Arrays.toString(arr));        
    }
    
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 9, 8, 7 };
        Arr73 sol = new Arr73();
        sol.findTheTwoIndex3(arr);
        System.out.println(Arrays.toString(arr) );
    }

}