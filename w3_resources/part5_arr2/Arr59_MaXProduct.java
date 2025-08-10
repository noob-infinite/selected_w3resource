package w3_resources.part5_arr2;

public class Arr59_MaXProduct {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-59.php
    // Find maximum product of two integers in an array
    int solve(int[] arr) {
        int max1 = arr[0];
        int max2 = arr[0];
        int min1 = arr[0];
        int min2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            } 
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }
        }

        int v1 = max1 * max2;
        int v2 = min1 * min2;
        return v1 > v2 ? v1 : v2;
    }
    public static void main(String[] args) {
        Arr59_MaXProduct sol = new Arr59_MaXProduct();
        int[] arr = { 2, 3, 5, 7, -7, 5, 8, -5 };
        System.out.println( sol.solve(arr) );
    }
}
