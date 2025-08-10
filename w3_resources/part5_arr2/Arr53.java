package w3_resources.part5_arr2;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;

public class Arr53 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-53.php
    // Replace each element with the next greatest (greater) element 
    // There is no element next to the last element, therefore replace it with -1.
    void solve(int[] arr) {
        int myGreater = -1;
        int i,j;
        for (i = 0; i < arr.length - 1; i++) {
            myGreater = arr[i];
            j = i + 1; 
            while (j < arr.length && arr[j] < arr[i]) {
                j++;
            }
            if (j != arr.length)
                myGreater = arr[j];
            arr[i] = myGreater;
        }
        arr[i] = -1;
    }
    void by_gpt(int[] arr) {
        int i;
        for (i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while (j < arr.length && arr[j] <= arr[i]) {
                j++;
            }
            arr[i] = (j == arr.length) ? -1 : arr[j];
        }
        arr[i] = -1;        
    }
    public static void main(String[] args) {
        int arr[] = {45, 20, 100, 23, -5, 2, -6}; 
        Arr53 sol = new Arr53();
        sol.solve(arr);
        System.out.println(Arrays.toString(arr));
    }
}
