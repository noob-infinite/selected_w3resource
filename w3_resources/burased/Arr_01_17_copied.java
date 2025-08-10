package w3_resources.burased;

public class Arr_01_17_copied {
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
        Arr_01_17_copied sol = new Arr_01_17_copied();
        int ans = sol.way_idx(new int[] {10789, 2035, 1899, 1456, 2013} );
        System.out.println( ans );
    }
}
