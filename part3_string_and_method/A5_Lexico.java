package selected_w3resource.part3_string_and_method;
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

    static void demo_1() {
        String s1 = "This is Exercise 1";
        String s2 = "This is Exercise 2";
        System.out.println(way1(s1, s2));
        System.out.println(way2(s1,s2));
    }
    public static void main(String[] args) {
        demo_1();
    }
}
