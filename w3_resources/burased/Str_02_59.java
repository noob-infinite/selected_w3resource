package w3_resources.burased;

public class Str_02_59 {
    // https://www.w3resource.com/java-exercises/string/java-string-exercise-52.php
    // check if two given strings are rotations of each other
    boolean solve(String t, String p) {
        StringBuilder sb = new StringBuilder(t);
        sb.append(t);
        int offset = 0;
        for (int i = 0; i < t.length() && offset < p.length(); i++) { // beware that offset < p.length is offset of previous iteration
            offset = 0;
            while (offset < p.length() && sb.charAt(i + offset) == p.charAt(offset)) {
                // System.out.println("i+offset " + sb.charAt(i+offset));
                offset++;
            }
        }
        return offset == p.length();
    }
    boolean way_regular(String t, String p) {
    // if (t.length() != p.length()) return false; // rotations must have same length

    StringBuilder sb = new StringBuilder(t);
    sb.append(t); // doubled string

    for (int i = 0; i < t.length(); i++) {
        int offset = 0;
        while (offset < p.length() && sb.charAt(i + offset) == p.charAt(offset)) {
            offset++;
        }
        if (offset == p.length()) return true; // full match found
    }
    return false;
    }
    public static void main(String[] args) {
        Str_02_59 sol = new Str_02_59();
        System.out.println( sol.solve("ABACD", "CDABA") );
    }
}
