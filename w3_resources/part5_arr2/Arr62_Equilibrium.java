package w3_resources.part5_arr2;

public class Arr62_Equilibrium {
    // find equilibrium indices in a given array of integers.
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-62.php
    // An equilibrium index of a sequence is an index into the sequence such that the sum of elements at lower indices is equal to the sum of elements at higher indices
    // {-7, 1, 5, 2, -4, 3, 0} -> {3,6} // or none
    // e0 + e1 + e2 = e4 + e5 + e6
    // e0 + e1 + ... + e5 = 0 
    private int solve(int[] arr) {
        int lSum = 0;
        int rSum = 0;
        int j,k;
        for (int i = 0; i < arr.length; i++) {
            lSum = 0;
            rSum = 0;
            j = i;
            for (j = 0; j < i; j++) {
                lSum += arr[j];
            }
            for (k = i+1; k < arr.length; k++) {
                rSum += arr[k];
            }
            if (lSum == rSum) return i;
        }
        return -1;
    }
    private int one_pass(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i; // Found equilibrium index
            }
            leftSum += arr[i];
        }
        return -1; // No equilibrium index
    }
    private void findEquilibrium(int[] nums) {
                // Find the total sum of elements in the array.
        int totalSum = 0;
        for (int n : nums) {
            totalSum += n;
        }

        // Initialize a running sum to keep track of the sum as we iterate.
        int runningSum = 0;

        // Iterate through the array to find equilibrium indices.
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            // Check if the current index is an equilibrium index.
            if (totalSum - runningSum - n == runningSum) {
                System.out.println("Equilibrium indices found at: " + i);
            }

            // Update the running sum as we move through the array.
            runningSum += n;
        }
    }
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        Arr62_Equilibrium sol = new Arr62_Equilibrium();
        System.out.println( sol.solve(arr) );
    }
}
