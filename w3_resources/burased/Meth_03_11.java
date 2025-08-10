package w3_resources.burased;

public class Meth_03_11 {
    // [https://www.w3resource.com/java-exercises/method/java-method-exercise-11.php
    // whether a string is a valid password.
// Password rules:
// A password must have at least ten characters.
// A password consists of only letters and digits.
// A password must contain at least two digits.
    boolean solve(String passwd) {
        final int MIN_LENGTH = 10;
        if (passwd.length() < MIN_LENGTH) return false;
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < passwd.length(); i++) {
            char ch = passwd.charAt(i);
            if (is_Letter(ch)) charCount++; // continue; Character.isLetter(ch)
            else if (is_Numeric(ch)) numCount++; // Character.isDigit(ch)
            else return false;
        }
        return numCount >= 2;
    }
    private boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    private boolean is_Numeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }
    public static void main(String[] args) {
        
    }
}
