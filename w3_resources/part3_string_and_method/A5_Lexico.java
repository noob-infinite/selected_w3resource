package w3_resources.part3_string_and_method;
// https://www.w3resource.com/java-exercises/string/index.php
// https://www.w3resource.com/java-exercises/string/java-string-exercise-5.php
// Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.


// static boolean solve(String s1, String s2) {
//     return way1(s1,s2);
// }
public class A5_Lexico {

    static boolean way1(String s1, String s2) {
        return s1.equals(s2);
    }

    static boolean way2(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))   
                return false;
        }
        return true;
    }
    static String way3(String s1, String s2) {
        String ans = "aa";
        int shorter_len = s1.length();
        if (s1.length() < s2.length()) {
            shorter_len = s1.length();
            ans = s1;
        } else if (s2.length() < s1.length() ) {
            shorter_len = s2.length();
            ans = s2;
        }
        int i = 0;
        for (i = 0; i < shorter_len; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                ans = s1;
                break;
            } else if (s2.charAt(i) < s1.charAt(i)) {
                ans = s2;
                break;
            }
        }
        if (s1.length() == s2.length() && i == s1.length())
            ans = "same";
        System.out.println(ans + " " + i);
        return ans;
    }
    static void demo_1() {
        String s1 = "This is Exercise 1";
        String s2 = "This is Exercise 2";
        System.out.println(way1(s1, s2));
        System.out.println(way2(s1,s2));
    }
    static void demo_2() {
        String s1 = "Exercise 1";
        String s2 = "Exercise ";
        System.out.println(way3(s1, s2));
    }
    public static void main(String[] args) {
        demo_2();
    }
}
