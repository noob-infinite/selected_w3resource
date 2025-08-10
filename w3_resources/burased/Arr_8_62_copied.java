package w3_resources.burased;

public class Arr_8_62_copied {
    // find equilibrium indices in a given array of integers.
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-62.php
    // An equilibrium index of a sequence is an index into the sequence such that the sum of elements at lower indices is equal to the sum of elements at higher indices
    // {-7, 1, 5, 2, -4, 3, 0} -> {3,6} // or none
    // e0 + e1 + e2 = e4 + e5 + e6
    // e0 + e1 + ... + e5 = 0 
    public void solve() {

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
        Arr_8_62_copied sol = new Arr_8_62_copied();
        sol.findEquilibrium(new int[]{-7, 1, 5, 2, -4, 3, 0});
    }
}
