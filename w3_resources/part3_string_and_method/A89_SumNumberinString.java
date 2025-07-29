package w3_resources.part3_string_and_method;

public class A89_SumNumberinString {
// https://www.w3resource.com/java-exercises/string/java-string-exercise-89.php
int way_2(String s) {
    int sum = 0;
    int len = s.length();
    int i = 0;

    while (i < len) {
        char ch = s.charAt(i);

        if ('0' <= ch && ch <= '9') {
            int v = 0;
            while (i < len && (ch = s.charAt(i)) >= '0' && ch <= '9') {
                v = v * 10 + (ch - '0');
                i++;
            }
            sum += v;
        } else {
            i++;
        }
    }

    return sum;
}

  int way_1(String s) {
    int sum = 0;
    int i = 0;
    int len = s.length();
    char ch;
    int v;
    for (; i < len; i++) {
        ch = s.charAt(i);
        v = 0;
        while (i < len && '0' <= ch && ch <= '9') {
            v *= 10;
            v += ch - '0';
            i++;
            ch = s.charAt(i);
        }
        sum += v;
    }
    return sum;
  }

  static void demo_1() {
    String s = "it 15 is25 and 20String";
    A89_SumNumberinString sol = new A89_SumNumberinString();
    System.out.println( sol.way_2(s) );
  }
  public static void main(String[] args) {
    demo_1();
  }    
}
