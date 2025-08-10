package w3_resources.part5_arr2;

public class Arr17_SecondLargestIdx {
    // find index of the second largest value
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-17.php
    int solve(int[] nums) {
        return 0;
    }
    int way_idx(int[] nums) {
        int max_idx = 0, ans = 1;
        if (nums[ans] > nums[max_idx]) {
            max_idx = 1;
            ans = 0;
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > nums[max_idx]) {
                ans = max_idx;
                max_idx = i;
            } else if (nums[i] > nums[ans]) {
                ans = i;
            }
        }
        System.out.println(nums[ans] + " is at " + ans);
        return ans;
    }
    public static void main(String[] args) {
        Arr17_SecondLargestIdx sol = new Arr17_SecondLargestIdx();
        int ans = sol.way_idx(new int[] {10789, 2035, 1899, 1456, 2013} );
        System.out.println( ans );
    }
}
