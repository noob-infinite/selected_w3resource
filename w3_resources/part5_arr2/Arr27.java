package w3_resources.part5_arr2;

import java.util.Arrays;

public class Arr27 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-27.php
    // Count even and odd numbers in array
    int[] solve(int[] arr) {
        int numEven = 0;
        int numOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                numEven++;
            else   
                numOdd++;
        }
        return new int[]{numEven, numOdd};
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 4, 9};
        Arr27 sol = new Arr27();
        System.out.println( Arrays.toString(sol.solve(arr)));
    }
}
