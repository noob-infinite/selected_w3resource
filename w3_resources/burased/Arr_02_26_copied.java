package w3_resources.burased;

import java.util.Arrays;

public class Arr_02_26_copied {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-26.php
    // move all element 0 to the right
    public void solve(int[] arr) {

    }
    private void way_1(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (right >= 0 && arr[right] == 0) {
            right--;
        }
        int tmp;
        while (left < right) {
            if (arr[left] == 0) {
                tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
                // while (right >= 0 && arr[right] == 0) {
                    right--;
                // }
                continue;
            }
            left++;
        }
    }
    private void way_2_stable(int[] arr) {
        int pos = 0; // pos of next non-zero;
        int tmp;
        for (int left = 0; left < arr.length; left++) {
            if (arr[left] != 0) {
                if (pos != left) {
                    tmp = arr[pos];
                    arr[pos] = arr[left];
                    arr[left] = tmp;
                }
                pos++;
            }
        }
    }
    private void way_3_reverse_one_pass(int[] arr) {
        int left = 0, right = arr.length - 1;
        int tmp;
        while (left < right) {
            if (arr[left] == 0) {
                tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                right--;
            } else {
                left++;
            }
        }
    }
    public static void main(String[] args) {
        Arr_02_26_copied sol = new Arr_02_26_copied();
        int[] nums = {0,0,1,0,3,0,5,0,6};
        // sol.way_1(nums);
        // sol.way_2_stable(nums);
        sol.way_3_reverse_one_pass(nums);
        System.out.println(Arrays.toString(nums));
    }
}
