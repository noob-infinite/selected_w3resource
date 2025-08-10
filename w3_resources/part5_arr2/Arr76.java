package w3_resources.part5_arr2;

public class Arr76 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-57.php
    // Check if sub-array is formed by consecutive integers
    boolean solve(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min) 
                min = arr[i];
        }
        boolean[] range = new boolean[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            range[arr[i]-min] = true;
        }
        boolean isConsec = true;
        for (int i = 0; i < range.length; i++) {
            if (!range[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Arr76 sol = new Arr76();
        int[] arr = { 2, 5, 0, 2, 1, 4, 3, 6, 1, 0 };
        System.out.println( sol.solve(arr) );
        int[] nums = {1, 2 ,5, 0, 4, 3, 6};
        System.out.println( sol.solve(nums) );
        System.out.println( sol.solve(new int[] {1, 2 ,5, 0, 3, 6, 7}) );
    }
}
