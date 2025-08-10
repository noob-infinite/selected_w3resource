package w3_resources.burased;

public class Meth_01_03 {
    // https://www.w3resource.com/java-exercises/method/java-method-exercise-3.php
    // display the middle character of a string
    //   Note: a) If the length of the string is odd there will be two middle characters.
            // b) If the length of the string is even there will be one middle character.
    // display the middle character of a string
    String solve(String str) {
        int mid = str.length()/2;
        String ans = "";
        if (str.length() % 2 == 0) {
            return ans + str.charAt(mid-1) + str.charAt(mid);
        } else {
            return ans + str.charAt(mid);
        }
    }
    public static void main(String[] args) {
        Meth_01_03 sol = new Meth_01_03();
        System.out.println( sol.solve("350") );
        System.out.println( sol.solve("AbCd") );
    }
}
