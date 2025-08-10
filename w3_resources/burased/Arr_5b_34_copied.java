package w3_resources.burased;

public class Arr_5b_34_copied {
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-34.php
    // Find the length of the longest consecutive elements sequence from a given unsorted array of integers
    // {49, 1, 3, 200, 2, 4, 70, 5} return 5 // {1,2,3,4,5}
    // union find concept
    // sort
    // brute force all subset using set (as on the page)
    int longest_streak(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) 
            max = Math.max(max, arr[i]);
        
        int[]len = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            len[arr[i]] = 1;
        }
        int streak = len[0];
        int idx = 1;
        int longest = 0;
        while (idx < len.length) {
            if (len[idx] == 1) {
                streak++;
                longest = Math.max(longest, streak);
            } else {
                streak = 0;
            }
            idx++;
        }
        return longest;
    }
    int min_max(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int val : arr) {
            max = Math.max(max, val);
            min = Math.min(min, val);
        }

        // Table to mark existence of numbers
        boolean[] exists = new boolean[max + 1];
        for (int val : arr) {
            exists[val] = true;
        }

        int longest = 0;
        int current = 0;

        for (int i = min; i <= max; i++) {
            if (exists[i]) {
                current++;
                longest = Math.max(longest, current);
            } else {
                current = 0;
            }
        }
        return longest;
    }   
}
