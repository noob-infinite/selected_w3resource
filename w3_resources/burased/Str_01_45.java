package w3_resources.burased;

public class Str_01_45 {
    // https://www.w3resource.com/java-exercises/string/java-string-exercise-45.php
    // reverse words in a given string.
    public String solve(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
        return sb.toString();
    }
    public static void main(String[] args) {
        Str_01_45 sol = new Str_01_45();
        System.out.println( sol.solve("fast") );
    }
}
