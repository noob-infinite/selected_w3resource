package w3_resources.part5_arr2;

public class Arr78 {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-78.php
    // checks whether an array is negative dominant or not.
    boolean solve(int[] arr) {
        int negCount = 0, posCount = 0;
        for (int i = 0; i < arr.length; i++) {
            // Skip duplicates by checking earlier elements
            boolean seenBefore = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    seenBefore = true;
                    break;
                }
            }
            if (seenBefore) continue;

            if (arr[i] < 0) negCount++;
            else if (arr[i] > 0) posCount++;
            // ignore zeros
        }

        return negCount > posCount;
    }
    public static void main(String[] args) {
        Arr78 sol = new Arr78();
        System.out.println( sol.solve(new int[] {1, -2, -5, -4, 3, -6}) ); // true
        System.out.println( sol.solve(new int[] {1, 2, -5, -4, -3, 6}) );  // false
    }
}
