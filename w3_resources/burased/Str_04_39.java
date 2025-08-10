package w3_resources.burased;

public class Str_04_39 {
    // https://www.w3resource.com/java-exercises/string/java-string-exercise-39.php
    // find the first non-repeating character in a string
    char solve(String str) {
        return '*';
    }
    char lookup_with_ch(String str) {
        char[] a_to_z = new char[26];
        char ch;
        for (int i = 0; i < str.length(); i++ ) {
            a_to_z[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < str.length(); i++ ) {
            ch = str.charAt(i) ;
            if(a_to_z[ch - 'a'] == 1)
                return ch;
        }        
        return '*';
    }
    char lookup(String str) {
        char[] a_to_z = new char[256];
        int idx = -1;
        char ch;
        for (int i = 0; i < str.length(); i++ ) {
            a_to_z[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++ ) {
            ch = str.charAt(i);
            if(a_to_z[ch] == 1)
                return ch;
        }        
        return '*';
    }
    char pointer(String str) {
        int r;
        char left_ch, right_ch;
        for (int i = 0; i < str.length(); i++) {
            left_ch = str.charAt(i);
            r = i+1;
            while (r < str.length() /* && !isDup */) {
                right_ch = str.charAt(r);
                if (left_ch == right_ch) {
                    break;
                    // isDup = true;
                }
                r++;
            }
            if (r == str.length())
                return left_ch;
        }
        return '*';
    }
    public static void main(String[] args) {
        Str_04_39 sol = new Str_04_39();
        System.out.println( sol.solve("gibblegabbler") );
        System.out.println( sol.lookup("gibblegabbler") );
    }
    
}
