package w3_resources.part5_arr2;

public class Arr24_MissingNumber {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-24.php
    // Write a Java program to find a missing number in an array.
    public int solve(int[] arr) {
        return 0;
    }
    private int way_sum(int[] arr) {
        int left = arr[0];
        int right = arr[arr.length - 1];
        int sum = (right * (right+1))/2 - (--left * (left+1))/2;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }
        System.out.println("ans= " + sum);
        return sum;
    }
    private int way_subtract(int[] arr) {
        int left = arr[0];
        int right = arr[arr.length - 1];
        int sum = (right * (right+1))/2 - (--left * (left+1))/2;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        // ans = sum - ans;
        System.out.println("ans= " + (sum - ans));
        return (sum - ans);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7};   
        Arr24_MissingNumber sol = new Arr24_MissingNumber();
        System.out.println( sol.way_sum(arr) );
        System.out.println( sol.way_subtract(arr) );
    }
}
