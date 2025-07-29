package w3_resources.part3_string_and_method;

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
