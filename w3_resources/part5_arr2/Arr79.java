package w3_resources.part5_arr2;

public class Arr79 { 
    // https://www.w3resource.com/java-exercises/array/java-array-exercise-79.php
    // Find missing letter in a sequence of consecutive letters
    char solve(char[] arr) {
        int[] chars = new int[26];
        int base = Character.isLowerCase(arr[0]) ? 'a' : 'A';
        for (int i = 0; i < arr.length; i++) { 
            int char_int = (int)arr[i] - base;
            chars[char_int] = 1;
        }
        int i = 0;
        while (chars[i] == 0) {
            i++;
        }
        while (chars[i] == 1) {
            i++;
        }
        return (char)(base + i);
    }
    char cleaner_solve(char[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int base = Character.isLowerCase(arr[0]) ? 'a' : 'A';
        int[] chars = new int[26];

        // Mark the letters present
        for (char c : arr) {
            chars[c - base] = 1;
        }

        // Find the first 1 (start of the sequence)
        int i = 0;
        while (i < 26 && chars[i] == 0) i++;

        // Then find the first 0 after that (the missing letter)
        while (i < 26 && chars[i] == 1) i++;

        // If i is within range, return the missing letter
        if (i < 26) {
            return (char)(base + i);
        }

        // No missing letter found
        return 0;        
    }
    public static void main(String[] args) {
        Arr79 sol = new Arr79();
        System.out.println( sol.solve(new char[]{'A', 'B', 'D', 'E'}) ); //'C'
        System.out.println( sol.solve(new char[]{'p', 'r', 's', 't'}) ); //'q'
    }
}
