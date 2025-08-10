package w3_resources.part3_string_and_method;

import java.util.LinkedHashMap;
import java.util.Map;

public class A39_bugFirstNonRepeatingChar {

  char solve(String s) {
    // bug
    // https://www.w3resource.com/java-exercises/string/java-string-exercise-39.php
    int left = 0, right = 1;
    int len = s.length();
    while (left < len - 1) {
        while (right < len) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right = left + 1;
                break;
            }
            right++;
        }
        if (right == len) {
            break;
        }
        System.out.println("ch= " + s.charAt(left));
    }
    return s.charAt(left);
  }    
  int indexOfFirstNoneRepeatingChar_count(String s) {
    int[] count = new int[256]; // ASCII size
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i)]++;
    }
    for (int i = 0; i < s.length(); i++) {
        if (count[s.charAt(i)] == 1)
            return i;
    }
    return -1; // if no non-repeating character found
  }
  int indexOfFirstNoneRepeatingChar_map(String s) {
    Map<Character, Integer> map = new LinkedHashMap<>();

    // Pass 1: store index or -1 if seen twice
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (map.containsKey(c)) {
            map.put(c, -1); // mark as repeated
        } else {
            map.put(c, i); // store first index
        }
    }

    // Pass 2: find the first non-repeating character
    for (int idx : map.values()) {
        if (idx != -1) return idx;
    }

    return -1;
}
  int indexOfFirstNoneRepeatingChar_bruteforce(String s) {
    for (int i = 0; i < s.length(); i++) {
        boolean isUnique = true;
        for (int j = 0; j < s.length(); j++) {
            if (i != j && s.charAt(i) == s.charAt(j)) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) return i;
    }
    return -1;
}
  static void demo_1() {
    //  String s = "gibblegabbler";
    String s = "bbl";
    A39_bugFirstNonRepeatingChar sol = new A39_bugFirstNonRepeatingChar();
    System.out.println(sol.solve(s));
  }
  public static void main(String[] args) {
    demo_1();
  }   
}
