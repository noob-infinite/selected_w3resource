package w3_resources.part3_string_and_method;

public class A53_bugMatchWildCards {
// https://www.w3resource.com/java-exercises/string/java-string-exercise-53.php

  boolean solve(String s1, String s2) {
    return false;
  }
  boolean isMatch_iterative(String text, String pattern) {
        int t = 0, p = 0; // pointers for text and pattern
        int starIdx = -1, match = 0;

        while (t < text.length()) {
            // Case 1: Characters match or pattern has '?'
            if (p < pattern.length() && 
                (pattern.charAt(p) == '?' || pattern.charAt(p) == text.charAt(t))) {
                t++;
                p++;
            }
            // Case 2: Pattern has '*'
            else if (p < pattern.length() && pattern.charAt(p) == '*') {
                starIdx = p;
                match = t;
                p++; // move pattern pointer ahead
            }
            // Case 3: Last pattern was '*', try to match more characters
            else if (starIdx != -1) {
                p = starIdx + 1;
                match++;
                t = match;
            }
            // Case 4: No match
            else {
                return false;
            }
        }

        // Check for remaining characters in pattern — they must all be '*'
        while (p < pattern.length() && pattern.charAt(p) == '*') {
            p++;
        }

        return p == pattern.length();
    }
  boolean isMatch_dp(String str, String pattern) {
        int n = str.length();
        int m = pattern.length();

        // dp[i][j] will be true if str[0..i-1] matches pattern[0..j-1]
        boolean[][] dp = new boolean[n + 1][m + 1];

        // Empty pattern matches empty string
        dp[0][0] = true;

        // Handle patterns like *, **, ***, etc. at the beginning
        for (int j = 1; j <= m; j++) {
            if (pattern.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        // Fill the table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                char sc = str.charAt(i - 1);
                char pc = pattern.charAt(j - 1);

                if (pc == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else if (pc == '?' || sc == pc) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }

        return dp[n][m];
    }

  static void demo_1() {
    A53_bugMatchWildCards sol = new A53_bugMatchWildCards();
    System.out.println( sol.isMatch_dp("abcdhgh","abc*d?*") );
    System.out.println( sol.isMatch_iterative("abcdhgh","abc*d?*") );
  }
  public static void main(String[] args) {
    demo_1();
  }  
}
