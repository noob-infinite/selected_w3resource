package ToIZero.string;

public class A1_031_comma_insert {
    static void solution_1(int x) {
        String y = "";
        int every_three = 0;
        while (x > 0) {
            y = "" + x%10 + y;
            x /= 10;
            every_three++;
            if (every_three  == 3 && x > 10) {
                y = "," + y;
                every_three = 0;
            }
        }
        System.out.println(y);
    }
    static void solution_2(int x) {
        String y = Integer.toString(x);
        String ans = "";
        int len = y.length();
        int i;
        for (i = len; i > 3; i -= 3) {
            ans = "," + y.substring(i-3, i) + ans;
        }
        ans = y.substring(0,i) + ans;
        System.out.println(ans);
    }
    static void demo_3() {
        solution_1(234);
        solution_2(234);
    }
    static void demo_2() {
        solution_1(1234);
        solution_2(1234);
    }
    static void demo_1() {
        solution_1(23456);
        solution_2(23456);
    }
    public static void main(String[] args) {
        demo_1();
        demo_2();
        demo_3();
    }
}
