package w3_resources.part5_arr2;

public class Arr77 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-77.php
    // Check if array alternates between positive and negative
    boolean solve(int[] arr) {
        // if (arr.length < 2) return true; 

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] > 0 && arr[i - 1] > 0) ||
                (arr[i] < 0 && arr[i - 1] < 0)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Arr77 sol = new Arr77();
        System.out.println( sol.solve(new int[] {1, -2, 5, -4, 3, -6}) );
        System.out.println( sol.solve(new int[] {1, 2 ,5, 4, 3, 6}) );
    }
}
